
/*
Samodejno testiranje:
tj.exe

Javni testni primeri:
01-03: razdalja2
04-06: poPredpisih
07-10: najTip
01, 04, 07: ro"cno izdelani
*/

import java.util.*;

public class Tretja {

    //=========================================================================

    public static class Igrisce {
        private Igralo[] igrala;

        public Igrisce(Igralo[] igrala) {
            this.igrala = igrala;
        }

        public boolean poPredpisih() {
            for (Igralo prvo: this.igrala) {
                for (Igralo drugo: this.igrala) {
                    if (prvo != drugo) {
                        int r = prvo.minRazdalja2() < drugo.minRazdalja2() ? drugo.minRazdalja2() : prvo.minRazdalja2();
                        if (prvo.razdalja2(drugo) < r) {
                            return false;
                        }
                    }
                }
            }
            return true;
        }

        public int najTip() {
            int[] tipi = {0, 0, 0, 0};
            for (Igralo i: this.igrala) {
                if (i instanceof Gugalnica) {
                    tipi[0]++;
                } else if (i instanceof Tobogan) {
                    tipi[1]++;
                } else if (i instanceof Plezalo) {
                    tipi[2]++;
                } else {
                    tipi[3]++;
                }
            }
            int naj = 0;
            int indeks = 0;
            for (int i = 0; i < 4; i++) {
                if (tipi[i] > naj) {
                    naj = tipi[i];
                    indeks = i;
                }
            }
            return indeks;
        }

        // po potrebi dopolnite ...
    }

    //=========================================================================

    public static abstract class Igralo {
        private int x;
        private int y;

        protected Igralo(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public abstract int minRazdalja2();

        public int razdalja2(Igralo igr) {
            return (this.x - igr.x) * (this.x - igr.x) + (this.y - igr.y) * (this.y - igr.y);
        }

        // po potrebi dopolnite ...
    }

    //=========================================================================

    public static class Gugalnica extends Igralo {
        public Gugalnica(int x, int y) {
            super(x, y);
        }

        @Override
        public int minRazdalja2() {
            return 200 * 200;
        }

        // po potrebi dopolnite ...
    }

    //=========================================================================

    public static class Tobogan extends Igralo {
        public Tobogan(int x, int y) {
            super(x, y);
        }

        @Override
        public int minRazdalja2() {
            return 150 * 150;
        }

        // po potrebi dopolnite ...
    }

    //=========================================================================

    public static class Plezalo extends Igralo {
        public Plezalo(int x, int y) {
            super(x, y);
        }

        @Override
        public int minRazdalja2() {
            return 130 * 130;
        }

        // po potrebi dopolnite ...
    }

    //=========================================================================

    public static class Vzmetnik extends Igralo {
        public Vzmetnik(int x, int y) {
            super(x, y);
        }

        @Override
        public int minRazdalja2() {
            return 100 * 100;
        }

        // po potrebi dopolnite ...
    }

    //=========================================================================

    // pomo"zne metode, notranji razredi (po potrebi) ...

    public static void main(String[] args) {
        // koda za ro"cno testiranje (po potrebi) ...
    }
}
