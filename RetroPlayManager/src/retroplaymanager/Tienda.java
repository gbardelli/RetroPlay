package retroplaymanager;

public class Tienda {

    private GestionEmpleados empleados;
    private GestionJuguetes juguetes;
    private GestionClientes clientes;
    private GestionServicios servicios;
    private GestionPaquetes paquetes;
    private Empleado sesion;

    public Tienda() {
        empleados = new GestionEmpleados();
        juguetes = new GestionJuguetes();
        clientes = new GestionClientes();
        servicios = new GestionServicios();
        paquetes = new GestionPaquetes();
        Empleado admin = new Empleado("00000000", "Admin", "General", "admin", "admin", "Administrador");
        empleados.registrar(admin);
    }

    public GestionEmpleados getEmpleados() {
        return empleados;
    }

    public GestionJuguetes getJuguetes() {
        return juguetes;
    }

    public GestionClientes getClientes() {
        return clientes;
    }

    public GestionServicios getServicios() {
        return servicios;
    }

    public GestionPaquetes getPaquetes() {
        return paquetes;
    }

    public Empleado getSesion() {
        return sesion;
    }

    public void setSesion(Empleado sesion) {
        this.sesion = sesion;
    }
}
