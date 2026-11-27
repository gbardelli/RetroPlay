package retroplaymanager;

public class Reglas {

    public boolean soloDigitos(String texto, int cantidad) {
        if (texto.length() != cantidad) {
            return false;
        }
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }
        }
        return true;
    }

    public boolean soloLetras(String texto) {
        if (texto.trim().length() == 0) {
            return false;
        }
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (!Character.isLetter(c) && c != ' ' && c != '\'') {
                return false;
            }
        }
        return true;
    }

    public boolean correoValido(String correo) {
        int arroba = correo.indexOf("@");
        int punto = correo.lastIndexOf(".");
        if (arroba < 1 || correo.indexOf("@", arroba + 1) != -1) {
            return false;
        }
        if (correo.indexOf(" ") != -1) {
            return false;
        }
        return punto > arroba + 1 && punto < correo.length() - 1;
    }
}
