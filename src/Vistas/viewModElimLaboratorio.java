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
public class viewModElimLaboratorio extends javax.swing.JInternalFrame {

    private LaboratorioData laboratorioData;
    
    /**
     * Creates new form viewLaboratorio
     */
    
    public viewModElimLaboratorio(LaboratorioData laboratorioData) {
        initComponents();    
        this.laboratorioData = laboratorioData;
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
        jbBorrar = new javax.swing.JButton();
        jbActualizar = new javax.swing.JButton();
        jbBuscar = new javax.swing.JButton();
        jblimpiar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Formulario Manejo de Laboratorios ");

        jLabel3.setText("Nombre comercial");

        jLabel4.setText("Dirección");

        jLabel5.setText("País de origen");

        jtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtNombreKeyTyped(evt);
            }
        });

        jtDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtDireccionActionPerformed(evt);
            }
        });

        jbBorrar.setText("Borrar");
        jbBorrar.setEnabled(false);
        jbBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBorrarActionPerformed(evt);
            }
        });

        jbActualizar.setText("Actualizar");
        jbActualizar.setEnabled(false);
        jbActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbActualizarActionPerformed(evt);
            }
        });

        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jblimpiar.setText("Limpiar");
        jblimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jblimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtNombre)
                            .addComponent(jtDireccion)
                            .addComponent(jtPais)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jbBorrar)
                        .addGap(18, 18, 18)
                        .addComponent(jbActualizar)
                        .addGap(18, 18, 18)
                        .addComponent(jbBuscar)
                        .addGap(18, 18, 18)
                        .addComponent(jblimpiar)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 172, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(136, 136, 136))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jblimpiar)
                    .addComponent(jbBuscar)
                    .addComponent(jbActualizar)
                    .addComponent(jbBorrar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtDireccionActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
<<<<<<< Updated upstream
try{ 
        String nombre, pais, direccion;
        Laboratorio labo;
        int id = Integer.parseInt(jtId.getText());
        labo = laboratorioData.buscarLaboratorio(id);
        if(labo != null){
        nombre = labo.getNombreComercial();
        direccion = labo.getDireccion();
        pais = labo.getPaisDeOrigen();
        jtId.setEnabled(false);
            jtNombre.setText(nombre);
        jtDireccion.setText(direccion);
        jtPais.setText(pais);
        jbBorrar.setEnabled(true);
        jbActualizar.setEnabled(true);
                }else{
            JOptionPane.showMessageDialog(this, "No se encuentra en la DB");
        }
    }catch (NumberFormatException ex){
        JOptionPane.showMessageDialog(this, "Solo puede buscar por ID, pase a la versión PRO para más funciones");
    }        // TODO add your handling code here:
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBorrarActionPerformed
int id = Integer.parseInt(jtId.getText());
if (jtId.getText().compareToIgnoreCase("")!=1){
laboratorioData.borrarLaboratorio(id);  
jtId.setText("");
jtNombre.setText("");
jtDireccion.setText("");
jtPais.setText("");
jtId.setEnabled(true);
jbBorrar.setEnabled(false);
jbActualizar.setEnabled(false);
}else{
    JOptionPane.showMessageDialog(this, "Primero ingrese un ID y busque"); 
}

// TODO add your handling code here:
    }//GEN-LAST:event_jbBorrarActionPerformed

    private void jbActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbActualizarActionPerformed
     int id = Integer.parseInt(jtId.getText());
     String nombre, pais, direccion;
if (jtId.getText().compareToIgnoreCase("")!=1){
        nombre = jtNombre.getText();
        pais = jtPais.getText();
        direccion = jtDireccion.getText();
                
        Laboratorio labo= new Laboratorio(id, direccion, nombre, pais);
        laboratorioData.actualizarLaboratorio(labo);
        
jtId.setText("");
jtNombre.setText("");
jtDireccion.setText("");
jtPais.setText("");
jtId.setEnabled(true);
jbBorrar.setEnabled(false);
jbActualizar.setEnabled(false);
}else{
    JOptionPane.showMessageDialog(this, "Primero ingrese un ID y busque"); 
}   
=======
//try{ 
//        String nombre, pais, direccion;
//        Laboratorio labo;
////        int id = Integer.parseInt(jtId.getText());
////        labo = laboratorioData.buscarLaboratorio(id);
////        if(labo != null){
//        nombre = labo.getNombreComercial();
//        direccion = labo.getDireccion();
//        pais = labo.getPaisDeOrigen();
//        
//            jtNombre.setText(nombre);
//        jtDireccion.setText(direccion);
//        jtPais.setText(pais);
//        jbBorrar.setEnabled(true);
//        jbActualizar.setEnabled(true);
//                }
//    }catch (NumberFormatException ex){
//        JOptionPane.showMessageDialog(this, "Solo puede buscar por ID, se trabaja en la próxima versión de busqueda xD");
//    }        // TODO add your handling code here:
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBorrarActionPerformed
//////int id = Integer.parseInt(jtId.getText());
//////if (id != Integer.parseInt("")){
//////laboratorioData.borrarLaboratorio(id);  
//////jtNombre.setText("");
//////jtDireccion.setText("");
//////jtPais.setText("");
//////}else{
//////    JOptionPane.showMessageDialog(this, "Primero ingrese un ID y busque"); 
//////}
//////
//////// TODO add your handling code here:
    }//GEN-LAST:event_jbBorrarActionPerformed

    private void jbActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbActualizarActionPerformed
//     int id = Integer.parseInt(jtId.getText());
//     String nombre, pais, direccion;
//if (id != Integer.parseInt("")){
//        nombre = jtNombre.getText();
//        pais = jtPais.getText();
//        direccion = jtDireccion.getText();
//                
//        Laboratorio labo= new Laboratorio(id, direccion, nombre, pais);
//        laboratorioData.actualizarLaboratorio(labo);
//        
//jtNombre.setText("");
//jtDireccion.setText("");
//jtPais.setText("");
//}else{
//    JOptionPane.showMessageDialog(this, "Primero ingrese un ID y busque"); 
//}   
>>>>>>> Stashed changes
// TODO add your handling code here:
    }//GEN-LAST:event_jbActualizarActionPerformed

    private void jblimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jblimpiarActionPerformed
        // TODO add your handling code here:
        
jtNombre.setText("");
jtDireccion.setText("");
jtPais.setText("");
jbBorrar.setEnabled(false);
        jbActualizar.setEnabled(false);
        jtId.setEnabled(true);
        
    }//GEN-LAST:event_jblimpiarActionPerformed

    private void jtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtNombreKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jtNombreKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton jbActualizar;
    private javax.swing.JButton jbBorrar;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jblimpiar;
    private javax.swing.JTextField jtDireccion;
    private javax.swing.JTextField jtNombre;
    private javax.swing.JTextField jtPais;
    // End of variables declaration//GEN-END:variables
}
