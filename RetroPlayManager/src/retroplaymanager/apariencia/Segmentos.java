package retroplaymanager.apariencia;

import java.awt.BasicStroke;
import java.awt.Graphics2D;
import java.awt.Stroke;

public class Segmentos {

    private Segmentos() {
    }

    public static boolean esNumero(String texto) {
        if (texto == null || texto.length() == 0) {
            return false;
        }
        int digitos = 0;
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (c >= '0' && c <= '9') {
                digitos++;
            } else if (c != '.' && c != ',' && c != '-' && c != ' ' && c != '%') {
                return false;
            }
        }
        return digitos > 0;
    }

    public static boolean tieneDecimales(String texto) {
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == '.' || texto.charAt(i) == ',') {
                return true;
            }
        }
        return false;
    }

    public static void dibujar(Graphics2D g, String texto, int x, int y, int alto) {
        int h = alto;
        int w = (int) (h * 0.6);
        int avance = w + 6;
        float grosor = Math.max(2f, h / 7f);
        Stroke antes = g.getStroke();
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (c == ' ') {
                x += avance / 2;
            } else if (c == '.' || c == ',') {
                g.setColor(Paleta.VERDE);
                g.fillOval(x, y + h - 2, 4, 4);
                x += 8;
            } else if (c == '-') {
                g.setStroke(new BasicStroke(grosor, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
                g.setColor(Paleta.VERDE);
                segmento(g, x + 2, y + h / 2, w - 4, true);
                x += avance;
            } else if (c >= '0' && c <= '9') {
                g.setStroke(new BasicStroke(grosor, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
                g.setColor(Paleta.VERDE_APAGADO);
                digito(g, '8', x, y, w, h);
                g.setStroke(new BasicStroke(grosor + 3f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
                g.setColor(Paleta.VERDE_HALO);
                digito(g, c, x, y, w, h);
                g.setStroke(new BasicStroke(grosor, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
                g.setColor(Paleta.VERDE);
                digito(g, c, x, y, w, h);
                x += avance;
            }
        }
        g.setStroke(antes);
    }

    public static int ancho(String texto, int alto) {
        int h = alto;
        int w = (int) (h * 0.6);
        int total = 0;
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (c == ' ') {
                total += (w + 6) / 2;
            } else if (c == '.' || c == ',') {
                total += 8;
            } else {
                total += w + 6;
            }
        }
        return total;
    }

    private static void digito(Graphics2D g, char c, int x, int y, int w, int h) {
        boolean[] s = segmentos(c);
        int medio = y + h / 2;
        if (s[0]) {
            segmento(g, x + 2, y, w - 4, true);
        }
        if (s[1]) {
            segmento(g, x, y + 2, h / 2 - 3, false);
        }
        if (s[2]) {
            segmento(g, x + w, y + 2, h / 2 - 3, false);
        }
        if (s[3]) {
            segmento(g, x + 2, medio, w - 4, true);
        }
        if (s[4]) {
            segmento(g, x, medio + 2, h / 2 - 3, false);
        }
        if (s[5]) {
            segmento(g, x + w, medio + 2, h / 2 - 3, false);
        }
        if (s[6]) {
            segmento(g, x + 2, y + h, w - 4, true);
        }
    }

    private static void segmento(Graphics2D g, int x, int y, int largo, boolean horizontal) {
        if (horizontal) {
            g.drawLine(x, y, x + largo, y);
        } else {
            g.drawLine(x, y, x, y + largo);
        }
    }

    private static boolean[] segmentos(char c) {
        if (c == '0') {
            return new boolean[] {true, true, true, false, true, true, true};
        }
        if (c == '1') {
            return new boolean[] {false, false, true, false, false, true, false};
        }
        if (c == '2') {
            return new boolean[] {true, false, true, true, true, false, true};
        }
        if (c == '3') {
            return new boolean[] {true, false, true, true, false, true, true};
        }
        if (c == '4') {
            return new boolean[] {false, true, true, true, false, true, false};
        }
        if (c == '5') {
            return new boolean[] {true, true, false, true, false, true, true};
        }
        if (c == '6') {
            return new boolean[] {true, true, false, true, true, true, true};
        }
        if (c == '7') {
            return new boolean[] {true, false, true, false, false, true, false};
        }
        if (c == '9') {
            return new boolean[] {true, true, true, true, false, true, true};
        }
        return new boolean[] {true, true, true, true, true, true, true};
    }
}
