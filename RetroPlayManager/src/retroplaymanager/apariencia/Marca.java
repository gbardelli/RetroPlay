package retroplaymanager.apariencia;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.AffineTransform;
import javax.swing.JPanel;

public class Marca extends JPanel {

    private static final Color EXTRUSION = new Color(150, 74, 22);
    private static final Color EXTRUSION_FONDO = new Color(84, 40, 14);

    public Marca() {
        setOpaque(false);
    }

    public Dimension getPreferredSize() {
        return new Dimension(420, 104);
    }

    public Dimension getMinimumSize() {
        return getPreferredSize();
    }

    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        Font inclinada = Fuentes.texto(46, true).deriveFont(AffineTransform.getShearInstance(-0.22, 0));
        g2.setFont(inclinada);
        FontMetrics medida = g2.getFontMetrics();
        String titulo = "RETROPLAY";
        int espacio = 3;
        int total = 0;
        for (int i = 0; i < titulo.length(); i++) {
            total = total + medida.charWidth(titulo.charAt(i)) + espacio;
        }
        total = total - espacio;
        int x0 = Math.max(0, (getWidth() - total) / 2);
        int y0 = 54;
        for (int capa = 6; capa >= 1; capa--) {
            if (capa > 3) {
                g2.setColor(EXTRUSION_FONDO);
            } else {
                g2.setColor(EXTRUSION);
            }
            dibujarLetras(g2, titulo, x0 + capa, y0 + capa, medida, espacio);
        }
        g2.setColor(Paleta.AMBAR);
        dibujarLetras(g2, titulo, x0, y0, medida, espacio);
        g2.setColor(new Color(255, 232, 170, 150));
        dibujarLetras(g2, titulo, x0, y0 - 1, medida, espacio);
        g2.setColor(Paleta.AMBAR);
        dibujarLetras(g2, titulo, x0, y0, medida, espacio);
        g2.setFont(Fuentes.texto(12, true));
        FontMetrics medidaSub = g2.getFontMetrics();
        String sub = "TIENDA DE JUGUETES VINTAGE";
        int anchoSub = 0;
        for (int i = 0; i < sub.length(); i++) {
            anchoSub = anchoSub + medidaSub.charWidth(sub.charAt(i)) + 2;
        }
        g2.setColor(Paleta.SECUNDARIO);
        dibujarLetras(g2, sub, Math.max(0, (getWidth() - anchoSub) / 2), 92, medidaSub, 2);
        g2.dispose();
    }

    private void dibujarLetras(Graphics2D g2, String texto, int x, int y, FontMetrics medida, int espacio) {
        int actual = x;
        for (int i = 0; i < texto.length(); i++) {
            g2.drawString(String.valueOf(texto.charAt(i)), actual, y);
            actual = actual + medida.charWidth(texto.charAt(i)) + espacio;
        }
    }
}
