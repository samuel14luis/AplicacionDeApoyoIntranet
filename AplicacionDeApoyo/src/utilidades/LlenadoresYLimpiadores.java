package utilidades;

import dao.CarreraDAO;
import dao.FacultadDAO;
import java.sql.ResultSet;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import to.FacultadTO;

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

    private static void limpiarComboBox(JComboBox combo) {
        DefaultComboBoxModel modelo = (DefaultComboBoxModel) combo.getModel();
        modelo.removeAllElements();
    }

    public static void llenarTableCarreras(JTable tabla, JComboBox facultades) throws Exception {
       limpiartable(tabla);
        CarreraDAO dao = new CarreraDAO();
        ResultSet rs = dao.getCarreras(
                (FacultadTO) ((DefaultComboBoxModel) facultades.getModel()).getSelectedItem()
        );
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        while(rs.next()){
            modelo.addRow(new Object[]{rs.getInt(1), rs.getString(2), rs.getDate(3)});
        }
    }

    private static void limpiartable(JTable tabla) {
        while(tabla.getModel().getRowCount() > 0){
            ((DefaultTableModel) tabla.getModel()).removeRow(0);
        }
    }
}