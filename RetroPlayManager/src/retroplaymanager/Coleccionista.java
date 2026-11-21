package retroplaymanager;

public class Coleccionista extends Cliente {

    public Coleccionista(String dni, String nombres, String apellidos, String telefono, String correo, int compras) {
        super(dni, nombres, apellidos, telefono, correo, compras);
    }

    @Override
    public double calcularDescuento(double precio) {
        return precio * 0.10;
    }

    @Override
    public String getTipo() {
        return "Coleccionista Frecuente";
    }
}
