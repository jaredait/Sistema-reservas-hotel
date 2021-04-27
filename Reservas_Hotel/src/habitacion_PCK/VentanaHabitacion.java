package habitacion_PCK;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class VentanaHabitacion extends javax.swing.JFrame {

    // atributos
    private Habitacion habitacion;
    private boolean habitacionExiste;
            
    // constructor
    public VentanaHabitacion() {
        initComponents();
        setLocationRelativeTo(null);

        // incicializar los atributos
        habitacion = new Habitacion();
        habitacionExiste = false;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tp_GESTION_HABITACION = new javax.swing.JTabbedPane();
        jp_CREAR_H = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tf_crearH_codigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cb_crearH_tipo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        cb_crearH_capacidad = new javax.swing.JComboBox<>();
        bt_crearH_guardar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        cb_crearH_estado = new javax.swing.JComboBox<>();
        jp_LISTAR = new javax.swing.JPanel();
        bt_listarH_listar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_listarH_tabla = new javax.swing.JTable();
        jp_CONSULTAR = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        tf_consultarH_codigo = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb_consultarH_tabla = new javax.swing.JTable();
        bt_consultarH_buscar = new javax.swing.JButton();
        jp_ELIMINAR = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        tf_eliminarH_codigo = new javax.swing.JTextField();
        bt_eliminarH_buscar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tb_eliminarH_tabla = new javax.swing.JTable();
        bt_eliminarH_eliminar = new javax.swing.JButton();
        jp_ACUTALIZAR = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        tf_actualizarH_codigo = new javax.swing.JTextField();
        bt_actualizarH_buscar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        cb_actualizarH_tipo = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        cb_actualizarH_capacidad = new javax.swing.JComboBox<>();
        bt_actualizarH_guardar = new javax.swing.JButton();
        cb_actualizarH_estado = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        bt_gestionH_menu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestión de Habitaciones");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(1000, 750));

        jp_CREAR_H.setPreferredSize(new java.awt.Dimension(700, 700));

        jLabel1.setText("Codigo:");

        jLabel2.setText("Tipo:");

        cb_crearH_tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Individual", "Doble", "Triple", "Quad", "Queen", "King" }));

        jLabel3.setText("Capacidad:");

        cb_crearH_capacidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));

        bt_crearH_guardar.setText("Guardar");
        bt_crearH_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_crearH_guardarActionPerformed(evt);
            }
        });

        jLabel9.setText("Estado");

        cb_crearH_estado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "disponible", "ocupada", "mantenimiento" }));

        javax.swing.GroupLayout jp_CREAR_HLayout = new javax.swing.GroupLayout(jp_CREAR_H);
        jp_CREAR_H.setLayout(jp_CREAR_HLayout);
        jp_CREAR_HLayout.setHorizontalGroup(
            jp_CREAR_HLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_CREAR_HLayout.createSequentialGroup()
                .addGap(234, 234, 234)
                .addGroup(jp_CREAR_HLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel9))
                .addGap(74, 74, 74)
                .addGroup(jp_CREAR_HLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cb_crearH_estado, 0, 1, Short.MAX_VALUE)
                    .addGroup(jp_CREAR_HLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(cb_crearH_capacidad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cb_crearH_tipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tf_crearH_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(508, 508, 508))
            .addGroup(jp_CREAR_HLayout.createSequentialGroup()
                .addGap(308, 308, 308)
                .addComponent(bt_crearH_guardar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jp_CREAR_HLayout.setVerticalGroup(
            jp_CREAR_HLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_CREAR_HLayout.createSequentialGroup()
                .addGap(173, 173, 173)
                .addGroup(jp_CREAR_HLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tf_crearH_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(84, 84, 84)
                .addGroup(jp_CREAR_HLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cb_crearH_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(91, 91, 91)
                .addGroup(jp_CREAR_HLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cb_crearH_capacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jp_CREAR_HLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cb_crearH_estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(bt_crearH_guardar)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        tp_GESTION_HABITACION.addTab("Crear habitación", jp_CREAR_H);

        bt_listarH_listar.setText("Listar habitaciones");
        bt_listarH_listar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_listarH_listarActionPerformed(evt);
            }
        });

        tb_listarH_tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Tipo", "Capacidad", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tb_listarH_tabla);

        javax.swing.GroupLayout jp_LISTARLayout = new javax.swing.GroupLayout(jp_LISTAR);
        jp_LISTAR.setLayout(jp_LISTARLayout);
        jp_LISTARLayout.setHorizontalGroup(
            jp_LISTARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_LISTARLayout.createSequentialGroup()
                .addGroup(jp_LISTARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_LISTARLayout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(bt_listarH_listar))
                    .addGroup(jp_LISTARLayout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 644, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(221, Short.MAX_VALUE))
        );
        jp_LISTARLayout.setVerticalGroup(
            jp_LISTARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_LISTARLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(bt_listarH_listar)
                .addGap(55, 55, 55)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        tp_GESTION_HABITACION.addTab("Listar todas las habitaciones", jp_LISTAR);

        jLabel4.setText("Codigo:");

        tb_consultarH_tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Tipo", "Capacidad", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tb_consultarH_tabla);

        bt_consultarH_buscar.setText("Buscar");
        bt_consultarH_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_consultarH_buscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jp_CONSULTARLayout = new javax.swing.GroupLayout(jp_CONSULTAR);
        jp_CONSULTAR.setLayout(jp_CONSULTARLayout);
        jp_CONSULTARLayout.setHorizontalGroup(
            jp_CONSULTARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_CONSULTARLayout.createSequentialGroup()
                .addGroup(jp_CONSULTARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_CONSULTARLayout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jp_CONSULTARLayout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(jLabel4)
                        .addGap(74, 74, 74)
                        .addComponent(tf_consultarH_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79)
                        .addComponent(bt_consultarH_buscar)))
                .addContainerGap(368, Short.MAX_VALUE))
        );
        jp_CONSULTARLayout.setVerticalGroup(
            jp_CONSULTARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_CONSULTARLayout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addGroup(jp_CONSULTARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tf_consultarH_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_consultarH_buscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(203, 203, 203))
        );

        tp_GESTION_HABITACION.addTab("Consultar datos habitación", jp_CONSULTAR);

        jLabel8.setText("Codigo:");

        bt_eliminarH_buscar.setText("Buscar");
        bt_eliminarH_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_eliminarH_buscarActionPerformed(evt);
            }
        });

        tb_eliminarH_tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Tipo", "Capacidad", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tb_eliminarH_tabla);

        bt_eliminarH_eliminar.setText("Eliminar");
        bt_eliminarH_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_eliminarH_eliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jp_ELIMINARLayout = new javax.swing.GroupLayout(jp_ELIMINAR);
        jp_ELIMINAR.setLayout(jp_ELIMINARLayout);
        jp_ELIMINARLayout.setHorizontalGroup(
            jp_ELIMINARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_ELIMINARLayout.createSequentialGroup()
                .addGroup(jp_ELIMINARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_ELIMINARLayout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jp_ELIMINARLayout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(jLabel8)
                        .addGap(74, 74, 74)
                        .addComponent(tf_eliminarH_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79)
                        .addComponent(bt_eliminarH_buscar))
                    .addGroup(jp_ELIMINARLayout.createSequentialGroup()
                        .addGap(275, 275, 275)
                        .addComponent(bt_eliminarH_eliminar)))
                .addContainerGap(368, Short.MAX_VALUE))
        );
        jp_ELIMINARLayout.setVerticalGroup(
            jp_ELIMINARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_ELIMINARLayout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addGroup(jp_ELIMINARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tf_eliminarH_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_eliminarH_buscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addComponent(bt_eliminarH_eliminar)
                .addGap(331, 331, 331))
        );

        tp_GESTION_HABITACION.addTab("Eliminar habitación", jp_ELIMINAR);

        jp_ACUTALIZAR.setPreferredSize(new java.awt.Dimension(1000, 600));

        jLabel5.setText("Codigo:");

        bt_actualizarH_buscar.setText("Buscar");
        bt_actualizarH_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_actualizarH_buscarActionPerformed(evt);
            }
        });

        jLabel6.setText("Tipo:");

        cb_actualizarH_tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Individual", "Doble", "Triple", "Quad", "Queen", "King" }));

        jLabel7.setText("Capacidad:");

        cb_actualizarH_capacidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));

        bt_actualizarH_guardar.setText("Guardar");
        bt_actualizarH_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_actualizarH_guardarActionPerformed(evt);
            }
        });

        cb_actualizarH_estado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "disponible", "ocupada", "mantenimiento" }));

        jLabel10.setText("Estado");

        javax.swing.GroupLayout jp_ACUTALIZARLayout = new javax.swing.GroupLayout(jp_ACUTALIZAR);
        jp_ACUTALIZAR.setLayout(jp_ACUTALIZARLayout);
        jp_ACUTALIZARLayout.setHorizontalGroup(
            jp_ACUTALIZARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_ACUTALIZARLayout.createSequentialGroup()
                .addGroup(jp_ACUTALIZARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_ACUTALIZARLayout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addGroup(jp_ACUTALIZARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jp_ACUTALIZARLayout.createSequentialGroup()
                                .addGroup(jp_ACUTALIZARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jp_ACUTALIZARLayout.createSequentialGroup()
                                        .addGroup(jp_ACUTALIZARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel7))
                                        .addGap(74, 74, 74)
                                        .addGroup(jp_ACUTALIZARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(cb_actualizarH_capacidad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(cb_actualizarH_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jp_ACUTALIZARLayout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(74, 74, 74)
                                        .addComponent(tf_actualizarH_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(39, 39, 39)
                                .addComponent(bt_actualizarH_buscar))
                            .addGroup(jp_ACUTALIZARLayout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(74, 74, 74)
                                .addComponent(cb_actualizarH_estado, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(72, 72, 72))))
                    .addGroup(jp_ACUTALIZARLayout.createSequentialGroup()
                        .addGap(229, 229, 229)
                        .addComponent(bt_actualizarH_guardar)))
                .addContainerGap(489, Short.MAX_VALUE))
        );
        jp_ACUTALIZARLayout.setVerticalGroup(
            jp_ACUTALIZARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_ACUTALIZARLayout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addGroup(jp_ACUTALIZARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tf_actualizarH_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_actualizarH_buscar))
                .addGap(57, 57, 57)
                .addGroup(jp_ACUTALIZARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cb_actualizarH_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addGroup(jp_ACUTALIZARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cb_actualizarH_capacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jp_ACUTALIZARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(cb_actualizarH_estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addComponent(bt_actualizarH_guardar)
                .addContainerGap(174, Short.MAX_VALUE))
        );

        tp_GESTION_HABITACION.addTab("Actualizar datos habitación", jp_ACUTALIZAR);

        bt_gestionH_menu.setText("Menú Principal");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tp_GESTION_HABITACION, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bt_gestionH_menu)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tp_GESTION_HABITACION, javax.swing.GroupLayout.PREFERRED_SIZE, 639, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addComponent(bt_gestionH_menu)
                .addGap(14, 14, 14))
        );

        getAccessibleContext().setAccessibleName("asdfasdf");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_crearH_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_crearH_guardarActionPerformed
        habitacion.setCodigo(tf_crearH_codigo.getText());
        habitacion.setTipo(cb_crearH_tipo.getSelectedItem().toString());
        habitacion.setCapacidad(Integer.parseInt(cb_crearH_capacidad.getSelectedItem().toString()));
        habitacion.setEstado(cb_crearH_estado.getSelectedItem().toString());
        habitacion.insertarDP();
        mensajeEmergente("Notificación", "¡Habitación creada con éxito!");
    }//GEN-LAST:event_bt_crearH_guardarActionPerformed

    private void bt_listarH_listarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_listarH_listarActionPerformed
        imprmirListaHabitaciones();
    }//GEN-LAST:event_bt_listarH_listarActionPerformed

    private void bt_consultarH_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_consultarH_buscarActionPerformed
        habitacion.setCodigo(tf_consultarH_codigo.getText());
        if(habitacion.verificarExisteDP()){
            // cargar cliente en la tabla de consulta
            cargarHabitacion(tb_consultarH_tabla);
        }
        else{
            mensajeEmergente("Error", "Habitación no existe. Crear Habitación primero");
        }
    }//GEN-LAST:event_bt_consultarH_buscarActionPerformed

    private void bt_eliminarH_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_eliminarH_buscarActionPerformed
        habitacion.setCodigo(tf_eliminarH_codigo.getText());
        if(habitacion.verificarExisteDP()){
            habitacionExiste = true;
            cargarHabitacion(tb_eliminarH_tabla);
        }
    }//GEN-LAST:event_bt_eliminarH_buscarActionPerformed

    private void bt_eliminarH_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_eliminarH_eliminarActionPerformed
        if(habitacionExiste){
            habitacion.eliminarDP();
            mensajeEmergente("Notificación", "¡Habitación eliminada con éxito!");
            eliminarContenidoTabla(tb_eliminarH_tabla);
            habitacionExiste = false;
        }
    }//GEN-LAST:event_bt_eliminarH_eliminarActionPerformed

    private void bt_actualizarH_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_actualizarH_buscarActionPerformed
        habitacion.setCodigo(tf_actualizarH_codigo.getText());
        if(habitacion.verificarExisteDP()){
            // bloquear la modificacion del codigo
            tf_actualizarH_codigo.setEditable(false);
            // recorrer los combo box para presentar la opcion actual correcta
            cb_actualizarH_tipo.setSelectedIndex(obtenerIndice(habitacion.getTipo(), cb_actualizarH_tipo));
            cb_actualizarH_capacidad.setSelectedIndex(obtenerIndice(String.valueOf(habitacion.getCapacidad()), cb_actualizarH_capacidad));            
            cb_actualizarH_capacidad.setSelectedIndex(obtenerIndice(habitacion.getEstado(), cb_actualizarH_estado)); 
            habitacionExiste = true;
        }
        else{
            mensajeEmergente("Error", "Código inválido");
        }
    }//GEN-LAST:event_bt_actualizarH_buscarActionPerformed

    private void bt_actualizarH_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_actualizarH_guardarActionPerformed
        if(habitacionExiste){
            // actualizar datos
            habitacion.setTipo(cb_actualizarH_tipo.getSelectedItem().toString());
            habitacion.setCapacidad(Integer.parseInt(cb_actualizarH_capacidad.getSelectedItem().toString()));
            habitacion.setEstado(cb_actualizarH_estado.getSelectedItem().toString());
            habitacion.modificarDP();
            
            // limpiar pestana
            tf_actualizarH_codigo.setEditable(true);
            tf_actualizarH_codigo.setText("");
            cb_actualizarH_tipo.setSelectedIndex(0);
            cb_actualizarH_capacidad.setSelectedIndex(0);
            cb_actualizarH_estado.setSelectedIndex(0);
            habitacionExiste = false;
            
        }
    }//GEN-LAST:event_bt_actualizarH_guardarActionPerformed

    // METODOS DE LA CLASE
    private int obtenerIndice(String opcion, JComboBox comboBox){
        for(int i = 0; i < comboBox.getItemCount(); i++){
            if(opcion.trim().toLowerCase().equals(comboBox.getComponent(i).toString().toLowerCase()))
                return i;
        }
        return -1;
    } 
    
    private static void mensajeEmergente(String titulo, String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, titulo, JOptionPane.INFORMATION_MESSAGE);
    }

    private void imprmirListaHabitaciones() {
        Habitacion[] habitaciones = habitacion.consultarTodosDP();
        DefaultTableModel model = (DefaultTableModel) tb_listarH_tabla.getModel();
        model.setRowCount(0);
        for (Habitacion hab : habitaciones) {
            model.insertRow(model.getRowCount(), new Object[]{hab.getCodigo(),
                hab.getTipo(), hab.getCapacidad(), hab.getEstado()});
        }
    }
    
    private void cargarHabitacion(JTable tabla){
        DefaultTableModel model = (DefaultTableModel) tabla.getModel();
        model.setRowCount(0);
        model.addRow(new Object[]{habitacion.getCodigo(), habitacion.getTipo(),
        habitacion.getCapacidad(), habitacion.getEstado()});
    }

    public void eliminarContenidoTabla(JTable tablaActual) {
        DefaultTableModel modelo = (DefaultTableModel) tablaActual.getModel();
        modelo.setRowCount(0);
    }

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
            java.util.logging.Logger.getLogger(VentanaHabitacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaHabitacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaHabitacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaHabitacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaHabitacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_actualizarH_buscar;
    private javax.swing.JButton bt_actualizarH_guardar;
    private javax.swing.JButton bt_consultarH_buscar;
    private javax.swing.JButton bt_crearH_guardar;
    private javax.swing.JButton bt_eliminarH_buscar;
    private javax.swing.JButton bt_eliminarH_eliminar;
    private javax.swing.JButton bt_gestionH_menu;
    private javax.swing.JButton bt_listarH_listar;
    private javax.swing.JComboBox<String> cb_actualizarH_capacidad;
    private javax.swing.JComboBox<String> cb_actualizarH_estado;
    private javax.swing.JComboBox<String> cb_actualizarH_tipo;
    private javax.swing.JComboBox<String> cb_crearH_capacidad;
    private javax.swing.JComboBox<String> cb_crearH_estado;
    private javax.swing.JComboBox<String> cb_crearH_tipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel jp_ACUTALIZAR;
    private javax.swing.JPanel jp_CONSULTAR;
    private javax.swing.JPanel jp_CREAR_H;
    private javax.swing.JPanel jp_ELIMINAR;
    private javax.swing.JPanel jp_LISTAR;
    private javax.swing.JTable tb_consultarH_tabla;
    private javax.swing.JTable tb_eliminarH_tabla;
    private javax.swing.JTable tb_listarH_tabla;
    private javax.swing.JTextField tf_actualizarH_codigo;
    private javax.swing.JTextField tf_consultarH_codigo;
    private javax.swing.JTextField tf_crearH_codigo;
    private javax.swing.JTextField tf_eliminarH_codigo;
    private javax.swing.JTabbedPane tp_GESTION_HABITACION;
    // End of variables declaration//GEN-END:variables
}
