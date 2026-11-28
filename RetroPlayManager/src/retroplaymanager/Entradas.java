package retroplaymanager;

import javax.swing.JComboBox;

public class Entradas {

    public String elegido(JComboBox<String> cbo) {
        if (cbo.getSelectedIndex() <= 0) {
            return "";
        }
        return (String) cbo.getSelectedItem();
    }

    public void seleccionar(JComboBox<String> cbo, String texto) {
        for (int i = 0; i < cbo.getItemCount(); i++) {
            if (cbo.getItemAt(i).equals(texto)) {
                cbo.setSelectedIndex(i);
                return;
            }
        }
        cbo.setSelectedIndex(0);
    }

    public void llenarDia(JComboBox<String> cbo) {
        for (int i = 1; i <= 31; i++) {
            cbo.addItem(String.format("%d", i));
        }
    }

    public void llenarMes(JComboBox<String> cbo) {
        for (int i = 1; i <= 12; i++) {
            cbo.addItem(String.format("%d", i));
        }
    }

    public void llenarAnio(JComboBox<String> cbo) {
        for (int i = 2025; i <= 2027; i++) {
            cbo.addItem(String.format("%d", i));
        }
    }

    public void llenarHora(JComboBox<String> cbo) {
        for (int i = 0; i <= 23; i++) {
            cbo.addItem(String.format("%d", i));
        }
    }

    public boolean esEntero(String texto) {
        int inicio = 0;
        if (texto.length() > 0 && texto.charAt(0) == '-') {
            inicio = 1;
        }
        int digitos = texto.length() - inicio;
        if (digitos < 1 || digitos > 9) {
            return false;
        }
        for (int i = inicio; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }
        }
        return true;
    }

    public boolean esDecimal(String texto) {
        int inicio = 0;
        if (texto.length() > 0 && texto.charAt(0) == '-') {
            inicio = 1;
        }
        int digitos = 0;
        int puntos = 0;
        for (int i = inicio; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (c == '.') {
                puntos++;
            } else if (c >= '0' && c <= '9') {
                digitos++;
            } else {
                return false;
            }
        }
        return digitos > 0 && puntos <= 1;
    }
}
