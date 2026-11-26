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

        pnlFormulario = new javax.swing.JPanel();
        pnlTabla = new javax.swing.JPanel();
        lblCodigo = new javax.swing.JLabel();
        entCodigo = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        entNombre = new javax.swing.JTextField();
        lblCategoria = new javax.swing.JLabel();
        entCategoria = new javax.swing.JTextField();
        lblAnio = new javax.swing.JLabel();
        entAnio = new javax.swing.JTextField();
        lblPrecioBase = new javax.swing.JLabel();
        entPrecio = new javax.swing.JTextField();
        lblStock = new javax.swing.JLabel();
        entStock = new javax.swing.JTextField();
        lblEstado = new javax.swing.JLabel();
        entEstado = new javax.swing.JTextField();
        lblFecha = new javax.swing.JLabel();
        entDia = new javax.swing.JTextField();
        entMes = new javax.swing.JTextField();
        entAnioF = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnMostrar = new javax.swing.JButton();
        scrTabla = new javax.swing.JScrollPane();
        Datos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Juguetes");

        lblCodigo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCodigo.setText("Codigo");

        lblNombre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblNombre.setText("Nombre");

        lblCategoria.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCategoria.setText("Categoria");

        lblAnio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblAnio.setText("Anio");

        lblPrecioBase.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblPrecioBase.setText("Precio base");

        lblStock.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblStock.setText("Stock");

        lblEstado.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEstado.setText("Estado");

        lblFecha.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblFecha.setText("Fecha");

        btnRegistrar.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnModificar.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnMostrar.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnMostrar.setText("Mostrar");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

        Datos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "Categoria", "Anio", "Precio base", "Precio venta", "Stock", "Estado", "Fecha"
            }
        ));
        scrTabla.setViewportView(Datos);

        javax.swing.GroupLayout pnlFormularioLayout = new javax.swing.GroupLayout(pnlFormulario);
        pnlFormulario.setLayout(pnlFormularioLayout);
        pnlFormularioLayout.setHorizontalGroup(
            pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormularioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCodigo)
                    .addComponent(lblNombre)
                    .addComponent(lblCategoria)
                    .addComponent(lblAnio)
                    .addComponent(lblPrecioBase)
                    .addComponent(lblStock)
                    .addComponent(lblEstado)
                    .addComponent(lblFecha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(entCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(entNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(entCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(entAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(entPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(entStock, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(entEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlFormularioLayout.createSequentialGroup()
                        .addComponent(entDia, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(entMes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(entAnioF, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlFormularioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnRegistrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnModificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMostrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlFormularioLayout.setVerticalGroup(
            pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormularioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigo)
                    .addComponent(entCodigo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(entNombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCategoria)
                    .addComponent(entCategoria))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAnio)
                    .addComponent(entAnio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrecioBase)
                    .addComponent(entPrecio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStock)
                    .addComponent(entStock))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEstado)
                    .addComponent(entEstado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFecha)
                    .addComponent(entDia)
                    .addComponent(entMes)
                    .addComponent(entAnioF))
                .addGap(18, 18, 18)
                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrar)
                    .addComponent(btnModificar)
                    .addComponent(btnEliminar)
                    .addComponent(btnMostrar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlTablaLayout = new javax.swing.GroupLayout(pnlTabla);
        pnlTabla.setLayout(pnlTablaLayout);
        pnlTablaLayout.setHorizontalGroup(
            pnlTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTablaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrTabla, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlTablaLayout.setVerticalGroup(
            pnlTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTablaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrTabla, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlFormulario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
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
    private javax.swing.JPanel pnlFormulario;
    private javax.swing.JPanel pnlTabla;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JTextField entCodigo;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JTextField entNombre;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JTextField entCategoria;
    private javax.swing.JLabel lblAnio;
    private javax.swing.JTextField entAnio;
    private javax.swing.JLabel lblPrecioBase;
    private javax.swing.JTextField entPrecio;
    private javax.swing.JLabel lblStock;
    private javax.swing.JTextField entStock;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JTextField entEstado;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JTextField entDia;
    private javax.swing.JTextField entMes;
    private javax.swing.JTextField entAnioF;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JScrollPane scrTabla;
    private javax.swing.JTable Datos;
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
        if (entEstado.getText().equals("")) {
            return true;
        }
        return false;
    }

    public Fecha leerFecha() {
        if (entDia.getText().equals("") || entMes.getText().equals("") || entAnioF.getText().equals("")) {
            return null;
        }
        int dia = Integer.parseInt(entDia.getText());
        int mes = Integer.parseInt(entMes.getText());
        int anio = Integer.parseInt(entAnioF.getText());
        Fecha fecha = new Fecha(dia, mes, anio, 0);
        if (!fecha.esValida()) {
            return null;
        }
        return fecha;
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
        Fecha fecha = leerFecha();
        if (fecha == null) {
            JOptionPane.showMessageDialog(this, "Ingrese una fecha valida", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        int anio = Integer.parseInt(entAnio.getText());
        double precio = Double.parseDouble(entPrecio.getText());
        int stock = Integer.parseInt(entStock.getText());
        Juguete obj = gestion.crear(entCategoria.getText(), entCodigo.getText(), entNombre.getText(), anio, precio, stock, entEstado.getText(), fecha.texto());
        if (obj == null) {
            JOptionPane.showMessageDialog(this, "Categoria no permitida", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!gestion.registrar(obj, fecha)) {
            JOptionPane.showMessageDialog(this, "Stock negativo o sin capacidad en el registro", "Error", JOptionPane.ERROR_MESSAGE);
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
        Fecha fecha = leerFecha();
        if (fecha == null) {
            JOptionPane.showMessageDialog(this, "Ingrese una fecha valida", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        int anio = Integer.parseInt(entAnio.getText());
        double precio = Double.parseDouble(entPrecio.getText());
        int stock = Integer.parseInt(entStock.getText());
        Juguete obj = gestion.crear(entCategoria.getText(), entCodigo.getText(), entNombre.getText(), anio, precio, stock, entEstado.getText(), fecha.texto());
        if (obj == null) {
            JOptionPane.showMessageDialog(this, "Categoria no permitida", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!gestion.modificar(pos, obj, fecha)) {
            JOptionPane.showMessageDialog(this, "Stock negativo o sin capacidad en el registro", "Error", JOptionPane.ERROR_MESSAGE);
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
        Fecha fecha = leerFecha();
        if (fecha == null) {
            JOptionPane.showMessageDialog(this, "Ingrese la fecha de eliminacion", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!gestion.eliminar(pos, fecha)) {
            JOptionPane.showMessageDialog(this, "Historial de inventario lleno", "Error", JOptionPane.ERROR_MESSAGE);
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
        entDia.setText(null);
        entMes.setText(null);
        entAnioF.setText(null);
    }
}
