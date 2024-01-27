
import java.util.*;

public class Tretja {

    public static abstract class Zival {
        // po potrebi dopolnite ...
    }

    public static class Pes extends Zival {
        // po potrebi dopolnite ...
    }

    public static class Macka extends Zival {
        // po potrebi dopolnite ...
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

        public boolean preveri() {
            // popravite / dopolnite ...
            return false;
        }

        // po potrebi dopolnite ...
    }

    public static int prestej(RodovniskiPes[] psi, String pasma) {
        // popravite / dopolnite ...
        return -1;
    }
}
