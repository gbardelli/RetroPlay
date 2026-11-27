package retroplaymanager.apariencia;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Rectangle;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JList;
import javax.swing.plaf.basic.BasicArrowButton;
import javax.swing.plaf.basic.BasicComboBoxUI;

public class ListaCombo extends BasicComboBoxUI {

    public void paint(Graphics g, JComponent c) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(Paleta.CAMPO);
        g2.fillRoundRect(1, 1, c.getWidth() - 3, c.getHeight() - 3, 8, 8);
        g2.dispose();
        super.paint(g, c);
    }

    public void paintCurrentValueBackground(Graphics g, Rectangle bounds, boolean hasFocus) {
    }

    protected JButton createArrowButton() {
        JButton flecha = new BasicArrowButton(BasicArrowButton.SOUTH, Paleta.CAMPO, Paleta.CAMPO, Paleta.TINTA, Paleta.CAMPO);
        flecha.setBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0));
        return flecha;
    }

    public void configureArrowButton() {
        super.configureArrowButton();
        if (arrowButton != null) {
            arrowButton.setBackground(Paleta.CAMPO);
        }
    }

    protected javax.swing.ListCellRenderer<Object> createRenderer() {
        return new Renderer();
    }

    private static class Renderer extends javax.swing.DefaultListCellRenderer {

        public Component getListCellRendererComponent(JList<?> lista, Object valor, int indice, boolean seleccionado, boolean foco) {
            super.getListCellRendererComponent(lista, valor, indice, seleccionado, foco);
            setFont(Fuentes.texto(13, false));
            setOpaque(true);
            if (seleccionado) {
                setBackground(Paleta.SELECCION);
            } else {
                setBackground(Paleta.CAMPO);
            }
            setForeground(Paleta.TINTA);
            return this;
        }
    }
}
