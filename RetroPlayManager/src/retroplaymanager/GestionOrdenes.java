package retroplaymanager;

public class GestionOrdenes {

    private Orden[] ordenes;
    private int cont;
    private int correlativo;

    public GestionOrdenes() {
        ordenes = new Orden[100];
        cont = 0;
        correlativo = 0;
    }

    public Orden crear(String tipo, Cliente cliente, Empleado vendedor, String tipoEntrega, Fecha fechaRegistro, Fecha fechaEntrega) {
        if (tipo.equals("Venta")) {
            return new OrdenVenta(cliente, vendedor, tipoEntrega, fechaRegistro, fechaEntrega);
        }
        if (tipo.equals("Apartado")) {
            return new OrdenApartado(cliente, vendedor, tipoEntrega, fechaRegistro, fechaEntrega);
        }
        return null;
    }

    public boolean registrar(Orden obj) {
        if (cont >= ordenes.length) {
            return false;
        }
        correlativo++;
        obj.setNumero(correlativo);
        obj.cambiarEstado("Pendiente", obj.getFechaRegistro(), obj.getVendedor().getUsuario(), "Orden registrada");
        ordenes[cont] = obj;
        cont++;
        return true;
    }

    public int buscarPorNumero(int numero) {
        for (int i = 0; i < cont; i++) {
            if (ordenes[i].getNumero() == numero) {
                return i;
            }
        }
        return -1;
    }

    public int cantidadComprometida(String tipo, String codigo, int numeroExcluido) {
        int total = 0;
        for (int i = 0; i < cont; i++) {
            if (ordenes[i].getNumero() != numeroExcluido) {
                if (ordenes[i].getEstado().equals("Pendiente") || ordenes[i].getEstado().equals("Confirmada")) {
                    total += ordenes[i].cantidadDe(tipo, codigo);
                }
            }
        }
        return total;
    }

    public String validarJuguete(Juguete obj, int cantidad, int numero) {
        if (cantidad <= 0) {
            return "La cantidad debe ser mayor que cero";
        }
        if (obj.getEstado().equals("En Restauracion")) {
            return String.format("El juguete %s esta En Restauracion y no puede ser vendido ni apartado", obj.getCodigo());
        }
        if (!obj.puedeVenderse()) {
            return String.format("El juguete %s no esta disponible, su estado es %s", obj.getCodigo(), obj.getEstado());
        }
        int comprometidos = cantidadComprometida("Juguete", obj.getCodigo(), numero);
        if (comprometidos > 0 && obj.getStock() - comprometidos < cantidad) {
            return String.format("El juguete %s ya se encuentra apartado en otra orden activa", obj.getCodigo());
        }
        if (obj.getStock() < cantidad) {
            return String.format("La cantidad solicitada del juguete %s (%d) supera el stock disponible (%d)", obj.getCodigo(), cantidad, obj.getStock());
        }
        return "";
    }

    public String validarServicio(Servicio obj, int cantidad, int numero) {
        if (cantidad <= 0) {
            return "La cantidad debe ser mayor que cero";
        }
        int disponibles = obj.getStock() - cantidadComprometida("Servicio", obj.getCodigo(), numero);
        if (disponibles < cantidad) {
            return String.format("La cantidad solicitada del servicio %s (%d) supera el stock disponible (%d)", obj.getCodigo(), cantidad, disponibles);
        }
        return "";
    }

    public String validarPaquete(Paquete obj, int cantidad, int numero, Tienda tienda) {
        if (cantidad <= 0) {
            return "La cantidad debe ser mayor que cero";
        }
        if (obj.getContJ() + obj.getContS() == 0) {
            return String.format("El paquete %s no tiene elementos", obj.getNombre());
        }
        Juguete[] juguetes = obj.getJuguetes();
        for (int i = 0; i < obj.getContJ(); i++) {
            int pos = tienda.getJuguetes().buscarPorCodigo(juguetes[i].getCodigo());
            if (pos == -1) {
                return String.format("El juguete %s del paquete %s ya no existe", juguetes[i].getCodigo(), obj.getNombre());
            }
            String mensaje = validarJuguete(tienda.getJuguetes().getJuguetes()[pos], cantidad, numero);
            if (!mensaje.equals("")) {
                return mensaje;
            }
        }
        Servicio[] servicios = obj.getServicios();
        for (int i = 0; i < obj.getContS(); i++) {
            int pos = tienda.getServicios().buscarPorCodigo(servicios[i].getCodigo());
            if (pos == -1) {
                return String.format("El servicio %s del paquete %s ya no existe", servicios[i].getCodigo(), obj.getNombre());
            }
            String mensaje = validarServicio(tienda.getServicios().getServicios()[pos], cantidad, numero);
            if (!mensaje.equals("")) {
                return mensaje;
            }
        }
        return "";
    }

