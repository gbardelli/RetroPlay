package retroplaymanager;

import javax.swing.JOptionPane;

public class VentanaPersonal extends javax.swing.JFrame {

    private Tienda tienda;
    private Entradas entradas = new Entradas();
    private javax.swing.table.DefaultTableModel modelo;

    public VentanaPersonal(Tienda tienda) {
        this.tienda = tienda;
        initComponents();
        modelo = (javax.swing.table.DefaultTableModel) Datos.getModel();
        for (int i = 0; i < tienda.getEmpleados().getRoles().length; i++) {
            cboRol.addItem(tienda.getEmpleados().getRoles()[i]);
        }
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
        entDni = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        entNombres = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        entApellidos = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        entUsuario = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        entClave = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        cboRol = new javax.swing.JComboBox<>();
        cboRol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione..." }));
        btnRegistrar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnMostrar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Datos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Personal");

        lblElegir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblElegir.setText("Editar existente");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("DNI");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Nombres");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Apellidos");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Usuario");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Contrasena");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Rol");

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
                        .addComponent(jLabel5)
                        .addComponent(jLabel6)
                )
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(cboElegir, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(entDni, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(entNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(entApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(entUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(entClave, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cboRol, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(entDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(entNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(entApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(entUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(entClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cboRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
            new String [] { "DNI", "Nombres", "Apellidos", "Usuario", "Contrasena", "Rol" }
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
    private javax.swing.JTextField entDni;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField entNombres;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField entApellidos;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField entUsuario;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField entClave;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JComboBox<String> cboRol;
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
        if (entDni.getText().equals("") || entNombres.getText().equals("") || entApellidos.getText().equals("")) {
            return true;
        }
        if (entUsuario.getText().equals("") || entClave.getText().equals("") || entradas.elegido(cboRol).equals("")) {
            return true;
        }
        return false;
    }

    public void registrar() {
        GestionEmpleados gestion = tienda.getEmpleados();
        if (gestion.getCont() >= 30) {
            JOptionPane.showMessageDialog(this, "Vector Lleno!!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (vacio()) {
            JOptionPane.showMessageDialog(this, "Complete los datos", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String mensaje = gestion.validar(entDni.getText(), entNombres.getText(), entApellidos.getText(), entUsuario.getText(), entClave.getText());
        if (!mensaje.equals("")) {
            JOptionPane.showMessageDialog(this, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!gestion.rolValido(entradas.elegido(cboRol))) {
            JOptionPane.showMessageDialog(this, "Rol no permitido", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (gestion.buscarPorDni(entDni.getText()) != -1) {
            JOptionPane.showMessageDialog(this, "DNI repetido", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (gestion.buscarPorUsuario(entUsuario.getText()) != -1) {
            JOptionPane.showMessageDialog(this, "Usuario repetido", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        Empleado obj = new Empleado(entDni.getText(), entNombres.getText(), entApellidos.getText(), entUsuario.getText(), entClave.getText(), entradas.elegido(cboRol));
        gestion.registrar(obj);
        JOptionPane.showMessageDialog(this, "Empleado registrado", "Info", JOptionPane.INFORMATION_MESSAGE);
        limpiar();
        cargarLista();
        mostrar();
    }

    public void modificar() {
        GestionEmpleados gestion = tienda.getEmpleados();
        int pos = gestion.buscarPorDni(entDni.getText());
        if (pos == -1) {
            JOptionPane.showMessageDialog(this, "Empleado no encontrado", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (vacio()) {
            JOptionPane.showMessageDialog(this, "Complete los datos", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String mensaje = gestion.validar(entDni.getText(), entNombres.getText(), entApellidos.getText(), entUsuario.getText(), entClave.getText());
        if (!mensaje.equals("")) {
            JOptionPane.showMessageDialog(this, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!gestion.rolValido(entradas.elegido(cboRol))) {
            JOptionPane.showMessageDialog(this, "Rol no permitido", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!gestion.usuarioLibre(entUsuario.getText(), pos)) {
            JOptionPane.showMessageDialog(this, "Usuario repetido", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        Empleado obj = gestion.getEmpleados()[pos];
        obj.setNombres(entNombres.getText());
        obj.setApellidos(entApellidos.getText());
        obj.setUsuario(entUsuario.getText());
        obj.setContrasena(entClave.getText());
        obj.setRol(entradas.elegido(cboRol));
        JOptionPane.showMessageDialog(this, "Empleado modificado", "Info", JOptionPane.INFORMATION_MESSAGE);
        limpiar();
        cargarLista();
        mostrar();
    }

    public void eliminar() {
        GestionEmpleados gestion = tienda.getEmpleados();
        int pos = gestion.buscarPorDni(entDni.getText());
        if (pos == -1) {
            JOptionPane.showMessageDialog(this, "Empleado no encontrado", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        gestion.eliminar(pos);
        JOptionPane.showMessageDialog(this, "Empleado eliminado", "Info", JOptionPane.INFORMATION_MESSAGE);
        limpiar();
        cargarLista();
        mostrar();
    }

    public void mostrar() {
        modelo.setNumRows(0);
        Empleado[] lista = tienda.getEmpleados().getEmpleados();
        for (int i = 0; i < tienda.getEmpleados().getCont(); i++) {
            Object[] fila = {lista[i].getDni(), lista[i].getNombres(), lista[i].getApellidos(), lista[i].getUsuario(), "******", lista[i].getRol()};
            modelo.addRow(fila);
        }
    }

    public void vaciarCampos() {
        entDni.setText(null);
        entNombres.setText(null);
        entApellidos.setText(null);
        entUsuario.setText(null);
        entClave.setText(null);
        cboRol.setSelectedIndex(0);
    }

    public void limpiar() {
        vaciarCampos();
        cboElegir.setSelectedIndex(0);
    }

    public void cargarLista() {
        cboElegir.removeAllItems();
        cboElegir.addItem("Seleccione para editar...");
        for (int i = 0; i < tienda.getEmpleados().getCont(); i++) {
            Empleado obj = tienda.getEmpleados().getEmpleados()[i];
            cboElegir.addItem(String.format("%s - %s %s", obj.getDni(), obj.getNombres(), obj.getApellidos()));
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
        Empleado obj = tienda.getEmpleados().getEmpleados()[pos];
        entDni.setText(obj.getDni());
        entNombres.setText(obj.getNombres());
        entApellidos.setText(obj.getApellidos());
        entUsuario.setText(obj.getUsuario());
        entClave.setText(obj.getContrasena());
        entradas.seleccionar(cboRol, obj.getRol());
    }
}
