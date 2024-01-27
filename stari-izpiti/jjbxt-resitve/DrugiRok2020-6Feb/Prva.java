
/*
 * Testiranje:
 *
 * tj.exe Prva.java . .
 */

import java.util.*;

public class Prva {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int prvi = sc.nextInt();
        int drugi = sc.nextInt();
        int indeks = 1;
        while(sc.hasNextInt() && drugi % prvi == 0) {
            indeks++;
            prvi = drugi;
            drugi = sc.nextInt();
        }
        if (drugi % prvi == 0) {
            indeks++;
        }
        System.out.println(indeks);
    }

    // po potrebi dopolnite ...
}
