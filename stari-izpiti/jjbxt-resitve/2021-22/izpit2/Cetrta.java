
/*
 * tj.exe
 */

import java.util.*;

public class Cetrta {

    public static class Tocka {
        private int x;
        private int y;

        public Tocka(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return String.format("(%d, %d)", this.x, this.y);
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Tocka)) {
                return false;
            }
            Tocka druga = (Tocka) obj;
            return this.x == druga.x && this.y == druga.y;
        }

        @Override
        public int hashCode() {
            return 17 * this.x + 31 * this.y;
        }

        public Map<Boolean, List<Tocka>> razdeli(Collection<Tocka> tocke) {
            Map<Boolean, List<Tocka>> slovar = new HashMap<>();
            List<Tocka> resnica = new ArrayList<>();
            List<Tocka> laz = new ArrayList<>();
            for (Tocka t: tocke) {
                if (t.x > this.x) {
                    resnica.add(t);
                } else {
                    laz.add(t);
                }
            }
            slovar.put(true, resnica);
            slovar.put(false, laz);
            return slovar;
        }

        public static Comparator<Tocka> polarno() {
            return new Comparator<Tocka>() {
                @Override
                public int compare(Tocka a, Tocka b) {
                    if (a.kvadratRadija() == b.kvadratRadija()) {
                        if (a.kvadrant() == b.kvadrant()) {
                            if (a.kvadrant() % 2 == 0) {
                                return Math.abs(a.x) - Math.abs(b.x);
                            }
                            return Math.abs(a.y) - Math.abs(b.y);
                        }
                        return a.kvadrant() - b.kvadrant();
                    }
                    return a.kvadratRadija() - b.kvadratRadija();
                }
            };
        }

        public int kvadrant() {
            if (this.x > 0 && this.y > 0) {
                return 1;
            }
            if (this.x < 0 && this.y > 0) {
                return 2;
            }
            if (this.x < 0 && this.y < 0) {
                return 3;
            }
            return 4;
        }

        public int kvadratRadija() {
            return this.x * this.x + this.y * this.y;
        }

    }

    public static void main(String[] args) {
        // koda za ro"cno testiranje (po potrebi)
    }
}
