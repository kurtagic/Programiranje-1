
/*
 * Testiranje:
 *
 * tj.exe
 */

import java.util.*;

public class Druga {

    public static void main(String[] args) {
        // koda za ro"cno testiranje (po "zelji)
    }

    public static int najCas(int[][] t, int krog) {
        int najmn = t[0][krog];
        for (int i = 0; i < t.length; i++) {
            if (t[i][krog] < najmn) {
                najmn = t[i][krog];
            }
        }
        return najmn;
    }

    public static int[][] kumulativa(int[][] t) {
        int[][] rez = new int[t.length][t[0].length];
        for (int i = 0; i < t.length; i++) {
            rez[i][0] = t[i][0];
            for (int j = 1; j < t[0].length; j++) {
                rez[i][j] = t[i][j] + rez[i][j-1];
            }
        }
        return rez;
    }
}
