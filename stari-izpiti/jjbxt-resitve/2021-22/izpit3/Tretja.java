
/*
 * Samodejno testiranje:
 * tj.exe
 *
 * Javni testni primeri:
 * 01: primer iz besedila
 * 02..04: kli"cejo samo metodo dolzinaVrste
 * 05..07: kli"cejo samo metodo steviloDokumentov
 * 08..10: kli"cejo samo metodo natisni
 *
 * Skriti testni primeri: 
 * 01..16: kli"cejo samo metodo dolzinaVrste
 * 17..33: kli"cejo samo metodo steviloDokumentov
 * 34..50: kli"cejo samo metodo natisni
 *
 * (Vsi testni primeri kli"cejo konstruktor in metodo prejmi, a ta dva se ne to"ckujeta.)
 */

import java.util.*;

public class Tretja {

    public static abstract class Pedagog {
        // po potrebi dopolnite ...
    }

    public static class Profesor extends Pedagog {
        // po potrebi dopolnite ...
    }

    public static class Docent extends Pedagog {
        // po potrebi dopolnite ...
    }

    public static class Asistent extends Pedagog {
        // po potrebi dopolnite ...
    }

    public static class Tiskalnik {

        private Map<Pedagog, List<String>> vrsta;
        private Profesor p;
        private Docent d;
        private Asistent a;
        private List<String> pji;
        private List<String> dji;
        private List<String> aji;

        public Tiskalnik() {
            this.vrsta = new HashMap<>();
            this.p = new Profesor();
            this.d = new Docent();
            this.a = new Asistent();
            this.pji = new LinkedList<>();
            this.dji = new LinkedList<>();
            this.aji = new LinkedList<>();
            this.vrsta.put(p, pji);
            this.vrsta.put(d, dji);
            this.vrsta.put(a, aji);
        }

        public void prejmi(Pedagog pedagog, String dokument) {
            if (pedagog instanceof Profesor) {
                pji.add(dokument);
                vrsta.put(p, pji);
            } else if (pedagog instanceof Docent) {
                dji.add(dokument);
                vrsta.put(d, dji);
            } else {
                aji.add(dokument);
                vrsta.put(a, aji);
            }
        }

        public int dolzinaVrste() {
            return vrsta.get(p).size() + vrsta.get(d).size() + vrsta.get(a).size();
        }

        public int steviloDokumentov(Pedagog pedagog) {
            if (pedagog instanceof Profesor) {
                return pji.size();
            } else if (pedagog instanceof Docent) {
                return dji.size();
            } else {
                return aji.size();
            }
        }

        public String natisni() {
            if (!pji.isEmpty()) {
                return pji.remove(0);
            } else if(!dji.isEmpty()) {
                return dji.remove(0);
            } else if(!aji.isEmpty()) {
                return aji.remove(0);
            }
            return null;
        }

        // pomo"zne metode (po potrebi) ...
    }

    // pomo"zne metode, notranji razredi (po potrebi) ...

    public static void main(String[] args) {
        // koda za ro"cno testiranje (po potrebi) ...
    }
}
