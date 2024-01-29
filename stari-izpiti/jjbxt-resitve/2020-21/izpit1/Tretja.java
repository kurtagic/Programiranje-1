
/*
 * tj.exe
 */

import java.util.*;

public class Tretja {

    //=========================================================================
    public static class Opravilo {
        private String naziv;
        private int zahtevnost;

        public Opravilo(String naziv, int zahtevnost) {
            this.naziv = naziv;
            this.zahtevnost = zahtevnost;
        }

        public int vrniZahtevnost() {
            return this.zahtevnost;
        }
    }

    //=========================================================================
    public static class Projekt {
        private String naziv;
        private Opravilo[] opravila;

        public Projekt(String naziv, Opravilo[] opravila) {
            this.naziv = naziv;
            this.opravila = opravila;
        }

        public Opravilo[] vrniOpravila() {
            return this.opravila;
        }

        public int zahtevnost() {
            Opravilo najtezje = this.opravila[0];
            for (Opravilo opravilo: this.opravila) {
                if (opravilo.vrniZahtevnost() > najtezje.vrniZahtevnost()) {
                    najtezje = opravilo;
                }
            }
            return najtezje.vrniZahtevnost();
        }

        public boolean jePermutacijaOd(Object drugi) {
            if (!(drugi instanceof Projekt)) {
                return false;
            }
            Projekt dr = (Projekt) drugi;
            z1:
            for (Opravilo o1: this.opravila) {
                for (Opravilo o2: dr.vrniOpravila()) {
                    if (o1 == o2) {
                        continue z1;
                    }
                }
                return false;
            }
            z2:
            for (Opravilo o1: dr.vrniOpravila()) {
                for (Opravilo o2: this.opravila) {
                    if (o1 == o2) {
                        continue z2;
                    }
                }
                return false;
            }
            return true;
        }
    }

    //=========================================================================
    public static class Delavec {
        private String ip;
        private int usposobljenost;

        public Delavec(String ip, int usposobljenost) {
            this.ip = ip;
            this.usposobljenost = usposobljenost;
        }

        public int vrniUsposobljenost() {
            return this.usposobljenost;
        }
    }

    //=========================================================================
    public static class Delavnica {
        private Delavec[] delavci;

        public Delavnica(Delavec[] delavci) {
            this.delavci = delavci;
        }

        public int univerzalci(Projekt[] projekti) {
            int stevilo = 0;
            z:
            for (Delavec d: this.delavci) {
                for (Projekt p: projekti) {
                    if (p.zahtevnost() > d.vrniUsposobljenost()) {
                        continue z;
                    }
                }
                stevilo++;
            }
            return stevilo;
        }
    }

    //=========================================================================
    public static void main(String[] args) {
        // koda za ro"cno testiranje (po potrebi)
    }

}
