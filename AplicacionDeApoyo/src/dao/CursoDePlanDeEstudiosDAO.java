package dao;

import java.sql.PreparedStatement;
import to.Curso_Plan_TO;

/**
 *
 * @author Alisoft
 */
public class CursoDePlanDeEstudiosDAO {
    public void addCursoPlan(Curso_Plan_TO curso_plan) throws Exception{
        PreparedStatement ps = conexion.Conexion.getInstancia().getConn().prepareStatement(
                "insert into curso_de_plan_estudios(id_curso,id_carrera,id_plan_estudios,id_nombre_ciclo,creditos) values (?,?,?,?,?)");
        ps.setInt(1, curso_plan.getId_curso());
        ps.setInt(2, curso_plan.getId_carrera());
        ps.setInt(3, curso_plan.getId_plan());
        ps.setInt(4, curso_plan.getId_ciclo());
        ps.setDouble(5, curso_plan.getCreditos());
        ps.execute();
    }
    
}
