package conexion;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Alisoft
 */
public class Conexion {

    static Conexion instancia = null;
    private Connection conn = null;

    public Conexion() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "123");
    }

    public static Conexion getInstancia() throws Exception {
        if (instancia == null) {
            instancia = new Conexion();
        }
        return instancia;
    }

    public Connection getConn() {
        return conn;
    }

    @Override
    protected void finalize() throws Throwable {
        if (!conn.isClosed()) {
            conn.close();        
        }
        conn = null;
        super.finalize(); //To change body of generated methods, choose Tools | Templates.
    }
}
