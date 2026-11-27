package retroplaymanager;

import javax.swing.JOptionPane;

public class VentanaComprobante extends javax.swing.JFrame {

    private Tienda tienda;
    private Entradas entradas = new Entradas();
    private javax.swing.table.DefaultTableModel modelo;

    public VentanaComprobante(Tienda tienda) {
        this.tienda = tienda;
        initComponents();
        modelo = (javax.swing.table.DefaultTableModel) Datos.getModel();
        actualizarTipo();
        cargarOrdenes();
        if (autorizado()) {
            mostrar();
        }
        retroplaymanager.apariencia.Apariencia.vestir(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlDatos = new javax.swing.JPanel();
        pnlTabla = new javax.swing.JPanel();
        pnlDetalle = new javax.swing.JPanel();
        lblNumOrden = new javax.swing.JLabel();
        cboOrden = new javax.swing.JComboBox<>();
        cboOrden.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una orden finalizada..." }));
        lblTipo = new javax.swing.JLabel();
        cboTipo = new javax.swing.JComboBox();
        lblRuc = new javax.swing.JLabel();
        entRuc = new javax.swing.JTextField();
        lblRazon = new javax.swing.JLabel();
        entRazon = new javax.swing.JTextField();
        btnActualizar = new javax.swing.JButton();
        btnVer = new javax.swing.JButton();
        btnEmitir = new javax.swing.JButton();
        scrTabla = new javax.swing.JScrollPane();
        Datos = new javax.swing.JTable();
        scrDetalle = new javax.swing.JScrollPane();
        txtDetalle = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Comprobantes");

        lblNumOrden.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblNumOrden.setText("Orden");

        lblTipo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTipo.setText("Tipo");

        cboTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Boleta", "Factura" }));
        cboTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboTipoActionPerformed(evt);
            }
        });

        lblRuc.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblRuc.setText("RUC");

        lblRazon.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblRazon.setText("Razon social");

        btnActualizar.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnVer.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnVer.setText("Ver cuenta");
        btnVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerActionPerformed(evt);
            }
        });

        btnEmitir.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnEmitir.setText("Emitir");
        btnEmitir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmitirActionPerformed(evt);
            }
        });

        Datos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Orden", "Cliente", "Fecha cierre", "Total", "Saldo", "Comprobante"
            }
        ));
        scrTabla.setViewportView(Datos);

        txtDetalle.setEditable(false);
        txtDetalle.setColumns(20);
        txtDetalle.setRows(5);
        scrDetalle.setViewportView(txtDetalle);

        javax.swing.GroupLayout pnlDatosLayout = new javax.swing.GroupLayout(pnlDatos);
        pnlDatos.setLayout(pnlDatosLayout);
        pnlDatosLayout.setHorizontalGroup(
            pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNumOrden)
                    .addComponent(lblTipo)
                    .addComponent(lblRuc)
                    .addComponent(lblRazon))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cboOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(entRuc, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(entRazon, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnActualizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEmitir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlDatosLayout.setVerticalGroup(
            pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumOrden)
                    .addComponent(cboOrden))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTipo)
                    .addComponent(cboTipo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRuc)
                    .addComponent(entRuc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRazon)
                    .addComponent(entRazon))
                .addGap(18, 18, 18)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnActualizar)
                    .addComponent(btnVer)
                    .addComponent(btnEmitir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlTablaLayout = new javax.swing.GroupLayout(pnlTabla);
        pnlTabla.setLayout(pnlTablaLayout);
        pnlTablaLayout.setHorizontalGroup(
            pnlTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTablaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrTabla, javax.swing.GroupLayout.DEFAULT_SIZE, 760, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlTablaLayout.setVerticalGroup(
            pnlTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTablaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrTabla, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlDetalleLayout = new javax.swing.GroupLayout(pnlDetalle);
        pnlDetalle.setLayout(pnlDetalleLayout);
        pnlDetalleLayout.setHorizontalGroup(
            pnlDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDetalleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrDetalle, javax.swing.GroupLayout.DEFAULT_SIZE, 760, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlDetalleLayout.setVerticalGroup(
            pnlDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDetalleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrDetalle, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlDetalle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlDetalle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cboTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboTipoActionPerformed
        actualizarTipo();
    }//GEN-LAST:event_cboTipoActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        cargarOrdenes();
        mostrar();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerActionPerformed
        ver();
    }//GEN-LAST:event_btnVerActionPerformed

    private void btnEmitirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmitirActionPerformed
        emitir();
    }//GEN-LAST:event_btnEmitirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel pnlDatos;
    private javax.swing.JPanel pnlTabla;
    private javax.swing.JPanel pnlDetalle;
    private javax.swing.JLabel lblNumOrden;
    private javax.swing.JComboBox<String> cboOrden;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JComboBox<String> cboTipo;
    private javax.swing.JLabel lblRuc;
    private javax.swing.JTextField entRuc;
    private javax.swing.JLabel lblRazon;
    private javax.swing.JTextField entRazon;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnVer;
    private javax.swing.JButton btnEmitir;
    private javax.swing.JScrollPane scrTabla;
    private javax.swing.JTable Datos;
    private javax.swing.JScrollPane scrDetalle;
    private javax.swing.JTextArea txtDetalle;
    // End of variables declaration//GEN-END:variables

    public boolean autorizado() {
        if (tienda.getSesion() == null) {
            return false;
        }
        return tienda.getSesion().getRol().equals("Vendedor");
    }

    public void actualizarTipo() {
        boolean factura = cboTipo.getSelectedItem().equals("Factura");
        entRuc.setEnabled(factura);
        entRazon.setEnabled(factura);
    }

    public void mostrar() {
        if (!autorizado()) {
            JOptionPane.showMessageDialog(this, "Acceso denegado", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        modelo.setNumRows(0);
        GestionOrdenes gestion = tienda.getOrdenes();
        for (int i = 0; i < gestion.getCont(); i++) {
            Orden obj = gestion.getOrdenes()[i];
            if (obj.getEstado().equals("Finalizada")) {
                Comprobante comp = tienda.getComprobantes().buscarPorOrden(obj.getNumero());
                String estado = "Sin emitir";
                if (comp != null) {
                    estado = String.format("%s %d", comp.getTipo(), comp.getNumero());
                }
                String cliente = String.format("%s %s", obj.getCliente().getNombres(), obj.getCliente().getApellidos());
                Object[] fila = {obj.getNumero(), cliente, obj.getFechaCierre().texto(), String.format("%.2f", obj.calcularTotal()), String.format("%.2f", obj.saldo()), estado};
                modelo.addRow(fila);
            }
        }
    }

    public Orden buscarOrden() {
        if (entradas.codigoDe(entradas.elegido(cboOrden)).equals("")) {
            JOptionPane.showMessageDialog(this, "Elija una orden de la lista", "Error", JOptionPane.ERROR_MESSAGE);
            return null;
        }
        int pos = tienda.getOrdenes().buscarPorNumero(Integer.parseInt(entradas.codigoDe(entradas.elegido(cboOrden))));
        if (pos == -1) {
            JOptionPane.showMessageDialog(this, "Orden no encontrada", "Error", JOptionPane.ERROR_MESSAGE);
            return null;
        }
        return tienda.getOrdenes().getOrdenes()[pos];
    }

    public void ver() {
        if (!autorizado()) {
            JOptionPane.showMessageDialog(this, "Acceso denegado", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        Orden obj = buscarOrden();
        if (obj == null) {
            return;
        }
        if (!obj.getEstado().equals("Finalizada")) {
            JOptionPane.showMessageDialog(this, "La orden aun no esta finalizada", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        Comprobante comp = tienda.getComprobantes().buscarPorOrden(obj.getNumero());
        if (comp == null) {
            Boleta previa = new Boleta(0, obj);
            txtDetalle.setText(String.format("VISTA PREVIA - SIN VALIDEZ\n%s", previa.mostrarDatos()));
        } else {
            txtDetalle.setText(comp.mostrarDatos());
        }
    }

    public void emitir() {
        if (!autorizado()) {
            JOptionPane.showMessageDialog(this, "Acceso denegado", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        Orden obj = buscarOrden();
        if (obj == null) {
            return;
        }
        String mensaje = tienda.getComprobantes().emitir(obj, (String) cboTipo.getSelectedItem(), entRuc.getText(), entRazon.getText());
        if (!mensaje.equals("")) {
            JOptionPane.showMessageDialog(this, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        txtDetalle.setText(tienda.getComprobantes().buscarPorOrden(obj.getNumero()).mostrarDatos());
        JOptionPane.showMessageDialog(this, "Comprobante emitido", "Info", JOptionPane.INFORMATION_MESSAGE);
        cargarOrdenes();
        mostrar();
    }

    public void cargarOrdenes() {
        String elegida = entradas.codigoDe(entradas.elegido(cboOrden));
        cboOrden.removeAllItems();
        cboOrden.addItem("Seleccione una orden finalizada...");
        GestionOrdenes gestion = tienda.getOrdenes();
        for (int i = 0; i < gestion.getCont(); i++) {
            Orden obj = gestion.getOrdenes()[i];
            if (obj.getEstado().equals("Finalizada")) {
                String estado = "Sin emitir";
                Comprobante comp = tienda.getComprobantes().buscarPorOrden(obj.getNumero());
                if (comp != null) {
                    estado = String.format("%s %d", comp.getTipo(), comp.getNumero());
                }
                cboOrden.addItem(String.format("%d - %s %s - %s", obj.getNumero(), obj.getCliente().getNombres(), obj.getCliente().getApellidos(), estado));
            }
        }
        entradas.seleccionarCodigo(cboOrden, elegida);
    }
}
