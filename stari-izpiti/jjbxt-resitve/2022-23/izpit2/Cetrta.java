
/*
Samodejno testiranje:
tj.exe

Javni testni primeri:
01-05: najMnozica
06-10: pogostost
01, 06: ro"cno izdelana
*/

import java.util.*;

public class Cetrta {

    public static Set<String> najMnozica(Map<String, Set<String>> sopomenke) {
        int najvec = 0;
        Set<String> najvecja = null;
        for (Set<String> mnozicaSopomenk: sopomenke.values()) {
            if (mnozicaSopomenk.size() > najvec) {
                najvec = mnozicaSopomenk.size();
                najvecja = mnozicaSopomenk;
            }
        }
        return najvecja;
    }

    public static Map<Set<String>, Integer> pogostost(String besedilo, Map<String, Set<String>> sopomenke) {
        Map<Set<String>, Integer> slovar = new HashMap<>();
        String[] besede = besedilo.split("\\s+");
        for (String beseda: besede) {
            for (String word: sopomenke.keySet()) {
                if (word.equals(beseda)) {
                    Set<String> mnsop = sopomenke.get(word);
                    Integer frekvenca = slovar.get(mnsop);
                    if (frekvenca == null) {
                        frekvenca = 1;
                    } else {
                        frekvenca++;
                    }
                    slovar.put(mnsop,frekvenca);
                }
            }
        }
        return slovar;
    }

    // pomo"zne metode, notranji razredi (po potrebi) ...

    public static void main(String[] args) {
        // koda za ro"cno testiranje (po potrebi) ...
    }
}
