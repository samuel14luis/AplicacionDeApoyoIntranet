/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import dao.CarreraDAO;
import to.CarreraTO;
import to.FacultadTO;
import to.NombreCicloTO;
import utilidades.Complementos;
import utilidades.FotoTO;
import utilidades.LlenadoresYLimpiadores;

/**
 *
 * @author Alisoft
 */
public class CarreraGUI extends javax.swing.JFrame {

    FotoTO foto = null;
    public CarreraGUI() {
        initComponents();
        habilitarFormulario(false);
        LlenadoresYLimpiadores.llenarComboBoxFacultades(jcbxFacultades);
        llenarDatos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jcbxFacultades = new javax.swing.JComboBox<>();
        jbtnNuevaCarrera = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jtxtNombreCarrera = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jlblLogo = new javax.swing.JLabel();
        jbtnCancelar = new javax.swing.JButton();
        jbtnAgregarEAP = new javax.swing.JButton();
        jbtnSubirLogo = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jcbxCicloMax = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Facultad:");

        jcbxFacultades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbxFacultadesActionPerformed(evt);
            }
        });

        jbtnNuevaCarrera.setText("Nueva E.A.P:");
        jbtnNuevaCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNuevaCarreraActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Carrera Profesional", "Creación", "Ciclos"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(100);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(100);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setMinWidth(140);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(140);
            jTable1.getColumnModel().getColumn(2).setMaxWidth(140);
        }

        jPanel2.setBackground(new java.awt.Color(253, 253, 253));

        jLabel2.setText("Nombre:");

        jLabel3.setText("Fecha deCreación:");

        jlblLogo.setBackground(new java.awt.Color(204, 51, 255));
        jlblLogo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));

        jbtnCancelar.setText("cancelar");
        jbtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCancelarActionPerformed(evt);
            }
        });

        jbtnAgregarEAP.setText("Agregar E.A.P");
        jbtnAgregarEAP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAgregarEAPActionPerformed(evt);
            }
        });

        jbtnSubirLogo.setText("subir logo");
        jbtnSubirLogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSubirLogoActionPerformed(evt);
            }
        });

        jLabel4.setText("Ciclo máximo:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtxtNombreCarrera))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jcbxCicloMax, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jbtnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtnAgregarEAP, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                        .addComponent(jbtnSubirLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jlblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jtxtNombreCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(jcbxCicloMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbtnCancelar)
                            .addComponent(jbtnAgregarEAP)
                            .addComponent(jbtnSubirLogo)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jlblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jcbxFacultades, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtnNuevaCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jcbxFacultades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnNuevaCarrera))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnNuevaCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNuevaCarreraActionPerformed
        habilitarFormulario(true);
    }//GEN-LAST:event_jbtnNuevaCarreraActionPerformed

    private void jbtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCancelarActionPerformed
        habilitarFormulario(false);
    }//GEN-LAST:event_jbtnCancelarActionPerformed

    private void jbtnAgregarEAPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAgregarEAPActionPerformed
        if (!jtxtNombreCarrera.getText().isEmpty() && jDateChooser1.getDate() != null) {
            CarreraDAO dao = new CarreraDAO();
            CarreraTO obj = new CarreraTO();
            obj.setNombre(jtxtNombreCarrera.getText());
            obj.setCreacion(jDateChooser1.getDate());
            obj.setId_facultad(((FacultadTO) jcbxFacultades.getModel().getSelectedItem()).getId());
            obj.setFoto(foto.getFoto());
            obj.setLong_bytes(foto.getLong_bytes());
            obj.setId_ciclo_max(
                    ((NombreCicloTO) jcbxCicloMax.getSelectedItem()).getId()
            );
            try {
                dao.insertarCarrera(obj);
                llenarDatos();
                Complementos.mostrarMensaje("Carrera insertada correctamente");
            } catch (Exception e) {
                Complementos.mostrarMensaje("error al insertar los datos");
            }
        }else{            
            Complementos.mostrarMensaje("Debe llenar los datos requeridos");
        }
        habilitarFormulario(false);
    }//GEN-LAST:event_jbtnAgregarEAPActionPerformed

    private void jbtnSubirLogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSubirLogoActionPerformed
        try {
            foto = Complementos.leerFotoALabel(jlblLogo, jlblLogo.getWidth(), jlblLogo.getHeight());            
        } catch (Exception ex) {
            Complementos.mostrarMensaje("Error al cargar el logo: "+ex);
        }
    }//GEN-LAST:event_jbtnSubirLogoActionPerformed

    private void jcbxFacultadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbxFacultadesActionPerformed
        llenarDatos();
    }//GEN-LAST:event_jcbxFacultadesActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbtnAgregarEAP;
    private javax.swing.JButton jbtnCancelar;
    private javax.swing.JButton jbtnNuevaCarrera;
    private javax.swing.JButton jbtnSubirLogo;
    private javax.swing.JComboBox<String> jcbxCicloMax;
    private javax.swing.JComboBox<String> jcbxFacultades;
    private javax.swing.JLabel jlblLogo;
    private javax.swing.JTextField jtxtNombreCarrera;
    // End of variables declaration//GEN-END:variables

    private void habilitarFormulario(boolean b) {
        limpiarformulario();
        jbtnNuevaCarrera.setEnabled(!b);
        jbtnAgregarEAP.setEnabled(b);
        jbtnCancelar.setEnabled(b);
        jbtnSubirLogo.setEnabled(b);
        jtxtNombreCarrera.setEditable(b);
        jDateChooser1.setEnabled(b);
        if (b) {
            LlenadoresYLimpiadores.llenarComboBoxCiclo(jcbxCicloMax);
        } else {
            LlenadoresYLimpiadores.limpiarComboBox(jcbxCicloMax);
        }
    }

    private void limpiarformulario() {
        jtxtNombreCarrera.setText(null);
        jDateChooser1.setDate(null);
        jlblLogo.setIcon(null);
    }

    private void llenarDatos() {
        try {
            LlenadoresYLimpiadores.llenarTableCarreras(jTable1,jcbxFacultades);
        } catch (Exception ex) {
            Complementos.mostrarMensaje("Error al llenar los datos");
        }
    }

}
