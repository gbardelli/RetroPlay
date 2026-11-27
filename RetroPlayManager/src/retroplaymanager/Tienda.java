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

    public void cargarDatosDePrueba() {
        cargarPersonalYClientes();
        cargarCatalogo();
        cargarOrdenes();
    }

    private void cargarPersonalYClientes() {
        empleados.registrar(new Empleado("11111111", "Luis", "Ramos", "vendedor", "vende123", "Vendedor"));
        empleados.registrar(new Empleado("22222222", "Rosa", "Diaz", "almacen", "alma123", "Almacenero"));
        clientes.registrar(new Regular("70000001", "Carlos", "Mendoza", "987654321", "carlos@mail.com", 0));
        clientes.registrar(new Regular("70000002", "Lucia", "Paredes", "987654322", "lucia@mail.com", 0));
        clientes.registrar(new Coleccionista("70000003", "Jorge", "Salas", "987654323", "jorge@mail.com", 5));
    }

    private void registrarJuguete(String categoria, String codigo, String nombre, int anio, double precio, int stock, String estado, Fecha fecha) {
        Juguete obj = juguetes.crear(categoria, codigo, nombre, anio, precio, stock, estado, fecha.texto());
        juguetes.registrar(obj, fecha);
    }

    private Juguete buscarJuguete(String codigo) {
        return juguetes.getJuguetes()[juguetes.buscarPorCodigo(codigo)];
    }

    private Servicio buscarServicio(String codigo) {
        return servicios.getServicios()[servicios.buscarPorCodigo(codigo)];
    }

    private void cargarCatalogo() {
        Fecha octubre = new Fecha(15, 10, 2026, 0);
        Fecha noviembre = new Fecha(1, 11, 2026, 0);
        registrarJuguete("Consola Retro", "3333", "Atari 2600", 1982, 100, 5, "Disponible", octubre);
        registrarJuguete("Consola Retro", "3334", "Nintendo NES", 1985, 150, 3, "Disponible", octubre);
        registrarJuguete("Juego de Mesa", "4444", "Catan", 1995, 40, 4, "Disponible", octubre);
        registrarJuguete("Consola Retro", "3335", "Game Boy", 1989, 80, 1, "Disponible", noviembre);
        registrarJuguete("Juego de Mesa", "4445", "Monopoly Clasico", 1980, 35, 2, "Disponible", noviembre);
        registrarJuguete("Figura de Acción", "5555", "Han Solo", 2005, 30, 3, "Disponible", noviembre);
        registrarJuguete("Figura de Acción", "5556", "He-Man", 1983, 45, 2, "En Restauración", noviembre);
        registrarJuguete("Figura de Acción", "5557", "Pikachu", 2000, 25, 1, "Disponible", noviembre);
        servicios.registrar(new Servicio("1111", "Limpieza", 10, 5));
        servicios.registrar(new Servicio("1112", "Estuche protector", 15, 10));
        Paquete retro = new Paquete("Pack Retro", 110);
        retro.agregarJuguete(buscarJuguete("3333"));
        retro.agregarServicio(buscarServicio("1111"));
        paquetes.registrar(retro);
        Paquete mesa = new Paquete("Pack Mesa", 70);
        mesa.agregarJuguete(buscarJuguete("4444"));
        mesa.agregarJuguete(buscarJuguete("4445"));
        mesa.agregarServicio(buscarServicio("1112"));
        paquetes.registrar(mesa);
    }

    private void cargarOrdenes() {
        Empleado vendedor = empleados.getEmpleados()[1];
        Empleado almacenero = empleados.getEmpleados()[2];
        Cliente carlos = clientes.getClientes()[0];
        Cliente lucia = clientes.getClientes()[1];
        Cliente jorge = clientes.getClientes()[2];

        Orden uno = ordenes.crear("Venta", carlos, vendedor, "Tienda", new Fecha(5, 11, 2026, 0), new Fecha(8, 11, 2026, 15));
        ordenes.agregarJuguete(uno, "4444", 1, this);
        ordenes.agregarPaquete(uno, "Pack Retro", 1, this);
        ordenes.registrar(uno);
        ordenes.confirmar(uno, new Fecha(5, 11, 2026, 10), vendedor, this);
        ordenes.preparar(uno, new Fecha(6, 11, 2026, 10), almacenero, this);
        ordenes.entregar(uno, new Fecha(8, 11, 2026, 15), almacenero, this);
        comprobantes.emitir(uno, "Factura", "20123456789", "Coleccionables Lima SAC");

        Orden dos = ordenes.crear("Apartado", lucia, vendedor, "Delivery", new Fecha(20, 11, 2026, 0), new Fecha(28, 11, 2026, 11));
        ordenes.agregarJuguete(dos, "5555", 1, this);
        ordenes.agregarServicio(dos, "1111", 1, this);
        ordenes.registrar(dos);

        Orden tres = ordenes.crear("Venta", jorge, vendedor, "Tienda", new Fecha(24, 11, 2026, 0), new Fecha(27, 11, 2026, 16));
        ordenes.agregarJuguete(tres, "3334", 1, this);
        ordenes.agregarServicio(tres, "1112", 2, this);
        ordenes.registrar(tres);
        ordenes.confirmar(tres, new Fecha(24, 11, 2026, 10), vendedor, this);

        Orden cuatro = ordenes.crear("Apartado", carlos, vendedor, "Tienda", new Fecha(10, 11, 2026, 0), new Fecha(25, 11, 2026, 10));
        ordenes.agregarJuguete(cuatro, "4445", 1, this);
        ordenes.registrar(cuatro);
        ordenes.confirmar(cuatro, new Fecha(10, 11, 2026, 10), vendedor, this);
        ordenes.cancelar(cuatro, new Fecha(12, 11, 2026, 10), vendedor, this);

        Orden cinco = ordenes.crear("Venta", lucia, vendedor, "Tienda", new Fecha(20, 11, 2026, 0), new Fecha(21, 11, 2026, 10));
        ordenes.agregarJuguete(cinco, "5555", 1, this);
        ordenes.registrar(cinco);
        ordenes.confirmar(cinco, new Fecha(20, 11, 2026, 8), vendedor, this);
        ordenes.cancelar(cinco, new Fecha(21, 11, 2026, 9), vendedor, this);

        Orden seis = ordenes.crear("Venta", jorge, vendedor, "Delivery", new Fecha(12, 11, 2026, 0), new Fecha(14, 11, 2026, 12));
        ordenes.agregarJuguete(seis, "3335", 1, this);
        ordenes.agregarServicio(seis, "1112", 1, this);
        ordenes.registrar(seis);
        ordenes.confirmar(seis, new Fecha(12, 11, 2026, 9), vendedor, this);
        ordenes.preparar(seis, new Fecha(13, 11, 2026, 9), almacenero, this);
        ordenes.entregar(seis, new Fecha(14, 11, 2026, 12), almacenero, this);

        Orden siete = ordenes.crear("Apartado", carlos, vendedor, "Tienda", new Fecha(21, 11, 2026, 0), new Fecha(28, 11, 2026, 10));
        ordenes.agregarJuguete(siete, "5557", 1, this);
        ordenes.agregarServicio(siete, "1111", 1, this);
        ordenes.registrar(siete);
        ordenes.confirmar(siete, new Fecha(21, 11, 2026, 10), vendedor, this);
        ordenes.preparar(siete, new Fecha(22, 11, 2026, 9), almacenero, this);
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

    public GestionComprobantes getComprobantes() {
        return comprobantes;
    }

    public GestionReportes getReportes() {
        return reportes;
    }

    public Empleado getSesion() {
        return sesion;
    }

    public void setSesion(Empleado sesion) {
        this.sesion = sesion;
    }
}
