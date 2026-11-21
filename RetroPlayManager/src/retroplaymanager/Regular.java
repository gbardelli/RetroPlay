package retroplaymanager;

public class Regular extends Cliente {

    public Regular(String dni, String nombres, String apellidos, String telefono, String correo, int compras) {
        super(dni, nombres, apellidos, telefono, correo, compras);
    }

    @Override
    public double calcularDescuento(double precio) {
        return 0;
    }

    @Override
    public String getTipo() {
        return "Regular";
    }
}
