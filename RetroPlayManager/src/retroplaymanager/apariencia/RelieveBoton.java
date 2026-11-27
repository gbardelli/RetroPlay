package retroplaymanager.apariencia;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.AbstractButton;
import javax.swing.JComponent;
import javax.swing.plaf.basic.BasicButtonUI;

public class RelieveBoton extends BasicButtonUI {

    public static final int NORMAL = 0;
    public static final int PRINCIPAL = 1;
    public static final int PELIGRO = 2;

    private int tipo;

    public RelieveBoton(int tipo) {
        this.tipo = tipo;
    }

    public void installUI(JComponent c) {
        super.installUI(c);
        AbstractButton boton = (AbstractButton) c;
        boton.setOpaque(false);
        boton.setContentAreaFilled(false);
        boton.setBorderPainted(false);
        boton.setFocusPainted(false);
        boton.setRolloverEnabled(true);
        boton.setFont(Fuentes.texto(13, true));
        boton.setBorder(new javax.swing.border.EmptyBorder(9, 16, 11, 16));
        if (tipo == PRINCIPAL) {
            boton.setForeground(Paleta.PRINCIPAL_TINTA);
        } else if (tipo == PELIGRO) {
            boton.setForeground(Paleta.PELIGRO);
        } else {
            boton.setForeground(Paleta.TINTA);
        }
    }

    protected void paintText(Graphics g, AbstractButton boton, java.awt.Rectangle zona, String texto) {
        if (boton.isEnabled()) {
            super.paintText(g, boton, zona, texto);
            return;
        }
        java.awt.FontMetrics medida = g.getFontMetrics();
        g.setColor(Paleta.LINEA);
        g.drawString(texto, zona.x, zona.y + medida.getAscent());
    }

    public void paint(Graphics g, JComponent c) {
        AbstractButton boton = (AbstractButton) c;
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        int ancho = c.getWidth();
        int alto = c.getHeight();
        boolean hundido = boton.getModel().isPressed();
        boolean encima = boton.getModel().isRollover();
        Color arriba = Paleta.BOTON_ARRIBA;
        Color abajo = Paleta.BOTON_ABAJO;
        Color borde = Paleta.LINEA;
        if (tipo == PRINCIPAL) {
            arriba = Paleta.PRINCIPAL_ARRIBA;
            abajo = Paleta.PRINCIPAL_ABAJO;
            borde = Paleta.PRINCIPAL_ABAJO;
        } else if (tipo == PELIGRO) {
            borde = Paleta.PELIGRO_LINEA;
        }
        if (!boton.isEnabled()) {
            arriba = Paleta.PANEL;
            abajo = Paleta.PANEL;
            borde = Paleta.LINEA;
        }
        if (!hundido) {
            g2.setColor(Paleta.SOMBRA);
            g2.fillRoundRect(1, 3, ancho - 2, alto - 3, 12, 12);
            g2.setColor(abajo);
            g2.fillRoundRect(0, 0, ancho - 1, alto - 4, 12, 12);
            g2.setColor(arriba);
            g2.fillRoundRect(0, 0, ancho - 1, (alto - 4) / 2, 12, 12);
            g2.fillRect(0, (alto - 4) / 4, ancho - 1, (alto - 4) / 4);
            g2.setColor(borde);
            g2.drawRoundRect(0, 0, ancho - 2, alto - 5, 12, 12);
            g2.setColor(Paleta.LUZ);
            g2.drawLine(8, 1, ancho - 9, 1);
            if (encima) {
                g2.setColor(Paleta.LUZ);
                g2.fillRoundRect(0, 0, ancho - 1, alto - 4, 12, 12);
            }
        } else {
            g2.setColor(abajo);
            g2.fillRoundRect(0, 2, ancho - 1, alto - 3, 12, 12);
            g2.setColor(Paleta.SOMBRA);
            g2.drawRoundRect(0, 2, ancho - 2, alto - 4, 12, 12);
        }
        g2.dispose();
        super.paint(g, c);
    }
}
