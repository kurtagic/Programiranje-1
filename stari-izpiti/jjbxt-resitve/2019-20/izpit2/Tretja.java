
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

    //=========================================================================
    public static abstract class Ukaz {

        public static int bilanca(Ukaz[] ukazi) {
            int p = 0;
            int o = 0;
            for (Ukaz u: ukazi) {
                if (u instanceof Postavi) {
                    p++;
                } else {
                    o++;
                }
            }
            return p - o;
        }

        public Ukaz zaporedje(Ukaz drugi) {
            Ukaz u = new Zap(this, drugi);
            return u;
        }

        public abstract String toString();
        public abstract void izvedi(int[] stolpi);
    }

    public static class Zap extends Ukaz {

        private Ukaz u1;
        private Ukaz u2;

        public Zap(Ukaz u1, Ukaz u2) {
            this.u1 = u1;
            this.u2 = u2;
        }

        @Override
        public void izvedi(int[] stolpi) {
            this.u1.izvedi(stolpi);
            this.u2.izvedi(stolpi);
        }

        @Override
        public String toString() {
            return String.format("[%s, %s]", this.u1.toString(), this.u2.toString());
        }
    }

    //=========================================================================
    public static class Postavi extends Ukaz {
        private int kam;

        // V vseh testnih primerih velja:
        // kam >= 0

        public Postavi(int kam) {
            this.kam = kam;
        }

        @Override
        public String toString() {
            return String.format("+%d", this.kam);
        }

        @Override
        public void izvedi(int[] stolpi) {
            if (stolpi.length > this.kam) {
                stolpi[this.kam]++;
            }
        }
    }

    //=========================================================================
    public static class Odvzemi extends Ukaz {
        private int odkod;

        // V vseh testnih primerih velja:
        // odkod >= 0

        public Odvzemi(int odkod) {
            this.odkod = odkod;
        }

        @Override
        public String toString() {
            return String.format("-%d", this.odkod);
        }


        @Override
        public void izvedi(int[] stolpi) {
            if (stolpi.length > this.odkod && stolpi[this.odkod] != 0) {
                stolpi[this.odkod]--;
            }
        }
    }

    //=========================================================================
    // po potrebi dopolnite ...
}
