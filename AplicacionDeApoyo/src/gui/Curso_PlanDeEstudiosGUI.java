package gui;

import to.CarreraTO;
import to.Curso_Plan_TO;
import to.FacultadTO;
import to.NombreCicloTO;
import to.PlanDeEstudioTO;
import utilidades.LlenadoresYLimpiadores;

/**
 *
 * @author Alisoft
 */
public class Curso_PlanDeEstudiosGUI extends javax.swing.JFrame {

    Curso_Plan_TO info_plan_curso;

    public Curso_PlanDeEstudiosGUI() {
        initComponents();
        LlenadoresYLimpiadores.llenarComboBoxPlanEstudio(jcbxPlanDeEstudio);
        LlenadoresYLimpiadores.llenarComboBoxFacultades(jcbxFacultad);
        LlenadoresYLimpiadores.llenarComboBoxEAP(jcbxEscuela, (FacultadTO) jcbxFacultad.getSelectedItem());
        LlenadoresYLimpiadores.llenarComboBoxCiclo(jcbxCiclo, (CarreraTO) jcbxEscuela.getSelectedItem());
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
        jLabel2 = new javax.swing.JLabel();
        jcbxPlanDeEstudio = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jcbxCiclo = new javax.swing.JComboBox<>();
        jcbxEscuela = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblCursosDePlan = new javax.swing.JTable();
        jbtnAgregarCurso = new javax.swing.JButton();
        jcbxFacultad = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Plan de estudios:");

        jLabel2.setText("E.A.P.:");

        jLabel3.setText("Ciclo:");

        jcbxCiclo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbxCicloActionPerformed(evt);
            }
        });

        jcbxEscuela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbxEscuelaActionPerformed(evt);
            }
        });

        jtblCursosDePlan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Nombre", "Créditos"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtblCursosDePlan.setGridColor(new java.awt.Color(255, 255, 255));
        jtblCursosDePlan.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jtblCursosDePlan.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jtblCursosDePlan);
        if (jtblCursosDePlan.getColumnModel().getColumnCount() > 0) {
            jtblCursosDePlan.getColumnModel().getColumn(0).setMinWidth(100);
            jtblCursosDePlan.getColumnModel().getColumn(0).setPreferredWidth(100);
            jtblCursosDePlan.getColumnModel().getColumn(0).setMaxWidth(100);
            jtblCursosDePlan.getColumnModel().getColumn(2).setMinWidth(80);
            jtblCursosDePlan.getColumnModel().getColumn(2).setPreferredWidth(80);
            jtblCursosDePlan.getColumnModel().getColumn(2).setMaxWidth(80);
        }

        jbtnAgregarCurso.setText("Agregar Nuevo Curso");
        jbtnAgregarCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAgregarCursoActionPerformed(evt);
            }
        });

        jcbxFacultad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbxFacultadActionPerformed(evt);
            }
        });

        jLabel4.setText("Facultad:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jcbxPlanDeEstudio, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(224, 224, 224))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbtnAgregarCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2))
                                .addGap(47, 47, 47)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jcbxEscuela, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jcbxCiclo, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jcbxFacultad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(208, 208, 208)))))
                        .addGap(16, 16, 16))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jcbxPlanDeEstudio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jcbxFacultad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcbxEscuela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jcbxCiclo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(jbtnAgregarCurso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE)
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

    private void jbtnAgregarCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAgregarCursoActionPerformed
        actualizarVariableInfo();
        CursosGenericosDisponiblesGUI gui = new CursosGenericosDisponiblesGUI(this, info_plan_curso);
        setVisible(false);
        gui.setVisible(true);
        llenarDatos();
    }//GEN-LAST:event_jbtnAgregarCursoActionPerformed

    private void jcbxFacultadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbxFacultadActionPerformed
        LlenadoresYLimpiadores.llenarComboBoxEAP(jcbxEscuela, (FacultadTO) jcbxFacultad.getSelectedItem());
        LlenadoresYLimpiadores.llenarComboBoxCiclo(jcbxCiclo, (CarreraTO) jcbxEscuela.getSelectedItem());
    }//GEN-LAST:event_jcbxFacultadActionPerformed

    private void jcbxCicloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbxCicloActionPerformed
        llenarDatos();
    }//GEN-LAST:event_jcbxCicloActionPerformed

    private void jcbxEscuelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbxEscuelaActionPerformed
        llenarDatos();
    }//GEN-LAST:event_jcbxEscuelaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnAgregarCurso;
    private javax.swing.JComboBox<String> jcbxCiclo;
    private javax.swing.JComboBox<String> jcbxEscuela;
    private javax.swing.JComboBox<String> jcbxFacultad;
    private javax.swing.JComboBox<String> jcbxPlanDeEstudio;
    private javax.swing.JTable jtblCursosDePlan;
    // End of variables declaration//GEN-END:variables

    public void llenarDatos() {
        actualizarVariableInfo();
        LlenadoresYLimpiadores.limpiartable(jtblCursosDePlan);
        LlenadoresYLimpiadores.llenarTablaCursoPorPlan(jtblCursosDePlan, info_plan_curso);
    }

    private void actualizarVariableInfo() {
        try {
            info_plan_curso = new Curso_Plan_TO();
            info_plan_curso.setId_carrera(((CarreraTO) jcbxEscuela.getSelectedItem()).getId());
            info_plan_curso.setId_ciclo(((NombreCicloTO) jcbxCiclo.getSelectedItem()).getId());
            info_plan_curso.setId_plan(((PlanDeEstudioTO) jcbxPlanDeEstudio.getSelectedItem()).getId());
        } catch (Exception e) {
        }
    }

}
