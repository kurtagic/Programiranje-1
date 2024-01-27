
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

    //=========================================================================
    // V vseh testnih primerih velja:
    // 1 <= "stevilo vrstic tabele <= 100
    // 1 <= "stevilo stolpcev tabele <= 100
    //=========================================================================

    public static int zadnjaVrsticaZLocilom(char[][] krizanka) {
        for (int i = krizanka.length - 1; i >= 0; i--) {
            for (int j = 0; j < krizanka[0].length; j++) {
                if (krizanka[i][j] == '-') {
                    return i;
                }
            }
        }
        return -1;
    }

    //=========================================================================
    // V vseh testnih primerih velja:
    // 1 <= "stevilo vrstic tabele <= 100
    // 1 <= "stevilo stolpcev tabele <= 100
    // 0 <= stolpec < "stevilo stolpcev
    //=========================================================================
//
//    public static char[] ktaBeseda(char[][] krizanka, int stolpec, int k) {
//        StringBuilder sb = new StringBuilder();
//        boolean praznaBeseda = false;
//        int keraBeseda = 1;
//        for (int i = 0; i < krizanka.length; i++) {
//            if (krizanka[i][stolpec] == '-') {
//                keraBeseda++;
//            }
//            if (keraBeseda == k) {
//                sb.append(krizanka[i][stolpec]);
//                praznaBeseda = true;
//            }
//        }
//        if (sb == null) {
//            if (praznaBeseda) {
//                return new char[]{};
//            }
//            return null;
//        }
//        String beseda = sb.toString();
//        char[] resitev = new char[beseda.length()];
//        for (int i = 0; i < beseda.length(); i++) {
//            resitev[i] = beseda.charAt(i);
//        }
//        return resitev;
//    }

    public static char[] ktaBeseda(char[][] krizanka, int stolpec, int k) {
        boolean obstaja = false;
        List<Character> rez = new ArrayList<>();
        int stMinusov = 0;
        for (int i = 0; i < krizanka.length; i++) {
            if (stMinusov == k - 1) {
                obstaja = true;
                if (krizanka[i][stolpec] != '-') {
                    rez.add(krizanka[i][stolpec]);
                }
            }
            if (krizanka[i][stolpec] == '-') {
                stMinusov++;
                if (stMinusov == k - 1) {
                    obstaja = true;
                }
            }
        }
        char[] r = new char[rez.size()];
        if (!obstaja) {
            return null;
        }
        for (int i = 0; i < r.length; i++) {
            r[i] = rez.get(i);
        }
        return r;
    }
}
