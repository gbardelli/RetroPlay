package retroplaymanager;

public class Boleta extends Comprobante {

    public Boleta(int numero, Orden orden) {
        super(numero, orden);
    }

    @Override
    public String getTipo() {
        return "Boleta";
    }

    @Override
    public String datosTributarios() {
        return "";
    }
}
