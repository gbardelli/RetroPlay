package retroplaymanager;

public class Paquete implements Agregable {

    private String nombre;
    private double precioPromocional;
    private Juguete[] juguetes;
    private int contJ;
    private Servicio[] servicios;
    private int contS;

    public Paquete(String nombre, double precioPromocional) {
        this.nombre = nombre;
        this.precioPromocional = precioPromocional;
        juguetes = new Juguete[10];
        servicios = new Servicio[10];
        contJ = 0;
        contS = 0;
    }

    public boolean agregarJuguete(Juguete obj) {
        if (contJ >= juguetes.length) {
            return false;
        }
        for (int i = 0; i < contJ; i++) {
            if (juguetes[i].getCodigo().equals(obj.getCodigo())) {
                return false;
            }
        }
        juguetes[contJ] = obj;
        contJ++;
        return true;
    }

    public boolean agregarServicio(Servicio obj) {
        if (contS >= servicios.length) {
            return false;
        }
        for (int i = 0; i < contS; i++) {
            if (servicios[i].getCodigo().equals(obj.getCodigo())) {
                return false;
            }
        }
        servicios[contS] = obj;
        contS++;
        return true;
    }

    public String lista() {
        String texto = "";
        for (int i = 0; i < contJ; i++) {
            texto = texto + juguetes[i].getNombre();
            if (i < contJ - 1 || contS > 0) {
                texto = texto + ", ";
            }
        }
        for (int i = 0; i < contS; i++) {
            texto = texto + servicios[i].getNombre();
            if (i < contS - 1) {
                texto = texto + ", ";
            }
        }
        return texto;
    }

    @Override
    public double precioUnitario() {
        return precioPromocional;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioPromocional() {
        return precioPromocional;
    }

    public void setPrecioPromocional(double precioPromocional) {
        this.precioPromocional = precioPromocional;
    }

    public Juguete[] getJuguetes() {
        return juguetes;
    }

    public int getContJ() {
        return contJ;
    }

    public Servicio[] getServicios() {
        return servicios;
    }

    public int getContS() {
        return contS;
    }
}
