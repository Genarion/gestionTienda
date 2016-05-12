/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.ControladorJFGestionArticulos;

/**
 *
 * @author Mario
 */
public class JFGestionArticulos extends javax.swing.JFrame {

    private ControladorJFGestionArticulos controlador;

    /**
     * Creates new form JFGestionArticulos
     */
    public JFGestionArticulos() {
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

        jButtonAnadirArticulo = new javax.swing.JButton();
        jButtonModificarArticulo = new javax.swing.JButton();
        jButtonBorrarArticulo = new javax.swing.JButton();
        jButtonVerArticulos = new javax.swing.JButton();
        jButtonVolver = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonAnadirArticulo.setText("Añadir Articulo");
        jButtonAnadirArticulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnadirArticuloActionPerformed(evt);
            }
        });

        jButtonModificarArticulo.setText("Modificar Articulo");
        jButtonModificarArticulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarArticuloActionPerformed(evt);
            }
        });

        jButtonBorrarArticulo.setText("Borrar Articulo");
        jButtonBorrarArticulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBorrarArticuloActionPerformed(evt);
            }
        });

        jButtonVerArticulos.setText("Ver Articulos");
        jButtonVerArticulos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerArticulosActionPerformed(evt);
            }
        });

        jButtonVolver.setText("Volver");
        jButtonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Articulos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonModificarArticulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonAnadirArticulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonBorrarArticulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonVerArticulos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(87, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonAnadirArticulo)
                .addGap(12, 12, 12)
                .addComponent(jButtonBorrarArticulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonModificarArticulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonVerArticulos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonVolver)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAnadirArticuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnadirArticuloActionPerformed
        controlador.anadirArticulos();
    }//GEN-LAST:event_jButtonAnadirArticuloActionPerformed

    private void jButtonBorrarArticuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBorrarArticuloActionPerformed
        controlador.borrarArticulo();
    }//GEN-LAST:event_jButtonBorrarArticuloActionPerformed

    private void jButtonModificarArticuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarArticuloActionPerformed
        controlador.modificarArticulos();
    }//GEN-LAST:event_jButtonModificarArticuloActionPerformed

    private void jButtonVerArticulosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerArticulosActionPerformed
        controlador.verArticulos();
    }//GEN-LAST:event_jButtonVerArticulosActionPerformed

    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed
        controlador.volver();
    }//GEN-LAST:event_jButtonVolverActionPerformed

    /**
     * Establece el controlador de la vista jfgestionarticulos
     * @param controlador controlador para la vista JFGestionArticulos
     */
    public void setControlador(ControladorJFGestionArticulos controlador) {
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
            java.util.logging.Logger.getLogger(JFGestionArticulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFGestionArticulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFGestionArticulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFGestionArticulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFGestionArticulos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAnadirArticulo;
    private javax.swing.JButton jButtonBorrarArticulo;
    private javax.swing.JButton jButtonModificarArticulo;
    private javax.swing.JButton jButtonVerArticulos;
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
