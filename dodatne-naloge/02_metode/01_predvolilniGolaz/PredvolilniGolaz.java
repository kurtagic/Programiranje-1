import java.util.*;

public class PredvolilniGolaz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int denar = sc.nextInt();
		
		while(sc.hasNextInt() && denar > 0) {
			int cenaKosila = sc.nextInt();
			int steviloKosil  = sc.nextInt();
			int jeVino = sc.nextInt();
			
			int cena = dinnerBill(cenaKosila, steviloKosil, jeVino);
			denar -= cena;
			
			System.out.printf("%d %s%n", cena, denar >= 0 ? String.valueOf(denar) : "-");
		}
	}
	
	private static int dinnerBill(int dinnerPrice, int mealsCount, int isWine) {
		double bill = dinnerPrice*mealsCount;
		if(isWine == 1) {
			double winePrice = Math.ceil(bill/2);
			bill += winePrice;
		}
		
		return (int) bill;
	}
}