package retroplaymanager;

public abstract class Comprobante {
    protected int numero;
    protected Orden orden;
    private String detalle;

    public Comprobante(int numero, Orden orden) {
        this.numero = numero;
        this.orden = orden;
        detalle = String.format("RETROPLAY\nOrden: %d\nFecha: %s\nCliente: %s %s\nDNI: %s\n\n", orden.getNumero(), orden.getFechaCierre().texto(), orden.getCliente().getNombres(), orden.getCliente().getApellidos(), orden.getCliente().getDni());
        for (int i = 0; i < orden.getContD(); i++) {
            DetalleOrden d = orden.getDetalles()[i];
            detalle = String.format("%s%s - %s | %d x S/ %.2f = S/ %.2f\n", detalle, d.getTipo(), d.getNombre(), d.getCantidad(), d.getPrecio(), d.subtotal());
        }
        detalle = String.format("%s\nJuguetes: S/ %.2f\nDescuento: S/ %.2f\nServicios: S/ %.2f\nPaquetes: S/ %.2f\nEnvio: S/ %.2f\nSubtotal: S/ %.2f\nIGV (18%%): S/ %.2f\nTotal: S/ %.2f\nAdelanto: S/ %.2f\nSaldo a pagar: S/ %.2f", detalle, orden.totalJuguetes(), orden.descuento(), orden.totalServicios(), orden.totalPaquetes(), orden.getCostoEnvio(), orden.calcularSubtotal(), orden.calcularIGV(), orden.calcularTotal(), orden.getAdelanto(), orden.saldo());
    }

    public abstract String getTipo();
    public abstract String datosTributarios();

    public int getNumero() { return numero; }
    public Orden getOrden() { return orden; }
    public String mostrarDatos() {
        return String.format("%s Nro. %d\n%s%s", getTipo(), numero, datosTributarios(), detalle);
    }
}
