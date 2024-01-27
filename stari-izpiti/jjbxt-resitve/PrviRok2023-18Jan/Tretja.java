
/*
Samodejno testiranje:
tj.exe

Testni primeri:

01..03: toString
04..06: equals
07..10: hashCode

01, 04, 07: ročno izdelani; isti podatki v vseh treh razredih
*/

import java.util.*;

public class Tretja {

    public static class Tablica {
        private char[] kraj;
        private int stevilo;
        private boolean zacasna;

        public Tablica(char[] kraj, int stevilo, boolean zacasna) {
            this.kraj = new char[]{kraj[0], kraj[1]};
            this.stevilo = stevilo;
            this.zacasna = zacasna;
        }

        @Override
        public String toString() {
            return String.format("%c%c %d-%d", this.kraj[0], this.kraj[1], this.stevilo / 100, this.stevilo % 100);
        }

        @Override
        public boolean equals(Object obj) {
            if (!(obj instanceof Tablica)) {
                return false;
            }
            Tablica druga = (Tablica) obj;
            if (this.kraj[0] == druga.kraj[0] && this.kraj[1] == druga.kraj[1] && this.stevilo == druga.stevilo && this.zacasna == druga.zacasna) {
                return true;
            }
            return false;
        }

        @Override
        public int hashCode() {
            Boolean b = new Boolean(this.zacasna);
            return this.kraj[0] * 101 + this.kraj[1] * 107 + this.stevilo * 31 + b.hashCode() * 37;
        }
    }
}
