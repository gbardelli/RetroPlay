package retroplaymanager;

import javax.swing.JOptionPane;

public class VentanaPaquetes extends javax.swing.JFrame {

    private Tienda tienda;
    private Entradas entradas = new Entradas();
    private javax.swing.table.DefaultTableModel modelo;

    public VentanaPaquetes(Tienda tienda) {
        this.tienda = tienda;
        initComponents();
        modelo = (javax.swing.table.DefaultTableModel) Datos.getModel();
        for (int i = 0; i < tienda.getJuguetes().getCont(); i++) {
            Juguete obj = tienda.getJuguetes().getJuguetes()[i];
            cboJuguete.addItem(String.format("%s - %s", obj.getCodigo(), obj.getNombre()));
        }
        for (int i = 0; i < tienda.getServicios().getCont(); i++) {
            Servicio obj = tienda.getServicios().getServicios()[i];
            cboServicio.addItem(String.format("%s - %s", obj.getCodigo(), obj.getNombre()));
        }
        cargarPaquetes();
        mostrar();
        retroplaymanager.apariencia.Apariencia.vestir(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        jPanel1 = new javax.swing.JPanel();
        lblCrear = new javax.swing.JLabel();
        lblArmar = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cboPaquete = new javax.swing.JComboBox<>();
        cboPaquete.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un paquete..." }));
        jLabel1 = new javax.swing.JLabel();
        entNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        entPrecio = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cboJuguete = new javax.swing.JComboBox<>();
        cboJuguete.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un juguete..." }));
        jLabel4 = new javax.swing.JLabel();
        cboServicio = new javax.swing.JComboBox<>();
        cboServicio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un servicio..." }));
        btnRegistrar = new javax.swing.JButton();
        btnJuguete = new javax.swing.JButton();
        btnServicio = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnMostrar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Datos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Paquetes");

        lblCrear.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lblCrear.setText("1. Crear paquete");

        lblArmar.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lblArmar.setText("2. Armar paquete (agregue de a uno)");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Paquete");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Nombre");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Precio cerrado");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Juguete");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Servicio");

        btnRegistrar.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

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

