
/*
 * tj.exe
 */

import java.util.*;

public class Cetrta {

    //=========================================================================
    public static class Barva {
        private int r;
        private int g;
        private int b;

        public Barva(int r, int g, int b) {
            this.r = r;
            this.g = g;
            this.b = b;
        }

        public int vrniR() {
            return this.r;
        }

        public int vrniG() {
            return this.g;
        }

        public int vrniB() {
            return this.b;
        }

        @Override
        public String toString() {
            return String.format("(%d, %d, %d)", this.r, this.g, this.b);
        }
    }

    //=========================================================================
    public static abstract class Lik implements Comparable<Lik>{
        private Barva barva;

        protected Lik(Barva barva) {
            this.barva = barva;
        }

        @Override
        public int compareTo(Lik drugi) {
            return this.ploscina() - drugi.ploscina();
        }

        public Barva vrniBarvo() {
            return this.barva;
        }

        public abstract String vrsta(); 
        public abstract String mere(); 
        public abstract int ploscina();
        public abstract int prioriteta();

        @Override
        public String toString() {
            return String.format("%s [%s, %s]", this.vrsta(), this.barva, this.mere());
        }
    }

    //=========================================================================
    public static class Pravokotnik extends Lik {
        private int a;
        private int b;

        public Pravokotnik(Barva barva, int a, int b) {
            super(barva);
            this.a = a;
            this.b = b;
        }

        public int vrniA() {
            return this.a;
        }

        @Override
        public int prioriteta() {
            return 0;
        }

        @Override
        public int ploscina() {
            return this.a * this.b;
        }

        @Override
        public String vrsta() {
            return "pravokotnik";
        }

        @Override
        public String mere() {
            return String.format("a = %d, b = %d", this.a, this.b);
        }
    }

    //=========================================================================
    public static class Kvadrat extends Pravokotnik {
        public Kvadrat(Barva barva, int a) {
            super(barva, a, a);
        }

        @Override
        public String vrsta() {
            return "kvadrat";
        }

        @Override
        public int prioriteta() {
            return 1;
        }

        @Override
        public String mere() {
            return String.format("a = %d", this.vrniA());
        }
    }

    //=========================================================================
    public static class Krog extends Lik {
        private int r;

        public Krog(Barva barva, int r) {
            super(barva);
            this.r = r;
        }

        @Override
        public String vrsta() {
            return "krog";
        }

        @Override
        public int prioriteta() {
            return 2;
        }

        @Override
        public int ploscina() {
            return (int) Math.round(Math.PI * this.r * this.r);
        }

        @Override
        public String mere() {
            return String.format("r = %d", this.r);
        }
    }

    //=========================================================================
    public static void urediNaravno(List<Lik> liki) {
        for (int i = 1; i < liki.size(); i++) {
            int j = i - 1;
            Lik x = liki.get(i);
            while(j >= 0 && x.compareTo(liki.get(j)) < 0) {
                liki.set(j + 1, liki.get(j));
                j--;
            }
            liki.set(j + 1, x);
        }
    }

    //=========================================================================
    public static Collection<Lik> poTipuInBarvi(Collection<Lik> liki) {
        Collection<Lik> rezultat = new TreeSet<>((l1, l2) ->
            (l1.prioriteta() == l2.prioriteta() ? (l1.vrniBarvo().vrniR() == l2.vrniBarvo().vrniR() ? (l1.vrniBarvo().vrniG() == l2.vrniBarvo().vrniG() ? l1.vrniBarvo().vrniB() - l2.vrniBarvo().vrniB() : l1.vrniBarvo().vrniG() - l2.vrniBarvo().vrniG()) : l1.vrniBarvo().vrniR() - l2.vrniBarvo().vrniR()) : l1.prioriteta() - l2.prioriteta()));
        for (Lik l: liki) {
            rezultat.add(l);
        }
        return rezultat;
    }

    //=========================================================================
    public static void main(String[] args) {
        // koda za ro"cno testiranje (po potrebi)
    }
}
