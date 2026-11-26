package retroplaymanager;

import javax.swing.JOptionPane;

public class VentanaPaquetes extends javax.swing.JFrame {

    private Tienda tienda;
    private javax.swing.table.DefaultTableModel modelo;

    public VentanaPaquetes(Tienda tienda) {
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
        entNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        entPrecio = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        entCodigoJuguete = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        entCodigoServicio = new javax.swing.JTextField();
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

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Nombre");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Precio cerrado");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Codigo juguete");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Codigo servicio");

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
                        .addComponent(jLabel1)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4)
                )
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(entNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(entPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(entCodigoJuguete, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(entCodigoServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                )
                .addGap(18, 18, 18))

                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(18, 18, 18)
                    .addComponent(btnRegistrar)
                    .addGap(18, 18, 18)
                    .addComponent(btnJuguete))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(18, 18, 18)
                    .addComponent(btnServicio)
                    .addGap(18, 18, 18)
                    .addComponent(btnEliminar))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(18, 18, 18)
                    .addComponent(btnMostrar))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)

                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(entNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(entPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(entCodigoJuguete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(entCodigoServicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)

                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrar)
                    .addComponent(btnJuguete))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnServicio)
                    .addComponent(btnEliminar))
                .addGap(12, 12, 12)
                .addComponent(btnMostrar)
                .addGap(12, 12, 12)
                .addGap(18, 18, 18)
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
        mostrar();
    }//GEN-LAST:event_btnMostrarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField entNombre;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField entPrecio;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField entCodigoJuguete;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField entCodigoServicio;
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
        double precio = Double.parseDouble(entPrecio.getText());
        Paquete obj = new Paquete(entNombre.getText(), precio);
        gestion.registrar(obj);
        JOptionPane.showMessageDialog(this, "Paquete registrado", "Info", JOptionPane.INFORMATION_MESSAGE);
        mostrar();
    }

    public void agregarJuguete() {
        GestionPaquetes gestion = tienda.getPaquetes();
        int pos = gestion.buscarPorNombre(entNombre.getText());
        if (pos == -1) {
            JOptionPane.showMessageDialog(this, "Paquete no encontrado", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        int pj = tienda.getJuguetes().buscarPorCodigo(entCodigoJuguete.getText());
        if (pj == -1) {
            JOptionPane.showMessageDialog(this, "Juguete no encontrado", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        boolean ok = gestion.getPaquetes()[pos].agregarJuguete(tienda.getJuguetes().getJuguetes()[pj]);
        if (!ok) {
            JOptionPane.showMessageDialog(this, "No se pudo agregar el juguete", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        JOptionPane.showMessageDialog(this, "Juguete agregado", "Info", JOptionPane.INFORMATION_MESSAGE);
        mostrar();
    }

    public void agregarServicio() {
        GestionPaquetes gestion = tienda.getPaquetes();
        int pos = gestion.buscarPorNombre(entNombre.getText());
        if (pos == -1) {
            JOptionPane.showMessageDialog(this, "Paquete no encontrado", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        int ps = tienda.getServicios().buscarPorCodigo(entCodigoServicio.getText());
        if (ps == -1) {
            JOptionPane.showMessageDialog(this, "Servicio no encontrado", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        boolean ok = gestion.getPaquetes()[pos].agregarServicio(tienda.getServicios().getServicios()[ps]);
        if (!ok) {
            JOptionPane.showMessageDialog(this, "No se pudo agregar el servicio", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        JOptionPane.showMessageDialog(this, "Servicio agregado", "Info", JOptionPane.INFORMATION_MESSAGE);
        mostrar();
    }

    public void eliminar() {
        GestionPaquetes gestion = tienda.getPaquetes();
        int pos = gestion.buscarPorNombre(entNombre.getText());
        if (pos == -1) {
            JOptionPane.showMessageDialog(this, "Paquete no encontrado", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        gestion.eliminar(pos);
        JOptionPane.showMessageDialog(this, "Paquete eliminado", "Info", JOptionPane.INFORMATION_MESSAGE);
        limpiar();
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
        entCodigoJuguete.setText(null);
        entCodigoServicio.setText(null);
    }
}
