package retroplaymanager.apariencia;

import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.io.InputStream;

public class Fuentes {

    private static Font regular;
    private static Font negrita;
    private static boolean lista;

    private Fuentes() {
    }

    public static void cargar() {
        if (lista) {
            return;
        }
        regular = leer("InstrumentSans-Regular.ttf");
        negrita = leer("InstrumentSans-SemiBold.ttf");
        if (regular == null) {
            regular = new Font("Segoe UI", Font.PLAIN, 14);
        }
        if (negrita == null) {
            negrita = new Font("Segoe UI", Font.BOLD, 14);
        }
        lista = true;
    }

    public static Font texto(int tamano, boolean fuerte) {
        cargar();
        Font base = fuerte ? negrita : regular;
        return base.deriveFont((float) tamano);
    }

    private static Font leer(String archivo) {
        InputStream datos = Fuentes.class.getResourceAsStream("fuentes/" + archivo);
        if (datos == null) {
            return null;
        }
        try {
            Font fuente = Font.createFont(Font.TRUETYPE_FONT, datos);
            GraphicsEnvironment.getLocalGraphicsEnvironment().registerFont(fuente);
            datos.close();
            return fuente;
        } catch (Exception e) {
            return null;
        }
    }
}
