
/*
 * Testiranje:
 *
 * tj.exe
 */

import java.util.*;

public class Cetrta {

    public static void main(String[] args) {
        // koda za ro"cno testiranje (po "zelji)
    }

    public static class Celica implements Comparable<Celica>{
        private int vrstica;
        private int stolpec;

        public Celica(int vrstica, int stolpec) {
            this.vrstica = vrstica;
            this.stolpec = stolpec;
        }

        public int vrniVrstico() {
            return this.vrstica;
        }

        public int vrniStolpec() {
            return this.stolpec;
        }

        public int manRaz(int center) {
            return Math.abs(center - this.vrstica) + Math.abs(center - this.stolpec);
        }

        @Override
        public int compareTo(Celica druga) {
            return this.vrstica == druga.vrniVrstico() ? this.stolpec - druga.vrniStolpec() : this.vrstica - druga. vrniVrstico() ;
        }

        @Override
        public String toString() {
            return String.format("(%d, %d)", this.vrstica, this.stolpec);
        }
    }

    public static class Ovojnik implements Iterable<Celica>{
        private boolean[][] tabela;

        public Ovojnik(boolean[][] tabela) {
            this.tabela = tabela;
        }

        public Iterator<Celica> iterator() {
            NavigableSet<Celica> mnozica = new TreeSet<>();
            for (int i = 0; i < this.tabela.length; i++) {
                for (int j = 0; j < this.tabela.length; j++) {
                    if (this.tabela[i][j]) {
                        mnozica.add(new Celica(i, j));
                    }
                }
            }
            return mnozica.iterator();
        }

        public NavigableSet<Celica> enice() {
            NavigableSet<Celica> mnozica = new TreeSet<>((c1, c2) ->
                (c1.manRaz(this.tabela.length / 2) == c2.manRaz(this.tabela.length / 2) ? c1.compareTo(c2) : c1.manRaz(this.tabela.length / 2) - c2.manRaz(this.tabela.length / 2)));
            for (int i = 0; i < this.tabela.length; i++) {
                for (int j = 0; j < this.tabela.length; j++) {
                    if (this.tabela[i][j]) {
                        mnozica.add(new Celica(i, j));
                    }
                }
            }
            return mnozica;
        }

        // dopolnite po potrebi ...
    }
}
