package retroplaymanager.apariencia;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.plaf.basic.BasicScrollBarUI;

public class BarraScroll extends BasicScrollBarUI {

    protected void configureScrollBarColors() {
        super.configureScrollBarColors();
        thumbColor = Paleta.BOTON_ARRIBA;
        trackColor = Paleta.TABLA;
    }

    protected JButton createDecreaseButton(int orientacion) {
        return vacio();
    }

    protected JButton createIncreaseButton(int orientacion) {
        return vacio();
    }

    private JButton vacio() {
        JButton boton = new JButton();
        boton.setPreferredSize(new Dimension(0, 0));
        return boton;
    }

    protected void paintTrack(Graphics g, JComponent c, Rectangle zona) {
        g.setColor(Paleta.TABLA);
        g.fillRect(zona.x, zona.y, zona.width, zona.height);
    }

    protected void paintThumb(Graphics g, JComponent c, Rectangle zona) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(Paleta.BOTON_ARRIBA);
        g2.fillRoundRect(zona.x + 2, zona.y + 2, zona.width - 4, zona.height - 4, 8, 8);
        g2.dispose();
    }

    public Dimension getPreferredSize(JComponent c) {
        return new Dimension(12, 12);
    }
}
