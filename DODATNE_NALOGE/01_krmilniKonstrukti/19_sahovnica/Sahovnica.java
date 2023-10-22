import java.util.*;

public class Sahovnica {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int v = sc.nextInt();
		int s = sc.nextInt();
		int d = sc.nextInt();
		
		String kvadrat = stringGenerator(d, "*");
		String presledki = stringGenerator(d, " ");
		
		String robX = "+ " + stringGenerator(d*s, "-") + "+";
		System.out.println(robX);
		
		for(int i = 0; i < v; i++) {
			for(int j = 0; j < d; j++) {
				String vrstica = "";
				boolean jeKvadrat = i % 2 == 1;
				for(int k = 0; k < s; k++) {
					if(!jeKvadrat) {
						vrstica += presledki;
						jeKvadrat = true;
					} else {
						vrstica += kvadrat;
						jeKvadrat = false;
					}
				}
				
				System.out.println("| " + vrstica + "|");
			}
		}
		
		System.out.println(robX);
	}
	
	private static String stringGenerator(int n, String value) {
		String str = "";
		
		for(int i = 0; i < n; i++) {
			str += value + " ";
		}
		
		return str;
	}
}