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
        int letras = 0;
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            boolean esLetra = (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= 192 && c <= 255);
            if (esLetra) {
                letras++;
            } else if (c != ' ' && c != '\'') {
                return false;
            }
        }
        return letras > 0;
    }

    public boolean correoValido(String correo) {
        int arrobas = 0;
        int posArroba = -1;
        int posPunto = -1;
        for (int i = 0; i < correo.length(); i++) {
            char c = correo.charAt(i);
            if (c == ' ') {
                return false;
            }
            if (c == '@') {
                arrobas++;
                posArroba = i;
            }
            if (c == '.') {
                posPunto = i;
            }
        }
        if (arrobas != 1 || posArroba < 1) {
            return false;
        }
        return posPunto > posArroba + 1 && posPunto < correo.length() - 1;
    }
}
