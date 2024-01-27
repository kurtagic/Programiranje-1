
import java.util.*;

public class Druga {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int stevilo = 0;
        int[][] slika = new int[h][w];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (sc.nextInt() == 1) {
                    slika[i][j] = 1;
                }
            }
        }

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (slika[i][j] == 1) {
                    if (i * j == 0 || i == h - 1 || j == w - 1) {
                        stevilo++;
                    } else if (slika[i-1][j] == 0 || slika[i+1][j] == 0 || slika[i][j-1] == 0 || slika[i][j+1] == 0 || slika[i-1][j-1] == 0 || slika[i-1][j+1] == 0 || slika[i+1][j-1] == 0 || slika[i+1][j+1] == 0) {
                        stevilo++;
                    }
                }
            }
        }
        System.out.println(stevilo);
    }
}