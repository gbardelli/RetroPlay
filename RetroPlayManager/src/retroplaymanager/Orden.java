package retroplaymanager;

public abstract class Orden {

    protected int numero;
    protected Cliente cliente;
    protected Empleado vendedor;
    protected Empleado almacenero;
    protected String tipoEntrega;
    protected String estado;
    protected Fecha fechaRegistro;
    protected Fecha fechaEntrega;
    protected Fecha fechaCierre;
    protected double costoEnvio;
    protected double adelanto;
    private double descuentoFijo = -1;
    private int[] vendidosCategoria = new int[3];
    protected double devolucion;
    protected double retenido;
    protected DetalleOrden[] detalles;
    protected int contD;
    protected HistorialOrden[] historial;
    protected int contH;

    public Orden(Cliente cliente, Empleado vendedor, String tipoEntrega, Fecha fechaRegistro, Fecha fechaEntrega) {
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.tipoEntrega = tipoEntrega;
        this.fechaRegistro = fechaRegistro;
        this.fechaEntrega = fechaEntrega;
        numero = 0;
        estado = "Nueva";
        almacenero = null;
        fechaCierre = null;
        adelanto = 0;
        devolucion = 0;
        retenido = 0;
        if (tipoEntrega.equals("Delivery")) {
            costoEnvio = 15.0;
        } else {
            costoEnvio = 0;
        }
        detalles = new DetalleOrden[20];
        contD = 0;
        historial = new HistorialOrden[10];
        contH = 0;
    }

    public abstract String getTipo();

    public abstract String estadoJuguete();

    public abstract int plazoMaximo();

    public String validarFechas() {
        if (!fechaRegistro.esValida()) {
            return "La fecha de registro no es valida";
        }
        if (!fechaEntrega.esValida()) {
            return "La fecha de entrega no es valida";
        }
        int dias = fechaEntrega.totalDias() - fechaRegistro.totalDias();
        if (dias < 0) {
            return "La fecha de entrega no puede ser anterior a la fecha de registro";
        }
        if (dias > plazoMaximo()) {
            return String.format("En una orden de %s la entrega debe ser dentro de %d dias", getTipo(), plazoMaximo());
        }
        return "";
    }

    public boolean agregarDetalle(DetalleOrden obj) {
        if (contD >= detalles.length) {
            return false;
        }
        detalles[contD] = obj;
        contD++;
        return true;
    }

    public int buscarDetalle(String tipo, String codigo) {
        for (int i = 0; i < contD; i++) {
            if (detalles[i].getTipo().equals(tipo) && detalles[i].getCodigo().equals(codigo)) {
                return i;
            }
        }
        return -1;
    }

    public void quitarDetalle(int pos) {
        for (int i = pos; i < contD - 1; i++) {
            detalles[i] = detalles[i + 1];
        }
        contD--;
    }

    public int cantidadDe(String tipo, String codigo) {
        int pos = buscarDetalle(tipo, codigo);
        if (pos == -1) {
            return 0;
        }
        return detalles[pos].getCantidad();
    }

    public void cambiarEstado(String nuevo, Fecha fecha, String usuario, String observacion) {
        if (contH < historial.length) {
            historial[contH] = new HistorialOrden(estado, nuevo, fecha, usuario, observacion);
            contH++;
        }
        estado = nuevo;
    }

    public boolean estaActiva() {
        if (estado.equals("Pendiente") || estado.equals("Confirmada") || estado.equals("En Preparación")) {
            return true;
        }
        return false;
    }

    public boolean estaCerrada() {
        if (estado.equals("Finalizada") || estado.equals("Cancelada")) {
            return true;
        }
        return false;
    }

    public double totalPorTipo(String tipo) {
        double suma = 0;
        for (int i = 0; i < contD; i++) {
            if (detalles[i].getTipo().equals(tipo)) {
                suma += detalles[i].subtotal();
            }
        }
        return suma;
    }

    public double totalJuguetes() {
        return totalPorTipo("Juguete");
    }

    public double totalServicios() {
        return totalPorTipo("Servicio");
    }

    public double totalPaquetes() {
        return totalPorTipo("Paquete");
    }