        btnEliminar.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnEliminar.setText("Eliminar paquete");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnMostrar.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnMostrar.setText("Ver detalle");
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCrear)
                    .addComponent(lblArmar)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(entNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(entPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRegistrar)
                            .addComponent(cboPaquete, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboJuguete, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnEliminar)
                                .addGap(12, 12, 12)
                                .addComponent(btnMostrar)))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnJuguete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnServicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblCrear)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(entNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(entPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(btnRegistrar)
                .addGap(28, 28, 28)
                .addComponent(lblArmar)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cboPaquete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cboJuguete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnJuguete))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cboServicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnServicio))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminar)
                    .addComponent(btnMostrar))
                .addGap(18, 18, 18))
        );

        Datos.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        Datos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] { "Nombre", "Precio", "Incluye" }
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

    private void btnJugueteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJugueteActionPerformed
        agregarJuguete();
    }//GEN-LAST:event_btnJugueteActionPerformed

    private void btnServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnServicioActionPerformed
        agregarServicio();
    }//GEN-LAST:event_btnServicioActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        eliminar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        verDetalle();
    }//GEN-LAST:event_btnMostrarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblCrear;
    private javax.swing.JLabel lblArmar;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JComboBox<String> cboPaquete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField entNombre;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField entPrecio;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JComboBox<String> cboJuguete;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JComboBox<String> cboServicio;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnJuguete;
    private javax.swing.JButton btnServicio;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable Datos;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    public void registrar() {
        GestionPaquetes gestion = tienda.getPaquetes();
        if (gestion.getCont() >= 20) {
            JOptionPane.showMessageDialog(this, "Vector Lleno!!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (entNombre.getText().equals("") || entPrecio.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Complete los datos", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (gestion.buscarPorNombre(entNombre.getText()) != -1) {
            JOptionPane.showMessageDialog(this, "Nombre repetido", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!entradas.esDecimal(entPrecio.getText())) {
            JOptionPane.showMessageDialog(this, "El precio debe ser un numero", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        double precio = Double.parseDouble(entPrecio.getText());
        String mensaje = gestion.validarPrecio(precio);
        if (!mensaje.equals("")) {
            JOptionPane.showMessageDialog(this, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        Paquete obj = new Paquete(entNombre.getText(), precio);
        gestion.registrar(obj);
        JOptionPane.showMessageDialog(this, "Paquete registrado. Ahora agregue sus juguetes y servicios en el paso 2", "Info", JOptionPane.INFORMATION_MESSAGE);
        entNombre.setText(null);
        entPrecio.setText(null);
        cargarPaquetes();
        cboPaquete.setSelectedIndex(cboPaquete.getItemCount() - 1);
        mostrar();
    }

    public void agregarJuguete() {
        GestionPaquetes gestion = tienda.getPaquetes();
        if (entradas.elegido(cboPaquete).equals("")) {
            JOptionPane.showMessageDialog(this, "Elija un paquete de la lista", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        int pos = gestion.buscarPorNombre(entradas.elegido(cboPaquete));
        if (pos == -1) {
            JOptionPane.showMessageDialog(this, "Paquete no encontrado", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (entradas.elegido(cboJuguete).equals("")) {
            JOptionPane.showMessageDialog(this, "Elija un juguete de la lista", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        int pj = cboJuguete.getSelectedIndex() - 1;
        if (pj == -1) {
            JOptionPane.showMessageDialog(this, "Juguete no encontrado", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        boolean ok = gestion.getPaquetes()[pos].agregarJuguete(tienda.getJuguetes().getJuguetes()[pj]);
        if (!ok) {
            JOptionPane.showMessageDialog(this, "No se pudo agregar el juguete", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        JOptionPane.showMessageDialog(this, "Juguete agregado al paquete", "Info", JOptionPane.INFORMATION_MESSAGE);
        cboJuguete.setSelectedIndex(0);
        mostrar();
    }

    public void agregarServicio() {
        GestionPaquetes gestion = tienda.getPaquetes();
        if (entradas.elegido(cboPaquete).equals("")) {
            JOptionPane.showMessageDialog(this, "Elija un paquete de la lista", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        int pos = gestion.buscarPorNombre(entradas.elegido(cboPaquete));
        if (pos == -1) {
            JOptionPane.showMessageDialog(this, "Paquete no encontrado", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (entradas.elegido(cboServicio).equals("")) {
            JOptionPane.showMessageDialog(this, "Elija un servicio de la lista", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        int ps = cboServicio.getSelectedIndex() - 1;
        if (ps == -1) {
            JOptionPane.showMessageDialog(this, "Servicio no encontrado", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        boolean ok = gestion.getPaquetes()[pos].agregarServicio(tienda.getServicios().getServicios()[ps]);
        if (!ok) {
            JOptionPane.showMessageDialog(this, "No se pudo agregar el servicio", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        JOptionPane.showMessageDialog(this, "Servicio agregado al paquete", "Info", JOptionPane.INFORMATION_MESSAGE);
        cboServicio.setSelectedIndex(0);
        mostrar();
    }

    public void eliminar() {
        GestionPaquetes gestion = tienda.getPaquetes();
        if (entradas.elegido(cboPaquete).equals("")) {
            JOptionPane.showMessageDialog(this, "Elija un paquete de la lista", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        int pos = gestion.buscarPorNombre(entradas.elegido(cboPaquete));
        if (pos == -1) {
            JOptionPane.showMessageDialog(this, "Paquete no encontrado", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        gestion.eliminar(pos);
        JOptionPane.showMessageDialog(this, "Paquete eliminado", "Info", JOptionPane.INFORMATION_MESSAGE);
        limpiar();
        cargarPaquetes();
        mostrar();
    }

    public void mostrar() {
        modelo.setNumRows(0);
        Paquete[] lista = tienda.getPaquetes().getPaquetes();
        for (int i = 0; i < tienda.getPaquetes().getCont(); i++) {
            String precio = String.format("%.2f", lista[i].precioUnitario());
            Object[] fila = {lista[i].getNombre(), precio, lista[i].lista()};
            modelo.addRow(fila);
        }
    }

    public void limpiar() {
        entNombre.setText(null);
        entPrecio.setText(null);
        cboJuguete.setSelectedIndex(0);
        cboServicio.setSelectedIndex(0);
    }

    public void cargarPaquetes() {
        cboPaquete.removeAllItems();
        cboPaquete.addItem("Seleccione un paquete...");
        for (int i = 0; i < tienda.getPaquetes().getCont(); i++) {
            cboPaquete.addItem(tienda.getPaquetes().getPaquetes()[i].getNombre());
        }
    }

    public void verDetalle() {
        if (entradas.elegido(cboPaquete).equals("")) {
            JOptionPane.showMessageDialog(this, "Elija un paquete de la lista", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        int pos = tienda.getPaquetes().buscarPorNombre(entradas.elegido(cboPaquete));
        if (pos == -1) {
            JOptionPane.showMessageDialog(this, "Paquete no encontrado", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        Paquete obj = tienda.getPaquetes().getPaquetes()[pos];
        double suma = 0;
        String texto = String.format("Paquete: %s\nPrecio cerrado: S/ %.2f\n\nJuguetes:\n", obj.getNombre(), obj.getPrecioPromocional());
        if (obj.getContJ() == 0) {
            texto = String.format("%s  (ninguno)\n", texto);
        }
        for (int i = 0; i < obj.getContJ(); i++) {
            Juguete juguete = obj.getJuguetes()[i];
            texto = String.format("%s  %s - %s: S/ %.2f\n", texto, juguete.getCodigo(), juguete.getNombre(), juguete.precioUnitario());
            suma = suma + juguete.precioUnitario();
        }
        texto = String.format("%s\nServicios:\n", texto);
        if (obj.getContS() == 0) {
            texto = String.format("%s  (ninguno)\n", texto);
        }
        for (int i = 0; i < obj.getContS(); i++) {
            Servicio servicio = obj.getServicios()[i];
            texto = String.format("%s  %s - %s: S/ %.2f\n", texto, servicio.getCodigo(), servicio.getNombre(), servicio.getPrecio());
            suma = suma + servicio.getPrecio();
        }
        texto = String.format("%s\nSuma de los precios por separado: S/ %.2f", texto, suma);
        JOptionPane.showMessageDialog(this, texto, "Detalle del paquete", JOptionPane.INFORMATION_MESSAGE);
    }
}
