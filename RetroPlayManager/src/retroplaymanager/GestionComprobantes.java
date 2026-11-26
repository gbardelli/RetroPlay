package retroplaymanager;

public class GestionComprobantes {

    private Comprobante[] comprobantes;
    private int cont;
    private int correlativo;

    public GestionComprobantes() {
        comprobantes = new Comprobante[100];
        cont = 0;
        correlativo = 0;
    }

    public Comprobante buscarPorOrden(int numero) {
        for (int i = 0; i < cont; i++) {
            if (comprobantes[i].getOrden().getNumero() == numero) {
                return comprobantes[i];
            }
        }
        return null;
    }

    public String emitir(Orden orden, String tipo, String ruc, String razonSocial) {
        if (orden == null || !orden.getEstado().equals("Finalizada") || orden.getFechaCierre() == null) {
            return "Solo se puede emitir para una orden finalizada";
        }
        if (buscarPorOrden(orden.getNumero()) != null) {
            return "La orden ya tiene un comprobante";
        }
        if (cont >= comprobantes.length) {
            return "No hay espacio para mas comprobantes";
        }
        Comprobante obj;
        if (tipo.equals("Factura")) {
            if (ruc.equals("") || razonSocial.equals("")) {
                return "Para una factura ingrese el RUC y la razon social";
            }
            obj = new Factura(correlativo + 1, orden, ruc, razonSocial);
        } else if (tipo.equals("Boleta")) {
            obj = new Boleta(correlativo + 1, orden);
        } else {
            return "Tipo de comprobante no permitido";
        }
        comprobantes[cont] = obj;
        cont++;
        correlativo++;
        return "";
    }

    public Comprobante[] getComprobantes() {
        return comprobantes;
    }

    public int getCont() {
        return cont;
    }
}
