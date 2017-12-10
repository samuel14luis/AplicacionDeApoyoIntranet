/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complementos;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author Alisoft
 */
public class JTableHorario extends JTable {

    public JTableHorario() {
        this.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                    {
                        "11:45 - 12:30", "3305251",
                        "TALLER DE DESARROLLO DE SOFTWARE I", "ING. FARRO PACÍFICO Edwin Iván",
                        1, 0, 6, 7,
                        null, null, null, null, null, null, null
                    }
                }, new String[]{
                    "HORA", "sCODIGO",
                    "ASIGNATURA", "DOCENTE",
                    "HT", "HP", "HL", "TH",
                    "LUNES", "MARTES", "MIÉRCOLES", "JUEVES", "VIERNES", "SÁBADO", "DOMINGO"
                }
        ) {
            Class[] types = new Class[]{
                java.lang.String.class, java.lang.String.class,
                java.lang.String.class, java.lang.String.class,
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class,
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class,};

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

        });

        if (getColumnModel()
                .getColumnCount() > 0) {
            getColumnModel().getColumn(0).setMinWidth(80);
            getColumnModel().getColumn(0).setPreferredWidth(80);
            getColumnModel().getColumn(0).setMaxWidth(80);

            getColumnModel().getColumn(1).setMinWidth(100);
            getColumnModel().getColumn(1).setPreferredWidth(100);
            getColumnModel().getColumn(1).setMaxWidth(100);
        }
    }

    public Component prepareRenderer(TableCellRenderer renderer, int row, int column) {
        Component component = super.prepareRenderer(renderer, row, column);
        component.setBackground(Color.WHITE);
        component.setForeground(Color.BLACK);
        if (column > 7) {
            component.setBackground(Color.green);
            component.setForeground(Color.WHITE);
        }
        return component;
    }

}
