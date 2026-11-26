package retroplaymanager;

public class GestionReportes {

    private Tienda tienda;
    private String[] categorias = {"Figura de Accion", "Consola Retro", "Juego de Mesa"};

    public GestionReportes(Tienda tienda) {
        this.tienda = tienda;
    }

    public boolean enPeriodo(Fecha fecha, Fecha desde, Fecha hasta) {
        return fecha != null && fecha.totalDias() >= desde.totalDias() && fecha.totalDias() <= hasta.totalDias();
    }

    public boolean finalizadaEn(Orden orden, Fecha desde, Fecha hasta) {
        return orden.getEstado().equals("Finalizada") && enPeriodo(orden.getFechaCierre(), desde, hasta);
    }

    public Object[][] rotacion(Fecha desde, Fecha hasta) {
        int[] inicial = new int[3];
        int[] entradas = new int[3];
        int[] vendidos = new int[3];
        GestionJuguetes g = tienda.getJuguetes();
        for (int i = 0; i < g.getContM(); i++) {
            MovimientoInventario m = g.getMovimientos()[i];
            int k = tienda.getJuguetes().posCategoria(m.getCategoria());
            if (k != -1) {
                if (m.getDia() < desde.totalDias()) {
                    inicial[k] += m.getCantidad();
                } else if (m.getDia() <= hasta.totalDias() && m.getCantidad() > 0) {
                    entradas[k] += m.getCantidad();
                }
            }
        }
        GestionOrdenes go = tienda.getOrdenes();
        for (int i = 0; i < go.getCont(); i++) {
            Orden o = go.getOrdenes()[i];
            if (o.getEstado().equals("Finalizada") && o.getFechaCierre() != null) {
                for (int j = 0; j < 3; j++) {
                    if (o.getFechaCierre().totalDias() < desde.totalDias()) {
                        inicial[j] -= o.getVendidosCategoria()[j];
                    } else if (enPeriodo(o.getFechaCierre(), desde, hasta)) {
                        vendidos[j] += o.getVendidosCategoria()[j];
                    }
                }
            }
        }
        Object[][] filas = new Object[3][6];
        for (int i = 0; i < 3; i++) {
            int base = inicial[i] + entradas[i];
            String porcentaje = "N/D";
            if (base > 0 && inicial[i] >= 0 && vendidos[i] <= base) {
                porcentaje = String.format("%.2f%%", 100.0 * vendidos[i] / base);
            }
            filas[i] = new Object[]{categorias[i], inicial[i], entradas[i], base, vendidos[i], porcentaje};
        }
        return filas;
    }

    public Object[][] ingresos(Fecha desde, Fecha hasta) {
        double juguetes = 0, servicios = 0, paquetes = 0, envio = 0, igv = 0;
        GestionOrdenes g = tienda.getOrdenes();
        for (int i = 0; i < g.getCont(); i++) {
            Orden o = g.getOrdenes()[i];
            if (finalizadaEn(o, desde, hasta)) {
                juguetes += o.totalJuguetes() - o.descuento();
                servicios += o.totalServicios();
                paquetes += o.totalPaquetes();
                envio += o.getCostoEnvio();
                igv += o.calcularIGV();
            }
        }
        return new Object[][]{
            {"Juguetes (neto del descuento)", String.format("%.2f", juguetes)},
            {"Servicios", String.format("%.2f", servicios)},
            {"Paquetes", String.format("%.2f", paquetes)},
            {"Envio", String.format("%.2f", envio)},
            {"Subtotal sin IGV", String.format("%.2f", juguetes + servicios + paquetes + envio)},
            {"IGV", String.format("%.2f", igv)},
            {"Total facturable", String.format("%.2f", juguetes + servicios + paquetes + envio + igv)}
        };
    }

    private int buscarPersona(String dni, String[] dnis, int cont) {
        for (int i = 0; i < cont; i++) {
            if (dnis[i].equals(dni)) {
                return i;
            }
        }
        return -1;
    }

