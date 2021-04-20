package reservas_hotel;

import cliente_PCK.*;
import habitacion_PCK.*;

public class MenuPrincipal extends javax.swing.JFrame {

    // atributos
    private VentanaCliente ventanaCliente;
    private VentanaHabitacion ventanaHabitacion;
    // private VentanaReserva ventanaReserva;

    // constructor
    public MenuPrincipal() {
        initComponents();

        // inicializar las ventanas
        ventanaCliente = new VentanaCliente();
        ventanaHabitacion = new VentanaHabitacion();
        //ventanaReserva = new VentanaReserva();

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

        bt_menuP_clientes = new javax.swing.JButton();
        bt_menuP_habitaciones = new javax.swing.JButton();
        bt_menuP_reservas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menú Principal");

        bt_menuP_clientes.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        bt_menuP_clientes.setText("Gestión de Clientes");
        bt_menuP_clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_menuP_clientesActionPerformed(evt);
            }
        });

        bt_menuP_habitaciones.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        bt_menuP_habitaciones.setText("Gestión de Habitaciones");
        bt_menuP_habitaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_menuP_habitacionesActionPerformed(evt);
            }
        });

        bt_menuP_reservas.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        bt_menuP_reservas.setText("Gestión de Reservas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addComponent(bt_menuP_clientes, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bt_menuP_habitaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bt_menuP_reservas, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(299, 299, 299)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_menuP_clientes, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_menuP_habitaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_menuP_reservas, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(351, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_menuP_clientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_menuP_clientesActionPerformed
        this.setVisible(false);
        ventanaCliente.setVisible(true);
    }//GEN-LAST:event_bt_menuP_clientesActionPerformed

    private void bt_menuP_habitacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_menuP_habitacionesActionPerformed
        this.setVisible(false);
        ventanaHabitacion.setVisible(true);
    }//GEN-LAST:event_bt_menuP_habitacionesActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_menuP_clientes;
    private javax.swing.JButton bt_menuP_habitaciones;
    private javax.swing.JButton bt_menuP_reservas;
    // End of variables declaration//GEN-END:variables
}