    public String validarDetalle(DetalleOrden obj, int numero, Tienda tienda) {
        if (obj.getTipo().equals("Juguete")) {
            int pos = tienda.getJuguetes().buscarPorCodigo(obj.getCodigo());
            if (pos == -1) {
                return String.format("El juguete %s ya no existe en el catalogo", obj.getCodigo());
            }
            return validarJuguete(tienda.getJuguetes().getJuguetes()[pos], obj.getCantidad(), numero);
        }
        if (obj.getTipo().equals("Servicio")) {
            int pos = tienda.getServicios().buscarPorCodigo(obj.getCodigo());
            if (pos == -1) {
                return String.format("El servicio %s ya no existe", obj.getCodigo());
            }
            return validarServicio(tienda.getServicios().getServicios()[pos], obj.getCantidad(), numero);
        }
        if (obj.getTipo().equals("Paquete")) {
            int pos = tienda.getPaquetes().buscarPorNombre(obj.getCodigo());
            if (pos == -1) {
                return String.format("El paquete %s ya no existe", obj.getCodigo());
            }
            return validarPaquete(tienda.getPaquetes().getPaquetes()[pos], obj.getCantidad(), numero, tienda);
        }
        return "";
    }

    public String validarOrden(Orden orden, Tienda tienda) {
        if (orden.getContD() == 0) {
            return "La orden no tiene articulos";
        }
        String mensaje = orden.validarFechas();
        if (!mensaje.equals("")) {
            return mensaje;
        }
        DetalleOrden[] lista = orden.getDetalles();
        for (int i = 0; i < orden.getContD(); i++) {
            mensaje = validarDetalle(lista[i], orden.getNumero(), tienda);
            if (!mensaje.equals("")) {
                return mensaje;
            }
        }
        return "";
    }

    public String agregarJuguete(Orden orden, String codigo, int cantidad, Tienda tienda) {
        int pos = tienda.getJuguetes().buscarPorCodigo(codigo);
        if (pos == -1) {
            return String.format("El juguete %s no existe", codigo);
        }
        if (orden.buscarDetalle("Juguete", codigo) != -1) {
            return String.format("El juguete %s ya esta repetido en esta orden", codigo);
        }
        Juguete obj = tienda.getJuguetes().getJuguetes()[pos];
        String mensaje = validarJuguete(obj, cantidad, orden.getNumero());
        if (!mensaje.equals("")) {
            return mensaje;
        }
        DetalleOrden detalle = new DetalleOrden("Juguete", obj.getCodigo(), obj.getNombre(), obj.getCategoria(), cantidad, obj);
        if (!orden.agregarDetalle(detalle)) {
            return "La orden ya no admite mas articulos";
        }
        return "";
    }

    public String agregarServicio(Orden orden, String codigo, int cantidad, Tienda tienda) {
        int pos = tienda.getServicios().buscarPorCodigo(codigo);
        if (pos == -1) {
            return String.format("El servicio %s no existe", codigo);
        }
        if (orden.buscarDetalle("Servicio", codigo) != -1) {
            return String.format("El servicio %s ya esta repetido en esta orden", codigo);
        }
        Servicio obj = tienda.getServicios().getServicios()[pos];
        String mensaje = validarServicio(obj, cantidad, orden.getNumero());
        if (!mensaje.equals("")) {
            return mensaje;
        }
        DetalleOrden detalle = new DetalleOrden("Servicio", obj.getCodigo(), obj.getNombre(), "Servicio adicional", cantidad, obj);
        if (!orden.agregarDetalle(detalle)) {
            return "La orden ya no admite mas articulos";
        }
        return "";
    }

    public String agregarPaquete(Orden orden, String nombre, int cantidad, Tienda tienda) {
        int pos = tienda.getPaquetes().buscarPorNombre(nombre);
        if (pos == -1) {
            return String.format("El paquete %s no existe", nombre);
        }
        if (orden.buscarDetalle("Paquete", nombre) != -1) {
            return String.format("El paquete %s ya esta repetido en esta orden", nombre);
        }
        Paquete obj = tienda.getPaquetes().getPaquetes()[pos];
        String mensaje = validarPaquete(obj, cantidad, orden.getNumero(), tienda);
        if (!mensaje.equals("")) {
            return mensaje;
        }
        DetalleOrden detalle = new DetalleOrden("Paquete", obj.getNombre(), obj.getNombre(), "Paquete promocional", cantidad, obj);
        if (!orden.agregarDetalle(detalle)) {
            return "La orden ya no admite mas articulos";
        }
        return "";
    }

