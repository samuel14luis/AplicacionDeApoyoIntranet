/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.ResultSet;

/**
 *
 * @author Angello
 */
public interface manejador <Objeto>{
      public void insert (Objeto objObjeto) throws Exception;
    public void update(Objeto objObjeto) throws Exception;
    public void delete(Objeto objObjeto) throws Exception;
    public ResultSet buscar(Object key) throws Exception;
}
