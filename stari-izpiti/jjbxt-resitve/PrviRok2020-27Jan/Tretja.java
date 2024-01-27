
/*
 * Testiranje:
 *
 * tj.exe
 */

import java.util.*;

public class Tretja {

    public static void main(String[] args) {
        // koda za ro"cno testiranje (po "zelji)
    }

    public static class Zaposleni {
        private String ip;
        private int placa;
        private Vodja nadrejeni;

        public Zaposleni(String ip, int placa, Vodja nadrejeni) {
            this.ip = ip;
            this.placa = placa;
            this.nadrejeni = nadrejeni;
        }

        @Override
        public String toString() {
            return this.ip;
        }

        public int vrniPlaco() {
            return this.placa;
        }

        public Vodja vrniNadrejenega() {
            return this.nadrejeni;
        }

        public int placaNadrejenega() {
            if (this.nadrejeni == null) {
                return -1;
            }
            return nadrejeni.vrniPlaco();
        }

        public static int steviloAnomalij(Zaposleni[] zaposleni) {
            int stParov = 0;
            List<Zaposleni> delavci = new ArrayList<>(zaposleni.length);
            List<Zaposleni> vodje = new ArrayList<>(zaposleni.length);
            for (Zaposleni z: zaposleni) {
                if (z instanceof Delavec) {
                    delavci.add(z);
                } else {
                    vodje.add(z);
                }
            }
            for (Zaposleni d: delavci) {
                for (Zaposleni v: vodje) {
                    if (d.vrniPlaco() > v.vrniPlaco()) {
                        stParov++;
                    }
                }
            }
            return stParov;
        }
    }

    public static class Delavec extends Zaposleni {
        public Delavec(String ip, int placa, Vodja nadrejeni) {
            super(ip, placa, nadrejeni);
        }
    }

    public static class Vodja extends Zaposleni {
        public Vodja(String ip, int placa, Vodja nadrejeni) {
            super(ip, placa, nadrejeni);
        }

        public Vodja vrhovni() {
            if (this.vrniNadrejenega() == null) {
                return this;
            }
            return this.vrniNadrejenega().vrhovni();
        }
    }
}
