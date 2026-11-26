package retroplaymanager;

import javax.swing.JOptionPane;

public class VentanaReportes extends javax.swing.JFrame {

    private Tienda tienda;

    public VentanaReportes(Tienda tienda) {
        this.tienda = tienda;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlFiltros = new javax.swing.JPanel();
        pnlTabla = new javax.swing.JPanel();
        lblReporte = new javax.swing.JLabel();
        cboTipo = new javax.swing.JComboBox();
        lblDesde = new javax.swing.JLabel();
        entDiaD = new javax.swing.JTextField();
        entMesD = new javax.swing.JTextField();
        entAnioD = new javax.swing.JTextField();
        lblHasta = new javax.swing.JLabel();
        entDiaH = new javax.swing.JTextField();
        entMesH = new javax.swing.JTextField();
        entAnioH = new javax.swing.JTextField();
        btnGenerar = new javax.swing.JButton();
        scrTabla = new javax.swing.JScrollPane();
        Datos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Reportes");

        lblReporte.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblReporte.setText("Reporte");

        cboTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rotacion por categoria", "Productividad del personal", "Clientes con mas compras", "Ingresos del periodo" }));

        lblDesde.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblDesde.setText("Desde");

        lblHasta.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblHasta.setText("Hasta");

        btnGenerar.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnGenerar.setText("Generar reporte");
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
            }
        });

        Datos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Categoria", "Stock inicial", "Entradas", "Base", "Vendidos", "% salida"
            }
        ));
        scrTabla.setViewportView(Datos);

        javax.swing.GroupLayout pnlFiltrosLayout = new javax.swing.GroupLayout(pnlFiltros);
        pnlFiltros.setLayout(pnlFiltrosLayout);
        pnlFiltrosLayout.setHorizontalGroup(
            pnlFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFiltrosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblReporte)
                    .addComponent(lblDesde)
                    .addComponent(lblHasta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlFiltrosLayout.createSequentialGroup()
                        .addComponent(entDiaD, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(entMesD, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(entAnioD, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlFiltrosLayout.createSequentialGroup()
                        .addComponent(entDiaH, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(entMesH, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(entAnioH, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlFiltrosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnGenerar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlFiltrosLayout.setVerticalGroup(
            pnlFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFiltrosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblReporte)
                    .addComponent(cboTipo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDesde)
                    .addComponent(entDiaD)
                    .addComponent(entMesD)
                    .addComponent(entAnioD))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHasta)
                    .addComponent(entDiaH)
                    .addComponent(entMesH)
                    .addComponent(entAnioH))
                .addGap(18, 18, 18)
                .addGroup(pnlFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGenerar))
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
                .addComponent(scrTabla, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFiltros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlFiltros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed
        generar();
    }//GEN-LAST:event_btnGenerarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel pnlFiltros;
    private javax.swing.JPanel pnlTabla;
    private javax.swing.JLabel lblReporte;
    private javax.swing.JComboBox<String> cboTipo;
    private javax.swing.JLabel lblDesde;
    private javax.swing.JTextField entDiaD;
    private javax.swing.JTextField entMesD;
    private javax.swing.JTextField entAnioD;
    private javax.swing.JLabel lblHasta;
    private javax.swing.JTextField entDiaH;
    private javax.swing.JTextField entMesH;
    private javax.swing.JTextField entAnioH;
    private javax.swing.JButton btnGenerar;
    private javax.swing.JScrollPane scrTabla;
    private javax.swing.JTable Datos;
    // End of variables declaration//GEN-END:variables

    public Fecha leerFecha(String dia, String mes, String anio) {
        if (dia.equals("") || mes.equals("") || anio.equals("")) {
            return null;
        }
        Fecha fecha = new Fecha(Integer.parseInt(dia), Integer.parseInt(mes), Integer.parseInt(anio), 0);
        if (!fecha.esValida()) {
            return null;
        }
        return fecha;
    }

    public boolean autorizado() {
        if (tienda.getSesion() == null) {
            return false;
        }
        return tienda.getSesion().getRol().equals("Administrador");
    }

    public void generar() {
        if (!autorizado()) {
            JOptionPane.showMessageDialog(this, "Acceso denegado", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        Fecha desde = leerFecha(entDiaD.getText(), entMesD.getText(), entAnioD.getText());
        Fecha hasta = leerFecha(entDiaH.getText(), entMesH.getText(), entAnioH.getText());
        if (desde == null || hasta == null || desde.totalDias() > hasta.totalDias()) {
            JOptionPane.showMessageDialog(this, "Ingrese un rango de fechas valido", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        GestionReportes gestion = tienda.getReportes();
        String[] columnas;
        Object[][] filas;
        if (cboTipo.getSelectedIndex() == 0) {
            columnas = new String[]{"Categoria", "Stock inicial", "Entradas", "Base", "Vendidos", "% salida"};
            filas = gestion.rotacion(desde, hasta);
        } else if (cboTipo.getSelectedIndex() == 1) {
            columnas = new String[]{"DNI", "Empleado", "Rol", "Ordenes registradas", "Ordenes verificadas", "Paquetes verificados"};
            filas = gestion.productividad(desde, hasta);
        } else if (cboTipo.getSelectedIndex() == 2) {
            columnas = new String[]{"DNI", "Cliente", "Compras finalizadas"};
            filas = gestion.clientes(desde, hasta);
        } else {
            columnas = new String[]{"Concepto", "Importe S/"};
            filas = gestion.ingresos(desde, hasta);
        }
        Datos.setModel(new javax.swing.table.DefaultTableModel(filas, columnas));
    }
}
