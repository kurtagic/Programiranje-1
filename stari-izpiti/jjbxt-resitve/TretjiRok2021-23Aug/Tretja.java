
import java.util.*;

public class Tretja {

    public static abstract class Zival {
        public abstract String oglasiSe();
    }

    public static class Pes extends Zival {
        @Override
        public String oglasiSe() {
            return "hov";
        }
    }

    public static class Macka extends Zival {
        @Override
        public String oglasiSe() {
            return "mijav";
        }
    }

    public static class RodovniskiPes extends Pes {
        private String pasma;
        private RodovniskiPes oce;
        private RodovniskiPes mati;

        public RodovniskiPes(String pasma, RodovniskiPes oce, RodovniskiPes mati) {
            this.pasma = pasma;
            this.oce = oce;
            this.mati = mati;
        }

        public String vrniPasmo() {
            return this.pasma;
        }

        public boolean preveri() {
            return this.oce == null || this.pasma.equals(this.oce.vrniPasmo()) && this.pasma.equals(this.mati.vrniPasmo()) && this.oce.preveri() && this.mati.preveri();
        }

        // po potrebi dopolnite ...
    }

    public static int prestej(RodovniskiPes[] psi, String pasma) {
        int c = 0;
        for (RodovniskiPes p: psi) {
            if (p.vrniPasmo().equals(pasma)) {
                c++;
            }
        }
        return c;
    }
}
