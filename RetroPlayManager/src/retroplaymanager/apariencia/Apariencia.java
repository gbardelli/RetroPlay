package retroplaymanager.apariencia;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.border.Border;
import javax.swing.text.JTextComponent;

public class Apariencia {

    private Apariencia() {
    }

    public static void vestir(JFrame marco) {
        Fuentes.cargar();
        UIManager.put("ComboBox.selectionBackground", Paleta.CAMPO);
        UIManager.put("ComboBox.selectionForeground", Paleta.TINTA);
        Container viejo = marco.getContentPane();
        if (!(viejo instanceof Lienzo)) {
            Lienzo lienzo = new Lienzo();
            lienzo.setLayout(new BorderLayout());
            JPanel centro = new JPanel(new GridBagLayout());
            centro.setOpaque(false);
            centro.setBorder(BorderFactory.createEmptyBorder(12, 28, 32, 28));
            centro.add(viejo);
            marco.setContentPane(lienzo);
            lienzo.add(centro, BorderLayout.CENTER);
        }
        if (viejo instanceof JComponent) {
            JComponent hoja = (JComponent) viejo;
            hoja.setOpaque(false);
        }
        String titulo = marco.getTitle();
        if (titulo != null && titulo.startsWith("RetroPlay")) {
            marco.getContentPane().add(new Marca(), BorderLayout.NORTH);
        }
        recorrer(viejo, true, false);
        marco.getRootPane().setBackground(Paleta.LIENZO);
        marco.setBackground(Paleta.LIENZO);
        marco.pack();
        if (marco.getWidth() < 640) {
            marco.setSize(640, Math.max(marco.getHeight(), 460));
        }
        marco.setMinimumSize(marco.getSize());
        marco.setLocationRelativeTo(null);
    }

