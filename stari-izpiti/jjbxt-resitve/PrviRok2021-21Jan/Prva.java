
/*
 * tj.exe Prva.java . .
 */

import java.util.*;

public class Prva {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        z:
        for(int i = 0; i < n; i++) {
            int k = sc.nextInt();
            while(k / 10 != 0) {
                int stevka = k % 10;
                k /= 10;
                int prejsnjaStevka = k % 10;
                if (prejsnjaStevka < stevka) {
                    System.out.println("NE");
                    continue z;
                }
            }
            System.out.println("DA");
        }
    }
}
