package retroplaymanager;

public class OrdenApartado extends Orden {

    public OrdenApartado(Cliente cliente, Empleado vendedor, String tipoEntrega, Fecha fechaRegistro, Fecha fechaEntrega) {
        super(cliente, vendedor, tipoEntrega, fechaRegistro, fechaEntrega);
    }

    @Override
    public String getTipo() {
        return "Apartado";
    }

    @Override
    public String estadoJuguete() {
        return "Apartado";
    }

    @Override
    public int plazoMaximo() {
        return 30;
    }
}
