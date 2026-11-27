package retroplaymanager;

public class GestionEmpleados {

    private Reglas reglas = new Reglas();
    private Empleado[] empleados;
    private int cont;
    private String[] roles;

    public GestionEmpleados() {
        empleados = new Empleado[30];
        cont = 0;
        roles = new String[]{"Administrador", "Vendedor", "Almacenero"};
    }

    public boolean rolValido(String rol) {
        for (int i = 0; i < roles.length; i++) {
            if (roles[i].equals(rol)) {
                return true;
            }
        }
        return false;
    }

    public String validar(String dni, String nombres, String apellidos, String usuario, String clave) {
        if (!reglas.soloDigitos(dni, 8)) {
            return "El DNI debe tener 8 digitos";
        }
        if (!reglas.soloLetras(nombres)) {
            return "Los nombres solo pueden tener letras";
        }
        if (!reglas.soloLetras(apellidos)) {
            return "Los apellidos solo pueden tener letras";
        }
        if (usuario.length() < 3) {
            return "El usuario debe tener al menos 3 caracteres";
        }
        if (clave.length() < 4) {
            return "La clave debe tener al menos 4 caracteres";
        }
        return "";
    }

    public String[] getRoles() {
        return roles;
    }

    public boolean registrar(Empleado obj) {
        if (cont >= empleados.length) {
            return false;
        }
        if (buscarPorDni(obj.getDni()) != -1) {
            return false;
        }
        if (buscarPorUsuario(obj.getUsuario()) != -1) {
            return false;
        }
        empleados[cont] = obj;
        cont++;
        return true;
    }

    public int buscarPorDni(String dni) {
        for (int i = 0; i < cont; i++) {
            if (empleados[i].getDni().equals(dni)) {
                return i;
            }
        }
        return -1;
    }

    public int buscarPorUsuario(String usuario) {
        for (int i = 0; i < cont; i++) {
            if (empleados[i].getUsuario().equals(usuario)) {
                return i;
            }
        }
        return -1;
    }

    public boolean dniLibre(String dni, int excepto) {
        for (int i = 0; i < cont; i++) {
            if (i != excepto && empleados[i].getDni().equals(dni)) {
                return false;
            }
        }
        return true;
    }

    public boolean usuarioLibre(String usuario, int excepto) {
        for (int i = 0; i < cont; i++) {
            if (i != excepto && empleados[i].getUsuario().equals(usuario)) {
                return false;
            }
        }
        return true;
    }

    public void eliminar(int pos) {
        for (int i = pos; i < cont - 1; i++) {
            empleados[i] = empleados[i + 1];
        }
        cont--;
        empleados[cont] = null;
    }

    public Empleado ingresar(String usuario, String contrasena) {
        for (int i = 0; i < cont; i++) {
            if (empleados[i].getUsuario().equals(usuario) && empleados[i].getContrasena().equals(contrasena)) {
                return empleados[i];
            }
        }
        return null;
    }

    public Empleado[] getEmpleados() {
        return empleados;
    }

    public void setEmpleados(Empleado[] empleados) {
        this.empleados = empleados;
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }
}
