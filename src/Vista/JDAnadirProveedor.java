/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.ControladorJDAnadirProveedor;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Alejandroo
 */
public class JDAnadirProveedor extends javax.swing.JDialog {

    private ControladorJDAnadirProveedor controlador;

    /**
     * Creates new form VistaAnadirProveedor
     *
     * @param parent
     * @param modal
     */
    public JDAnadirProveedor(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        jTextFieldNombreProveedor = new javax.swing.JTextField();
        jTextFieldNifProveedor = new javax.swing.JTextField();
        jTextFieldDireccionProveedor = new javax.swing.JTextField();
        jTextFieldTelefonoProveedor = new javax.swing.JTextField();
        jButtonAceptar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonBorrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldEmailProveedor = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Añadir Proveedor");
        setResizable(false);

        jTextFieldNombreProveedor.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nombre", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));
        jTextFieldNombreProveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldNombreProveedorKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldNombreProveedorKeyTyped(evt);
            }
        });

        jTextFieldNifProveedor.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "NIF", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));
        jTextFieldNifProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNifProveedorActionPerformed(evt);
            }
        });
        jTextFieldNifProveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldNifProveedorKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldNifProveedorKeyTyped(evt);
            }
        });

        jTextFieldDireccionProveedor.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Direccion", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));

        jTextFieldTelefonoProveedor.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Telefono", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));
        jTextFieldTelefonoProveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldTelefonoProveedorKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldTelefonoProveedorKeyTyped(evt);
            }
        });

        jButtonAceptar.setText("Aceptar");
        jButtonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAceptarActionPerformed(evt);
            }
        });

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jButtonBorrar.setText("Borrar Todo");
        jButtonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBorrarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Añadir Proveedor");

        jTextFieldEmailProveedor.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Email", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jButtonAceptar)
                        .addGap(64, 64, 64)
                        .addComponent(jButtonBorrar)
                        .addGap(79, 79, 79)
                        .addComponent(jButtonCancelar))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextFieldNombreProveedor)
                            .addComponent(jTextFieldNifProveedor)
                            .addComponent(jTextFieldDireccionProveedor)
                            .addComponent(jTextFieldTelefonoProveedor)
                            .addComponent(jTextFieldEmailProveedor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldNombreProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldNifProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldDireccionProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldEmailProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldTelefonoProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAceptar)
                    .addComponent(jButtonBorrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonCancelar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBorrarActionPerformed
        controlador.limpiaDatos();
    }//GEN-LAST:event_jButtonBorrarActionPerformed

    private void jTextFieldNombreProveedorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNombreProveedorKeyPressed
        char c = evt.getKeyChar();
        if (!Character.isLetter(c) && evt.getKeyCode() != KeyEvent.VK_BACK_SPACE && evt.getKeyCode() != KeyEvent.VK_CAPS_LOCK) {
            evt.consume();
            JOptionPane.showMessageDialog(this, "Debes introducir solo letras", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jTextFieldNombreProveedorKeyPressed

    private void jTextFieldNombreProveedorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNombreProveedorKeyTyped
        char c = evt.getKeyChar();
        if (Character.isDigit(c) || !Character.isLetter(c)) {
            evt.consume();

        }
    }//GEN-LAST:event_jTextFieldNombreProveedorKeyTyped

    private void jTextFieldNifProveedorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNifProveedorKeyTyped
        char c = evt.getKeyChar();

        if (jTextFieldNifProveedor.getText().length() == 9) {
            evt.consume();
            JOptionPane.showMessageDialog(this, "El NIF no puede contener mas de 9 caracteres", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        if (jTextFieldNifProveedor.getText().length() < 8) {

            if (!Character.isDigit(c)) {
                evt.consume();

            }
        }

        if (jTextFieldNifProveedor.getText().length() == 8) {
            if (Character.isDigit(c) || !Character.isLetter(c)) {
                evt.consume();
            }

        }

    }//GEN-LAST:event_jTextFieldNifProveedorKeyTyped

    private void jTextFieldNifProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNifProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNifProveedorActionPerformed

    private void jTextFieldNifProveedorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNifProveedorKeyPressed
        char c = evt.getKeyChar();

        if (jTextFieldNifProveedor.getText().length() < 8) {

            if (!Character.isDigit(c) && evt.getKeyCode() != KeyEvent.VK_BACK_SPACE && evt.getKeyCode() != KeyEvent.VK_CAPS_LOCK) {
                evt.consume();
                JOptionPane.showMessageDialog(this, "Solo se pueden introducir caracteres numericos", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
        if (jTextFieldNifProveedor.getText().length() == 8) {

            if (Character.isDigit(c) || !Character.isLetter(c) && evt.getKeyCode() != KeyEvent.VK_BACK_SPACE && evt.getKeyCode() != KeyEvent.VK_CAPS_LOCK) {
                evt.consume();
                JOptionPane.showMessageDialog(this, "Debes escribir una letra", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jTextFieldNifProveedorKeyPressed

    private void jButtonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceptarActionPerformed
        controlador.checkNif();
        controlador.comprobador();
        controlador.limpiaDatos();
    }//GEN-LAST:event_jButtonAceptarActionPerformed

    private void jTextFieldTelefonoProveedorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldTelefonoProveedorKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)|| !(jTextFieldTelefonoProveedor.getText().length() < 6)) {
            evt.consume();

        }
    }//GEN-LAST:event_jTextFieldTelefonoProveedorKeyTyped

    private void jTextFieldTelefonoProveedorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldTelefonoProveedorKeyPressed
        char c = evt.getKeyChar();
        if (!Character.isDigit(c) || !(jTextFieldTelefonoProveedor.getText().length() < 6)) {
            evt.consume();
            JOptionPane.showMessageDialog(this, "Solo digitos y maximo 6", "Error al instroducir telefono", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jTextFieldTelefonoProveedorKeyPressed

    /**
     * Obtiene el texto del cuadro en el que se escriben la direccion
     *
     * @return direccionProveedor
     */
    public JTextField getjTextFieldDireccionProveedor() {
        return jTextFieldDireccionProveedor;
    }

    /**
     * Modifica el valor del cuadro en el que se escribe la direccion
     *
     * @param jTextFieldDireccionProveedor
     */
    public void setjTextFieldDireccionProveedor(JTextField jTextFieldDireccionProveedor) {
        this.jTextFieldDireccionProveedor = jTextFieldDireccionProveedor;
    }

    /**
     * Obtiene el texto del cuadro en el que se escriben el dni
     *
     * @return nifProveedor
     */
    public JTextField getjTextFieldNifProveedor() {
        return jTextFieldNifProveedor;
    }

    /**
     * Modifica el valor del cuadro en el que se escribe el dni
     *
     * @param jTextFieldNifProveedor
     */
    public void setjTextFieldNifProveedor(JTextField jTextFieldNifProveedor) {
        this.jTextFieldNifProveedor = jTextFieldNifProveedor;
    }

    /**
     * Obtiene el texto del cuadro en el que se escribe el email
     *
     * @return jTextFieldEmailProveedor
     */
    public JTextField getjTextFieldEmailProveedor() {
        return jTextFieldTelefonoProveedor;
    }

    /**
     * Modifica el valor del cuadro en el que se escribe el email
     *
     * @param jTextFieldEmailProveedor
     */
    public void setjTextFieldEmailProveedor(JTextField jTextFieldEmailProveedor) {
        this.jTextFieldTelefonoProveedor = jTextFieldEmailProveedor;
    }

    /**
     * Obtiene el texto del cuadro en el que se escribe el nombre
     *
     * @return jTextFieldNombreProveedor
     */
    public JTextField getjTextFieldNombreProveedor() {
        return jTextFieldNombreProveedor;
    }

    /**
     * Modifica el valor del cuadro en el que se escribe el nombre
     *
     * @param jTextFieldNombreProveedor
     */
    public void setjTextFieldNombreProveedor(JTextField jTextFieldNombreProveedor) {
        this.jTextFieldNombreProveedor = jTextFieldNombreProveedor;
    }

    public JTextField getjTextFieldTelefonoProveedor() {
        return jTextFieldTelefonoProveedor;
    }

    public void setjTextFieldTelefonoProveedor(JTextField jTextFieldTelefonoProveedor) {
        this.jTextFieldTelefonoProveedor = jTextFieldTelefonoProveedor;
    }

    public void setControlador(ControladorJDAnadirProveedor controlador) {
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
            java.util.logging.Logger.getLogger(JDAnadirProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDAnadirProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDAnadirProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDAnadirProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDAnadirProveedor dialog = new JDAnadirProveedor(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAceptar;
    private javax.swing.JButton jButtonBorrar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextFieldDireccionProveedor;
    private javax.swing.JTextField jTextFieldEmailProveedor;
    private javax.swing.JTextField jTextFieldNifProveedor;
    private javax.swing.JTextField jTextFieldNombreProveedor;
    private javax.swing.JTextField jTextFieldTelefonoProveedor;
    // End of variables declaration//GEN-END:variables
}
