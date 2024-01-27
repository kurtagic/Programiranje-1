import java.util.*;

public class Zgoscenke {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k  = sc.nextInt();
		int zgoscenka = 1;
		int zgoscenkaVelikost = 0;

		while(sc.hasNextInt()) {
			int d = sc.nextInt();
			
			if(d + zgoscenkaVelikost > k) {
				zgoscenka++;
				if(zgoscenka > n) break;
				
				zgoscenkaVelikost = 0;
			}
			
			zgoscenkaVelikost += d;

			System.out.printf("%d EP -> zgoscenka %d (%d EP)%n", d, zgoscenka, zgoscenkaVelikost);
		}
	}
}