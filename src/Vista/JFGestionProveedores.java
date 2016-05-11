/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.ControladorJFGestionProveedores;

/**
 *
 * @author Mario
 */
public class JFGestionProveedores extends javax.swing.JFrame {

    private ControladorJFGestionProveedores controlador;
    /**
     * Creates new form JFGestionProveedores
     */
    public JFGestionProveedores() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonAnadirProveedor = new javax.swing.JButton();
        jButtonBorrarProveedor = new javax.swing.JButton();
        jButtonModificarProveedor = new javax.swing.JButton();
        jButtonVerProveedores = new javax.swing.JButton();
        jButtonVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonAnadirProveedor.setText("Añadir Proveedor");
        jButtonAnadirProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnadirProveedorActionPerformed(evt);
            }
        });

        jButtonBorrarProveedor.setText("Borrar Proveedor");
        jButtonBorrarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBorrarProveedorActionPerformed(evt);
            }
        });

        jButtonModificarProveedor.setText("Modificar Proveedor");
        jButtonModificarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarProveedorActionPerformed(evt);
            }
        });

        jButtonVerProveedores.setText("Ver Proveedores");
        jButtonVerProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerProveedoresActionPerformed(evt);
            }
        });

        jButtonVolver.setText("Volver");
        jButtonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonVerProveedores)
                            .addComponent(jButtonModificarProveedor)
                            .addComponent(jButtonBorrarProveedor)
                            .addComponent(jButtonAnadirProveedor)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(jButtonVolver)))
                .addContainerGap(116, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jButtonAnadirProveedor)
                .addGap(18, 18, 18)
                .addComponent(jButtonBorrarProveedor)
                .addGap(18, 18, 18)
                .addComponent(jButtonModificarProveedor)
                .addGap(18, 18, 18)
                .addComponent(jButtonVerProveedores)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(jButtonVolver)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAnadirProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnadirProveedorActionPerformed
        // TODO add your handling code here:
        controlador.anadirProveedor();
    }//GEN-LAST:event_jButtonAnadirProveedorActionPerformed

    private void jButtonBorrarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBorrarProveedorActionPerformed
        // TODO add your handling code here:
        controlador.borrarProveedor();
    }//GEN-LAST:event_jButtonBorrarProveedorActionPerformed

    private void jButtonModificarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarProveedorActionPerformed
        // TODO add your handling code here:
        controlador.modificarProveedor();
    }//GEN-LAST:event_jButtonModificarProveedorActionPerformed

    private void jButtonVerProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerProveedoresActionPerformed
        // TODO add your handling code here:
        controlador.verProveedor();
    }//GEN-LAST:event_jButtonVerProveedoresActionPerformed

    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed
        // TODO add your handling code here:
        controlador.volver();
    }//GEN-LAST:event_jButtonVolverActionPerformed

    public void setControlador(ControladorJFGestionProveedores controlador) {
        this.controlador = controlador;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFGestionProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFGestionProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFGestionProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFGestionProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFGestionProveedores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAnadirProveedor;
    private javax.swing.JButton jButtonBorrarProveedor;
    private javax.swing.JButton jButtonModificarProveedor;
    private javax.swing.JButton jButtonVerProveedores;
    private javax.swing.JButton jButtonVolver;
    // End of variables declaration//GEN-END:variables
}
