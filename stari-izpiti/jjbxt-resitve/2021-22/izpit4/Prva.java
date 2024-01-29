import java.util.Scanner;

public class Prva {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int stevec = 0;
        int x = sc.nextInt();
        int y = sc.nextInt();
        boolean s = false;
        boolean ok = true;
        for (int i = 1; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (s) {
                x = a;
                y = b;
                s = false;
                ok = false;
            }
            if (ok && a == x && b == y) {
                stevec++;
                s = true;
            }
            ok = true;
        }
        System.out.println(stevec);
    }
}
