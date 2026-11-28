package retroplaymanager;

import javax.swing.JOptionPane;

public class VentanaJuguetes extends javax.swing.JFrame {

    private Tienda tienda;
    private Entradas entradas = new Entradas();
    private javax.swing.table.DefaultTableModel modelo;

    public VentanaJuguetes(Tienda tienda) {
        this.tienda = tienda;
        initComponents();
        modelo = (javax.swing.table.DefaultTableModel) Datos.getModel();
        for (int i = 0; i < tienda.getJuguetes().getCategorias().length; i++) {
            cboCategoria.addItem(tienda.getJuguetes().getCategorias()[i]);
        }
        for (int i = 0; i < tienda.getJuguetes().getEstados().length; i++) {
            cboEstado.addItem(tienda.getJuguetes().getEstados()[i]);
        }
        entradas.llenarDia(cboDia);
        entradas.llenarMes(cboMes);
        entradas.llenarAnio(cboAnioF);
        cargarLista();
        mostrar();
        retroplaymanager.apariencia.Apariencia.vestir(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlFormulario = new javax.swing.JPanel();
        lblElegir = new javax.swing.JLabel();
        cboElegir = new javax.swing.JComboBox<>();
        cboElegir.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione para editar..." }));
        cboElegir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboElegirActionPerformed(evt);
            }
        });
        pnlTabla = new javax.swing.JPanel();
        lblCodigo = new javax.swing.JLabel();
        entCodigo = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        entNombre = new javax.swing.JTextField();
        lblCategoria = new javax.swing.JLabel();
        cboCategoria = new javax.swing.JComboBox<>();
        cboCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione..." }));
        lblAnio = new javax.swing.JLabel();
        entAnio = new javax.swing.JTextField();
        lblPrecioBase = new javax.swing.JLabel();
        entPrecio = new javax.swing.JTextField();
        lblStock = new javax.swing.JLabel();
        entStock = new javax.swing.JTextField();
        lblEstado = new javax.swing.JLabel();
        cboEstado = new javax.swing.JComboBox<>();
        cboEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione..." }));
        lblFecha = new javax.swing.JLabel();
        cboDia = new javax.swing.JComboBox<>();
        cboDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dia" }));
        cboMes = new javax.swing.JComboBox<>();
        cboMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mes" }));
        cboAnioF = new javax.swing.JComboBox<>();
        cboAnioF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Anio" }));
        btnRegistrar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnMostrar = new javax.swing.JButton();
        scrTabla = new javax.swing.JScrollPane();
        Datos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Juguetes");

        lblElegir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblElegir.setText("Editar existente");

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
                    .addComponent(lblElegir)
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
                    .addComponent(cboElegir, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(entCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(entNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(entAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(entPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(entStock, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlFormularioLayout.createSequentialGroup()
                        .addComponent(cboDia, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboMes, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboAnioF, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                    .addComponent(lblElegir)
                    .addComponent(cboElegir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                    .addComponent(cboCategoria))
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
                    .addComponent(cboEstado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFecha)
                    .addComponent(cboDia)
                    .addComponent(cboMes)
                    .addComponent(cboAnioF))
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
    private javax.swing.JPanel pnlFormulario;
    private javax.swing.JPanel pnlTabla;
    private javax.swing.JLabel lblElegir;
    private javax.swing.JComboBox<String> cboElegir;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JTextField entCodigo;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JTextField entNombre;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JComboBox<String> cboCategoria;
    private javax.swing.JLabel lblAnio;
    private javax.swing.JTextField entAnio;
    private javax.swing.JLabel lblPrecioBase;
    private javax.swing.JTextField entPrecio;
    private javax.swing.JLabel lblStock;
    private javax.swing.JTextField entStock;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JComboBox<String> cboEstado;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JComboBox<String> cboDia;
    private javax.swing.JComboBox<String> cboMes;
    private javax.swing.JComboBox<String> cboAnioF;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JScrollPane scrTabla;
    private javax.swing.JTable Datos;
    // End of variables declaration//GEN-END:variables

    public boolean vacio() {
        if (entCodigo.getText().equals("") || entNombre.getText().equals("") || entradas.elegido(cboCategoria).equals("")) {
            return true;
        }
        if (entAnio.getText().equals("") || entPrecio.getText().equals("") || entStock.getText().equals("")) {
            return true;
        }
        if (entradas.elegido(cboEstado).equals("")) {
            return true;
        }
        return false;
    }

    public Fecha leerFecha() {
        if (entradas.elegido(cboDia).equals("") || entradas.elegido(cboMes).equals("") || entradas.elegido(cboAnioF).equals("")) {
            return null;
        }
        int dia = Integer.parseInt(entradas.elegido(cboDia));
        int mes = Integer.parseInt(entradas.elegido(cboMes));
        int anio = Integer.parseInt(entradas.elegido(cboAnioF));
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
        if (!gestion.estadoValido(entradas.elegido(cboEstado))) {
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
        if (!entradas.esEntero(entAnio.getText()) || !entradas.esDecimal(entPrecio.getText()) || !entradas.esEntero(entStock.getText())) {
            JOptionPane.showMessageDialog(this, "Anio, precio y stock deben ser numeros", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        int anio = Integer.parseInt(entAnio.getText());
        double precio = Double.parseDouble(entPrecio.getText());
        int stock = Integer.parseInt(entStock.getText());
        String mensaje = gestion.validar(anio, precio, stock);
        if (!mensaje.equals("")) {
            JOptionPane.showMessageDialog(this, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        Juguete obj = gestion.crear(entradas.elegido(cboCategoria), entCodigo.getText(), entNombre.getText(), anio, precio, stock, entradas.elegido(cboEstado), fecha.texto());
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
        cargarLista();
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
        if (!gestion.estadoValido(entradas.elegido(cboEstado))) {
            JOptionPane.showMessageDialog(this, "Estado no permitido", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        Fecha fecha = leerFecha();
        if (fecha == null) {
            JOptionPane.showMessageDialog(this, "Ingrese una fecha valida", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!entradas.esEntero(entAnio.getText()) || !entradas.esDecimal(entPrecio.getText()) || !entradas.esEntero(entStock.getText())) {
            JOptionPane.showMessageDialog(this, "Anio, precio y stock deben ser numeros", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        int anio = Integer.parseInt(entAnio.getText());
        double precio = Double.parseDouble(entPrecio.getText());
        int stock = Integer.parseInt(entStock.getText());
        String mensaje = gestion.validar(anio, precio, stock);
        if (!mensaje.equals("")) {
            JOptionPane.showMessageDialog(this, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        Juguete obj = gestion.crear(entradas.elegido(cboCategoria), entCodigo.getText(), entNombre.getText(), anio, precio, stock, entradas.elegido(cboEstado), fecha.texto());
        if (obj == null) {
            JOptionPane.showMessageDialog(this, "Categoria no permitida", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!gestion.modificar(pos, obj, fecha)) {
            JOptionPane.showMessageDialog(this, "Stock negativo o sin capacidad en el registro", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        JOptionPane.showMessageDialog(this, "Juguete modificado", "Info", JOptionPane.INFORMATION_MESSAGE);
        limpiar();
        cargarLista();
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
        cargarLista();
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

    public void vaciarCampos() {
        entCodigo.setText(null);
        entNombre.setText(null);
        cboCategoria.setSelectedIndex(0);
        entAnio.setText(null);
        entPrecio.setText(null);
        entStock.setText(null);
        cboEstado.setSelectedIndex(0);
        cboDia.setSelectedIndex(0);
        cboMes.setSelectedIndex(0);
        cboAnioF.setSelectedIndex(0);
    }

    public void limpiar() {
        vaciarCampos();
        cboElegir.setSelectedIndex(0);
    }

    public void cargarLista() {
        cboElegir.removeAllItems();
        cboElegir.addItem("Seleccione para editar...");
        for (int i = 0; i < tienda.getJuguetes().getCont(); i++) {
            Juguete obj = tienda.getJuguetes().getJuguetes()[i];
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
        int pos = cboElegir.getSelectedIndex() - 1;
        if (pos == -1) {
            return;
        }
        Juguete obj = tienda.getJuguetes().getJuguetes()[pos];
        entCodigo.setText(obj.getCodigo());
        entNombre.setText(obj.getNombre());
        entradas.seleccionar(cboCategoria, obj.getCategoria());
        entAnio.setText(String.format("%d", obj.getAnio()));
        entPrecio.setText(String.format("%.2f", obj.getPrecioBase()));
        entStock.setText(String.format("%d", obj.getStock()));
        entradas.seleccionar(cboEstado, obj.getEstado());
    }
}
