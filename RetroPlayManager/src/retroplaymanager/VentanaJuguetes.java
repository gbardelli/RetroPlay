package retroplaymanager;

import javax.swing.JOptionPane;

public class VentanaJuguetes extends javax.swing.JFrame {

    private Tienda tienda;
    private javax.swing.table.DefaultTableModel modelo;

    public VentanaJuguetes(Tienda tienda) {
        this.tienda = tienda;
        initComponents();
        modelo = (javax.swing.table.DefaultTableModel) Datos.getModel();
        mostrar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        entCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        entNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        entCategoria = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        entAnio = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        entPrecio = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        entStock = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        entEstado = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        entFecha = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnMostrar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Datos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Juguetes");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jLabel1.setText("Codigo");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jLabel2.setText("Nombre");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jLabel3.setText("Categoria");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jLabel4.setText("Anio");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jLabel5.setText("Precio base");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jLabel6.setText("Stock");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jLabel7.setText("Estado");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jLabel8.setText("Fecha");

        btnRegistrar.setFont(new java.awt.Font("Segoe UI", 0, 13));
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnModificar.setFont(new java.awt.Font("Segoe UI", 0, 13));
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Segoe UI", 0, 13));
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnMostrar.setFont(new java.awt.Font("Segoe UI", 0, 13));
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
                        .addComponent(jLabel1)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4)
                        .addComponent(jLabel5)
                        .addComponent(jLabel6)
                        .addComponent(jLabel7)
                        .addComponent(jLabel8)
                )
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(entCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(entNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(entCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(entAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(entPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(entStock, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(entEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(entFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(jLabel1)
                    .addComponent(entCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(entNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(entCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(entAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(entPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(entStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(entEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(entFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        Datos.setFont(new java.awt.Font("Segoe UI", 0, 13));
        Datos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] { "Codigo", "Nombre", "Categoria", "Anio", "Precio base", "Precio venta", "Stock", "Estado", "Fecha" }
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

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        modificar();
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        eliminar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        mostrar();
    }//GEN-LAST:event_btnMostrarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField entCodigo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField entNombre;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField entCategoria;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField entAnio;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField entPrecio;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField entStock;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField entEstado;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField entFecha;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable Datos;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    public boolean estadoValido(String estado) {
        if (estado.equals("Disponible") || estado.equals("Vendido") || estado.equals("En Restauracion") || estado.equals("Apartado")) {
            return true;
        }
        return false;
    }

    public boolean vacio() {
        if (entCodigo.getText().equals("") || entNombre.getText().equals("") || entCategoria.getText().equals("")) {
            return true;
        }
        if (entAnio.getText().equals("") || entPrecio.getText().equals("") || entStock.getText().equals("")) {
            return true;
        }
        if (entEstado.getText().equals("") || entFecha.getText().equals("")) {
            return true;
        }
        return false;
    }

    public void registrar() {
        GestionJuguetes gestion = tienda.getJuguetes();
        if (gestion.getCont() >= 50) {
            JOptionPane.showMessageDialog(this, "Vector Lleno!!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (vacio()) {
            JOptionPane.showMessageDialog(this, "Complete los datos", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!estadoValido(entEstado.getText())) {
            JOptionPane.showMessageDialog(this, "Estado no permitido", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (gestion.buscarPorCodigo(entCodigo.getText()) != -1) {
            JOptionPane.showMessageDialog(this, "Codigo repetido", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        int anio = Integer.parseInt(entAnio.getText());
        double precio = Double.parseDouble(entPrecio.getText());
        int stock = Integer.parseInt(entStock.getText());
        Juguete obj = gestion.crear(entCategoria.getText(), entCodigo.getText(), entNombre.getText(), anio, precio, stock, entEstado.getText(), entFecha.getText());
        if (obj == null) {
            JOptionPane.showMessageDialog(this, "Categoria no permitida", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!gestion.registrar(obj)) {
            JOptionPane.showMessageDialog(this, "Fecha invalida (dia/mes/anio), stock negativo o sin capacidad", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        JOptionPane.showMessageDialog(this, "Juguete registrado", "Info", JOptionPane.INFORMATION_MESSAGE);
        limpiar();
        mostrar();
    }

    public void modificar() {
        GestionJuguetes gestion = tienda.getJuguetes();
        int pos = gestion.buscarPorCodigo(entCodigo.getText());
        if (pos == -1) {
            JOptionPane.showMessageDialog(this, "Juguete no encontrado", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (vacio()) {
            JOptionPane.showMessageDialog(this, "Complete los datos", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!estadoValido(entEstado.getText())) {
            JOptionPane.showMessageDialog(this, "Estado no permitido", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        int anio = Integer.parseInt(entAnio.getText());
        double precio = Double.parseDouble(entPrecio.getText());
        int stock = Integer.parseInt(entStock.getText());
        Juguete obj = gestion.crear(entCategoria.getText(), entCodigo.getText(), entNombre.getText(), anio, precio, stock, entEstado.getText(), entFecha.getText());
        if (obj == null) {
            JOptionPane.showMessageDialog(this, "Categoria no permitida", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!gestion.modificar(pos, obj, GestionReportes.leerFecha(entFecha.getText()))) {
            JOptionPane.showMessageDialog(this, "Ingrese fecha valida (dia/mes/anio) y stock no negativo", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        JOptionPane.showMessageDialog(this, "Juguete modificado", "Info", JOptionPane.INFORMATION_MESSAGE);
        mostrar();
    }

    public void eliminar() {
        GestionJuguetes gestion = tienda.getJuguetes();
        int pos = gestion.buscarPorCodigo(entCodigo.getText());
        if (pos == -1) {
            JOptionPane.showMessageDialog(this, "Juguete no encontrado", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String textoFecha = JOptionPane.showInputDialog(this, "Fecha de eliminacion (dia/mes/anio)");
        if (!gestion.eliminar(pos, GestionReportes.leerFecha(textoFecha))) {
            JOptionPane.showMessageDialog(this, "Fecha invalida o historial lleno", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        JOptionPane.showMessageDialog(this, "Juguete eliminado", "Info", JOptionPane.INFORMATION_MESSAGE);
        limpiar();
        mostrar();
    }

    public void mostrar() {
        modelo.setNumRows(0);
        Juguete[] lista = tienda.getJuguetes().getJuguetes();
        for (int i = 0; i < tienda.getJuguetes().getCont(); i++) {
            String precioBase = String.format("%.2f", lista[i].getPrecioBase());
            String precioVenta = String.format("%.2f", lista[i].precioUnitario());
            Object[] fila = {lista[i].getCodigo(), lista[i].getNombre(), lista[i].getCategoria(), lista[i].getAnio(), precioBase, precioVenta, lista[i].getStock(), lista[i].getEstado(), lista[i].getFecha()};
            modelo.addRow(fila);
        }
    }

    public void limpiar() {
        entCodigo.setText(null);
        entNombre.setText(null);
        entCategoria.setText(null);
        entAnio.setText(null);
        entPrecio.setText(null);
        entStock.setText(null);
        entEstado.setText(null);
        entFecha.setText(null);
    }
}
