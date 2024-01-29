
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

    public static int stPresezkov(int[][] r, int meja) {
        int st = 0;
        for (int i = 0; i < r.length; i++) {
            for (int j = 0; j < r[i].length; j++) {
                if (r[i][j] > meja) {
                    st++;
                }
            }
        }
        return st;
    }

    public static int nedeljskoPovprecje(int[][] r) {
        int skupnoDelcev = 0;
        int prvi = 6;
        int stNedelj = 0;
        for (int i = 0; i < r.length; i++) {
            for (int j = prvi; j < r[i].length; j += 7) {
                skupnoDelcev += r[i][j];
                stNedelj++;
                if (r[i].length - 7 <= j) {
                    prvi = 6 - r[i].length + j + 1;
                }
            }
        }
        return (int) skupnoDelcev / stNedelj;
    }
}
