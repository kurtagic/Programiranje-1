
/*
Samodejno testiranje:
tj.exe Prva.java . .

Javni testni primeri:
01: primer iz besedila
02-04: vsa "stevila so enomestna
01, 05-10: splo"sni primeri
*/

import java.util.*;

public class Prva {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int stevec = 0;
        boolean jeUstrezen;
        for (int i = 0; i < n; i++) {
            jeUstrezen = true;
            int st1 = sc.nextInt();
            int st2 = sc.nextInt();
            while (st1 != 0 && jeUstrezen) {
                if (st1 % 10 >= st2 % 10) {
                    jeUstrezen = false;
                }
                st1 /= 10;
                st2 /= 10;
            }
            if (jeUstrezen) {
                stevec++;
            }
        }
        System.out.println(stevec);
    }

    // pomo"zne metode, notranji razredi (po potrebi) ...
}
