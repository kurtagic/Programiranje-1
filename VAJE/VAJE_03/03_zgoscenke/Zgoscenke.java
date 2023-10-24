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
			
			if(d <= (k - zgoscenkaVelikost)) {
				
				zgoscenkaVelikost += d;
				System.out.printf("%d EP -> zgoscenka %d (%d EP)", d, zgoscenka, zgoscenkaVelikost);
				
			} else {
				
				zgoscenka++;
				zgoscenkaVelikost = 0;
				zgoscenkaVelikost += d;
				
				if(zgoscenka > n) break;
				
				System.out.printf("%d EP -> zgoscenka %d (%d EP)", d, zgoscenka, zgoscenkaVelikost);
			}
			System.out.println();
		}
		
	}
}