package utilidades;

import dao.CarreraDAO;
import dao.FacultadDAO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import to.CarreraTO;
import to.CursoTO;
import to.Curso_Plan_TO;
import to.FacultadTO;
import to.NombreCicloTO;
import to.PlanDeEstudioTO;

/**
 *
 * @author Alisoft
 */
public class LlenadoresYLimpiadores {

    /**
     *
     * @param combo llenamos combo con objetos FacultadTO(id,nombre,f_creacion)
     */
    public static void llenarComboBoxFacultades(javax.swing.JComboBox combo) {
        limpiarComboBox(combo);
        try {
            FacultadDAO dao = new FacultadDAO();
            ResultSet rs = dao.getFacultades();
            DefaultComboBoxModel modelo = (DefaultComboBoxModel) combo.getModel();
            while (rs.next()) {
                FacultadTO obj = new FacultadTO();
                obj.setId(rs.getInt(1));
                obj.setNombre(rs.getString(2));
                obj.setCreacion(rs.getDate(3));
                modelo.addElement(obj);
            }
        } catch (Exception ex) {
            System.out.println("error al llenar datos en combo facultades");
        }
    }

    public static void limpiarComboBox(JComboBox combo) {
        DefaultComboBoxModel modelo = (DefaultComboBoxModel) combo.getModel();
        modelo.removeAllElements();
    }

    public static void llenarComboBoxPlanEstudio(JComboBox combo) {
        try {
            ResultSet rs = conexion.Conexion.getInstancia().getConn().createStatement().executeQuery("SELECT * FROM plan_estudios");
            DefaultComboBoxModel modelo = (DefaultComboBoxModel) combo.getModel();
            while (rs.next()) {
                PlanDeEstudioTO obj = new PlanDeEstudioTO();
                obj.setId(rs.getInt(1));
                obj.setNombre(rs.getString(2));
                modelo.addElement(obj);
            }
        } catch (Exception ex) {
            Complementos.mostrarMensaje("Error al mostrar los planes de estudio disponibles " + ex);
        }
    }

    public static void llenarTableCarreras(JTable tabla, JComboBox facultades) throws Exception {
        limpiartable(tabla);
        CarreraDAO dao = new CarreraDAO();
        ResultSet rs = dao.getCarreras(
                (FacultadTO) ((DefaultComboBoxModel) facultades.getModel()).getSelectedItem()
        );
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        while (rs.next()) {
            NombreCicloTO obj = new NombreCicloTO();
            obj.setId(rs.getInt(4));
            obj.setNombre(rs.getString(5));
            modelo.addRow(new Object[]{rs.getInt(1), rs.getString(2), rs.getDate(3), obj});
        }
    }

    public static void limpiartable(JTable tabla) {
        while (tabla.getModel().getRowCount() > 0) {
            ((DefaultTableModel) tabla.getModel()).removeRow(0);
        }
    }

    public static void llenarComboBoxCiclo(JComboBox combo) {
        try {
            limpiarComboBox(combo);
            ResultSet rs = conexion.Conexion.getInstancia().getConn().createStatement().executeQuery("SELECT * FROM nombre_ciclo");
            DefaultComboBoxModel modelo = (DefaultComboBoxModel) combo.getModel();
            while (rs.next()) {
                NombreCicloTO obj = new NombreCicloTO();
                obj.setId(rs.getInt(1));
                obj.setNombre(rs.getString(2));
                modelo.addElement(obj);
            }
        } catch (Exception ex) {
            Complementos.mostrarMensaje("Error al mostrar los ciclos disponibles " + ex);
        }
    }

