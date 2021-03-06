/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Controladores.Conexion;
import Modelos.Laboratorio;
import Controladores.LaboratorioData;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ceratto
 */
public class viewAgregarLaboratorio extends javax.swing.JInternalFrame {

    /**
     * Creates new form viewLaboratorio
     */
    private LaboratorioData laboratorioData;
    
    public viewAgregarLaboratorio(LaboratorioData laboratorioData) {
        initComponents();
        this.laboratorioData = laboratorioData;
    }
    
    public void guardarLaboratorio(){
        Laboratorio labo = new Laboratorio(jtDireccion.getText(), jtNombre.getText() , jtPais.getText());
        laboratorioData.guardarLaboratorio(labo);
        limpiar();
    }
    
    public void limpiar(){
        jtNombre.setText("");
        jtDireccion.setText("");
        jtPais.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtNombre = new javax.swing.JTextField();
        jtDireccion = new javax.swing.JTextField();
        jtPais = new javax.swing.JTextField();
        jbGuardar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Formulario Agregar Laboratorio");

        jLabel3.setText("Nombre comercial");

        jLabel4.setText("Direcci??n");

        jLabel5.setText("Pa??s de origen");

        jtDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtDireccionActionPerformed(evt);
            }
        });

        jtPais.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtPaisKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtPaisKeyTyped(evt);
            }
        });

        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtNombre)
                    .addComponent(jtDireccion)
                    .addComponent(jtPais)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jbGuardar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(132, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(116, 116, 116))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jtNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jtPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbGuardar)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtDireccionActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed

        // TODO add your handling code here:
        String nombre = jtNombre.getText();
        String direccion = jtDireccion.getText();
        String pais = jtPais.getText();
        if(jtNombre.getText().trim().length() != 0  && jtDireccion.getText().trim().length() != 0 && jtPais.getText().trim().length() != 0){
        Laboratorio labo = new Laboratorio(nombre, direccion, pais);
        laboratorioData.guardarLaboratorio(labo);
        jtNombre.setText("");
        jtDireccion.setText("");
        jtPais.setText("");
        }else{
            JOptionPane.showMessageDialog(this, "Faltan completar campos");
            jtNombre.requestFocus();
        }

        guardarLaboratorio();

    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jtPaisKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtPaisKeyPressed
        
    }//GEN-LAST:event_jtPaisKeyPressed

    private void jtPaisKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtPaisKeyTyped
        char c = evt.getKeyChar();
        if ((Character.isDigit(c))) {
            evt.consume();
        }
    }//GEN-LAST:event_jtPaisKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JTextField jtDireccion;
    private javax.swing.JTextField jtNombre;
    private javax.swing.JTextField jtPais;
    // End of variables declaration//GEN-END:variables
}
