package retroplaymanager;

public class Tienda {

    private GestionEmpleados empleados;
    private GestionJuguetes juguetes;
    private GestionClientes clientes;
    private GestionServicios servicios;
    private GestionPaquetes paquetes;
    private GestionOrdenes ordenes;
    private Empleado sesion;
    private GestionComprobantes comprobantes;
    private GestionReportes reportes;

    public Tienda() {
        empleados = new GestionEmpleados();
        juguetes = new GestionJuguetes();
        clientes = new GestionClientes();
        servicios = new GestionServicios();
        paquetes = new GestionPaquetes();
        ordenes = new GestionOrdenes();
        comprobantes = new GestionComprobantes();
        reportes = new GestionReportes(this);
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

    public GestionOrdenes getOrdenes() {
        return ordenes;
    }

    public GestionComprobantes getComprobantes() { return comprobantes; }

    public GestionReportes getReportes() { return reportes; }

    public Empleado getSesion() {
        return sesion;
    }

    public void setSesion(Empleado sesion) {
        this.sesion = sesion;
    }
}
