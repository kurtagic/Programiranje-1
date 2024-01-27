
/*
 * tj.exe
 */

import java.util.*;

public class Druga {
    
    public static int stolpecZNajvecPrevladujoceZelenimi(int[][][] slika) {
        int najPre = 0;
        int najIndeks = 0;
        int stVrstic = slika.length;
        int stStolpcev = slika[0].length;
        for (int stolpec = 0; stolpec < stStolpcev; stolpec++) {
            int kandidat = 0;
            for (int vrstica = 0; vrstica < stVrstic; vrstica++) {
                if (slika[vrstica][stolpec][1] > slika[vrstica][stolpec][0] && slika[vrstica][stolpec][1] > slika[vrstica][stolpec][2]) {
                    kandidat++;
                }
            }
            if (kandidat > najPre) {
                najPre = kandidat;
                najIndeks = stolpec;
            }
        }
        return najIndeks;
    }

    public static void main(String[] args) {
        // koda za ro"cno testiranje (po potrebi)
    }
}
