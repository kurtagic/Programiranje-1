
/*
 * tj.exe Prva.java . .
 */

import java.util.*;

public class Prva {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int steviloSolat = sc.nextInt();
        int steviloKupcev = sc.nextInt();
        int keraBranjevka = 1;
        int kopija = steviloSolat;
        for (int i = 0; i < steviloKupcev; i++) {
            int zahteva = sc.nextInt();
            if (zahteva > steviloSolat) {
                keraBranjevka++;
                steviloSolat = kopija;
            }
            steviloSolat -= zahteva;
        }
        System.out.println(keraBranjevka);
    }
}
