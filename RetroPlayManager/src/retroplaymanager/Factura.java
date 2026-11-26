package retroplaymanager;

public class Factura extends Comprobante implements Fiscal {

    private String ruc;
    private String razonSocial;

    public Factura(int numero, Orden orden, String ruc, String razonSocial) {
        super(numero, orden);
        registrarRuc(ruc, razonSocial);
    }

    @Override
    public String getTipo() {
        return "Factura";
    }

    @Override
    public String datosTributarios() {
        return String.format("RUC: %s\nRazon social: %s\n", ruc, razonSocial);
    }

    @Override
    public void registrarRuc(String ruc, String razonSocial) {
        this.ruc = ruc;
        this.razonSocial = razonSocial;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }
}
