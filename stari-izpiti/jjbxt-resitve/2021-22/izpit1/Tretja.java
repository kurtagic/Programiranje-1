
/*
 * tj.exe
 */

import java.util.*;

public class Tretja {

    public static class Tocka {
        private double x;
        private double y;

        public Tocka(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public double vrniX() {
            return this.x;
        }

        public double vrniY() {
            return this.y;
        }
    }

    public static class Najdba {
        private String najditelj;
        private int cas;

        public Najdba(String najditelj, int cas) {
            this.najditelj = najditelj;
            this.cas = cas;
        }

        public String vrniNajditelja() {
            return this.najditelj;
        }

        public int vrniCas() {
            return this.cas;
        }
    }

    public static class Zaklad {
        private String id;
        private Tocka polozaj;
        private Najdba[] najdbe;

        public Zaklad(String id, Tocka polozaj, Najdba[] najdbe) {
            this.id = id;
            this.polozaj = polozaj;
            this.najdbe = najdbe;
        }

        public Tocka vrniPolozaj() {
            return this.polozaj;
        }

        public Najdba[] vrniNajdbe() {
            return this.najdbe;
        }

        public String[] najditelji() {
            String[] rez = new String[najdbe.length];
            for (int i = 0; i < najdbe.length; i++) {
                rez[i] = najdbe[i].vrniNajditelja();
            }
            return rez;
        }

        @Override
        public String toString() {
            return this.id;
        }
    }

    public static class Geolov {
        private Zaklad[] zakladi;

        public Geolov(Zaklad[] zakladi) {
            this.zakladi = zakladi;
        }

        public Zaklad[] vrniZaklade() {
            return this.zakladi;
        }

        public double pot(Tocka zacetna) {
            if (this.zakladi == null) {
                return 0.0;
            }
            double skupnaPot = Math.sqrt((zacetna.vrniX() - this.zakladi[0].vrniPolozaj().vrniX()) * (zacetna.vrniX() - this.zakladi[0].vrniPolozaj().vrniX()) + 
                (zacetna.vrniY() - this.zakladi[0].vrniPolozaj().vrniY()) * (zacetna.vrniY() - this.zakladi[0].vrniPolozaj().vrniY()));
            for (int i = 1; i < this.zakladi.length; i++) {
                skupnaPot += Math.sqrt((this.zakladi[i].vrniPolozaj().vrniX() - this.zakladi[i - 1].vrniPolozaj().vrniX()) * (this.zakladi[i].vrniPolozaj().vrniX() - this.zakladi[i - 1].vrniPolozaj().vrniX()) + 
                    (this.zakladi[i].vrniPolozaj().vrniY() - this.zakladi[i - 1].vrniPolozaj().vrniY()) * (this.zakladi[i].vrniPolozaj().vrniY() - this.zakladi[i - 1].vrniPolozaj().vrniY()));
            }
            skupnaPot += Math.sqrt((zacetna.vrniX() - this.zakladi[this.zakladi.length - 1].vrniPolozaj().vrniX()) * (zacetna.vrniX() - this.zakladi[this.zakladi.length - 1].vrniPolozaj().vrniX()) + 
                (zacetna.vrniY() - this.zakladi[this.zakladi.length - 1].vrniPolozaj().vrniY()) * (zacetna.vrniY() - this.zakladi[this.zakladi.length - 1].vrniPolozaj().vrniY()));
            return skupnaPot;
        }

        public Zaklad nazadnjeOdkrit() {
            if (this.zakladi == null) {
                return null;
            }
            Zaklad nazadnji = null;
            for (Zaklad z: this.zakladi) {
                if (z.vrniNajdbe().length != 0 && (nazadnji == null || z.vrniNajdbe()[0].vrniCas() > nazadnji.vrniNajdbe()[0].vrniCas())) {
                    nazadnji = z;
                }
            }
            return nazadnji;
        }
    }

    public static void main(String[] args) {
        // koda za ro"cno testiranje (po potrebi)
    }
}
