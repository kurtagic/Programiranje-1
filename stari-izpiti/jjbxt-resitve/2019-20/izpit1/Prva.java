
/*
 * Testiranje:
 *
 * tj.exe Prva.java . .
 */

import java.util.*;

public class Prva {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int zacetniKup = sc.nextInt();
        int inkrement = sc.nextInt();
        int iscem = sc.nextInt();
        int stevilkaKupa = 1;
        int zdajsniKup = zacetniKup;
        while(iscem > zdajsniKup) {
            zdajsniKup = zdajsniKup + zacetniKup + stevilkaKupa * inkrement;
            stevilkaKupa++;

        }
        System.out.println(stevilkaKupa);
    }
}
