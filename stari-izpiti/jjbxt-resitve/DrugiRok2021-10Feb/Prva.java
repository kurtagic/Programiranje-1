
/*
 * tj.exe Prva.java . .
 */

import java.util.*;

public class Prva {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (int vrstica = 0; vrstica < 5 * a; vrstica++) {
            if (vrstica < 2 * a || vrstica >= 3 * a) {
                for (int i = 0; i < b; i++) {
                    System.out.print("*");
                }
                for (int i = 0; i < 2 * b; i++) {
                    System.out.print(" ");
                }
                for (int i = 0; i < b; i++) {
                    System.out.print("*");
                }
            } else {
                for (int i = 0; i < 4 * b; i++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
