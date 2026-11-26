package retroplaymanager;

public class MovimientoInventario {
    private String categoria;
    private int cantidad;
    private int dia;

    public MovimientoInventario(String categoria, int cantidad, Fecha fecha) {
        this.categoria = categoria;
        this.cantidad = cantidad;
        dia = fecha.totalDias();
    }
    public String getCategoria() { return categoria; }
    public int getCantidad() { return cantidad; }
    public int getDia() { return dia; }
}
