package retroplaymanager;

import javax.swing.JOptionPane;

public class VentanaNuevaOrden extends javax.swing.JFrame {

    private Tienda tienda;
    private Entradas entradas = new Entradas();
    private Orden orden;
    private javax.swing.table.DefaultTableModel modelo;

    public VentanaNuevaOrden(Tienda tienda) {
        this.tienda = tienda;
        orden = null;
        initComponents();
        modelo = (javax.swing.table.DefaultTableModel) Datos.getModel();
        entradas.llenarDia(cboDiaR);
        entradas.llenarMes(cboMesR);
        entradas.llenarAnio(cboAnioR);
        entradas.llenarDia(cboDiaE);
        entradas.llenarMes(cboMesE);
        entradas.llenarAnio(cboAnioE);
        entradas.llenarHora(cboHoraE);
        for (int i = 0; i < tienda.getClientes().getCont(); i++) {
            Cliente obj = tienda.getClientes().getClientes()[i];
            cboCliente.addItem(String.format("%s - %s %s", obj.getDni(), obj.getNombres(), obj.getApellidos()));
        }
        for (int i = 0; i < tienda.getOrdenes().getTipos().length; i++) {
            cboTipo.addItem(tienda.getOrdenes().getTipos()[i]);
        }
        for (int i = 0; i < tienda.getOrdenes().getEntregas().length; i++) {
            cboEntrega.addItem(tienda.getOrdenes().getEntregas()[i]);
        }
        for (int i = 0; i < tienda.getJuguetes().getCont(); i++) {
            Juguete obj = tienda.getJuguetes().getJuguetes()[i];
            cboArticulo.addItem(String.format("[Juguete] %s - %s", obj.getCodigo(), obj.getNombre()));
        }
        for (int i = 0; i < tienda.getServicios().getCont(); i++) {
            Servicio obj = tienda.getServicios().getServicios()[i];
            cboArticulo.addItem(String.format("[Servicio] %s - %s", obj.getCodigo(), obj.getNombre()));
        }
        for (int i = 0; i < tienda.getPaquetes().getCont(); i++) {
            Paquete obj = tienda.getPaquetes().getPaquetes()[i];
            cboArticulo.addItem(String.format("[Paquete] %s", obj.getNombre()));
        }
        mostrar();
        retroplaymanager.apariencia.Apariencia.vestir(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cboCliente = new javax.swing.JComboBox<>();
        cboCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un cliente..." }));
        jLabel2 = new javax.swing.JLabel();
        cboTipo = new javax.swing.JComboBox<>();
        cboTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione..." }));
        jLabel3 = new javax.swing.JLabel();
        cboEntrega = new javax.swing.JComboBox<>();
        cboEntrega.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione..." }));
        jLabel4 = new javax.swing.JLabel();
        cboDiaR = new javax.swing.JComboBox<>();
        cboDiaR.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dia" }));
        cboMesR = new javax.swing.JComboBox<>();
        cboMesR.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mes" }));
        cboAnioR = new javax.swing.JComboBox<>();
        cboAnioR.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Anio" }));
        jLabel5 = new javax.swing.JLabel();
        cboDiaE = new javax.swing.JComboBox<>();
        cboDiaE.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dia" }));
        cboMesE = new javax.swing.JComboBox<>();
        cboMesE.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mes" }));
        cboAnioE = new javax.swing.JComboBox<>();
        cboAnioE.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Anio" }));
        jLabel6 = new javax.swing.JLabel();
        cboHoraE = new javax.swing.JComboBox<>();
        cboHoraE.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hora" }));
        btnNueva = new javax.swing.JButton();
        lblOrden = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cboArticulo = new javax.swing.JComboBox<>();
        cboArticulo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un articulo..." }));
        jLabel8 = new javax.swing.JLabel();
        entCantidad = new javax.swing.JTextField();
        btnJuguete = new javax.swing.JButton();
        btnServicio = new javax.swing.JButton();
        btnPaquete = new javax.swing.JButton();
        btnQuitar = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Datos = new javax.swing.JTable();
        lblTotal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Nueva orden");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Cliente");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Tipo de orden");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Entrega");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Fecha de registro");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Fecha de entrega");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Hora de entrega");

        btnNueva.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnNueva.setText("Nueva orden");
        btnNueva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaActionPerformed(evt);
            }
        });

        lblOrden.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        lblOrden.setText("No hay una orden en armado");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Articulo");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Cantidad");

        btnJuguete.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnJuguete.setText("Agregar juguete");
        btnJuguete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJugueteActionPerformed(evt);
            }
        });

        btnServicio.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnServicio.setText("Agregar servicio");
        btnServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnServicioActionPerformed(evt);
            }
        });

        btnPaquete.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnPaquete.setText("Agregar paquete");
        btnPaquete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPaqueteActionPerformed(evt);
            }
        });

        btnQuitar.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnQuitar.setText("Quitar");
        btnQuitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitarActionPerformed(evt);
            }
        });

        btnRegistrar.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnRegistrar.setText("Registrar orden");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnVolver.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnVolver.setText("<--");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cboCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cboDiaR, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(cboMesR, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(cboAnioR, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cboDiaE, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(cboMesE, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(cboAnioE, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cboHoraE, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(entCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(btnNueva, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblOrden))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(btnJuguete, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(btnServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(btnPaquete, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(btnQuitar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(btnVolver)
                .addGap(12, 12, 12)
                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cboCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cboEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cboDiaR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboMesR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboAnioR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cboDiaE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboMesE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboAnioE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cboHoraE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnNueva)
                .addGap(12, 12, 12)
                .addComponent(lblOrden)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cboArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(entCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnJuguete)
                    .addComponent(btnServicio))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPaquete)
                    .addComponent(btnQuitar))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVolver)
                    .addComponent(btnRegistrar))
                .addGap(18, 18, 18)
        );

        Datos.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        Datos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] { "Tipo", "Codigo", "Nombre", "Categoria", "Cantidad", "Precio", "Subtotal" }
        ));
        jScrollPane1.setViewportView(Datos);

        lblTotal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTotal.setText("Total: S/ 0.00");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
                    .addComponent(lblTotal))
                .addGap(12, 12, 12)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
                .addGap(12, 12, 12)
                .addComponent(lblTotal)
                .addGap(12, 12, 12)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(14, 14, 14)
        );
        layout.setVerticalGroup(
            layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaActionPerformed
        nuevaOrden();
    }//GEN-LAST:event_btnNuevaActionPerformed

    private void btnJugueteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJugueteActionPerformed
        agregar("Juguete");
    }//GEN-LAST:event_btnJugueteActionPerformed

    private void btnServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnServicioActionPerformed
        agregar("Servicio");
    }//GEN-LAST:event_btnServicioActionPerformed

    private void btnPaqueteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPaqueteActionPerformed
        agregar("Paquete");
    }//GEN-LAST:event_btnPaqueteActionPerformed

    private void btnQuitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitarActionPerformed
        quitar();
    }//GEN-LAST:event_btnQuitarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        registrar();
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        VentanaOrden obj = new VentanaOrden(tienda);
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Datos;
    private javax.swing.JButton btnJuguete;
    private javax.swing.JButton btnNueva;
    private javax.swing.JButton btnPaquete;
    private javax.swing.JButton btnQuitar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnServicio;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cboAnioE;
    private javax.swing.JComboBox<String> cboAnioR;
    private javax.swing.JTextField entCantidad;
    private javax.swing.JComboBox<String> cboArticulo;
    private javax.swing.JComboBox<String> cboDiaE;
    private javax.swing.JComboBox<String> cboDiaR;
    private javax.swing.JComboBox<String> cboCliente;
    private javax.swing.JComboBox<String> cboEntrega;
    private javax.swing.JComboBox<String> cboHoraE;
    private javax.swing.JComboBox<String> cboMesE;
    private javax.swing.JComboBox<String> cboMesR;
    private javax.swing.JComboBox<String> cboTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblOrden;
    private javax.swing.JLabel lblTotal;
    // End of variables declaration//GEN-END:variables

    public boolean vacio() {
        if (entradas.codigoDe(entradas.elegido(cboCliente)).equals("") || entradas.elegido(cboTipo).equals("") || entradas.elegido(cboEntrega).equals("")) {
            return true;
        }
        if (entradas.elegido(cboDiaR).equals("") || entradas.elegido(cboMesR).equals("") || entradas.elegido(cboAnioR).equals("")) {
            return true;
        }
        if (entradas.elegido(cboDiaE).equals("") || entradas.elegido(cboMesE).equals("") || entradas.elegido(cboAnioE).equals("") || entradas.elegido(cboHoraE).equals("")) {
            return true;
        }
        return false;
    }

    public void nuevaOrden() {
        if (vacio()) {
            JOptionPane.showMessageDialog(this, "Complete los datos de la orden", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        int pos = tienda.getClientes().buscarPorDni(entradas.codigoDe(entradas.elegido(cboCliente)));
        if (pos == -1) {
            JOptionPane.showMessageDialog(this, String.format("El cliente con DNI %s no esta registrado", entradas.codigoDe(entradas.elegido(cboCliente))), "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String entrega = entradas.elegido(cboEntrega);
        if (!tienda.getOrdenes().entregaValida(entrega)) {
            JOptionPane.showMessageDialog(this, "La entrega debe ser Tienda o Delivery", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        int diaR = Integer.parseInt(entradas.elegido(cboDiaR));
        int mesR = Integer.parseInt(entradas.elegido(cboMesR));
        int anioR = Integer.parseInt(entradas.elegido(cboAnioR));
        int diaE = Integer.parseInt(entradas.elegido(cboDiaE));
        int mesE = Integer.parseInt(entradas.elegido(cboMesE));
        int anioE = Integer.parseInt(entradas.elegido(cboAnioE));
        int horaE = Integer.parseInt(entradas.elegido(cboHoraE));
        Fecha registro = new Fecha(diaR, mesR, anioR, 0);
        Fecha entregaProgramada = new Fecha(diaE, mesE, anioE, horaE);
        Cliente cliente = tienda.getClientes().getClientes()[pos];
        Orden nueva = tienda.getOrdenes().crear(entradas.elegido(cboTipo), cliente, tienda.getSesion(), entrega, registro, entregaProgramada);
        if (nueva == null) {
            JOptionPane.showMessageDialog(this, "El tipo de orden debe ser Venta o Apartado", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String mensaje = nueva.validarFechas();
        if (!mensaje.equals("")) {
            JOptionPane.showMessageDialog(this, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        orden = nueva;
        lblOrden.setText(String.format("Orden de %s para %s %s", orden.getTipo(), cliente.getNombres(), cliente.getApellidos()));
        JOptionPane.showMessageDialog(this, "Orden creada, ahora agregue los articulos", "Info", JOptionPane.INFORMATION_MESSAGE);
        mostrar();
    }

    public void agregar(String tipo) {
        if (orden == null) {
            JOptionPane.showMessageDialog(this, "Primero cree una nueva orden", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (entradas.elegido(cboArticulo).equals("") || entCantidad.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Elija el articulo de la lista e ingrese la cantidad", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!tipoArticulo().equals(tipo)) {
            JOptionPane.showMessageDialog(this, String.format("El articulo elegido es de tipo %s: use el boton Agregar %s", tipoArticulo(), tipoArticulo().toLowerCase()), "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!entradas.esEntero(entCantidad.getText())) {
            JOptionPane.showMessageDialog(this, "La cantidad debe ser un numero entero", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        int cantidad = Integer.parseInt(entCantidad.getText());
        GestionOrdenes gestion = tienda.getOrdenes();
        String mensaje = "";
        if (tipo.equals("Juguete")) {
            mensaje = gestion.agregarJuguete(orden, codigoArticulo(), cantidad, tienda);
        }
        if (tipo.equals("Servicio")) {
            mensaje = gestion.agregarServicio(orden, codigoArticulo(), cantidad, tienda);
        }
        if (tipo.equals("Paquete")) {
            mensaje = gestion.agregarPaquete(orden, codigoArticulo(), cantidad, tienda);
        }
        if (!mensaje.equals("")) {
            JOptionPane.showMessageDialog(this, mensaje, "Rechazado", JOptionPane.ERROR_MESSAGE);
            return;
        }
        cboArticulo.setSelectedIndex(0);
        entCantidad.setText(null);
        mostrar();
    }

    public void quitar() {
        if (orden == null) {
            JOptionPane.showMessageDialog(this, "Primero cree una nueva orden", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String codigo = codigoArticulo();
        if (codigo.equals("")) {
            JOptionPane.showMessageDialog(this, "Elija en la lista el articulo que quiere quitar", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        int pos = orden.buscarDetalle("Juguete", codigo);
        if (pos == -1) {
            pos = orden.buscarDetalle("Servicio", codigo);
        }
        if (pos == -1) {
            pos = orden.buscarDetalle("Paquete", codigo);
        }
        if (pos == -1) {
            JOptionPane.showMessageDialog(this, "Ese articulo no esta en la orden", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        orden.quitarDetalle(pos);
        cboArticulo.setSelectedIndex(0);
        mostrar();
    }

    public void registrar() {
        if (orden == null) {
            JOptionPane.showMessageDialog(this, "Primero cree una nueva orden", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        GestionOrdenes gestion = tienda.getOrdenes();
        if (gestion.getCont() >= 100) {
            JOptionPane.showMessageDialog(this, "Vector Lleno!!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String mensaje = gestion.validarOrden(orden, tienda);
        if (!mensaje.equals("")) {
            JOptionPane.showMessageDialog(this, mensaje, "Rechazado", JOptionPane.ERROR_MESSAGE);
            return;
        }
        gestion.registrar(orden);
        JOptionPane.showMessageDialog(this, String.format("Orden %d registrada en estado Pendiente. Total: S/ %.2f", orden.getNumero(), orden.calcularTotal()), "Info", JOptionPane.INFORMATION_MESSAGE);
        orden = null;
        lblOrden.setText("No hay una orden en armado");
        limpiar();
        mostrar();
    }

    public void mostrar() {
        modelo.setNumRows(0);
        if (orden == null) {
            lblTotal.setText("Total: S/ 0.00");
            return;
        }
        DetalleOrden[] lista = orden.getDetalles();
        for (int i = 0; i < orden.getContD(); i++) {
            String precio = String.format("%.2f", lista[i].getPrecio());
            String subtotal = String.format("%.2f", lista[i].subtotal());
            Object[] fila = {lista[i].getTipo(), lista[i].getCodigo(), lista[i].getNombre(), lista[i].getCategoria(), lista[i].getCantidad(), precio, subtotal};
            modelo.addRow(fila);
        }
        lblTotal.setText(String.format("Descuento: S/ %.2f   Envio: S/ %.2f   Total: S/ %.2f   Adelanto: S/ %.2f", orden.descuento(), orden.getCostoEnvio(), orden.calcularTotal(), orden.calcularAdelanto()));
    }

    public void limpiar() {
        cboCliente.setSelectedIndex(0);
        cboTipo.setSelectedIndex(0);
        cboEntrega.setSelectedIndex(0);
        cboDiaR.setSelectedIndex(0);
        cboMesR.setSelectedIndex(0);
        cboAnioR.setSelectedIndex(0);
        cboDiaE.setSelectedIndex(0);
        cboMesE.setSelectedIndex(0);
        cboAnioE.setSelectedIndex(0);
        cboHoraE.setSelectedIndex(0);
        cboArticulo.setSelectedIndex(0);
        entCantidad.setText(null);
    }

    public String tipoArticulo() {
        String texto = entradas.elegido(cboArticulo);
        if (texto.equals("")) {
            return "";
        }
        return texto.substring(1, texto.indexOf("]"));
    }

    public String codigoArticulo() {
        String texto = entradas.elegido(cboArticulo);
        if (texto.equals("")) {
            return "";
        }
        String resto = texto.substring(texto.indexOf("] ") + 2);
        if (tipoArticulo().equals("Paquete")) {
            return resto;
        }
        return entradas.codigoDe(resto);
    }
}
