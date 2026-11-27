package retroplaymanager;

public class GestionPaquetes {

    private Paquete[] paquetes;
    private int cont;

    public GestionPaquetes() {
        paquetes = new Paquete[20];
        cont = 0;
    }

    public String validarPrecio(double precio) {
        if (precio <= 0) {
            return "El precio debe ser mayor a cero";
        }
        return "";
    }

    public boolean registrar(Paquete obj) {
        if (cont >= paquetes.length) {
            return false;
        }
        if (buscarPorNombre(obj.getNombre()) != -1) {
            return false;
        }
        paquetes[cont] = obj;
        cont++;
        return true;
    }

    public int buscarPorNombre(String nombre) {
        for (int i = 0; i < cont; i++) {
            if (paquetes[i].getNombre().equals(nombre)) {
                return i;
            }
        }
        return -1;
    }

    public void eliminar(int pos) {
        for (int i = pos; i < cont - 1; i++) {
            paquetes[i] = paquetes[i + 1];
        }
        cont--;
        paquetes[cont] = null;
    }

    public Paquete[] getPaquetes() {
        return paquetes;
    }

    public void setPaquetes(Paquete[] paquetes) {
        this.paquetes = paquetes;
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }
}
