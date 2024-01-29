
/*
 * Testiranje:
 *
 * tj.exe
 */

public class Tretja {

    public static abstract class Drevo {
        private int x;
        private int y;

        protected Drevo(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int vrniX() {
            return this.x;
        }

        public int vrniY() {
            return this.y;
        }

        public abstract String vrsta();

        @Override
        public String toString() {
            return String.format("%s(%d, %d)", this.vrsta(), this.x, this.y);
        }

        public int d2(Drevo drevo) {
            return (this.x - drevo.vrniX()) * (this.x - drevo.vrniX()) + (this.y - drevo.vrniY()) * (this.y - drevo.vrniY());
        }

        // po potrebi dopolnite ...
    }

    public static abstract class Listavec extends Drevo {
        protected Listavec(int x, int y) {
            super(x, y);
        }
        // po potrebi dopolnite ...
    }

    public static abstract class Iglavec extends Drevo {
        protected Iglavec(int x, int y) {
            super(x, y);
        }
        // po potrebi dopolnite ...
    }

    public static class Hrast extends Listavec {
        public Hrast(int x, int y) {
            super(x, y);
        }

        @Override
        public String vrsta() {
            return "Hrast";
        }

        // po potrebi dopolnite ...
    }

    public static class Bukev extends Listavec {
        public Bukev(int x, int y) {
            super(x, y);
        }

        @Override
        public String vrsta() {
            return "Bukev";
        }

        // po potrebi dopolnite ...
    }

    public static class Breza extends Listavec {
        public Breza(int x, int y) {
            super(x, y);
        }

        @Override
        public String vrsta() {
            return "Breza";
        }

        // po potrebi dopolnite ...
    }

    public static class Smreka extends Iglavec {
        public Smreka(int x, int y) {
            super(x, y);
        }

        @Override
        public String vrsta() {
            return "Smreka";
        }

        // po potrebi dopolnite ...
    }

    public static class Jelka extends Iglavec {
        public Jelka(int x, int y) {
            super(x, y);
        }

        @Override
        public String vrsta() {
            return "Jelka";
        }

        // po potrebi dopolnite ...
    }

    public static class Bor extends Iglavec {
        public Bor(int x, int y) {
            super(x, y);
        }

        @Override
        public String vrsta() {
            return "Bor";
        }

        // po potrebi dopolnite ...
    }

    public static class Gozd {
        private Drevo[] drevesa;

        public Gozd(Drevo[] drevesa) {
            this.drevesa = drevesa;
        }

        public boolean jeListnat() {
            for (Drevo d: this.drevesa) {
                if (d instanceof Iglavec) {
                    return false;
                }
            }
            return true;
        }

        public Drevo najblizjeIstovrstno(Drevo drevo) {
            Drevo najblizje = null;
            for (Drevo d: this.drevesa) {
                if (d.vrsta().equals(drevo.vrsta()) && drevo != d && (najblizje == null || najblizje.d2(drevo) > d.d2(drevo))) {
                    najblizje = d;
                }
            }
            return najblizje;
        }

        // po potrebi dopolnite ...
    }

    public static void main(String[] args) {
        // koda za ro"cno testiranje (po "zelji)
    }

}
