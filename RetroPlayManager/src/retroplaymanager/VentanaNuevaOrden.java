package retroplaymanager;

import javax.swing.JOptionPane;

public class VentanaNuevaOrden extends javax.swing.JFrame {

    private Tienda tienda;
    private Orden orden;
    private javax.swing.table.DefaultTableModel modelo;

    public VentanaNuevaOrden(Tienda tienda) {
        this.tienda = tienda;
        orden = null;
        initComponents();
        modelo = (javax.swing.table.DefaultTableModel) Datos.getModel();
        mostrar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        entDni = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        entTipo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        entEntrega = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        entDiaR = new javax.swing.JTextField();
        entMesR = new javax.swing.JTextField();
        entAnioR = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        entDiaE = new javax.swing.JTextField();
        entMesE = new javax.swing.JTextField();
        entAnioE = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        entHoraE = new javax.swing.JTextField();
        btnNueva = new javax.swing.JButton();
        lblOrden = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        entCodigo = new javax.swing.JTextField();
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
        jLabel1.setText("DNI cliente");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Tipo (Venta / Apartado)");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Entrega (Tienda / Delivery)");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Fecha registro (d m a)");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Fecha entrega (d m a)");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Hora entrega (0 - 23)");

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
        jLabel7.setText("Codigo o paquete");

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
                    .addComponent(entDni, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(entTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(entEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(entDiaR, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(entMesR, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(entAnioR, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(entDiaE, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(entMesE, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(entAnioE, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(entHoraE, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(entCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(entDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(entTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(entEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(entDiaR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(entMesR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(entAnioR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(entDiaE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(entMesE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(entAnioE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(entHoraE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnNueva)
                .addGap(12, 12, 12)
                .addComponent(lblOrden)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(entCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        this.setVisible(false);
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
    private javax.swing.JTextField entAnioE;
    private javax.swing.JTextField entAnioR;
    private javax.swing.JTextField entCantidad;
    private javax.swing.JTextField entCodigo;
    private javax.swing.JTextField entDiaE;
    private javax.swing.JTextField entDiaR;
    private javax.swing.JTextField entDni;
    private javax.swing.JTextField entEntrega;
    private javax.swing.JTextField entHoraE;
    private javax.swing.JTextField entMesE;
    private javax.swing.JTextField entMesR;
    private javax.swing.JTextField entTipo;
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
        if (entDni.getText().equals("") || entTipo.getText().equals("") || entEntrega.getText().equals("")) {
            return true;
        }
        if (entDiaR.getText().equals("") || entMesR.getText().equals("") || entAnioR.getText().equals("")) {
            return true;
        }
        if (entDiaE.getText().equals("") || entMesE.getText().equals("") || entAnioE.getText().equals("") || entHoraE.getText().equals("")) {
            return true;
        }
        return false;
    }

    public void nuevaOrden() {
        if (vacio()) {
            JOptionPane.showMessageDialog(this, "Complete los datos de la orden", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        int pos = tienda.getClientes().buscarPorDni(entDni.getText());
        if (pos == -1) {
            JOptionPane.showMessageDialog(this, String.format("El cliente con DNI %s no esta registrado", entDni.getText()), "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String entrega = entEntrega.getText();
        if (!entrega.equals("Tienda") && !entrega.equals("Delivery")) {
            JOptionPane.showMessageDialog(this, "La entrega debe ser Tienda o Delivery", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        int diaR = Integer.parseInt(entDiaR.getText());
        int mesR = Integer.parseInt(entMesR.getText());
        int anioR = Integer.parseInt(entAnioR.getText());
        int diaE = Integer.parseInt(entDiaE.getText());
        int mesE = Integer.parseInt(entMesE.getText());
        int anioE = Integer.parseInt(entAnioE.getText());
        int horaE = Integer.parseInt(entHoraE.getText());
        Fecha registro = new Fecha(diaR, mesR, anioR, 0);
        Fecha entregaProgramada = new Fecha(diaE, mesE, anioE, horaE);
        Cliente cliente = tienda.getClientes().getClientes()[pos];
        Orden nueva = tienda.getOrdenes().crear(entTipo.getText(), cliente, tienda.getSesion(), entrega, registro, entregaProgramada);
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
        if (entCodigo.getText().equals("") || entCantidad.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Ingrese el codigo y la cantidad", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        int cantidad = Integer.parseInt(entCantidad.getText());
        GestionOrdenes gestion = tienda.getOrdenes();
        String mensaje = "";
        if (tipo.equals("Juguete")) {
            mensaje = gestion.agregarJuguete(orden, entCodigo.getText(), cantidad, tienda);
        }
        if (tipo.equals("Servicio")) {
            mensaje = gestion.agregarServicio(orden, entCodigo.getText(), cantidad, tienda);
        }
        if (tipo.equals("Paquete")) {
            mensaje = gestion.agregarPaquete(orden, entCodigo.getText(), cantidad, tienda);
        }
        if (!mensaje.equals("")) {
            JOptionPane.showMessageDialog(this, mensaje, "Rechazado", JOptionPane.ERROR_MESSAGE);
            return;
        }
        entCodigo.setText(null);
        entCantidad.setText(null);
        mostrar();
    }

    public void quitar() {
        if (orden == null) {
            JOptionPane.showMessageDialog(this, "Primero cree una nueva orden", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String codigo = entCodigo.getText();
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
        entCodigo.setText(null);
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
        entDni.setText(null);
        entTipo.setText(null);
        entEntrega.setText(null);
        entDiaR.setText(null);
        entMesR.setText(null);
        entAnioR.setText(null);
        entDiaE.setText(null);
        entMesE.setText(null);
        entAnioE.setText(null);
        entHoraE.setText(null);
        entCodigo.setText(null);
        entCantidad.setText(null);
    }
}
