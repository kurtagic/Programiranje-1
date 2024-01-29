
/*
Samodejno testiranje:
tj.exe Prva.java . .

Testni primeri:

01: primer iz besedila
02..04: na vhodu je 42 "stevil
01, 05..10: splo"sni primeri
*/

import java.util.*;

public class Prva {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int najVsota = Integer.MIN_VALUE;
        int prvi = sc.nextInt();
        while (sc.hasNextInt()) {
            int drugi = sc.nextInt();
            int vsota = prvi + drugi;
            if (vsota > najVsota) {
                najVsota = vsota;
            }
            prvi = drugi;
        }
        System.out.println(najVsota);
    }
}
