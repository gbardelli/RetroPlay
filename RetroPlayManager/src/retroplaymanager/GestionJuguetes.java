package retroplaymanager;

public class GestionJuguetes {

    private Juguete[] juguetes;
    private int cont;

    public GestionJuguetes() {
        juguetes = new Juguete[50];
        cont = 0;
    }

    public boolean registrar(Juguete obj) {
        if (cont >= juguetes.length) {
            return false;
        }
        if (buscarPorCodigo(obj.getCodigo()) != -1) {
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

    public void eliminar(int pos) {
        for (int i = pos; i < cont - 1; i++) {
            juguetes[i] = juguetes[i + 1];
        }
        cont--;
    }

    public int consultar(String estado, String fecha, Juguete[] destino) {
        int n = 0;
        for (int i = 0; i < cont; i++) {
            boolean okEstado = estado.equals("") || juguetes[i].getEstado().equals(estado);
            boolean okFecha = fecha.equals("") || juguetes[i].getFecha().equals(fecha);
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
