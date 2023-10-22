import java.util.*;

public class StevilskaZaporedja {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int a = sc.nextInt();
		int b = sc.nextInt();
		int k = sc.nextInt();
		
		if(!jeKorektenVhod(a, b, k)) {
		
			System.out.println("NAPAKA");
			return;
		}
		
		if(a == b) {
			System.out.println(a);
			return;
		}
		
		for(int i = 0; ; i++) {
			int n = a + k*i;
			
			if(a <= b && n > b || (a > b && n < b)) break;
			
			System.out.println(n);
		}
	}
	
	private static boolean jeKorektenVhod(int a, int b, int k) {
		return k != 0 && ((k > 0 && a <= b) || (k < 0 && a >= b));
	}
}