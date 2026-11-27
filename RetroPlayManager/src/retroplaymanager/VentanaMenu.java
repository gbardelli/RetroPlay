package retroplaymanager;

public class VentanaMenu extends javax.swing.JFrame {

    private Tienda tienda;

    public VentanaMenu(Tienda tienda) {
        this.tienda = tienda;
        initComponents();
        Empleado sesion = tienda.getSesion();
        lblTitulo.setText(sesion.getNombres() + " " + sesion.getApellidos());
        setTitle("RetroPlay - " + sesion.getRol());
        if (!sesion.getRol().equals("Administrador")) {
            btnPersonal.setVisible(false);
            btnJuguetes.setVisible(false);
            btnServicios.setVisible(false);
            btnPaquetes.setVisible(false);
            btnReportes.setVisible(false);
        }
        if (!sesion.getRol().equals("Vendedor")) {
            btnClientes.setVisible(false);
            btnComprobante.setVisible(false);
        }
        if (!sesion.getRol().equals("Administrador") && !sesion.getRol().equals("Almacenero")) {
            btnInventario.setVisible(false);
        }
        if (!sesion.getRol().equals("Vendedor") && !sesion.getRol().equals("Almacenero")) {
            btnOrdenes.setVisible(false);
        }
        pack();
        retroplaymanager.apariencia.Apariencia.vestir(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        btnPersonal = new javax.swing.JButton();
        btnJuguetes = new javax.swing.JButton();
        btnServicios = new javax.swing.JButton();
        btnPaquetes = new javax.swing.JButton();
        btnInventario = new javax.swing.JButton();
        btnReportes = new javax.swing.JButton();
        btnClientes = new javax.swing.JButton();
        btnOrdenes = new javax.swing.JButton();
        btnComprobante = new javax.swing.JButton();
        btnSesion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("RetroPlay");

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblTitulo.setText("Menu");

        btnPersonal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnPersonal.setText("Personal");
        btnPersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPersonalActionPerformed(evt);
            }
        });

        btnJuguetes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnJuguetes.setText("Juguetes");
        btnJuguetes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJuguetesActionPerformed(evt);
            }
        });

        btnServicios.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnServicios.setText("Servicios");
        btnServicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnServiciosActionPerformed(evt);
            }
        });

        btnPaquetes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnPaquetes.setText("Paquetes");
        btnPaquetes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPaquetesActionPerformed(evt);
            }
        });

        btnInventario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnInventario.setText("Inventario");
        btnInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInventarioActionPerformed(evt);
            }
        });

        btnReportes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnReportes.setText("Reportes");
        btnReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportesActionPerformed(evt);
            }
        });

        btnClientes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnClientes.setText("Clientes");
        btnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesActionPerformed(evt);
            }
        });

        btnOrdenes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnOrdenes.setText("Ordenes");
        btnOrdenes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenesActionPerformed(evt);
            }
        });

        btnComprobante.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnComprobante.setText("Comprobante");
        btnComprobante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprobanteActionPerformed(evt);
            }
        });

        btnSesion.setText("Cerrar sesion");
        btnSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSesionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblTitulo)
                    .addComponent(btnPersonal, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                    .addComponent(btnJuguetes, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                    .addComponent(btnServicios, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                    .addComponent(btnPaquetes, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                    .addComponent(btnInventario, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                    .addComponent(btnReportes, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                    .addComponent(btnClientes, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                    .addComponent(btnOrdenes, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                    .addComponent(btnComprobante, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                    .addComponent(btnSesion, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE))
                .addGap(24, 24, 24))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblTitulo)
                .addGap(12, 12, 12)
                .addComponent(btnPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(btnJuguetes, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(btnServicios, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(btnPaquetes, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(btnInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(btnReportes, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(btnClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(btnOrdenes, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(btnComprobante, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(btnSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createSequentialGroup()
                .addComponent(jPanel1)
        );
        layout.setVerticalGroup(
            layout.createSequentialGroup()
                .addComponent(jPanel1)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPersonalActionPerformed
        abrir("personal");
    }//GEN-LAST:event_btnPersonalActionPerformed

    private void btnJuguetesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJuguetesActionPerformed
        abrir("juguetes");
    }//GEN-LAST:event_btnJuguetesActionPerformed

    private void btnServiciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnServiciosActionPerformed
        abrir("servicios");
    }//GEN-LAST:event_btnServiciosActionPerformed

    private void btnPaquetesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPaquetesActionPerformed
        abrir("paquetes");
    }//GEN-LAST:event_btnPaquetesActionPerformed

    private void btnInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInventarioActionPerformed
        abrir("inventario");
    }//GEN-LAST:event_btnInventarioActionPerformed

    private void btnReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportesActionPerformed
        abrir("reportes");
    }//GEN-LAST:event_btnReportesActionPerformed

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
        abrir("clientes");
    }//GEN-LAST:event_btnClientesActionPerformed

    private void btnOrdenesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenesActionPerformed
        abrir("ordenes");
    }//GEN-LAST:event_btnOrdenesActionPerformed

    private void btnComprobanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprobanteActionPerformed
        abrir("comprobante");
    }//GEN-LAST:event_btnComprobanteActionPerformed

    private void btnSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSesionActionPerformed
        tienda.setSesion(null);
        java.awt.Frame[] ventanas = java.awt.Frame.getFrames();
        for (int i = 0; i < ventanas.length; i++) {
            ventanas[i].dispose();
        }
        VentanaLogin obj = new VentanaLogin(tienda);
        obj.setVisible(true);
    }//GEN-LAST:event_btnSesionActionPerformed

    public void abrir(String destino) {
        if (destino.equals("personal")) {
            new VentanaPersonal(tienda).setVisible(true);
        }
        if (destino.equals("juguetes")) {
            new VentanaJuguetes(tienda).setVisible(true);
        }
        if (destino.equals("servicios")) {
            new VentanaServicios(tienda).setVisible(true);
        }
        if (destino.equals("paquetes")) {
            new VentanaPaquetes(tienda).setVisible(true);
        }
        if (destino.equals("inventario")) {
            new VentanaInventario(tienda).setVisible(true);
        }
        if (destino.equals("clientes")) {
            new VentanaClientes(tienda).setVisible(true);
        }
        if (destino.equals("ordenes")) {
            new VentanaOrden(tienda).setVisible(true);
        }
        if (destino.equals("comprobante")) {
            new VentanaComprobante(tienda).setVisible(true);
        }
        if (destino.equals("reportes")) {
            new VentanaReportes(tienda).setVisible(true);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnComprobante;
    private javax.swing.JButton btnInventario;
    private javax.swing.JButton btnJuguetes;
    private javax.swing.JButton btnOrdenes;
    private javax.swing.JButton btnPaquetes;
    private javax.swing.JButton btnPersonal;
    private javax.swing.JButton btnReportes;
    private javax.swing.JButton btnServicios;
    private javax.swing.JButton btnSesion;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
