package retroplaymanager;

import javax.swing.JOptionPane;

public class VentanaServicios extends javax.swing.JFrame {

    private Tienda tienda;
    private Entradas entradas = new Entradas();
    private javax.swing.table.DefaultTableModel modelo;

    public VentanaServicios(Tienda tienda) {
        this.tienda = tienda;
        initComponents();
        modelo = (javax.swing.table.DefaultTableModel) Datos.getModel();
        cargarLista();
        mostrar();
        retroplaymanager.apariencia.Apariencia.vestir(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        jPanel1 = new javax.swing.JPanel();
        lblElegir = new javax.swing.JLabel();
        cboElegir = new javax.swing.JComboBox<>();
        cboElegir.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione para editar..." }));
        cboElegir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboElegirActionPerformed(evt);
            }
        });
        jLabel1 = new javax.swing.JLabel();
        entCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        entNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        entPrecio = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        entStock = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnMostrar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Datos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Servicios");

        lblElegir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblElegir.setText("Editar existente");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Codigo");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Nombre");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Precio");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Stock");

        btnRegistrar.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnModificar.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnMostrar.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnMostrar.setText("Mostrar");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblElegir)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4)
                )
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(cboElegir, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(entCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(entNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(entPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(entStock, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                )
                .addGap(18, 18, 18))

                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(18, 18, 18)
                    .addComponent(btnRegistrar)
                    .addGap(18, 18, 18)
                    .addComponent(btnModificar))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(18, 18, 18)
                    .addComponent(btnEliminar)
                    .addGap(18, 18, 18)
                    .addComponent(btnMostrar))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblElegir)
                    .addComponent(cboElegir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)

                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(entCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(entNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(entPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(entStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)

                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrar)
                    .addComponent(btnModificar))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminar)
                    .addComponent(btnMostrar))
                .addGap(12, 12, 12)
                .addGap(18, 18, 18)
        );

        Datos.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        Datos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] { "Codigo", "Nombre", "Precio", "Stock" }
        ));
        jScrollPane1.setViewportView(Datos);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE)
                .addGap(12, 12, 12)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
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

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        registrar();
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void cboElegirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboElegirActionPerformed
        cargarSeleccion();
    }//GEN-LAST:event_cboElegirActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        modificar();
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        eliminar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        mostrar();
        cargarLista();
    }//GEN-LAST:event_btnMostrarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblElegir;
    private javax.swing.JComboBox<String> cboElegir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField entCodigo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField entNombre;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField entPrecio;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField entStock;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable Datos;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    public boolean vacio() {
        if (entCodigo.getText().equals("") || entNombre.getText().equals("") || entPrecio.getText().equals("") || entStock.getText().equals("")) {
            return true;
        }
        return false;
    }

    public void registrar() {
        GestionServicios gestion = tienda.getServicios();
        if (gestion.getCont() >= 30) {
            JOptionPane.showMessageDialog(this, "Vector Lleno!!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (vacio()) {
            JOptionPane.showMessageDialog(this, "Complete los datos", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (gestion.buscarPorCodigo(entCodigo.getText()) != -1) {
            JOptionPane.showMessageDialog(this, "Codigo repetido", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!entradas.esDecimal(entPrecio.getText()) || !entradas.esEntero(entStock.getText())) {
            JOptionPane.showMessageDialog(this, "El precio y el stock deben ser numeros", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        double precio = Double.parseDouble(entPrecio.getText());
        int stock = Integer.parseInt(entStock.getText());
        String mensaje = gestion.validar(precio, stock);
        if (!mensaje.equals("")) {
            JOptionPane.showMessageDialog(this, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        Servicio obj = new Servicio(entCodigo.getText(), entNombre.getText(), precio, stock);
        gestion.registrar(obj);
        JOptionPane.showMessageDialog(this, "Servicio registrado", "Info", JOptionPane.INFORMATION_MESSAGE);
        limpiar();
        cargarLista();
        mostrar();
    }

    public void modificar() {
        GestionServicios gestion = tienda.getServicios();
        int pos = gestion.buscarPorCodigo(entCodigo.getText());
        if (pos == -1) {
            JOptionPane.showMessageDialog(this, "Servicio no encontrado", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (vacio()) {
            JOptionPane.showMessageDialog(this, "Complete los datos", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!entradas.esDecimal(entPrecio.getText()) || !entradas.esEntero(entStock.getText())) {
            JOptionPane.showMessageDialog(this, "El precio y el stock deben ser numeros", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        double precio = Double.parseDouble(entPrecio.getText());
        int stock = Integer.parseInt(entStock.getText());
        String mensaje = gestion.validar(precio, stock);
        if (!mensaje.equals("")) {
            JOptionPane.showMessageDialog(this, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        Servicio obj = gestion.getServicios()[pos];
        obj.setNombre(entNombre.getText());
        obj.setPrecio(precio);
        obj.setStock(stock);
        JOptionPane.showMessageDialog(this, "Servicio modificado", "Info", JOptionPane.INFORMATION_MESSAGE);
        limpiar();
        cargarLista();
        mostrar();
    }

    public void eliminar() {
        GestionServicios gestion = tienda.getServicios();
        int pos = gestion.buscarPorCodigo(entCodigo.getText());
        if (pos == -1) {
            JOptionPane.showMessageDialog(this, "Servicio no encontrado", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        gestion.eliminar(pos);
        JOptionPane.showMessageDialog(this, "Servicio eliminado", "Info", JOptionPane.INFORMATION_MESSAGE);
        limpiar();
        cargarLista();
        mostrar();
    }

    public void mostrar() {
        modelo.setNumRows(0);
        Servicio[] lista = tienda.getServicios().getServicios();
        for (int i = 0; i < tienda.getServicios().getCont(); i++) {
            String precio = String.format("%.2f", lista[i].precioUnitario());
            Object[] fila = {lista[i].getCodigo(), lista[i].getNombre(), precio, lista[i].getStock()};
            modelo.addRow(fila);
        }
    }

    public void vaciarCampos() {
        entCodigo.setText(null);
        entNombre.setText(null);
        entPrecio.setText(null);
        entStock.setText(null);
    }

    public void limpiar() {
        vaciarCampos();
        cboElegir.setSelectedIndex(0);
    }

    public void cargarLista() {
        cboElegir.removeAllItems();
        cboElegir.addItem("Seleccione para editar...");
        for (int i = 0; i < tienda.getServicios().getCont(); i++) {
            Servicio obj = tienda.getServicios().getServicios()[i];
            cboElegir.addItem(String.format("%s - %s", obj.getCodigo(), obj.getNombre()));
        }
    }

    public void cargarSeleccion() {
        if (cboElegir.getSelectedIndex() == -1) {
            return;
        }
        if (cboElegir.getSelectedIndex() == 0) {
            vaciarCampos();
            return;
        }
        int pos = tienda.getServicios().buscarPorCodigo(entradas.codigoDe(entradas.elegido(cboElegir)));
        if (pos == -1) {
            return;
        }
        Servicio obj = tienda.getServicios().getServicios()[pos];
        entCodigo.setText(obj.getCodigo());
        entNombre.setText(obj.getNombre());
        entPrecio.setText(String.valueOf(obj.getPrecio()));
        entStock.setText(String.valueOf(obj.getStock()));
    }
}
