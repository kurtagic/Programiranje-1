
/*
 * tj.exe Druga.java . .
 */

import java.util.*;

public class Druga {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int visina = sc.nextInt();
        int sirina = sc.nextInt();
        int dol = sc.nextInt();
        int desno = sc.nextInt();
        int ciljDreves = sc.nextInt();
        int[][] pravokotnik = new int[visina][sirina];
        for (int i = 0; i < visina; i++) {
            for (int j = 0; j < sirina; j++) {
                pravokotnik[i][j] = sc.nextInt();
            }
        }
        int steviloUr = 1;
        int steviloObiskanih = 0;
        int x = 0;
        int y = 0;
        while(steviloObiskanih != ciljDreves && steviloUr <= 10000) {
            x = (x + desno) % sirina;
            y = (y + dol) % visina;
            if (pravokotnik[y][x] == 1) {
                steviloObiskanih++;
            }
            steviloUr++;
        }
        System.out.println(--steviloUr);
    }
}
