package retroplaymanager.apariencia;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.plaf.basic.BasicPasswordFieldUI;

public class CampoClave extends BasicPasswordFieldUI {

    protected void paintBackground(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(Paleta.CAMPO);
        g2.fillRoundRect(1, 1, getComponent().getWidth() - 3, getComponent().getHeight() - 3, 8, 8);
        g2.dispose();
    }
}
