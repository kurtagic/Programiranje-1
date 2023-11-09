import java.util.*;

public class Berac {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int seme = sc.nextInt();
		int mEURtoPound = sc.nextInt();
		int mEURtoDollar = sc.nextInt();
		int k = sc.nextInt();
		int m = sc.nextInt();
		
		Random random = new Random(seme);
		
		System.out.print(znaki(' ', 4));
		System.out.print("Darilo");
		System.out.print(znaki(' ', 10));
		System.out.print("Klobuk");
		System.out.println();
		
		int total = 0;
		while(total < m) {
			int currency = random.nextInt(2 + 1);						
			
			int unitsMoney = random.nextInt(k);
			int mEURmoney = unitsMoney;
			String currencyAronym = "";
			
			switch(currency) {
				case 0:
					currencyAronym = "EUR";
					mEURmoney *= 1000;
					break;
				case 1:
					currencyAronym = "GBP";
					mEURmoney *= mEURtoPound;
					break;
				case 2:
					currencyAronym = "USD";
					mEURmoney *= mEURtoDollar;
					break;

			}
			total += mEURmoney;
			System.out.printf(znaki(' ', 4));
			System.out.printf("%d %s", unitsMoney, currencyAronym);
			System.out.print(znaki(' ', 7));
			System.out.printf("%5d mEUR%n",  total);
		}
	}
	
	private static String znaki(char c, int length) {
		String str = "";
		
		for(int i = 0; i < length; i++) {
			str += c;
		}
		
		return str;
	}
}