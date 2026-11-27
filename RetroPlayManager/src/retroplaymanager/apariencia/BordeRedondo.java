package retroplaymanager.apariencia;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.RenderingHints;
import javax.swing.border.AbstractBorder;

public class BordeRedondo extends AbstractBorder {

    private Color relleno;
    private Color linea;
    private int arco;
    private Insets margen;

    public BordeRedondo(Color relleno, Color linea, int arco, int arriba, int izquierda, int abajo, int derecha) {
        this.relleno = relleno;
        this.linea = linea;
        this.arco = arco;
        this.margen = new Insets(arriba, izquierda, abajo, derecha);
    }

    public void paintBorder(Component c, Graphics g, int x, int y, int w, int h) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(linea);
        g2.drawRoundRect(x + 1, y + 1, w - 3, h - 3, arco, arco);
        g2.dispose();
    }

    public Insets getBorderInsets(Component c) {
        return margen;
    }

    public Insets getBorderInsets(Component c, Insets insets) {
        insets.top = margen.top;
        insets.left = margen.left;
        insets.bottom = margen.bottom;
        insets.right = margen.right;
        return insets;
    }

    public boolean isBorderOpaque() {
        return false;
    }
}
