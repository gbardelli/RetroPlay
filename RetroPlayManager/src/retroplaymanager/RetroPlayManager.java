package retroplaymanager;

public class RetroPlayManager {

    public static void main(String[] args) {
        Tienda tienda = new Tienda();
        tienda.cargarDatosDePrueba();
        VentanaLogin login = new VentanaLogin(tienda);
        login.setVisible(true);
    }
}
