package retroplaymanager;

public class GestionJuguetes {

    private Juguete[] juguetes;
    private int cont;
    private MovimientoInventario[] movimientos = new MovimientoInventario[5000];
    private int contM = 0;

    public GestionJuguetes() {
        juguetes = new Juguete[50];
        cont = 0;
    }

    public boolean registrar(Juguete obj, Fecha fecha) {
        if (cont >= juguetes.length) {
            return false;
        }
        if (buscarPorCodigo(obj.getCodigo()) != -1) {
            return false;
        }
        if (fecha == null || obj.getStock() < 0 || !registrarMovimiento(obj.getCategoria(), obj.getStock(), fecha)) {
            return false;
        }
        juguetes[cont] = obj;
        cont++;
        return true;
    }

    public int buscarPorCodigo(String codigo) {
        for (int i = 0; i < cont; i++) {
            if (juguetes[i].getCodigo().equals(codigo)) {
                return i;
            }
        }
        return -1;
    }

    public boolean codigoLibre(String codigo, int excepto) {
        for (int i = 0; i < cont; i++) {
            if (i != excepto && juguetes[i].getCodigo().equals(codigo)) {
                return false;
            }
        }
        return true;
    }

    public boolean registrarMovimiento(String categoria, int cantidad, Fecha fecha) {
        if (cantidad == 0) {
            return true;
        }
        if (fecha == null || contM >= movimientos.length) {
            return false;
        }
        movimientos[contM] = new MovimientoInventario(categoria, cantidad, fecha);
        contM++;
        return true;
    }

    public MovimientoInventario[] getMovimientos() {
        return movimientos;
    }

    public int getContM() {
        return contM;
    }

    public boolean modificar(int pos, Juguete nuevo, Fecha fecha) {
        if (fecha == null || nuevo.getStock() < 0 || contM + 2 > movimientos.length) {
            return false;
        }
        Juguete anterior = juguetes[pos];
        if (anterior.getCategoria().equals(nuevo.getCategoria())) {
            registrarMovimiento(nuevo.getCategoria(), nuevo.getStock() - anterior.getStock(), fecha);
        } else {
            registrarMovimiento(anterior.getCategoria(), -anterior.getStock(), fecha);
            registrarMovimiento(nuevo.getCategoria(), nuevo.getStock(), fecha);
        }
        juguetes[pos] = nuevo;
        return true;
    }

    public boolean actualizarStock(int pos, int stock, Fecha fecha) {
        if (stock < 0 || fecha == null || !registrarMovimiento(juguetes[pos].getCategoria(), stock - juguetes[pos].getStock(), fecha)) {
            return false;
        }
        juguetes[pos].setStock(stock);
        juguetes[pos].setFecha(fecha.texto());
        return true;
    }

    public boolean eliminar(int pos, Fecha fecha) {
        if (fecha == null || !registrarMovimiento(juguetes[pos].getCategoria(), -juguetes[pos].getStock(), fecha)) {
            return false;
        }
        eliminar(pos);
        return true;
    }

    private void eliminar(int pos) {
        for (int i = pos; i < cont - 1; i++) {
            juguetes[i] = juguetes[i + 1];
        }
        cont--;
    }

    public int posCategoria(String categoria) {
        if (categoria.equals("Figura de Accion")) {
            return 0;
        }
        if (categoria.equals("Consola Retro")) {
            return 1;
        }
        if (categoria.equals("Juego de Mesa")) {
            return 2;
        }
        return -1;
    }

    public int consultar(String estado, Fecha fecha, Juguete[] destino) {
        int n = 0;
        for (int i = 0; i < cont; i++) {
            boolean okEstado = estado.equals("") || juguetes[i].getEstado().equals(estado);
            boolean okFecha = fecha == null || juguetes[i].getFecha().equals(fecha.texto());
            if (okEstado && okFecha) {
                destino[n] = juguetes[i];
                n++;
            }
        }
        return n;
    }

    public Juguete crear(String categoria, String codigo, String nombre, int anio, double precioBase, int stock, String estado, String fecha) {
        if (categoria.equals("Figura de Accion")) {
            return new FiguraAccion(codigo, nombre, anio, precioBase, stock, estado, fecha);
        }
        if (categoria.equals("Consola Retro")) {
            return new ConsolaRetro(codigo, nombre, anio, precioBase, stock, estado, fecha);
        }
        if (categoria.equals("Juego de Mesa")) {
            return new JuegoMesa(codigo, nombre, anio, precioBase, stock, estado, fecha);
        }
        return null;
    }

    public Juguete[] getJuguetes() {
        return juguetes;
    }

    public void setJuguetes(Juguete[] juguetes) {
        this.juguetes = juguetes;
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }
}
