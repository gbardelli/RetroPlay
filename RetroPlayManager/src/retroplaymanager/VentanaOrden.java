package retroplaymanager;

import javax.swing.JOptionPane;

public class VentanaOrden extends javax.swing.JFrame {

    private Tienda tienda;
    private javax.swing.table.DefaultTableModel modelo;
    private javax.swing.table.DefaultTableModel modeloDetalle;
    private javax.swing.table.DefaultTableModel modeloHistorial;

    public VentanaOrden(Tienda tienda) {
        this.tienda = tienda;
        initComponents();
        modelo = (javax.swing.table.DefaultTableModel) Datos.getModel();
        modeloDetalle = (javax.swing.table.DefaultTableModel) Detalle.getModel();
        modeloHistorial = (javax.swing.table.DefaultTableModel) Historial.getModel();
        String rol = tienda.getSesion().getRol();
        if (!rol.equals("Vendedor")) {
            btnConfirmar.setEnabled(false);
            btnCancelar.setEnabled(false);
            btnNueva.setEnabled(false);
        }
        if (!rol.equals("Almacenero")) {
            btnPreparar.setEnabled(false);
            btnEntregar.setEnabled(false);
        }
        mostrar();
    }

    public Tienda getTienda() {
        return tienda;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        entNumero = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        entDia = new javax.swing.JTextField();
        entMes = new javax.swing.JTextField();
        entAnio = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        entHora = new javax.swing.JTextField();
        btnVer = new javax.swing.JButton();
        btnMostrar = new javax.swing.JButton();
        btnConfirmar = new javax.swing.JButton();
        btnPreparar = new javax.swing.JButton();
        btnEntregar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnNueva = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Datos = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Detalle = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Historial = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ordenes");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jLabel1.setText("Numero de orden");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jLabel2.setText("Fecha (d m a)");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jLabel3.setText("Hora (0 - 23)");

        btnVer.setFont(new java.awt.Font("Segoe UI", 0, 13));
        btnVer.setText("Ver detalle");
        btnVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerActionPerformed(evt);
            }
        });

        btnMostrar.setFont(new java.awt.Font("Segoe UI", 0, 13));
        btnMostrar.setText("Mostrar");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

        btnConfirmar.setFont(new java.awt.Font("Segoe UI", 0, 13));
        btnConfirmar.setText("Confirmar");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        btnPreparar.setFont(new java.awt.Font("Segoe UI", 0, 13));
        btnPreparar.setText("Preparar");
        btnPreparar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrepararActionPerformed(evt);
            }
        });

        btnEntregar.setFont(new java.awt.Font("Segoe UI", 0, 13));
        btnEntregar.setText("Entregar");
        btnEntregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntregarActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Segoe UI", 0, 13));
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnNueva.setFont(new java.awt.Font("Segoe UI", 1, 14));
        btnNueva.setText("Nueva orden -->");
        btnNueva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaActionPerformed(evt);
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
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(entNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(entDia, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(entMes, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(entAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(entHora, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(btnVer, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(btnMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(btnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(btnPreparar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(btnEntregar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(btnNueva, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(entNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(entDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(entMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(entAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(entHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVer)
                    .addComponent(btnMostrar))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConfirmar)
                    .addComponent(btnPreparar))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEntregar)
                    .addComponent(btnCancelar))
                .addGap(18, 18, 18)
                .addComponent(btnNueva)
                .addGap(18, 18, 18)
        );

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jLabel4.setText("Ordenes registradas");

        Datos.setFont(new java.awt.Font("Segoe UI", 0, 13));
        Datos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] { "Numero", "Tipo", "Cliente", "Vendedor", "Entrega", "Fecha entrega", "Estado", "Total", "Adelanto" }
        ));
        jScrollPane1.setViewportView(Datos);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jLabel5.setText("Detalle de la orden");

        Detalle.setFont(new java.awt.Font("Segoe UI", 0, 13));
        Detalle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] { "Tipo", "Codigo", "Nombre", "Cantidad", "Precio", "Subtotal" }
        ));
        jScrollPane2.setViewportView(Detalle);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jLabel6.setText("Historial de la orden");

        Historial.setFont(new java.awt.Font("Segoe UI", 0, 13));
        Historial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] { "Fecha", "Anterior", "Nuevo", "Usuario", "Observacion" }
        ));
        jScrollPane3.setViewportView(Historial);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
                    .addComponent(jLabel6)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE))
                .addGap(12, 12, 12)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel4)
                .addGap(6, 6, 6)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                .addGap(12, 12, 12)
                .addComponent(jLabel5)
                .addGap(6, 6, 6)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                .addGap(12, 12, 12)
                .addComponent(jLabel6)
                .addGap(6, 6, 6)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
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

    private void btnVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerActionPerformed
        Orden orden = ordenElegida();
        if (orden != null) {
            verDetalle(orden);
            JOptionPane.showMessageDialog(this, resumen(orden), "Orden", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnVerActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        mostrar();
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        cambiar("Confirmar");
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void btnPrepararActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrepararActionPerformed
        cambiar("Preparar");
    }//GEN-LAST:event_btnPrepararActionPerformed

    private void btnEntregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntregarActionPerformed
        cambiar("Entregar");
    }//GEN-LAST:event_btnEntregarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        cambiar("Cancelar");
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnNuevaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaActionPerformed
        VentanaNuevaOrden obj = new VentanaNuevaOrden(tienda);
        obj.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnNuevaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Datos;
    private javax.swing.JTable Detalle;
    private javax.swing.JTable Historial;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnEntregar;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JButton btnNueva;
    private javax.swing.JButton btnPreparar;
    private javax.swing.JButton btnVer;
    private javax.swing.JTextField entAnio;
    private javax.swing.JTextField entDia;
    private javax.swing.JTextField entHora;
    private javax.swing.JTextField entMes;
    private javax.swing.JTextField entNumero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables

    public Orden ordenElegida() {
        if (entNumero.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Ingrese el numero de la orden", "Error", JOptionPane.ERROR_MESSAGE);
            return null;
        }
        int numero = Integer.parseInt(entNumero.getText());
        int pos = tienda.getOrdenes().buscarPorNumero(numero);
        if (pos == -1) {
            JOptionPane.showMessageDialog(this, String.format("La orden %d no existe", numero), "Error", JOptionPane.ERROR_MESSAGE);
            return null;
        }
        return tienda.getOrdenes().getOrdenes()[pos];
    }

    public Fecha leerFecha() {
        if (entDia.getText().equals("") || entMes.getText().equals("") || entAnio.getText().equals("") || entHora.getText().equals("")) {
            return null;
        }
        int dia = Integer.parseInt(entDia.getText());
        int mes = Integer.parseInt(entMes.getText());
        int anio = Integer.parseInt(entAnio.getText());
        int hora = Integer.parseInt(entHora.getText());
        return new Fecha(dia, mes, anio, hora);
    }

    public void cambiar(String accion) {
        Orden orden = ordenElegida();
        if (orden == null) {
            return;
        }
        Fecha fecha = leerFecha();
        if (fecha == null) {
            JOptionPane.showMessageDialog(this, "Ingrese la fecha y la hora del movimiento", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        GestionOrdenes gestion = tienda.getOrdenes();
        Empleado empleado = tienda.getSesion();
        String mensaje = "";
        String exito = "";
        if (accion.equals("Confirmar")) {
            mensaje = gestion.confirmar(orden, fecha, empleado, tienda);
            exito = String.format("Orden %d confirmada. Adelanto registrado: S/ %.2f", orden.getNumero(), orden.getAdelanto());
        }
        if (accion.equals("Preparar")) {
            mensaje = gestion.preparar(orden, fecha, empleado, tienda);
            exito = String.format("Orden %d en preparacion. Juguetes en estado %s", orden.getNumero(), orden.estadoJuguete());
        }
        if (accion.equals("Entregar")) {
            mensaje = gestion.entregar(orden, fecha, empleado, tienda);
            exito = String.format("Orden %d finalizada y entregada al cliente", orden.getNumero());
        }
        if (accion.equals("Cancelar")) {
            mensaje = gestion.cancelar(orden, fecha, empleado, tienda);
            if (orden.getDevolucion() > 0) {
                exito = String.format("Orden %d cancelada. Se devuelve el adelanto de S/ %.2f", orden.getNumero(), orden.getDevolucion());
            } else if (orden.getRetenido() > 0) {
                exito = String.format("Orden %d cancelada con menos de 24 horas. Se retiene el adelanto de S/ %.2f", orden.getNumero(), orden.getRetenido());
            } else {
                exito = String.format("Orden %d cancelada", orden.getNumero());
            }
        }
        if (!mensaje.equals("")) {
            JOptionPane.showMessageDialog(this, mensaje, "Rechazado", JOptionPane.ERROR_MESSAGE);
            return;
        }
        JOptionPane.showMessageDialog(this, exito, "Info", JOptionPane.INFORMATION_MESSAGE);
        mostrar();
        verDetalle(orden);
    }

    public void mostrar() {
        modelo.setNumRows(0);
        Orden[] lista = tienda.getOrdenes().getOrdenes();
        for (int i = 0; i < tienda.getOrdenes().getCont(); i++) {
            String cliente = String.format("%s %s", lista[i].getCliente().getNombres(), lista[i].getCliente().getApellidos());
            String total = String.format("%.2f", lista[i].calcularTotal());
            String adelanto = String.format("%.2f", lista[i].getAdelanto());
            Object[] fila = {lista[i].getNumero(), lista[i].getTipo(), cliente, lista[i].getVendedor().getUsuario(), lista[i].getTipoEntrega(), lista[i].getFechaEntrega().textoConHora(), lista[i].getEstado(), total, adelanto};
            modelo.addRow(fila);
        }
    }

    public void verDetalle(Orden orden) {
        modeloDetalle.setNumRows(0);
        DetalleOrden[] detalles = orden.getDetalles();
        for (int i = 0; i < orden.getContD(); i++) {
            String precio = String.format("%.2f", detalles[i].getPrecio());
            String subtotal = String.format("%.2f", detalles[i].subtotal());
            Object[] fila = {detalles[i].getTipo(), detalles[i].getCodigo(), detalles[i].getNombre(), detalles[i].getCantidad(), precio, subtotal};
            modeloDetalle.addRow(fila);
        }
        modeloHistorial.setNumRows(0);
        HistorialOrden[] historial = orden.getHistorial();
        for (int i = 0; i < orden.getContH(); i++) {
            Object[] fila = {historial[i].getFecha().textoConHora(), historial[i].getEstadoAnterior(), historial[i].getEstadoNuevo(), historial[i].getUsuario(), historial[i].getObservacion()};
            modeloHistorial.addRow(fila);
        }
    }

    public String resumen(Orden orden) {
        String almacenero = "-";
        if (orden.getAlmacenero() != null) {
            almacenero = orden.getAlmacenero().getUsuario();
        }
        String texto = String.format("Orden %d de %s\nEstado: %s\nCliente: %s %s (%s)\nEntrega: %s el %s\n", orden.getNumero(), orden.getTipo(), orden.getEstado(), orden.getCliente().getNombres(), orden.getCliente().getApellidos(), orden.getCliente().getTipo(), orden.getTipoEntrega(), orden.getFechaEntrega().textoConHora());
        String montos = String.format("Juguetes: S/ %.2f\nDescuento: S/ %.2f\nServicios: S/ %.2f\nPaquetes: S/ %.2f\nEnvio: S/ %.2f\nSubtotal: S/ %.2f\nIGV: S/ %.2f\nTotal: S/ %.2f\nAdelanto: S/ %.2f\nSaldo: S/ %.2f\n", orden.totalJuguetes(), orden.descuento(), orden.totalServicios(), orden.totalPaquetes(), orden.getCostoEnvio(), orden.calcularSubtotal(), orden.calcularIGV(), orden.calcularTotal(), orden.getAdelanto(), orden.saldo());
        String cierre = String.format("Vendedor: %s\nAlmacenero: %s\nDevuelto: S/ %.2f\nRetenido: S/ %.2f", orden.getVendedor().getUsuario(), almacenero, orden.getDevolucion(), orden.getRetenido());
        return String.format("%s%s%s", texto, montos, cierre);
    }
}
