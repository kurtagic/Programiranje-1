public class Oseba {

    private String ime;
    private String priimek;
    private char spol;
    private int letoRojstva;
    private Oseba oce;
    private Oseba mati;

    public Oseba(String ime, String priimek, char spol, int letoRojstva, Oseba oce, Oseba mati) {
        this.ime = ime;
        this.priimek = priimek;
        this.spol = spol;
        this.letoRojstva = letoRojstva;
        this.oce = oce;
        this.mati = mati;
    }

    public String vrniIme() {
        return this.ime;
    }

    public String toString() {
        return this.ime + " " + this.priimek + " (" + this.spol + "), " + letoRojstva;
    }

    public int starost(int leto) {
        return leto - this.letoRojstva;
    }

    public boolean jeStarejsaOd(Oseba os) {
        return this.letoRojstva < os.letoRojstva;
    }

    public static Oseba starejsa(Oseba a, Oseba b) {
        if(a.letoRojstva == b.letoRojstva) return null;
        return a.letoRojstva < b.letoRojstva ? a : b;
    }

    public String imeOceta() {
        return this.oce != null ? this.oce.ime : null;
    }

    public boolean jeBratAliSestraOd(Oseba os) {
        return this != os && this.oce == os.oce;
    }

    public boolean jeSestraOd(Oseba os) {
        return jeBratAliSestraOd(os) && this.spol == 'Z';
    }

    public boolean jeTetaOd(Oseba os) {
        return jeSestraOd(os.oce);
    }

    public boolean jeOcetovskiPrednikOd(Oseba os) {
        if(os.oce == null) return false;
        if(os.oce == this) return true;

        return jeOcetovskiPrednikOd((os.oce));
    }
}
