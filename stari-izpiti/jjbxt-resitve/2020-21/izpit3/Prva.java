
import java.util.*;

public class Prva {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int v = sc.nextInt();
        int[] stevke = new int[d];
        for (int i = 0; i < d; i++) {
            stevke[i] = 9;
        }
        int vsota = 9 * d;
        int indeks = 0;
        while(vsota != v) {
            if (indeks == 0) {
                if (stevke[indeks] > 1) {
                    stevke[indeks]--;
                    vsota--;
                } else {
                    indeks++;
                }
            } else {
                if (stevke[indeks] > 0) {
                    stevke[indeks]--;
                    vsota--;
                } else {
                    indeks++;
                }
            }
        }
        int deset = 1;
        int stevilo = 0;
        for (int i = d - 1; i >= 0; i--) {
            stevilo += deset * stevke[i];
            deset *= 10;
        }
        System.out.println(stevilo);
    }
}
