package retroplaymanager;

import javax.swing.JOptionPane;

public class VentanaInventario extends javax.swing.JFrame {

    private Tienda tienda;
    private Entradas entradas = new Entradas();
    private javax.swing.table.DefaultTableModel modelo;

    public VentanaInventario(Tienda tienda) {
        this.tienda = tienda;
        initComponents();
        modelo = (javax.swing.table.DefaultTableModel) Datos.getModel();
        for (int i = 0; i < tienda.getJuguetes().getEstados().length; i++) {
            cboEstado.addItem(tienda.getJuguetes().getEstados()[i]);
        }
        entradas.llenarDia(cboDia);
        entradas.llenarMes(cboMes);
        entradas.llenarAnio(cboAnio);
        for (int i = 0; i < tienda.getJuguetes().getCont(); i++) {
            Juguete obj = tienda.getJuguetes().getJuguetes()[i];
            cboCodigo.addItem(String.format("%s - %s", obj.getCodigo(), obj.getNombre()));
        }
        consultar();
        retroplaymanager.apariencia.Apariencia.vestir(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlFormulario = new javax.swing.JPanel();
        pnlTabla = new javax.swing.JPanel();
        lblEstado = new javax.swing.JLabel();
        cboEstado = new javax.swing.JComboBox<>();
        cboEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos" }));
        lblFecha = new javax.swing.JLabel();
        cboDia = new javax.swing.JComboBox<>();
        cboDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dia" }));
        cboMes = new javax.swing.JComboBox<>();
        cboMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mes" }));
        cboAnio = new javax.swing.JComboBox<>();
        cboAnio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Anio" }));
        lblCodigo = new javax.swing.JLabel();
        cboCodigo = new javax.swing.JComboBox<>();
        cboCodigo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un juguete..." }));
        lblNuevoStock = new javax.swing.JLabel();
        entStock = new javax.swing.JTextField();
        btnConsultar = new javax.swing.JButton();
        btnStock = new javax.swing.JButton();
        scrTabla = new javax.swing.JScrollPane();
        Datos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Inventario");

        lblEstado.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEstado.setText("Filtrar estado");

        lblFecha.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblFecha.setText("Fecha (filtro / cambio)");

        lblCodigo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCodigo.setText("Juguete");

        lblNuevoStock.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblNuevoStock.setText("Nuevo stock");

        btnConsultar.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        btnStock.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnStock.setText("Actualizar stock");
        btnStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStockActionPerformed(evt);
            }
        });

        Datos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "Categoria", "Estado", "Fecha", "Stock", "Precio venta"
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
                    .addComponent(lblEstado)
                    .addComponent(lblFecha)
                    .addComponent(lblCodigo)
                    .addComponent(lblNuevoStock))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlFormularioLayout.createSequentialGroup()
                        .addComponent(cboDia, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboMes, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cboCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(entStock, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlFormularioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnConsultar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnStock)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlFormularioLayout.setVerticalGroup(
            pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormularioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEstado)
                    .addComponent(cboEstado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFecha)
                    .addComponent(cboDia)
                    .addComponent(cboMes)
                    .addComponent(cboAnio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigo)
                    .addComponent(cboCodigo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNuevoStock)
                    .addComponent(entStock))
                .addGap(18, 18, 18)
                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConsultar)
                    .addComponent(btnStock))
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

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        consultar();
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStockActionPerformed
        actualizarStock();
    }//GEN-LAST:event_btnStockActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel pnlFormulario;
    private javax.swing.JPanel pnlTabla;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JComboBox<String> cboEstado;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JComboBox<String> cboDia;
    private javax.swing.JComboBox<String> cboMes;
    private javax.swing.JComboBox<String> cboAnio;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JComboBox<String> cboCodigo;
    private javax.swing.JLabel lblNuevoStock;
    private javax.swing.JTextField entStock;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnStock;
    private javax.swing.JScrollPane scrTabla;
    private javax.swing.JTable Datos;
    // End of variables declaration//GEN-END:variables

    public Fecha leerFecha() {
        if (entradas.elegido(cboDia).equals("") || entradas.elegido(cboMes).equals("") || entradas.elegido(cboAnio).equals("")) {
            return null;
        }
        int dia = Integer.parseInt(entradas.elegido(cboDia));
        int mes = Integer.parseInt(entradas.elegido(cboMes));
        int anio = Integer.parseInt(entradas.elegido(cboAnio));
        Fecha fecha = new Fecha(dia, mes, anio, 0);
        if (!fecha.esValida()) {
            return null;
        }
        return fecha;
    }

    public void consultar() {
        Fecha fecha = null;
        if (!entradas.elegido(cboDia).equals("") || !entradas.elegido(cboMes).equals("") || !entradas.elegido(cboAnio).equals("")) {
            fecha = leerFecha();
            if (fecha == null) {
                JOptionPane.showMessageDialog(this, "Ingrese una fecha valida", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
        modelo.setNumRows(0);
        Juguete[] destino = new Juguete[50];
        int n = tienda.getJuguetes().consultar(entradas.elegido(cboEstado), fecha, destino);
        for (int i = 0; i < n; i++) {
            String precio = String.format("%.2f", destino[i].precioUnitario());
            Object[] fila = {destino[i].getCodigo(), destino[i].getNombre(), destino[i].getCategoria(), destino[i].getEstado(), destino[i].getFecha(), destino[i].getStock(), precio};
            modelo.addRow(fila);
        }
    }

    public void actualizarStock() {
        if (entradas.elegido(cboCodigo).equals("")) {
            JOptionPane.showMessageDialog(this, "Elija un juguete de la lista", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        int pos = cboCodigo.getSelectedIndex() - 1;
        if (pos == -1) {
            JOptionPane.showMessageDialog(this, "Juguete no encontrado", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (entStock.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Complete los datos", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        Fecha fecha = leerFecha();
        if (fecha == null) {
            JOptionPane.showMessageDialog(this, "Ingrese una fecha valida", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!entradas.esEntero(entStock.getText())) {
            JOptionPane.showMessageDialog(this, "El nuevo stock debe ser un numero entero", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        int stock = Integer.parseInt(entStock.getText());
        if (!tienda.getJuguetes().actualizarStock(pos, stock, fecha)) {
            JOptionPane.showMessageDialog(this, "El stock no puede ser negativo", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        JOptionPane.showMessageDialog(this, "Stock actualizado", "Info", JOptionPane.INFORMATION_MESSAGE);
        consultar();
    }
}
