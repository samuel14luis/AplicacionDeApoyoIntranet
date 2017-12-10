package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import to.UsuarioTO;

/**
 *
 * @author Alisoft
 */
public class UsuarioDAO implements dao.manejador<UsuarioTO> {

    @Override
    public void insert(UsuarioTO objObjeto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(UsuarioTO objObjeto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(UsuarioTO objObjeto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResultSet buscar(Object key) throws Exception {
        return null;
    }

    /**
     *
     * @param usuario
     * @return -1 si el usuario no existe, 0 si el usuario existe pero la
     * contaseña es incorrecta, y 1 si el usuario existe y la contraseña es
     * correcta
     * @throws Exception
     */
    public int validar(UsuarioTO usuario) throws Exception {
        PreparedStatement ps = conexion.Conexion.getInstancia().getConn().prepareStatement("select * from usuario where nombre = ?");
        ps.setString(1, usuario.getNombre());
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            ps = conexion.Conexion.getInstancia().getConn().prepareStatement("select * from usuario where nombre = ? and pass = ?");
            ps.setString(1, usuario.getNombre());
            ps.setString(2, usuario.getPass());
            rs = ps.executeQuery();
            if (rs.next()) {
                return 1;
            } else {
                return 0;
            }
        } else {
            return -1;
        }
    }

}
