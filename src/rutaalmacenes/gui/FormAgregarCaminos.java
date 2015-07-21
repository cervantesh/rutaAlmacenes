/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rutaalmacenes.gui;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import rutaalmacenes.logic.*;

/**
 *
 * @author Seelee
 */
public class FormAgregarCaminos extends javax.swing.JFrame {

    /**
     * Creates new form FormManipulacionAlmacen
     */
    
    Grafo grafo;
    
    public FormAgregarCaminos(Grafo grafo) {
        initComponents();
        aplicarFormatos();
        this.grafo = grafo;
        try {
            llenarComboBoxesForm(cbInicio, cbDestino, grafo);
        } catch (Exception ex) {
            Logger.getLogger(FormAgregarCaminos.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    private void aplicarFormatos()
    {
        setLocationRelativeTo(null);
                
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbAlmacen01 = new javax.swing.JLabel();
        lbDestino = new javax.swing.JLabel();
        tfNombre1 = new javax.swing.JFormattedTextField();
        lbHoraInicio = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        cbInicio = new javax.swing.JComboBox();
        cbDestino = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Agregar Camino");

        lbAlmacen01.setText("Inicio");

        lbDestino.setText("Destino");

        lbHoraInicio.setText("Tiempo");

        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        cbInicio.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cbDestino.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbHoraInicio)
                            .addComponent(lbAlmacen01)
                            .addComponent(lbDestino))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbDestino, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfNombre1)
                            .addComponent(cbInicio, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(260, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAgregar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbAlmacen01)
                    .addComponent(cbInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDestino)
                    .addComponent(cbDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbHoraInicio)
                    .addComponent(tfNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(btnAgregar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnAgregar.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        
        if(validarAgregarCamino(this.grafo, cbInicio.getSelectedItem(), cbDestino.getSelectedItem()))
        {
            JOptionPane.showMessageDialog(rootPane, "Almacen Agregado Exitosamente");
            this.dispose();
        }
        
        
    }//GEN-LAST:event_btnAgregarActionPerformed
    
    private void llenarComboBoxesForm(javax.swing.JComboBox jc1,javax.swing.JComboBox jc2, Grafo grafo) throws Exception
    {
        AyudaGUI.llenarComboBox(jc1,  grafo);
        AyudaGUI.llenarComboBox(jc2,  grafo);
    }
    
    private boolean validarAgregarCamino(Grafo grafo, Object a1, Object a2)
    {
        try {
            if (grafo.EstaElArco(a1, a2)) {
                JOptionPane.showMessageDialog(rootPane, "Existe el Camino");
                return false; 
            }
            
        } catch (Exception ex) {
            Logger.getLogger(FormAgregarCaminos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return true;
    }
    
    
    
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JComboBox cbDestino;
    private javax.swing.JComboBox cbInicio;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lbAlmacen01;
    private javax.swing.JLabel lbDestino;
    private javax.swing.JLabel lbHoraInicio;
    private javax.swing.JFormattedTextField tfNombre1;
    // End of variables declaration//GEN-END:variables
}