    /**
     *
     * @param combo
     * @param carrera obligatorio carrera.id_ciclo_max, carrera.id
     */
    public static void llenarComboBoxCiclo(JComboBox combo, CarreraTO carrera) {
        try {
            limpiarComboBox(combo);
            PreparedStatement ps = conexion.Conexion.getInstancia().getConn().prepareStatement("select * from nombre_ciclo where idnombre_ciclo <= (select c.id_ciclo_max from carrera c inner join nombre_ciclo n on c.id_ciclo_max = n.idnombre_ciclo where idcarrera = ?)");
            ps.setInt(1, carrera.getId());
            ResultSet rs = ps.executeQuery();
            DefaultComboBoxModel modelo = (DefaultComboBoxModel) combo.getModel();
            while (rs.next()) {
                NombreCicloTO obj = new NombreCicloTO();
                obj.setId(rs.getInt(1));
                obj.setNombre(rs.getString(2));
                modelo.addElement(obj);
            }
        } catch (Exception ex) {
            //Complementos.mostrarMensaje("Error al mostrar los ciclos disponibles "+ex);
        }
    }

    public static void llenarComboBoxEAP(JComboBox combo, FacultadTO facultad) {
        try {
            limpiarComboBox(combo);
            PreparedStatement ps = conexion.Conexion.getInstancia().getConn().prepareStatement("select * from carrera where id_facultad = ?");
            ps.setInt(1, facultad.getId());
            ResultSet rs = ps.executeQuery();
            DefaultComboBoxModel modelo = (DefaultComboBoxModel) combo.getModel();
            while (rs.next()) {
                CarreraTO obj = new CarreraTO();
                obj.setId(rs.getInt(1));
                obj.setNombre(rs.getString(2));
                obj.setId_facultad(rs.getInt(5));
                obj.setId_ciclo_max(rs.getInt(6));
                modelo.addElement(obj);
            }
        } catch (Exception ex) {
            Complementos.mostrarMensaje("Error al mostrar los planes de estudio disponibles " + ex);
        }
    }

    public static void limpiarList(JList lista) {
        ((DefaultListModel) lista.getModel()).removeAllElements();
    }

    public static void llenarListaCursosGenerales(JList lista, String nombre) {
        try {
            limpiarList(lista);
            PreparedStatement ps = conexion.Conexion.getInstancia().getConn().prepareStatement("SELECT * FROM curso where nombre_curso like ?");
            ps.setString(1, "%" + nombre + "%");
            ResultSet rs = ps.executeQuery();
            DefaultListModel<CursoTO> modelo = (DefaultListModel) lista.getModel();
            while (rs.next()) {
                CursoTO obj = new CursoTO();
                obj.setId(rs.getInt(1));
                obj.setNombre_curso(rs.getString(2));
                modelo.addElement(obj);
            }
        } catch (Exception ex) {
            Complementos.mostrarMensaje("Error al llenar los cursos generales " + ex);
        }
    }

    /**
     * busca por los cursos por ciclo, carrera y plan de estudios
     *
     * @param tabla
     * @param info
     */
    public static void llenarTablaCursoPorPlan(JTable tabla, Curso_Plan_TO info) {
        try {
            limpiartable(tabla);
            PreparedStatement ps = conexion.Conexion.getInstancia().getConn().prepareStatement("select idcurso_de_plan_estudios, c.nombre_curso,creditos,id_nombre_ciclo from curso_de_plan_estudios p inner join curso c on c.idcurso = p.id_curso where id_plan_estudios = ? and id_carrera = ? and id_nombre_ciclo = ? ");
            ps.setInt(1, info.getId_plan());
            ps.setInt(2, info.getId_carrera());
            ps.setInt(3, info.getId_ciclo());
            System.out.println("select idcurso_de_plan_estudios, c.nombre_curso,creditos,id_nombre_ciclo from curso_de_plan_estudios p inner join curso c on c.idcurso = p.id_curso where id_plan_estudios = "
                    + info.getId_plan() + " and id_carrera = " + info.getId_carrera() + " and id_nombre_ciclo = " + info.getId_ciclo());
            ResultSet rs = ps.executeQuery();
            DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
            while (rs.next()) {
                modelo.addRow(new Object[]{rs.getInt(1), rs.getString(2), rs.getDouble(3)});
            }
            System.out.println("llenado");
        } catch (Exception ex) {
            Complementos.mostrarMensaje("Error al llenar los cursos generales " + ex);
            ex.printStackTrace();
        }
    }
}
