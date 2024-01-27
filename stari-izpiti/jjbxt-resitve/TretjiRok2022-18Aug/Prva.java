
/*
 * Samodejno testiranje:
 * tj.exe Prva.java . .
 *
 * Javni testni primeri:
 * 01, 02: primera iz besedila
 * 03..10: splo"sni primeri
 */

import java.util.*;

public class Prva {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int d = sc.nextInt();
        int kopija = h;
        for (int i = 0; i < h; i++) {
            kopija--;
            for (int p = 0; p < kopija; p++) {
                System.out.print(" ");
            }
            if (i == 0 || i == h - 1) {
                for (int j = 0; j < d; j++) {
                    System.out.print("*");
                }
            } else {
                for (int j = 0; j < d; j++) {
                    if (j == 0 || j == d - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }  
            }
            if (i != h - 1) {
                System.out.println();
            }
            d += 2;
        }
    }

    // pomo"zne metode, notranji razredi (po potrebi) ...
}
