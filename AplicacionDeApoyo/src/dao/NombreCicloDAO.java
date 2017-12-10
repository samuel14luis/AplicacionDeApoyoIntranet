package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author YERSY
 */
public class NombreCicloDAO {
    
    public void addNombreCiclo(String nombre_ciclo) throws Exception{
        PreparedStatement ps = conexion.Conexion.getInstancia().getConn().prepareStatement("insert into nombre_ciclo(nombre_ciclo) values (?)");
        ps.setString(1, nombre_ciclo);
        ps.execute();
    }
    
    public ResultSet getCiclos() throws Exception{
        return conexion.Conexion.getInstancia().getConn().createStatement().executeQuery("select * from nombre_ciclo");
    }
    
}
