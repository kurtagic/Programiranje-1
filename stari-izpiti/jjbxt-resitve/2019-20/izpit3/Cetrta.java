
/*
 * Testiranje:
 *
 * tj.exe
 */

import java.util.*;

public class Cetrta {

    public static interface Generator {
        public int naslednji();
    }

    public static int stKlicev(Generator gen, int k) {
        Map<Integer, Integer> slovar = new HashMap<>();
        int stevec = 0;
        int kokKlicev = 0;
        while (stevec < k) {
            kokKlicev++;
            int nasl = gen.naslednji();
            if (slovar.keySet().contains(nasl)) {
                slovar.put(nasl, slovar.get(nasl) + 1);
            } else {
                slovar.put(nasl, 1);
            }
            for (Integer i: slovar.keySet()) {
                if (slovar.get(i) > stevec) {
                    stevec++;
                }
            }
        }
        return kokKlicev;
    }

    public static void main(String[] args) {
        // koda za ro"cno testiranje (po "zelji)
    }
}
