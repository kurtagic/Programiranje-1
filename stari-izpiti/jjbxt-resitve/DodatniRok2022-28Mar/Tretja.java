
import java.util.*;

public class Tretja {

    public static class Oddajnik {

        private int coun;
        private Sprejemnik[] sprejemniki;

        public Oddajnik() {
            this.sprejemniki = new Sprejemnik[1000];
            this.coun = 0;
        }
        
        public void dodaj(Sprejemnik s) {
            this.sprejemniki[this.coun] = s;
            coun++;
        }

        public void oddaj(Character c) {
            for (Sprejemnik s: this.sprejemniki) {
                if (s != null) {
                    s.sprejmi(c);
                }
            }
        }
    }

    public static class Sprejemnik {

        private int stevec;
        private String sprejeto;
        private Oddajnik oddajnik;

        public Sprejemnik(Oddajnik o) {
            this.oddajnik = o;
            this.sprejeto = "";
            this.stevec = 0;
            o.dodaj(this);
        }

        public int koliko() {
            return this.stevec;
        }

        public String odZadnjic() {
            String kopija = this.sprejeto;
            this.sprejeto = "";
            return kopija;
        }

        public void sprejmi(Character c) {
            StringBuilder sb = new StringBuilder(this.sprejeto);
            sb.append(Character.toString(c));
            this.sprejeto = sb.toString();
            stevec++;
        }
    }

    public static void main(String[] args) {
        // koda za ro"cno testiranje (po potrebi)
    }
}
