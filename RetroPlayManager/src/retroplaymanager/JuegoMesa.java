package retroplaymanager;

public class JuegoMesa extends Juguete {

    public JuegoMesa(String codigo, String nombre, int anio, double precioBase, int stock, String estado, String fecha) {
        super(codigo, nombre, anio, precioBase, stock, estado, fecha);
    }

    @Override
    public double calcularPrecioVenta() {
        if (antiguedad() > 30) {
            return precioBase * 1.10;
        }
        return precioBase;
    }

    @Override
    public String getCategoria() {
        return "Juego de Mesa";
    }
}
