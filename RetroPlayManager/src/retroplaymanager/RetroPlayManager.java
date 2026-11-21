package retroplaymanager;

public class RetroPlayManager {

    public static void main(String[] args) {
        Tienda tienda = new Tienda();
        VentanaLogin login = new VentanaLogin(tienda);
        login.setVisible(true);
    }
}