    public double descuento() {
        if (descuentoFijo >= 0) {
            return descuentoFijo;
        }
        return cliente.calcularDescuento(totalJuguetes());
    }

    public void fijarDescuento() {
        descuentoFijo = descuento();
    }

    public double calcularSubtotal() {
        return totalJuguetes() - descuento() + totalServicios() + totalPaquetes() + costoEnvio;
    }

    public double calcularIGV() {
        return calcularSubtotal() * 0.18;
    }

    public double calcularTotal() {
        return calcularSubtotal() + calcularIGV();
    }

    public int[] getVendidosCategoria() {
        return vendidosCategoria;
    }

    public void registrarCategorias(Tienda tienda) {
        vendidosCategoria = new int[3];
        for (int i = 0; i < contD; i++) {
            DetalleOrden d = detalles[i];
            if (d.getTipo().equals("Juguete")) {
                int pos = tienda.getJuguetes().buscarPorCodigo(d.getCodigo());
                String cat = d.getCategoria();
                if (pos != -1) {
                    cat = tienda.getJuguetes().getJuguetes()[pos].getCategoria();
                }
                sumarCategoria(tienda, cat, d.getCantidad());
            }
            if (d.getTipo().equals("Paquete")) {
                int pos = tienda.getPaquetes().buscarPorNombre(d.getCodigo());
                if (pos != -1) {
                    Paquete paq = tienda.getPaquetes().getPaquetes()[pos];
                    for (int j = 0; j < paq.getContJ(); j++) {
                        Juguete juguete = paq.getJuguetes()[j];
                        int k = tienda.getJuguetes().buscarPorCodigo(juguete.getCodigo());
                        if (k != -1) {
                            juguete = tienda.getJuguetes().getJuguetes()[k];
                        }
                        sumarCategoria(tienda, juguete.getCategoria(), d.getCantidad());
                    }
                }
            }
        }
    }

    private void sumarCategoria(Tienda tienda, String categoria, int cantidad) {
        int pos = tienda.getJuguetes().posCategoria(categoria);
        if (pos != -1) {
            vendidosCategoria[pos] += cantidad;
        }
    }

    public double calcularAdelanto() {
        return calcularTotal() * 0.5;
    }

    public double saldo() {
        return calcularTotal() - adelanto;
    }

    public int horasParaEntrega(Fecha momento) {
        return fechaEntrega.totalHoras() - momento.totalHoras();
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Empleado getVendedor() {
        return vendedor;
    }

    public void setVendedor(Empleado vendedor) {
        this.vendedor = vendedor;
    }

    public Empleado getAlmacenero() {
        return almacenero;
    }

    public void setAlmacenero(Empleado almacenero) {
        this.almacenero = almacenero;
    }

    public String getTipoEntrega() {
        return tipoEntrega;
    }

    public void setTipoEntrega(String tipoEntrega) {
        this.tipoEntrega = tipoEntrega;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Fecha getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Fecha fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Fecha getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Fecha fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public Fecha getFechaCierre() {
        return fechaCierre;
    }

    public void setFechaCierre(Fecha fechaCierre) {
        this.fechaCierre = fechaCierre;
    }

    public double getCostoEnvio() {
        return costoEnvio;
    }

    public void setCostoEnvio(double costoEnvio) {
        this.costoEnvio = costoEnvio;
    }

    public double getAdelanto() {
        return adelanto;
    }

    public void setAdelanto(double adelanto) {
        this.adelanto = adelanto;
    }

    public double getDevolucion() {
        return devolucion;
    }

    public void setDevolucion(double devolucion) {
        this.devolucion = devolucion;
    }

    public double getRetenido() {
        return retenido;
    }

    public void setRetenido(double retenido) {
        this.retenido = retenido;
    }

    public DetalleOrden[] getDetalles() {
        return detalles;
    }

    public void setDetalles(DetalleOrden[] detalles) {
        this.detalles = detalles;
    }

    public int getContD() {
        return contD;
    }

    public void setContD(int contD) {
        this.contD = contD;
    }

    public HistorialOrden[] getHistorial() {
        return historial;
    }

    public void setHistorial(HistorialOrden[] historial) {
        this.historial = historial;
    }

    public int getContH() {
        return contH;
    }

    public void setContH(int contH) {
        this.contH = contH;
    }
}
