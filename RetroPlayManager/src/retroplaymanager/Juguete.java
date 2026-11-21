package retroplaymanager;

public abstract class Juguete implements Agregable {

    protected String codigo;
    protected String nombre;
    protected String estado;
    protected String fecha;
    protected int anio;
    protected int stock;
    protected double precioBase;

    public Juguete(String codigo, String nombre, int anio, double precioBase, int stock, String estado, String fecha) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.anio = anio;
        this.precioBase = precioBase;
        this.stock = stock;
        this.estado = estado;
        this.fecha = fecha;
    }

    public abstract double calcularPrecioVenta();

    public abstract String getCategoria();

    @Override
    public double precioUnitario() {
        return calcularPrecioVenta();
    }

    public int antiguedad() {
        return 2026 - anio;
    }

    public boolean puedeVenderse() {
        if (estado.equals("Disponible")) {
            return true;
        }
        return false;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }
}