    public String validarMomento(Orden orden, Fecha fecha) {
        if (!fecha.esValida()) {
            return "La fecha ingresada no es valida";
        }
        if (fecha.totalDias() < orden.getFechaRegistro().totalDias()) {
            return "La fecha no puede ser anterior al registro de la orden";
        }
        return "";
    }

    public String revisarCerrada(Orden orden) {
        if (orden.estaCerrada()) {
            return String.format("La orden %d esta %s y ya no puede modificarse", orden.getNumero(), orden.getEstado());
        }
        return "";
    }

    public void descontarJuguete(String codigo, int cantidad, Orden orden, Fecha fecha, Tienda tienda) {
        int pos = tienda.getJuguetes().buscarPorCodigo(codigo);
        if (pos == -1) {
            return;
        }
        Juguete obj = tienda.getJuguetes().getJuguetes()[pos];
        obj.setStock(obj.getStock() - cantidad);
        if (obj.getStock() == 0) {
            obj.setEstado(orden.estadoJuguete());
            obj.setFecha(fecha.texto());
        }
    }

    public void descontarServicio(String codigo, int cantidad, Tienda tienda) {
        int pos = tienda.getServicios().buscarPorCodigo(codigo);
        if (pos == -1) {
            return;
        }
        Servicio obj = tienda.getServicios().getServicios()[pos];
        obj.setStock(obj.getStock() - cantidad);
    }

    public void devolverJuguete(String codigo, int cantidad, Orden orden, Tienda tienda) {
        int pos = tienda.getJuguetes().buscarPorCodigo(codigo);
        if (pos == -1) {
            return;
        }
        Juguete obj = tienda.getJuguetes().getJuguetes()[pos];
        obj.setStock(obj.getStock() + cantidad);
        if (obj.getEstado().equals(orden.estadoJuguete())) {
            obj.setEstado("Disponible");
        }
    }

    public void devolverServicio(String codigo, int cantidad, Tienda tienda) {
        int pos = tienda.getServicios().buscarPorCodigo(codigo);
        if (pos == -1) {
            return;
        }
        Servicio obj = tienda.getServicios().getServicios()[pos];
        obj.setStock(obj.getStock() + cantidad);
    }

    public void venderApartado(String codigo, Fecha fecha, Tienda tienda) {
        int pos = tienda.getJuguetes().buscarPorCodigo(codigo);
        if (pos == -1) {
            return;
        }
        Juguete obj = tienda.getJuguetes().getJuguetes()[pos];
        if (obj.getEstado().equals("Apartado")) {
            obj.setEstado("Vendido");
            obj.setFecha(fecha.texto());
        }
    }

    public void moverInventario(Orden orden, String accion, Fecha fecha, Tienda tienda) {
        DetalleOrden[] lista = orden.getDetalles();
        for (int i = 0; i < orden.getContD(); i++) {
            String tipo = lista[i].getTipo();
            String codigo = lista[i].getCodigo();
            int cantidad = lista[i].getCantidad();
            if (tipo.equals("Juguete")) {
                moverJuguete(codigo, cantidad, orden, accion, fecha, tienda);
            }
            if (tipo.equals("Servicio")) {
                moverServicio(codigo, cantidad, accion, tienda);
            }
            if (tipo.equals("Paquete")) {
                int pos = tienda.getPaquetes().buscarPorNombre(codigo);
                if (pos != -1) {
                    Paquete paquete = tienda.getPaquetes().getPaquetes()[pos];
                    for (int j = 0; j < paquete.getContJ(); j++) {
                        moverJuguete(paquete.getJuguetes()[j].getCodigo(), cantidad, orden, accion, fecha, tienda);
                    }
                    for (int j = 0; j < paquete.getContS(); j++) {
                        moverServicio(paquete.getServicios()[j].getCodigo(), cantidad, accion, tienda);
                    }
                }
            }
        }
    }

    public void moverJuguete(String codigo, int cantidad, Orden orden, String accion, Fecha fecha, Tienda tienda) {
        if (accion.equals("descontar")) {
            descontarJuguete(codigo, cantidad, orden, fecha, tienda);
        }
        if (accion.equals("devolver")) {
            devolverJuguete(codigo, cantidad, orden, tienda);
        }
        if (accion.equals("vender")) {
            venderApartado(codigo, fecha, tienda);
        }
    }

    public void moverServicio(String codigo, int cantidad, String accion, Tienda tienda) {
        if (accion.equals("descontar")) {
            descontarServicio(codigo, cantidad, tienda);
        }
        if (accion.equals("devolver")) {
            devolverServicio(codigo, cantidad, tienda);
        }
    }

