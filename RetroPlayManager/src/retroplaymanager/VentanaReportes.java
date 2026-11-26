package retroplaymanager;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;

public class VentanaReportes extends javax.swing.JFrame {

    private Tienda tienda;

    public VentanaReportes(Tienda tienda) {
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
        setTitle("Reportes");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 16));
        jLabel1.setText("Reportes");

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
    private JTextField desde = new JTextField("1/1/2026", 10);
    private JTextField hasta = new JTextField("31/12/2026", 10);
    private JComboBox<String> tipo = new JComboBox<>(new String[]{"Rotacion por categoria", "Productividad del personal", "Clientes con mas compras", "Ingresos del periodo"});
    private JLabel nota = new JLabel("Seleccione un reporte y el rango de fechas");
    private JButton generar = new JButton("Generar reporte");

    private void construir() {
        setTitle("RetroPlay - Reportes gerenciales");
        JPanel controles = new JPanel(new FlowLayout());
        controles.add(new JLabel("Desde (d/m/a)"));
        controles.add(desde);
        controles.add(new JLabel("Hasta (d/m/a)"));
        controles.add(hasta);
        controles.add(tipo);
        controles.add(generar);
        JPanel panel = new JPanel(new BorderLayout());
        panel.add(controles, BorderLayout.NORTH);
        panel.add(new JScrollPane(tabla), BorderLayout.CENTER);
        panel.add(nota, BorderLayout.SOUTH);
        tabla.setDefaultEditor(Object.class, null);
        setContentPane(panel);
        generar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) { mostrar(); }
        });
        if (!autorizado()) {
            generar.setEnabled(false);
            nota.setText("Acceso denegado");
        }
        setSize(1000, 440);
        setLocationRelativeTo(null);
    }

    private boolean autorizado() {
        return tienda.getSesion() != null && tienda.getSesion().getRol().equals("Administrador");
    }

    public void mostrar() {
        if (!autorizado()) { return; }
        Fecha inicio = GestionReportes.leerFecha(desde.getText());
        Fecha fin = GestionReportes.leerFecha(hasta.getText());
        if (inicio == null || fin == null || inicio.totalDias() > fin.totalDias()) {
            JOptionPane.showMessageDialog(this, "Ingrese un rango valido (dia/mes/anio)", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        GestionReportes g = tienda.getReportes();
        int op = tipo.getSelectedIndex();
        String[] columnas;
        Object[][] filas;
        if (op == 0) {
            columnas = new String[]{"Categoria", "Stock inicial", "Entradas", "Base", "Vendidos", "% salida"};
            filas = g.rotacion(inicio, fin);
            nota.setText("Salida = vendidos / (stock inicial + entradas). N/D: sin base valida. Incluye juguetes en paquetes.");
        } else if (op == 1) {
            columnas = new String[]{"DNI", "Empleado", "Rol", "Ordenes registradas", "Ordenes verificadas", "Paquetes verificados"};
            filas = g.productividad(inicio, fin);
            nota.setText("Registradas por fecha de registro; verificadas por fecha de preparacion.");
        } else if (op == 2) {
            columnas = new String[]{"DNI", "Cliente", "Compras finalizadas"};
            filas = g.clientes(inicio, fin);
            nota.setText("Ranking descendente de compras finalizadas en el periodo.");
        } else {
            columnas = new String[]{"Concepto", "Importe S/"};
            filas = g.ingresos(inicio, fin);
            nota.setText("Ventas finalizadas por fecha de cierre; no incluye adelantos de ordenes activas ni canceladas.");
        }
        modelo.setNumRows(0);
        modelo.setColumnCount(0);
        for (int i = 0; i < columnas.length; i++) {
            modelo.addColumn(columnas[i]);
        }
        for (int i = 0; i < filas.length; i++) {
            modelo.addRow(filas[i]);
        }
    }
}
