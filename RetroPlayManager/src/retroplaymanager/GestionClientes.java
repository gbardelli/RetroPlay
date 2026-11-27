package retroplaymanager;

public class GestionClientes {

    private Reglas reglas = new Reglas();
    private Cliente[] clientes;
    private int cont;

    public GestionClientes() {
        clientes = new Cliente[50];
        cont = 0;
    }

    public String validar(String dni, String nombres, String apellidos, String telefono, String correo) {
        if (!reglas.soloDigitos(dni, 8)) {
            return "El DNI debe tener 8 digitos";
        }
        if (!reglas.soloLetras(nombres)) {
            return "Los nombres solo pueden tener letras";
        }
        if (!reglas.soloLetras(apellidos)) {
            return "Los apellidos solo pueden tener letras";
        }
        if (!reglas.soloDigitos(telefono, 9)) {
            return "El telefono debe tener 9 digitos";
        }
        if (!reglas.correoValido(correo)) {
            return "El correo no es valido";
        }
        return "";
    }

    public boolean registrar(Cliente obj) {
        if (cont >= clientes.length) {
            return false;
        }
        if (buscarPorDni(obj.getDni()) != -1) {
            return false;
        }
        clientes[cont] = obj;
        cont++;
        return true;
    }

    public int buscarPorDni(String dni) {
        for (int i = 0; i < cont; i++) {
            if (clientes[i].getDni().equals(dni)) {
                return i;
            }
        }
        return -1;
    }

    public void eliminar(int pos) {
        for (int i = pos; i < cont - 1; i++) {
            clientes[i] = clientes[i + 1];
        }
        cont--;
        clientes[cont] = null;
    }

    public void sumarCompra(String dni) {
        int p = buscarPorDni(dni);
        if (p == -1) {
            return;
        }
        clientes[p].setCompras(clientes[p].getCompras() + 1);
        if (clientes[p].getCompras() >= 5 && clientes[p].getTipo().equals("Regular")) {
            Cliente viejo = clientes[p];
            clientes[p] = new Coleccionista(viejo.getDni(), viejo.getNombres(), viejo.getApellidos(), viejo.getTelefono(), viejo.getCorreo(), viejo.getCompras());
        }
    }

    public Cliente[] getClientes() {
        return clientes;
    }

    public void setClientes(Cliente[] clientes) {
        this.clientes = clientes;
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }
}
