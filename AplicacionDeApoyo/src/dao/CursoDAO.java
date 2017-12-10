package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Alisoft
 */
public class CursoDAO {
    
    public void addNombreCiclo(String ciclo) throws Exception{
        PreparedStatement ps = conexion.Conexion.getInstancia().getConn().prepareStatement("insert into curso(nombre_curso) values (?)");
        ps.setString(1, ciclo);
        ps.execute();
    }
    
    public ResultSet getCiclos() throws Exception{
        return conexion.Conexion.getInstancia().getConn().createStatement().executeQuery("select * from curso");
    }
    
}
