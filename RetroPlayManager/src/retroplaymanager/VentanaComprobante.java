package retroplaymanager;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;

public class VentanaComprobante extends javax.swing.JFrame {

    private Tienda tienda;

    public VentanaComprobante(Tienda tienda) {
        this.tienda = tienda;
        initComponents();
        construir();
    }

    public Tienda getTienda() {
        return tienda;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Comprobante");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 16));
        jLabel1.setText("Comprobante");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(24, 24, 24)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(280, 280, 280)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createSequentialGroup().addComponent(jPanel1)
        );
        layout.setVerticalGroup(
            layout.createSequentialGroup().addComponent(jPanel1)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
    private DefaultTableModel modelo = new DefaultTableModel();
    private JTable tabla = new JTable(modelo);
    private JComboBox<String> tipo = new JComboBox<>(new String[]{"Boleta", "Factura"});
    private JTextField ruc = new JTextField(12);
    private JTextField razon = new JTextField(18);
    private JTextArea detalle = new JTextArea(18, 55);
    private JButton btnEmitir = new JButton("Emitir comprobante");
    private JButton btnVer = new JButton("Ver cuenta / comprobante");
    private JButton btnActualizar = new JButton("Actualizar");

    private void construir() {
        setTitle("RetroPlay - Comprobantes");
        modelo.addColumn("Orden");
        modelo.addColumn("Cliente");
        modelo.addColumn("Fecha cierre");
        modelo.addColumn("Total S/");
        modelo.addColumn("Saldo S/");
        modelo.addColumn("Comprobante");
        tabla.setDefaultEditor(Object.class, null);
        detalle.setEditable(false);
        JPanel controles = new JPanel(new FlowLayout());
        controles.add(new JLabel("Tipo"));
        controles.add(tipo);
        controles.add(new JLabel("RUC"));
        controles.add(ruc);
        controles.add(new JLabel("Razon social"));
        controles.add(razon);
        JPanel botones = new JPanel(new FlowLayout());
        botones.add(btnActualizar);
        botones.add(btnVer);
        botones.add(btnEmitir);
        JPanel arriba = new JPanel(new GridLayout(2, 1));
        arriba.add(controles);
        arriba.add(botones);
        JPanel centro = new JPanel(new BorderLayout());
        JScrollPane tablaOrdenes = new JScrollPane(tabla);
        tablaOrdenes.setPreferredSize(new Dimension(800, 140));
        centro.add(tablaOrdenes, BorderLayout.NORTH);
        centro.add(new JScrollPane(detalle), BorderLayout.CENTER);
        JPanel panel = new JPanel(new BorderLayout());
        panel.add(arriba, BorderLayout.NORTH);
        panel.add(centro, BorderLayout.CENTER);
        setContentPane(panel);
        tipo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) { actualizarTipo(); }
        });
        btnActualizar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) { mostrar(); }
        });
        btnVer.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) { ver(); }
        });
        btnEmitir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) { emitir(); }
        });
        actualizarTipo();
        if (!autorizado()) {
            btnEmitir.setEnabled(false);
            btnVer.setEnabled(false);
            btnActualizar.setEnabled(false);
            detalle.setText("Acceso denegado");
        } else {
            mostrar();
        }
        setSize(910, 760);
        setLocationRelativeTo(null);
    }

    private boolean autorizado() {
        return tienda.getSesion() != null && tienda.getSesion().getRol().equals("Vendedor");
    }

    private void actualizarTipo() {
        boolean factura = tipo.getSelectedItem().equals("Factura");
        ruc.setEnabled(factura);
        razon.setEnabled(factura);
    }

    public void mostrar() {
        if (!autorizado()) { return; }
        modelo.setNumRows(0);
        GestionOrdenes g = tienda.getOrdenes();
        for (int i = 0; i < g.getCont(); i++) {
            Orden o = g.getOrdenes()[i];
            if (o.getEstado().equals("Finalizada")) {
                Comprobante c = tienda.getComprobantes().buscarPorOrden(o.getNumero());
                String estado = "Sin emitir";
                if (c != null) { estado = String.format("%s %d", c.getTipo(), c.getNumero()); }
                modelo.addRow(new Object[]{o.getNumero(), String.format("%s %s", o.getCliente().getNombres(), o.getCliente().getApellidos()), o.getFechaCierre().texto(), String.format("%.2f", o.calcularTotal()), String.format("%.2f", o.saldo()), estado});
            }
        }
    }

    private Orden elegida() {
        int fila = tabla.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione una orden finalizada");
            return null;
        }
        int num = (int) modelo.getValueAt(fila, 0);
        int pos = tienda.getOrdenes().buscarPorNumero(num);
        if (pos == -1) { return null; }
        return tienda.getOrdenes().getOrdenes()[pos];
    }

    private void ver() {
        if (!autorizado()) { return; }
        Orden o = elegida();
        if (o == null) { return; }
        Comprobante c = tienda.getComprobantes().buscarPorOrden(o.getNumero());
        if (c == null) {
            String texto = new Boleta(0, o).mostrarDatos();
            detalle.setText(String.format("VISTA PREVIA - SIN VALIDEZ\\n%s", texto));
        } else {
            detalle.setText(c.mostrarDatos());
        }
        detalle.setCaretPosition(0);
    }

    private void emitir() {
        if (!autorizado()) { return; }
        Orden o = elegida();
        if (o == null) { return; }
        String mensaje = tienda.getComprobantes().emitir(o, (String) tipo.getSelectedItem(), ruc.getText(), razon.getText());
        if (!mensaje.equals("")) {
            JOptionPane.showMessageDialog(this, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        detalle.setText(tienda.getComprobantes().buscarPorOrden(o.getNumero()).mostrarDatos());
        detalle.setCaretPosition(0);
        mostrar();
        JOptionPane.showMessageDialog(this, "Comprobante emitido correctamente");
    }
}
