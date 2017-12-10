/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complementos;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alisoft
 */
public class TableModelHorario extends DefaultTableModel {

    public TableModelHorario() {
        super(new Object[][]{
            {
                "11:45 - 12:30", "3305251", 
                "TALLER DE DESARROLLO DE SOFTWARE I", "ING. FARRO PACÍFICO Edwin Iván", 
                1, 0, 6, 7,
                null, null, null, null, null, null, null
            },
            {null, null, null, null},
            {null, null, null, null},
            {null, null, null, null}
        }, new String[]{
            "HORA", "CODIGO", 
            "ASIGNATURA", "DOCENTE", 
            "HT", "HP", "HL", "TH", 
            "LUNES", "MARTES", "MIÉRCOLES", "JUEVES", "VIERNES", "SÁBADO", "DOMINGO"
        });
    }

    Class[] types = new Class[]{
        java.lang.String.class, java.lang.String.class,
        java.lang.String.class, java.lang.String.class,
        java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class,
        java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class,
    };

    public Class getColumnClass(int columnIndex) {
        return types[columnIndex];
    }
}
