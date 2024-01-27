
/*
Samodejno testiranje:

tj.exe

Javni testni primeri:

01--03: klici metode poisciGlagol
04--07: klici metode preveriPS
08--10: preverjanje umestitve razreda SamPrid v hierarhijo
01, 04, 08--10: ro"cno izdelani
*/

import java.util.*;

public class Tretja {

    public static class Beseda {
        private String zapis;  // neprazno zaporedje malih "crk angle"ske abecede

        public Beseda(String zapis) {
            this.zapis = zapis;
        }

        @Override
        public String toString() {
            return this.zapis;
        }
    }

    public static class Samostalnik extends SamPrid {

        public Samostalnik(String zapis, char spol, int sklon, int stevilo) {
            super(zapis, spol, sklon, stevilo);
        }
    }

    public static class Pridevnik extends SamPrid {

        public Pridevnik(String zapis, char spol, int sklon, int stevilo) {
            super(zapis, spol, sklon, stevilo);
        }
    }

    public static class Glagol extends Beseda {
        private int oseba;    // 1, 2 ali 3
        private int stevilo;  // 1, 2 ali 3

        public Glagol(String zapis, int oseba, int stevilo) {
            super(zapis);
            this.oseba = oseba;
            this.stevilo = stevilo;
        }
    }

    public static abstract class SamPrid extends Beseda {
        private char spol;    // 'M', 'Z' ali 'S'
        private int sklon;    // med 1 (imenovalnik) in 6 (orodnik)
        private int stevilo;  // 1, 2 ali 3

        public SamPrid(String zapis, char spol, int sklon, int stevilo) {
            super(zapis);
            this.spol = spol;
            this.sklon = sklon;
            this.stevilo = stevilo;
        }
    }

    public static class Stavek {
        private Beseda[] besede;

        public Stavek(Beseda[] besede) {
            this.besede = besede;
        }

        public Glagol poisciGlagol() {
            for (Beseda b : this.besede) if (b instanceof Glagol) return (Glagol)b;
            return null;
        }

        public boolean preveriPS() {
            if (besede[besede.length - 1] instanceof Pridevnik) return false;
            for (int i = 1; i < besede.length; ++i) {
                if (besede[i - 1] instanceof Pridevnik && !(besede[i] instanceof Pridevnik || besede[i] instanceof Samostalnik)) {
                    return false;
                }
            }
            return true;
        }
    }

    //=========================================================================

    public static void main(String[] args) {
        // koda za ro"cno testiranje (po potrebi) ...
    }
}
