package retroplaymanager;

public class OrdenVenta extends Orden {

    public OrdenVenta(Cliente cliente, Empleado vendedor, String tipoEntrega, Fecha fechaRegistro, Fecha fechaEntrega) {
        super(cliente, vendedor, tipoEntrega, fechaRegistro, fechaEntrega);
    }

    @Override
    public String getTipo() {
        return "Venta";
    }

    @Override
    public String estadoJuguete() {
        return "Vendido";
    }

    @Override
    public int plazoMaximo() {
        return 7;
    }
}
