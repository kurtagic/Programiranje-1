
/*
 * tj.exe
 */

import java.util.*;

public class Cetrta {

    public static <T> List<T> odsek(Iterator<T> it, int p, int q) {
        List<T> seznam = new ArrayList<>(q - p + 1);
        for (int i = 0; i < p; i++) {
            it.next();
        }
        for (int i = p; i <= q; i++) {
            seznam.add(it.next());
        }
        return seznam;
    }

    public static Iterator<Integer> manjkajoci(Iterator<Integer> it, int zacetek) {
        return new Iterator<Integer>() {
            int vrni = zacetek;
            Collection<Integer> zbirka = new HashSet<>();
            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                zbirka.add(it.next());
                if (!zbirka.contains(vrni)) {
                    return vrni++;
                }
                vrni++;
                return next();
            }
        };
    }

    public static void main(String[] args) {
        // koda za ro"cno testiranje (po potrebi)
    }
}
