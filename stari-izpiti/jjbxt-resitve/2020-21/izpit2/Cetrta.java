
/*
 * tj.exe
 */

import java.util.*;

public class Cetrta {

    public static void main(String[] args) {
        // koda za ro"cno testiranje (po potrebi)
    }

    public static <T> List<T> razmnozi(List<T> seznam, int n) {
        List<T> rez = new ArrayList<>();
        for (int i = 0; i < seznam.size(); i++) {
            for (int j = 0; j <= i % n; j++) {
                rez.add(seznam.get(i));
            }
        }
        return rez;
    }

    public static <T> Iterator<T> razmnozevalnik(List<T> seznam, int n) {
        return new Iterator<T>() {

            int indeksElementa = 0;
            int kokratZe = 0;

            @Override
            public boolean hasNext() {
                if (kokratZe > indeksElementa % n) {
                    kokratZe = 0;
                    indeksElementa++;
                }
                return seznam.size() > indeksElementa;
            }

            @Override
            public T next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                kokratZe++;
                return seznam.get(indeksElementa);
            }
        };
    }
}
