package retroplaymanager.apariencia;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.BorderFactory;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JViewport;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

public class EstiloTabla {

    private EstiloTabla() {
    }

    public static void aplicar(JTable tabla) {
        tabla.setFont(Fuentes.texto(13, false));
        tabla.setForeground(Paleta.TINTA);
        tabla.setBackground(Paleta.TABLA);
        tabla.setSelectionBackground(Paleta.SELECCION);
        tabla.setSelectionForeground(Paleta.TINTA);
        tabla.setRowHeight(32);
        tabla.setShowHorizontalLines(false);
        tabla.setShowVerticalLines(false);
        tabla.setGridColor(Paleta.LINEA);
        tabla.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tabla.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        javax.swing.table.JTableHeader cabeza = tabla.getTableHeader();
        java.awt.FontMetrics medida = cabeza.getFontMetrics(cabeza.getFont());
        for (int i = 0; i < tabla.getColumnCount(); i++) {
            String titulo = tabla.getColumnName(i);
            int ancho = medida.stringWidth(titulo) + 24;
            if (ancho < 72) {
                ancho = 72;
            }
            boolean dinero = titulo.equals("Total") || titulo.equals("Adelanto") || titulo.equals("Saldo") || titulo.equals("Subtotal") || titulo.equals("Importe S/") || titulo.startsWith("Precio");
            if (dinero && ancho < 84) {
                ancho = 84;
            }
            tabla.getColumnModel().getColumn(i).setMinWidth(ancho);
            tabla.getColumnModel().getColumn(i).setPreferredWidth(ancho);
        }
        Container padre = tabla.getParent();
        if (padre instanceof JViewport && padre.getParent() instanceof JScrollPane) {
            JScrollPane panel = (JScrollPane) padre.getParent();
            int ancho = tabla.getPreferredSize().width + 18;
            if (ancho > 960) {
                ancho = 960;
            }
            int alto = panel.getPreferredSize().height;
            if (alto < 280) {
                alto = 320;
            }
            panel.setPreferredSize(new Dimension(ancho, alto));
        }
        tabla.getTableHeader().setFont(Fuentes.texto(12, true));
        tabla.getTableHeader().setBackground(Paleta.ENCABEZADO);
        tabla.getTableHeader().setForeground(Paleta.SECUNDARIO);
        tabla.getTableHeader().setReorderingAllowed(false);
        tabla.getTableHeader().setDefaultRenderer(new Encabezado());
        tabla.setDefaultRenderer(Object.class, new Fila());
    }

    private static class Encabezado extends DefaultTableCellRenderer {

        public Component getTableCellRendererComponent(JTable origen, Object valor, boolean seleccionado, boolean enfocado, int fila, int columna) {
            super.getTableCellRendererComponent(origen, valor, false, false, fila, columna);
            setBackground(Paleta.ENCABEZADO);
            setForeground(Paleta.AMBAR);
            setFont(Fuentes.texto(12, true));
            setBorder(BorderFactory.createCompoundBorder(
                    BorderFactory.createMatteBorder(0, 0, 1, 0, Paleta.LINEA),
                    BorderFactory.createEmptyBorder(6, 8, 6, 8)));
            setHorizontalAlignment(SwingConstants.LEFT);
            return this;
        }
    }

    private static class Fila extends DefaultTableCellRenderer {

        private String texto = "";
        private boolean numero;

        public Component getTableCellRendererComponent(JTable origen, Object valor, boolean seleccionado, boolean enfocado, int fila, int columna) {
            super.getTableCellRendererComponent(origen, valor, seleccionado, false, fila, columna);
            texto = valor == null ? "" : valor.toString();
            String columnaNombre = origen.getColumnName(columna);
            numero = Segmentos.esNumero(texto) && (Segmentos.tieneDecimales(texto) || columnaNombre.equals("Stock") || columnaNombre.equals("Cantidad"));
            setText(numero ? "" : texto);
            if (seleccionado) {
                setBackground(Paleta.SELECCION);
            } else if (fila % 2 == 1) {
                setBackground(Paleta.TABLA_ALTA);
            } else {
                setBackground(Paleta.TABLA);
            }
            setForeground(Paleta.TINTA);
            setFont(Fuentes.texto(13, false));
            setBorder(BorderFactory.createEmptyBorder(0, 8, 0, 8));
            return this;
        }

        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            if (!numero || texto.length() == 0) {
                return;
            }
            Graphics2D g2 = (Graphics2D) g.create();
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            int alto = 13;
            int disponible = Math.max(8, getWidth() - 12);
            int ancho = Segmentos.ancho(texto, alto);
            if (ancho > disponible && ancho > 0) {
                alto = Math.max(8, alto * disponible / ancho);
            }
            int x = 8;
            int y = Math.max(2, (getHeight() - alto) / 2);
            Segmentos.dibujar(g2, texto, x, y, alto);
            g2.dispose();
        }
    }
}
