
/*
Samodejno testiranje:
tj.exe

Javni testni primeri:
01: primer iz besedila
02-04: ni premikov levo in navzgor
01, 05-10: splo"sni primeri
*/

import java.util.*;

public class Druga {

    public static int[] poLomljenki(boolean[][] matrika) {
        int vrstica = 1;
        int stolpec = 1;
        boolean imaSoseda = true;
        int[] premiki = new int[4];
        int od = -1;
        if (!matrika[vrstica + 1][stolpec] && !matrika[vrstica - 1][stolpec] && !matrika[vrstica][stolpec + 1] && !matrika[vrstica][stolpec - 1]) {
            return premiki;
        }
        if (matrika[vrstica][stolpec + 1]) {
            premiki[2]++;
            od = 2;
            stolpec++;
        } else {
            premiki[3]++;
            od = 3;
            vrstica++;
        }
        while (imaSoseda) {
            if (matrika[vrstica - 1][stolpec] && od != 3) {
                premiki[1]++;
                od = 1;
                vrstica--;
            } else if (matrika[vrstica + 1][stolpec] && od != 1) {
                premiki[3]++;
                od = 3;
                vrstica++;
            } else if (matrika[vrstica][stolpec - 1] && od != 2) {
                premiki[0]++;
                od = 0;
                stolpec--;
            } else if (matrika[vrstica][stolpec + 1] && od != 0) {
                premiki[2]++;
                od = 2;
                stolpec++;
            } else {
                imaSoseda = false;
            }
        }
        return premiki;
    }

    // pomo"zne metode, notranji razredi (po potrebi) ...

    public static void main(String[] args) {
        // koda za ro"cno testiranje (po potrebi)
    }
}
