
/*
 * Samodejno testiranje:
 * tj.exe
 *
 * Javni testni primeri:
 * 01: primer iz besedila
 * 02, 03: manj"sa la"zja primera (vsaka navpi"cna premica seka natanko eno polico)
 * 04..06: ve"cji la"zji primeri
 * 07: manj"si splo"sni primer
 * 08..10: ve"cji splo"sni primeri
 *
 * Skriti testni primeri:
 * 01..25: la"zji
 * 26..50: splo"sni
 *
 * Za vsako polico velja x >= 0, d >= 1, x + d <= m, y >= 1 in y <= m
 * (d je dol"zina police).  Police se med seboj ne prekrivajo.
 */

import java.util.*;

public class Druga {

    public static int najGlobina(int m, int[][] p) {
        int[] maxPoStolpcih = new int[m];
        int absMin = 0;
        for (int i = 0; i < m; i++) {
            maxPoStolpcih[i] = m;
        }
        for (int i = 0; i < m; i++) {
            int minNaStolpec = m;
            for (int[] tab: p) {
                if(tab[0] == i) {
                    minNaStolpec = tab[1];
                    for (int j = 0; j < tab[2]; j++) {
                        if (maxPoStolpcih[i + j] > minNaStolpec) {
                            maxPoStolpcih[i + j] = minNaStolpec;
                        }
                    }
                }
            }
        }
        for (int k: maxPoStolpcih) {
            if (k > absMin) {
                absMin = k;
            }
        }
        return absMin;
    }

    // pomo"zne metode, notranji razredi (po potrebi) ...

    public static void main(String[] args) {
        // koda za ro"cno testiranje (po potrebi)
    }

}
