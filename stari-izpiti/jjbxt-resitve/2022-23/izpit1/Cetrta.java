
/*
Samodejno testiranje:
tj.exe Cetrta.java . .

Testni primeri:

01, 02: primera iz besedila
03..06: u = 1
07..10: u = 2
*/

import java.util.*;

public class Cetrta {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int u = sc.nextInt();
        switch (u) {
        case 1:
            Set<String> ponudniki = new TreeSet<>();
            for (int i = 0; i < n; ++i) {
                String ponudnik = sc.next();
                String artikel = sc.next();
                int cena = sc.nextInt();
                ponudniki.add(ponudnik);
            }
            for (String ponudnik : ponudniki) {
                System.out.println(ponudnik);
            }
            break;
        case 2:
            String a = sc.next();
            Set<Integer> cene = new TreeSet<>();
            Map<Integer, String> slovar = new HashMap<>();
            for (int i = 0; i < n; ++i) {
                String ponudnik = sc.next();
                String artikel = sc.next();
                int cena = sc.nextInt();
                if (artikel.equals(a)) {
                    cene.add(cena);
                    slovar.put(cena, ponudnik);                    
                }
            }
            for (Integer cena : cene) {
                System.out.println(slovar.get(cena));
            }
        }
    }
}