    public Object[][] productividad(Fecha desde, Fecha hasta) {
        GestionEmpleados ge = tienda.getEmpleados();
        GestionOrdenes go = tienda.getOrdenes();
        int capacidad = ge.getCont() + go.getCont() * 2;
        String[] dnis = new String[capacidad];
        String[] nombres = new String[capacidad];
        String[] roles = new String[capacidad];
        int[] registradas = new int[capacidad];
        int[] verificadas = new int[capacidad];
        int[] paquetes = new int[capacidad];
        int cont = 0;
        for (int i = 0; i < ge.getCont(); i++) {
            Empleado e = ge.getEmpleados()[i];
            if (e.getRol().equals("Vendedor") || e.getRol().equals("Almacenero")) {
                dnis[cont] = e.getDni();
                nombres[cont] = String.format("%s %s", e.getNombres(), e.getApellidos());
                roles[cont] = e.getRol();
                cont++;
            }
        }
        for (int i = 0; i < go.getCont(); i++) {
            Orden o = go.getOrdenes()[i];
            Empleado v = o.getVendedor();
            if (v != null && enPeriodo(o.getFechaRegistro(), desde, hasta)) {
                int k = buscarPersona(v.getDni(), dnis, cont);
                if (k == -1) {
                    k = cont;
                    dnis[cont] = v.getDni();
                    nombres[cont] = String.format("%s %s", v.getNombres(), v.getApellidos());
                    roles[cont] = "Vendedor";
                    cont++;
                }
                registradas[k]++;
            }
            Empleado a = o.getAlmacenero();
            if (a != null) {
                for (int j = 0; j < o.getContH(); j++) {
                    HistorialOrden h = o.getHistorial()[j];
                    if (h.getEstadoNuevo().equals("En Preparacion") && enPeriodo(h.getFecha(), desde, hasta)) {
                        int k = buscarPersona(a.getDni(), dnis, cont);
                        if (k == -1) {
                            k = cont;
                            dnis[cont] = a.getDni();
                            nombres[cont] = String.format("%s %s", a.getNombres(), a.getApellidos());
                            roles[cont] = "Almacenero";
                            cont++;
                        }
                        verificadas[k]++;
                        for (int z = 0; z < o.getContD(); z++) {
                            DetalleOrden d = o.getDetalles()[z];
                            if (d.getTipo().equals("Paquete")) {
                                paquetes[k] += d.getCantidad();
                            }
                        }
                        break;
                    }
                }
            }
        }
        Object[][] filas = new Object[cont][6];
        for (int i = 0; i < cont; i++) {
            filas[i] = new Object[]{dnis[i], nombres[i], roles[i], registradas[i], verificadas[i], paquetes[i]};
        }
        return filas;
    }

    public Object[][] clientes(Fecha desde, Fecha hasta) {
        GestionClientes gc = tienda.getClientes();
        GestionOrdenes go = tienda.getOrdenes();
        int capacidad = gc.getCont() + go.getCont();
        String[] dnis = new String[capacidad];
        String[] nombres = new String[capacidad];
        int[] compras = new int[capacidad];
        int cont = 0;
        for (int i = 0; i < gc.getCont(); i++) {
            Cliente c = gc.getClientes()[i];
            dnis[cont] = c.getDni();
            nombres[cont] = String.format("%s %s", c.getNombres(), c.getApellidos());
            cont++;
        }
        for (int i = 0; i < go.getCont(); i++) {
            Orden o = go.getOrdenes()[i];
            if (finalizadaEn(o, desde, hasta)) {
                Cliente c = o.getCliente();
                int k = buscarPersona(c.getDni(), dnis, cont);
                if (k == -1) {
                    k = cont;
                    dnis[cont] = c.getDni();
                    nombres[cont] = String.format("%s %s", c.getNombres(), c.getApellidos());
                    cont++;
                }
                compras[k]++;
            }
        }
        for (int i = 0; i < cont; i++) {
            for (int j = i + 1; j < cont; j++) {
                if (compras[i] < compras[j]) {
                    int aux = compras[i];
                    compras[i] = compras[j];
                    compras[j] = aux;
                    String texto = dnis[i];
                    dnis[i] = dnis[j];
                    dnis[j] = texto;
                    texto = nombres[i];
                    nombres[i] = nombres[j];
                    nombres[j] = texto;
                }
            }
        }
        Object[][] filas = new Object[cont][3];
        for (int i = 0; i < cont; i++) {
            filas[i] = new Object[]{dnis[i], nombres[i], compras[i]};
        }
        return filas;
    }
}
