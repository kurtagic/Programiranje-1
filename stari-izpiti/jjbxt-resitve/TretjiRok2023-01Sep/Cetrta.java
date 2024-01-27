
/*
Samodejno testiranje:

tj.exe

Javni testni primeri:

01--05: klici metode zamenjaj
06--10: preverjanje implementacije vmesnika Iterable<T>
01--03, 06--08: ro"cno izdelani
*/

import java.util.*;

public class Cetrta {

    public static class Miks<T> implements Iterable<T> {
        private List<T> seznam;
        private Set<T> mnozica;

        public Miks(List<T> seznam, Set<T> mnozica) {
            this.seznam = seznam;
            this.mnozica = mnozica;
        }

        @Override
        public String toString() {
            return String.format("%s | %s", this.seznam, this.mnozica);
        }

        public List<T> vrniSeznam() {
            return this.seznam;
        }

        public Set<T> vrniMnozico() {
            return this.mnozica;
        }

        public void zamenjaj() {
            List<T> zacasna = new ArrayList<>();
            for (T element : seznam) zacasna.add(element);
            seznam.clear();
            for (T element : mnozica) seznam.add(element);
            mnozica.clear();
            for (T element : zacasna) mnozica.add(element);
        }

        public Iterator<T> iterator() {
            return new Iterator<T>() {
                Iterator<T> it1 = seznam.iterator();
                Iterator<T> it2 = mnozica.iterator();
                
                @Override
                public boolean hasNext() {
                    return it1.hasNext() || it2.hasNext();
                }

                @Override
                public T next() {
                    return it1.hasNext() ? it1.next() : it2.next();
                }
            };
        }
    }

    //=========================================================================

    public static void main(String[] args) {
        // koda za ro"cno testiranje (po potrebi) ...
    }
}
