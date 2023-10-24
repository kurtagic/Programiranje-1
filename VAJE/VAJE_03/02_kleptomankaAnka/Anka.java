import java.util.*;

public class Anka {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int d = sc.nextInt();
		
		int a = 1; // liha
		int b = m + 1; // b > m
		int c = d; // c % d == 0
		int counter = 0;
		for (int i = a; i < 10; i+=2) {
			String vrstica = "";
			vrstica += i + "-";
			for (int j = b; j < 10; j++) {
				String vrsticaJ = vrstica;
				vrsticaJ += j + "-";
				for (int k = 0; k < 10; k +=d) {
					String vrsticaK = vrsticaJ;
					vrsticaK += k;
					System.out.println(vrsticaK);
					
					counter++;
				}
			}
		}
		
		System.out.println(counter);
	}
}