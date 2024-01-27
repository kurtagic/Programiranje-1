
/*
Samodejno testiranje:

tj.exe

Javni testni primeri:
01: primer iz besedila
02--04: natanko dva elementa true
05--07: H = 1
01, 08--10: splo"sni primeri
*/

import java.util.*;

public class Druga {

    public static int[] manhattan(boolean[][] t) {
        int h = t.length, w = t[0].length;
        int[] razdalje = new int[h + w - 1];
        for (int i = 0; i < h; ++i) {
            for (int j = 0; j < w; ++j) {
                for (int a = 0; a < h; ++a) {
                    for (int b = 0; b < w; ++b) {
                        if (t[i][j] && t[a][b]) {
                            razdalje[Math.abs(i - a) + Math.abs(j - b)]++;
                        }
                    }
                }
            }
        }
        razdalje[0] = 0;
        for (int i = 0; i < razdalje.length; ++i) razdalje[i] /= 2;
        return razdalje;
    }

    // pomo"zne metode, notranji razredi (po potrebi) ...

    public static void main(String[] args) {
        // koda za ro"cno testiranje (po potrebi)
    }
}