    public String confirmar(Orden orden, Fecha fecha, Empleado empleado, Tienda tienda) {
        String mensaje = revisarCerrada(orden);
        if (!mensaje.equals("")) {
            return mensaje;
        }
        if (!orden.getEstado().equals("Pendiente")) {
            return "Solo se puede confirmar una orden Pendiente";
        }
        mensaje = validarMomento(orden, fecha);
        if (!mensaje.equals("")) {
            return mensaje;
        }
        mensaje = validarOrden(orden, tienda);
        if (!mensaje.equals("")) {
            return mensaje;
        }
        orden.setAdelanto(orden.calcularAdelanto());
        orden.cambiarEstado("Confirmada", fecha, empleado.getUsuario(), String.format("Adelanto del 50 por ciento pagado: S/ %.2f", orden.getAdelanto()));
        return "";
    }

    public String preparar(Orden orden, Fecha fecha, Empleado empleado, Tienda tienda) {
        String mensaje = revisarCerrada(orden);
        if (!mensaje.equals("")) {
            return mensaje;
        }
        if (!orden.getEstado().equals("Confirmada")) {
            return "Solo se puede preparar una orden Confirmada";
        }
        mensaje = validarMomento(orden, fecha);
        if (!mensaje.equals("")) {
            return mensaje;
        }
        mensaje = validarOrden(orden, tienda);
        if (!mensaje.equals("")) {
            return mensaje;
        }
        moverInventario(orden, "descontar", fecha, tienda);
        orden.setAlmacenero(empleado);
        orden.cambiarEstado("En Preparacion", fecha, empleado.getUsuario(), String.format("Producto verificado, juguetes pasan a %s", orden.estadoJuguete()));
        return "";
    }

    public String entregar(Orden orden, Fecha fecha, Empleado empleado, Tienda tienda) {
        String mensaje = revisarCerrada(orden);
        if (!mensaje.equals("")) {
            return mensaje;
        }
        if (!orden.getEstado().equals("En Preparacion")) {
            return "Solo se puede entregar una orden En Preparacion";
        }
        mensaje = validarMomento(orden, fecha);
        if (!mensaje.equals("")) {
            return mensaje;
        }
        if (orden.getTipo().equals("Apartado")) {
            moverInventario(orden, "vender", fecha, tienda);
        }
        orden.setFechaCierre(fecha);
        orden.cambiarEstado("Finalizada", fecha, empleado.getUsuario(), "Producto entregado al cliente");
        String dni = orden.getCliente().getDni();
        tienda.getClientes().sumarCompra(dni);
        int pos = tienda.getClientes().buscarPorDni(dni);
        if (pos != -1) {
            actualizarCliente(tienda.getClientes().getClientes()[pos]);
        }
        return "";
    }

    public String cancelar(Orden orden, Fecha fecha, Empleado empleado, Tienda tienda) {
        String mensaje = revisarCerrada(orden);
        if (!mensaje.equals("")) {
            return mensaje;
        }
        mensaje = validarMomento(orden, fecha);
        if (!mensaje.equals("")) {
            return mensaje;
        }
        String observacion;
        if (orden.getEstado().equals("Pendiente")) {
            observacion = "Cancelada antes de pagar el adelanto";
        } else {
            int horas = orden.horasParaEntrega(fecha);
            if (horas >= 24) {
                orden.setDevolucion(orden.getAdelanto());
                observacion = String.format("Cancelada con %d horas de anticipacion, se devuelve el adelanto S/ %.2f", horas, orden.getAdelanto());
            } else {
                orden.setRetenido(orden.getAdelanto());
                observacion = String.format("Cancelada con menos de 24 horas, se retiene el adelanto S/ %.2f", orden.getAdelanto());
            }
        }
        if (orden.getEstado().equals("En Preparacion")) {
            moverInventario(orden, "devolver", fecha, tienda);
        }
        orden.setFechaCierre(fecha);
        orden.cambiarEstado("Cancelada", fecha, empleado.getUsuario(), observacion);
        return "";
    }

    public void actualizarCliente(Cliente nuevo) {
        for (int i = 0; i < cont; i++) {
            if (ordenes[i].getCliente().getDni().equals(nuevo.getDni())) {
                ordenes[i].setCliente(nuevo);
            }
        }
    }

    public Orden[] getOrdenes() {
        return ordenes;
    }

    public void setOrdenes(Orden[] ordenes) {
        this.ordenes = ordenes;
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }

    public int getCorrelativo() {
        return correlativo;
    }

    public void setCorrelativo(int correlativo) {
        this.correlativo = correlativo;
    }
}