    private static void recorrer(Component pieza, boolean raiz, boolean titulos) {
        if (!raiz && pieza instanceof JPanel && !(pieza instanceof Lienzo)) {
            JPanel panel = (JPanel) pieza;
            panel.setOpaque(true);
            panel.setBackground(Paleta.PANEL);
            panel.setBorder(BorderFactory.createLineBorder(Paleta.PANEL_BORDE));
        }
        if (pieza instanceof JLabel) {
            JLabel etiqueta = (JLabel) pieza;
            etiqueta.setText(conTilde(etiqueta.getText()));
            boolean titulo = etiqueta.getFont() != null && etiqueta.getFont().getSize() >= 16;
            if (titulos) {
                etiqueta.setFont(Fuentes.texto(14, true));
                etiqueta.setForeground(Paleta.AMBAR);
            } else {
                etiqueta.setFont(Fuentes.texto(titulo ? 20 : 13, titulo));
                etiqueta.setForeground(titulo ? Paleta.TINTA : Paleta.SECUNDARIO);
            }
        }
        if (pieza instanceof JButton) {
            JButton boton = (JButton) pieza;
            boton.setText(conTilde(boton.getText()));
            boton.setUI(new RelieveBoton(tipoBoton(boton.getText())));
        }
        if (pieza instanceof JTextComponent) {
            JTextComponent campo = (JTextComponent) pieza;
            if (pieza instanceof JPasswordField) {
                campo.setUI(new CampoClave());
            } else if (pieza instanceof JTextField) {
                campo.setUI(new CampoRedondo());
            }
            campo.setFont(Fuentes.texto(14, false));
            campo.setOpaque(true);
            if (pieza instanceof JTextField) {
                campo.setBackground(Paleta.PANEL);
            } else {
                campo.setBackground(Paleta.CAMPO);
            }
            campo.setForeground(Paleta.TINTA);
            campo.setCaretColor(Paleta.TINTA);
            campo.setSelectionColor(Paleta.SELECCION);
            campo.setSelectedTextColor(Paleta.TINTA);
            campo.setBorder(bordeCampo(false));
            campo.addFocusListener(new FocusListener() {
                public void focusGained(FocusEvent e) {
                    campo.setBorder(bordeCampo(true));
                }

                public void focusLost(FocusEvent e) {
                    campo.setBorder(bordeCampo(false));
                }
            });
        }
        if (pieza instanceof JComboBox) {
            JComboBox lista = (JComboBox) pieza;
            lista.setFont(Fuentes.texto(13, false));
            lista.setBackground(Paleta.CAMPO);
            lista.setForeground(Paleta.TINTA);
            lista.setUI(new ListaCombo());
            lista.setOpaque(false);
            lista.setBorder(bordeCampo(false));
            lista.addFocusListener(new FocusListener() {
                public void focusGained(FocusEvent e) {
                    lista.setBorder(bordeCampo(true));
                }

                public void focusLost(FocusEvent e) {
                    lista.setBorder(bordeCampo(false));
                }
            });
        }
        if (pieza instanceof JTable) {
            EstiloTabla.aplicar((JTable) pieza);
        }
        if (pieza instanceof JScrollPane) {
            JScrollPane panel = (JScrollPane) pieza;
            panel.setBorder(BorderFactory.createEmptyBorder());
            panel.setViewportBorder(BorderFactory.createEmptyBorder());
            panel.getViewport().setBackground(Paleta.TABLA);
            panel.getVerticalScrollBar().setUI(new BarraScroll());
            panel.getHorizontalScrollBar().setUI(new BarraScroll());
            JPanel esquina = new JPanel();
            esquina.setBackground(Paleta.ENCABEZADO);
            panel.setCorner(JScrollPane.UPPER_RIGHT_CORNER, esquina);
            JPanel esquinaBaja = new JPanel();
            esquinaBaja.setBackground(Paleta.TABLA);
            panel.setCorner(JScrollPane.LOWER_RIGHT_CORNER, esquinaBaja);
            Dimension medida = panel.getPreferredSize();
            if (medida.width < 680) {
                panel.setPreferredSize(new Dimension(720, Math.max(320, medida.height)));
            }
        }
        if (pieza instanceof Container) {
            Component[] hijos = ((Container) pieza).getComponents();
            boolean conTabla = false;
            for (int i = 0; i < hijos.length; i++) {
                if (hijos[i] instanceof JScrollPane) {
                    conTabla = true;
                }
            }
            for (int i = 0; i < hijos.length; i++) {
                recorrer(hijos[i], false, pieza instanceof JPanel && conTabla);
            }
        }
    }

    private static Border bordeCampo(boolean activo) {
        if (activo) {
            return new BordeRedondo(Paleta.CAMPO, Paleta.FOCO, 8, 8, 10, 8, 10);
        }
        return new BordeRedondo(Paleta.CAMPO, Paleta.LINEA, 8, 8, 10, 8, 10);
    }

    private static String conTilde(String texto) {
        if (texto == null) {
            return null;
        }
        if (texto.equals("Contrasena")) {
            return "Contraseña";
        }
        if (texto.equals("Categoria")) {
            return "Categoría";
        }
        if (texto.equals("Anio")) {
            return "Año";
        }
        if (texto.equals("Telefono")) {
            return "Teléfono";
        }
        if (texto.equals("Codigo")) {
            return "Código";
        }
        if (texto.equals("Codigo juguete")) {
            return "Código juguete";
        }
        if (texto.equals("Codigo servicio")) {
            return "Código servicio";
        }
        if (texto.equals("Cerrar sesion")) {
            return "Cerrar sesión";
        }
        return texto;
    }

    private static int tipoBoton(String texto) {
        if (texto == null) {
            return RelieveBoton.NORMAL;
        }
        if (texto.equals("Entrar") || texto.equals("Registrar") || texto.equals("Registrar orden") || texto.equals("Confirmar") || texto.equals("Emitir") || texto.equals("Generar reporte")) {
            return RelieveBoton.PRINCIPAL;
        }
        if (texto.equals("Eliminar") || texto.equals("Eliminar paquete") || texto.equals("Cancelar") || texto.equals("Quitar") || texto.equals("Cerrar sesión")) {
            return RelieveBoton.PELIGRO;
        }
        return RelieveBoton.NORMAL;
    }
}
