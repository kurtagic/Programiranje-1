
/*
Samodejno testiranje:

tj.exe Prva.java . .

Javni testni primeri:

01: primer iz besedila
02--06: zamik = 0
01, 07--10: splo"sni primeri
*/

import java.util.*;

public class Prva {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int visina = 0, zamik = 0;
        boolean found1 = false;
        while (sc.hasNextInt()) {
            int x = sc.nextInt();
            if (x == 1) found1 = true;
            if (!found1) zamik++;
            if (x == 2) visina++;
        }
        System.out.println(visina);
        System.out.println(zamik - visina + 1);
    }

    // pomo"zne metode, notranji razredi (po potrebi) ...
}
