package reservas_PCK;

public class VentanaReserva extends javax.swing.JFrame {

    public VentanaReserva() {
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jp_CREAR_R = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_crearR_cliente = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb_crearR_habitacion = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        ta_crearR_detalle = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        bt_crearR_actualizar = new javax.swing.JButton();
        dt_crearR_inicio = new com.toedter.calendar.JDateChooser();
        dt_crearR_fin = new com.toedter.calendar.JDateChooser();
        jp_LISTAR_Rs = new javax.swing.JPanel();
        bt_listarR_listar = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tb_listarR_tabla = new javax.swing.JTable();
        jp_CONSULTAR_R = new javax.swing.JPanel();
        tf_consultarR_codigo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tb_listarR_tabla1 = new javax.swing.JTable();
        bt_consultarR_buscar = new javax.swing.JButton();
        jp_MODIFICAR_R = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tb_modificarR_cliente = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tb_modificarR_habitacion = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        ta_modificarR_detalle = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        tf_modificarR_codigo = new javax.swing.JTextField();
        bt_modificarR_buscar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        bt_modificarR_guardar = new javax.swing.JButton();
        dt_modificarR_inicio = new com.toedter.calendar.JDateChooser();
        dt_modificarR_fin = new com.toedter.calendar.JDateChooser();
        jp_ELIMINAR_R = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        tf_eliminarR_codigo = new javax.swing.JTextField();
        bt_eliminarR_buscar = new javax.swing.JButton();
        jScrollPane10 = new javax.swing.JScrollPane();
        tb_eliminarR_tabla = new javax.swing.JTable();
        bt_eliminarR_eliminar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Seleccione al cliente");

        tb_crearR_cliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cédula", "Nombre", "Apellido", "Edad", "Email", "Teléfono"
            }
        ));
        tb_crearR_cliente.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(tb_crearR_cliente);
        tb_crearR_cliente.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        jLabel2.setText("Seleccione la habitación");

        tb_crearR_habitacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cédula", "Nombre", "Apellido", "Edad", "Email", "Teléfono"
            }
        ));
        jScrollPane2.setViewportView(tb_crearR_habitacion);
        tb_crearR_habitacion.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        ta_crearR_detalle.setColumns(20);
        ta_crearR_detalle.setRows(5);
        jScrollPane3.setViewportView(ta_crearR_detalle);

        jLabel3.setText("Fecha inicio:");

        jLabel4.setText("Fecha finalización:");

        jButton2.setText("Guardar");

        bt_crearR_actualizar.setText("Actualizar");

        javax.swing.GroupLayout jp_CREAR_RLayout = new javax.swing.GroupLayout(jp_CREAR_R);
        jp_CREAR_R.setLayout(jp_CREAR_RLayout);
        jp_CREAR_RLayout.setHorizontalGroup(
            jp_CREAR_RLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_CREAR_RLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jp_CREAR_RLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_CREAR_RLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(49, 49, 49)
                        .addComponent(bt_crearR_actualizar))
                    .addGroup(jp_CREAR_RLayout.createSequentialGroup()
                        .addGroup(jp_CREAR_RLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jp_CREAR_RLayout.createSequentialGroup()
                                .addGroup(jp_CREAR_RLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGroup(jp_CREAR_RLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jp_CREAR_RLayout.createSequentialGroup()
                                        .addGap(440, 440, 440)
                                        .addComponent(jButton2))
                                    .addGroup(jp_CREAR_RLayout.createSequentialGroup()
                                        .addGap(50, 50, 50)
                                        .addGroup(jp_CREAR_RLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(dt_crearR_inicio, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                                            .addComponent(dt_crearR_fin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                        .addGap(94, 94, 94)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jp_CREAR_RLayout.setVerticalGroup(
            jp_CREAR_RLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_CREAR_RLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jp_CREAR_RLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(bt_crearR_actualizar))
                .addGap(18, 18, 18)
                .addGroup(jp_CREAR_RLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jp_CREAR_RLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addGroup(jp_CREAR_RLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jp_CREAR_RLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(35, 35, 35)
                                .addGroup(jp_CREAR_RLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jp_CREAR_RLayout.createSequentialGroup()
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(58, 58, 58)
                                        .addComponent(jLabel3))
                                    .addComponent(dt_crearR_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(63, 63, 63)
                                .addComponent(jLabel4))
                            .addComponent(dt_crearR_fin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(14, 14, 14))
        );

        jTabbedPane1.addTab("Crear reserva", jp_CREAR_R);

        bt_listarR_listar.setText("Listar");

        tb_listarR_tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Fecha inicio", "Fecha fin", "Habitaciones", "Cédula cliente"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tb_listarR_tabla);

        javax.swing.GroupLayout jp_LISTAR_RsLayout = new javax.swing.GroupLayout(jp_LISTAR_Rs);
        jp_LISTAR_Rs.setLayout(jp_LISTAR_RsLayout);
        jp_LISTAR_RsLayout.setHorizontalGroup(
            jp_LISTAR_RsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_LISTAR_RsLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(jp_LISTAR_RsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt_listarR_listar)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 926, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        jp_LISTAR_RsLayout.setVerticalGroup(
            jp_LISTAR_RsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_LISTAR_RsLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(bt_listarR_listar)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Listar todas las reservas", jp_LISTAR_Rs);

        jLabel5.setText("Código reserva:");

        tb_listarR_tabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Fecha inicio", "Fecha fin", "Habitaciones", "Cédula cliente"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(tb_listarR_tabla1);

        bt_consultarR_buscar.setText("Buscar");

        javax.swing.GroupLayout jp_CONSULTAR_RLayout = new javax.swing.GroupLayout(jp_CONSULTAR_R);
        jp_CONSULTAR_R.setLayout(jp_CONSULTAR_RLayout);
        jp_CONSULTAR_RLayout.setHorizontalGroup(
            jp_CONSULTAR_RLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_CONSULTAR_RLayout.createSequentialGroup()
                .addContainerGap(79, Short.MAX_VALUE)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 926, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
            .addGroup(jp_CONSULTAR_RLayout.createSequentialGroup()
                .addGap(271, 271, 271)
                .addComponent(jLabel5)
                .addGap(61, 61, 61)
                .addComponent(tf_consultarR_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(bt_consultarR_buscar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jp_CONSULTAR_RLayout.setVerticalGroup(
            jp_CONSULTAR_RLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_CONSULTAR_RLayout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addGroup(jp_CONSULTAR_RLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_consultarR_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(bt_consultarR_buscar))
                .addGap(44, 44, 44)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(400, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Consultar por código", jp_CONSULTAR_R);

        jLabel6.setText("Seleccione al cliente");

        tb_modificarR_cliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cédula", "Nombre", "Apellido", "Edad", "Email", "Teléfono"
            }
        ));
        jScrollPane6.setViewportView(tb_modificarR_cliente);
        tb_modificarR_cliente.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        jLabel7.setText("Seleccione la habitación");

        tb_modificarR_habitacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cédula", "Nombre", "Apellido", "Edad", "Email", "Teléfono"
            }
        ));
        jScrollPane7.setViewportView(tb_modificarR_habitacion);
        tb_modificarR_habitacion.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        jLabel8.setText("Fecha inicio:");

        jLabel9.setText("Fecha finalización:");

        ta_modificarR_detalle.setColumns(20);
        ta_modificarR_detalle.setRows(5);
        jScrollPane8.setViewportView(ta_modificarR_detalle);

        jLabel10.setText("Código reserva:");

        bt_modificarR_buscar.setText("Buscar");

        jLabel11.setText("Reserva modificada:");

        bt_modificarR_guardar.setText("Guardar");

        javax.swing.GroupLayout jp_MODIFICAR_RLayout = new javax.swing.GroupLayout(jp_MODIFICAR_R);
        jp_MODIFICAR_R.setLayout(jp_MODIFICAR_RLayout);
        jp_MODIFICAR_RLayout.setHorizontalGroup(
            jp_MODIFICAR_RLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_MODIFICAR_RLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jp_MODIFICAR_RLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addGroup(jp_MODIFICAR_RLayout.createSequentialGroup()
                        .addGroup(jp_MODIFICAR_RLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(46, 46, 46)
                        .addGroup(jp_MODIFICAR_RLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dt_modificarR_inicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dt_modificarR_fin, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jp_MODIFICAR_RLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(61, 61, 61)
                        .addComponent(tf_modificarR_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(bt_modificarR_buscar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addGroup(jp_MODIFICAR_RLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(61, 61, 61))
            .addGroup(jp_MODIFICAR_RLayout.createSequentialGroup()
                .addGap(458, 458, 458)
                .addComponent(bt_modificarR_guardar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jp_MODIFICAR_RLayout.setVerticalGroup(
            jp_MODIFICAR_RLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_MODIFICAR_RLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jp_MODIFICAR_RLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_MODIFICAR_RLayout.createSequentialGroup()
                        .addGroup(jp_MODIFICAR_RLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_modificarR_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(bt_modificarR_buscar))
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_MODIFICAR_RLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)))
                .addGroup(jp_MODIFICAR_RLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jp_MODIFICAR_RLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel7)
                        .addGap(35, 35, 35)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(jLabel8)
                        .addGap(63, 63, 63)
                        .addComponent(jLabel9))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_MODIFICAR_RLayout.createSequentialGroup()
                        .addComponent(dt_modificarR_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79))
                    .addComponent(dt_modificarR_fin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt_modificarR_guardar)
                .addGap(15, 15, 15))
        );

        jTabbedPane1.addTab("Modificar reserva", jp_MODIFICAR_R);

        jLabel13.setText("Código reserva:");

        bt_eliminarR_buscar.setText("Buscar");

        tb_eliminarR_tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Fecha inicio", "Fecha fin", "Habitaciones", "Cédula cliente"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane10.setViewportView(tb_eliminarR_tabla);

        bt_eliminarR_eliminar.setText("Eliminar");

        javax.swing.GroupLayout jp_ELIMINAR_RLayout = new javax.swing.GroupLayout(jp_ELIMINAR_R);
        jp_ELIMINAR_R.setLayout(jp_ELIMINAR_RLayout);
        jp_ELIMINAR_RLayout.setHorizontalGroup(
            jp_ELIMINAR_RLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_ELIMINAR_RLayout.createSequentialGroup()
                .addContainerGap(79, Short.MAX_VALUE)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 926, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
            .addGroup(jp_ELIMINAR_RLayout.createSequentialGroup()
                .addGroup(jp_ELIMINAR_RLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_ELIMINAR_RLayout.createSequentialGroup()
                        .addGap(271, 271, 271)
                        .addComponent(jLabel13)
                        .addGap(61, 61, 61)
                        .addComponent(tf_eliminarR_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(bt_eliminarR_buscar))
                    .addGroup(jp_ELIMINAR_RLayout.createSequentialGroup()
                        .addGap(467, 467, 467)
                        .addComponent(bt_eliminarR_eliminar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jp_ELIMINAR_RLayout.setVerticalGroup(
            jp_ELIMINAR_RLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_ELIMINAR_RLayout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addGroup(jp_ELIMINAR_RLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_eliminarR_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(bt_eliminarR_buscar))
                .addGap(44, 44, 44)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(bt_eliminarR_eliminar)
                .addContainerGap(313, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Eliminar reserva", jp_ELIMINAR_R);

        jButton1.setText("Menú principal");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1075, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 678, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(0, 27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaReserva().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_consultarR_buscar;
    private javax.swing.JButton bt_crearR_actualizar;
    private javax.swing.JButton bt_eliminarR_buscar;
    private javax.swing.JButton bt_eliminarR_eliminar;
    private javax.swing.JButton bt_listarR_listar;
    private javax.swing.JButton bt_modificarR_buscar;
    private javax.swing.JButton bt_modificarR_guardar;
    private com.toedter.calendar.JDateChooser dt_crearR_fin;
    private com.toedter.calendar.JDateChooser dt_crearR_inicio;
    private com.toedter.calendar.JDateChooser dt_modificarR_fin;
    private com.toedter.calendar.JDateChooser dt_modificarR_inicio;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel jp_CONSULTAR_R;
    private javax.swing.JPanel jp_CREAR_R;
    private javax.swing.JPanel jp_ELIMINAR_R;
    private javax.swing.JPanel jp_LISTAR_Rs;
    private javax.swing.JPanel jp_MODIFICAR_R;
    private javax.swing.JTextArea ta_crearR_detalle;
    private javax.swing.JTextArea ta_modificarR_detalle;
    private javax.swing.JTable tb_crearR_cliente;
    private javax.swing.JTable tb_crearR_habitacion;
    private javax.swing.JTable tb_eliminarR_tabla;
    private javax.swing.JTable tb_listarR_tabla;
    private javax.swing.JTable tb_listarR_tabla1;
    private javax.swing.JTable tb_modificarR_cliente;
    private javax.swing.JTable tb_modificarR_habitacion;
    private javax.swing.JTextField tf_consultarR_codigo;
    private javax.swing.JTextField tf_eliminarR_codigo;
    private javax.swing.JTextField tf_modificarR_codigo;
    // End of variables declaration//GEN-END:variables
}
