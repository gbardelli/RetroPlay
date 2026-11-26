package retroplaymanager;

import javax.swing.JOptionPane;

public class VentanaInventario extends javax.swing.JFrame {

    private Tienda tienda;
    private javax.swing.table.DefaultTableModel modelo;

    public VentanaInventario(Tienda tienda) {
        this.tienda = tienda;
        initComponents();
        modelo = (javax.swing.table.DefaultTableModel) Datos.getModel();
        consultar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlFormulario = new javax.swing.JPanel();
        pnlTabla = new javax.swing.JPanel();
        lblEstado = new javax.swing.JLabel();
        entEstado = new javax.swing.JTextField();
        lblFecha = new javax.swing.JLabel();
        entDia = new javax.swing.JTextField();
        entMes = new javax.swing.JTextField();
        entAnio = new javax.swing.JTextField();
        lblCodigo = new javax.swing.JLabel();
        entCodigo = new javax.swing.JTextField();
        lblNuevoStock = new javax.swing.JLabel();
        entStock = new javax.swing.JTextField();
        btnConsultar = new javax.swing.JButton();
        btnStock = new javax.swing.JButton();
        scrTabla = new javax.swing.JScrollPane();
        Datos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Inventario");

        lblEstado.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEstado.setText("Estado");

        lblFecha.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblFecha.setText("Fecha");

        lblCodigo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCodigo.setText("Codigo");

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
                    .addComponent(entEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlFormularioLayout.createSequentialGroup()
                        .addComponent(entDia, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(entMes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(entAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(entCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(entEstado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFecha)
                    .addComponent(entDia)
                    .addComponent(entMes)
                    .addComponent(entAnio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigo)
                    .addComponent(entCodigo))
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
    private javax.swing.JTextField entEstado;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JTextField entDia;
    private javax.swing.JTextField entMes;
    private javax.swing.JTextField entAnio;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JTextField entCodigo;
    private javax.swing.JLabel lblNuevoStock;
    private javax.swing.JTextField entStock;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnStock;
    private javax.swing.JScrollPane scrTabla;
    private javax.swing.JTable Datos;
    // End of variables declaration//GEN-END:variables

    public Fecha leerFecha() {
        if (entDia.getText().equals("") || entMes.getText().equals("") || entAnio.getText().equals("")) {
            return null;
        }
        int dia = Integer.parseInt(entDia.getText());
        int mes = Integer.parseInt(entMes.getText());
        int anio = Integer.parseInt(entAnio.getText());
        Fecha fecha = new Fecha(dia, mes, anio, 0);
        if (!fecha.esValida()) {
            return null;
        }
        return fecha;
    }

    public void consultar() {
        Fecha fecha = null;
        if (!entDia.getText().equals("") || !entMes.getText().equals("") || !entAnio.getText().equals("")) {
            fecha = leerFecha();
            if (fecha == null) {
                JOptionPane.showMessageDialog(this, "Ingrese una fecha valida", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
        modelo.setNumRows(0);
        Juguete[] destino = new Juguete[50];
        int n = tienda.getJuguetes().consultar(entEstado.getText(), fecha, destino);
        for (int i = 0; i < n; i++) {
            String precio = String.format("%.2f", destino[i].precioUnitario());
            Object[] fila = {destino[i].getCodigo(), destino[i].getNombre(), destino[i].getCategoria(), destino[i].getEstado(), destino[i].getFecha(), destino[i].getStock(), precio};
            modelo.addRow(fila);
        }
    }

    public void actualizarStock() {
        int pos = tienda.getJuguetes().buscarPorCodigo(entCodigo.getText());
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
        int stock = Integer.parseInt(entStock.getText());
        if (!tienda.getJuguetes().actualizarStock(pos, stock, fecha)) {
            JOptionPane.showMessageDialog(this, "El stock no puede ser negativo", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        JOptionPane.showMessageDialog(this, "Stock actualizado", "Info", JOptionPane.INFORMATION_MESSAGE);
        consultar();
    }
}
