/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import to.FacultadTO;
import utilidades.Conversores;

/**
 *
 * @author Alisoft
 */
public class FacultadDAO {
    
    public void insertarFacultad(FacultadTO facultad) throws Exception{
        PreparedStatement ps = conexion.Conexion.getInstancia().getConn().prepareStatement("insert into facultad(nombre_facu,f_creacion) values (?,?)");
        ps.setString(1, facultad.getNombre());
        ps.setDate(2, Conversores.convertJavaDateToSqlDate(facultad.getCreacion()));
        ps.execute();
    }
    
    public ResultSet getFacultades() throws Exception{
        return conexion.Conexion.getInstancia().getConn().createStatement().executeQuery("select * from facultad");
    }
}
