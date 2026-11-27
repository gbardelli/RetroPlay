package retroplaymanager.apariencia;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;

public class Lienzo extends JPanel {

    private static BufferedImage grano;

    public Lienzo() {
        setOpaque(true);
        setBackground(Paleta.LIENZO);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (grano == null) {
            grano = crearGrano();
        }
        for (int y = 0; y < getHeight(); y = y + grano.getHeight()) {
            for (int x = 0; x < getWidth(); x = x + grano.getWidth()) {
                g.drawImage(grano, x, y, null);
            }
        }
    }

    private static BufferedImage crearGrano() {
        BufferedImage imagen = new BufferedImage(64, 64, BufferedImage.TYPE_INT_ARGB);
        for (int y = 0; y < 64; y++) {
            for (int x = 0; x < 64; x++) {
                int v = (x * 17 + y * 31) % 18;
                imagen.setRGB(x, y, (v << 24) | 0x00ffffff);
            }
        }
        return imagen;
    }
}
