import java.util.Scanner;
public class Sejk {
    private static final int VELIKOST_TABELE = 2000;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int stOznak = sc.nextInt();
        int ciljnaVsota = sc.nextInt();

        int[] frekvenca = new int[VELIKOST_TABELE];
        for (int i = 0; i < stOznak; i++) {
            int oznaka = sc.nextInt();
            frekvenca[oznaka]++;
        }
        long stParov = 0;
        for (int oznaka = 1; oznaka < ciljnaVsota; oznaka++) {
            stParov += ((long) frekvenca[oznaka]) *
                    ((long) frekvenca[ciljnaVsota - oznaka]);
        }
        System.out.println(stParov);
    }
}