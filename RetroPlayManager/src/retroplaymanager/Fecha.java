package retroplaymanager;

public class Fecha {

    private int dia;
    private int mes;
    private int anio;
    private int hora;

    public Fecha(int dia, int mes, int anio, int hora) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        this.hora = hora;
    }

    public boolean esBisiesto(int a) {
        if ((a % 4 == 0 && a % 100 != 0) || a % 400 == 0) {
            return true;
        }
        return false;
    }

    public int diasDelMes(int m, int a) {
        if (m == 2) {
            if (esBisiesto(a)) {
                return 29;
            }
            return 28;
        }
        if (m == 4 || m == 6 || m == 9 || m == 11) {
            return 30;
        }
        return 31;
    }

    public boolean esValida() {
        if (anio < 2000 || anio > 2100) {
            return false;
        }
        if (mes < 1 || mes > 12) {
            return false;
        }
        if (dia < 1 || dia > diasDelMes(mes, anio)) {
            return false;
        }
        if (hora < 0 || hora > 23) {
            return false;
        }
        return true;
    }

    public int totalDias() {
        int total = 0;
        for (int a = 2000; a < anio; a++) {
            if (esBisiesto(a)) {
                total += 366;
            } else {
                total += 365;
            }
        }
        for (int m = 1; m < mes; m++) {
            total += diasDelMes(m, anio);
        }
        return total + dia;
    }

    public int totalHoras() {
        return totalDias() * 24 + hora;
    }

    public String texto() {
        return String.format("%d/%d/%d", dia, mes, anio);
    }

    public String textoConHora() {
        return String.format("%d/%d/%d %d:00", dia, mes, anio, hora);
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }
}
