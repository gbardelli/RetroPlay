package retroplaymanager;

public class GestionServicios {

    private Servicio[] servicios;
    private int cont;

    public GestionServicios() {
        servicios = new Servicio[30];
        cont = 0;
    }

    public String validar(double precio, int stock) {
        if (precio <= 0) {
            return "El precio debe ser mayor a cero";
        }
        if (stock < 0) {
            return "El stock no puede ser negativo";
        }
        return "";
    }

    public boolean registrar(Servicio obj) {
        if (cont >= servicios.length) {
            return false;
        }
        if (buscarPorCodigo(obj.getCodigo()) != -1) {
            return false;
        }
        servicios[cont] = obj;
        cont++;
        return true;
    }

    public int buscarPorCodigo(String codigo) {
        for (int i = 0; i < cont; i++) {
            if (servicios[i].getCodigo().equals(codigo)) {
                return i;
            }
        }
        return -1;
    }

    public boolean codigoLibre(String codigo, int excepto) {
        for (int i = 0; i < cont; i++) {
            if (i != excepto && servicios[i].getCodigo().equals(codigo)) {
                return false;
            }
        }
        return true;
    }

    public void eliminar(int pos) {
        for (int i = pos; i < cont - 1; i++) {
            servicios[i] = servicios[i + 1];
        }
        cont--;
        servicios[cont] = null;
    }

    public Servicio[] getServicios() {
        return servicios;
    }

    public void setServicios(Servicio[] servicios) {
        this.servicios = servicios;
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }
}
