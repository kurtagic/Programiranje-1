import java.util.*;

public class DigitalneCrtice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int najvec = 0;
		
		for(int i = 0; i < n; i++) {
			int stevilo = sc.nextInt();
			if(numberLines(stevilo) > numberLines(najvec)) najvec = stevilo;
		}
		
		System.out.println(najvec);
	}
	
	private static int numberLines(int n) {
		int[] stevke = {6, 2, 5, 5, 4, 5, 6, 3, 7, 6};
		int sum = 0;
		
		while(n > 0) {
			sum += stevke[n % 10];	
			n /= 10;
		}
		
		return sum;
	}
}