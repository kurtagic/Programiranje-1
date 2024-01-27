
/*
 * tj.exe Druga.java . .
 */

import java.util.*;

public class Druga {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int[][] tabela = new int[h][w];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                tabela[i][j] = sc.nextInt();
            }
        }
        int vzpon = 0;
        int spust = 0;
        int[] visine = new int[w];
        for (int stolpec = 0; stolpec < w; stolpec++) {
            for (int vrstica = h - 1; vrstica >= 0; vrstica--) {
                if (tabela[vrstica][stolpec] == 0) {
                    break;
                }
                visine[stolpec]++;
            }
            if (stolpec != 0) {
                if (visine[stolpec] - visine[stolpec - 1] > 0) {
                    vzpon += visine[stolpec] - visine[stolpec - 1];
                } else {
                    spust += visine[stolpec - 1] - visine[stolpec];
                }
            }
        }
        System.out.println(vzpon);
        System.out.println(spust);
    }
}
