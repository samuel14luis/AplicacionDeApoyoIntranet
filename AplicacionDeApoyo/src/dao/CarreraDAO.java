package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import to.CarreraTO;
import to.FacultadTO;
import utilidades.Conversores;

/**
 *
 * @author Alisoft
 */
public class CarreraDAO {

    public void insertarCarrera(CarreraTO carrera) throws Exception {
        PreparedStatement ps = conexion.Conexion.getInstancia().getConn().prepareStatement("insert into carrera(nombre_carrera,f_creacion,logo,id_facultad) values (?,?,?,?);");
        ps.setString(1, carrera.getNombre());
        ps.setDate(2, Conversores.convertJavaDateToSqlDate(carrera.getCreacion()));
        ps.setBinaryStream(3, carrera.getFoto(), carrera.getLong_bytes());
        ps.setInt(4, carrera.getId_facultad());
        ps.execute();
    }

    public ResultSet getCarreras(FacultadTO facultad) throws Exception {
        //SELECT idCARRERA, nombre_carrera,f_creacion,logo,id_facultad FROM carrera c where id_facultad = 1;
        PreparedStatement ps =  conexion.Conexion.getInstancia().getConn().prepareStatement("select * from carrera where id_facultad = ?");
        ps.setInt(1, facultad.getId());
        return ps.executeQuery();
    }
}
