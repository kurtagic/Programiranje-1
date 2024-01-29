
/*
 * Testiranje:
 *
 * tj.exe Cetrta.java . .
 */

import java.util.*;

public class Cetrta {
    public static void main(String[] args) {
        Map<String, List<Integer>> rezultati = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String prviGlas = sc.next();
            String drugiGlas = sc.next();
            List<Integer> glasoviZaStranko = rezultati.get(prviGlas);
            if (glasoviZaStranko == null) {
                glasoviZaStranko = new ArrayList<>();
                glasoviZaStranko.add(1);
                glasoviZaStranko.add(0);
            } else if (glasoviZaStranko.get(0) == null) {
                glasoviZaStranko.set(0, 1);
            } else {
                glasoviZaStranko.set(0, glasoviZaStranko.get(0) + 1);
            }
            List<Integer> glasoviZaStranko2 = rezultati.get(drugiGlas);
            if (glasoviZaStranko2 == null) {
                glasoviZaStranko2 = new ArrayList<>();
                glasoviZaStranko2.add(0);
                glasoviZaStranko2.add(1);
            } else if (glasoviZaStranko2.get(1) == null) {
                glasoviZaStranko2.set(1, 1);
            } else {
                glasoviZaStranko2.set(1, glasoviZaStranko2.get(1) + 1);
            }
            rezultati.put(prviGlas, glasoviZaStranko);
            rezultati.put(drugiGlas, glasoviZaStranko2);
        }
        Map<String, List<Integer>> urejen = new TreeMap<>((s1, s2) -> (!rezultati.get(s1).get(0).equals(rezultati.get(s2).get(0)) ? rezultati.get(s2).get(0) - rezultati.get(s1).get(0) : (!rezultati.get(s1).get(1).equals(rezultati.get(s2).get(1)) ? rezultati.get(s2).get(1) - rezultati.get(s1).get(1) : s1.compareTo(s2))));
        for (String s: rezultati.keySet()) {
            urejen.put(s, rezultati.get(s));
        }
        List<String> stranke = new ArrayList<>();
        for (String stranka: urejen.keySet()) {
            stranke.add(stranka);
        }
        System.out.println(stranke.toString());
    }

    // po potrebi dopolnite ...
}
