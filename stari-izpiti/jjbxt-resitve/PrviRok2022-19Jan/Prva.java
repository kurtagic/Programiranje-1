import java.util.Scanner;

public class Prva {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int steviloPravih = 0;
		for (int i = a; i <= b; i++) {
			boolean jePrastevilo = true;
			int stDeliteljevOdPlus2 = 2;
			for (int d = 2; d < i; d++) {
				if (i % d == 0) {
					jePrastevilo = false;
				}
			}
			if (jePrastevilo) {
				for (int d = 2; d < i + 2; d++) {
					if ((i + 2) % d == 0) {
						stDeliteljevOdPlus2++;
					}
				}
				if (stDeliteljevOdPlus2 <= 4) {
					steviloPravih++;
				}
			}
		}
		System.out.println(steviloPravih);
	}
}