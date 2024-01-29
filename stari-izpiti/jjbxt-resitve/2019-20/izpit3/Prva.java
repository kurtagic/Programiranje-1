
/*
 * Testiranje:
 *
 * tj.exe Prva.java . .
 */

import java.util.*;

public class Prva {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int vsota;
        do {
            vsota = 0;
            for(int i = 1; i <= n / 2; i++) {
                if (n % i == 0) {
                    vsota += i;
                }
            }
            n++;
        } while(vsota < n);
        System.out.println(--n);
    }

    // po potrebi dopolnite ...
}
