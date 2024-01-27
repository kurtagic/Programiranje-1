import java.util.*;

public class NajboljseSeme {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int n = sc.nextInt();

		int najboljseSeme = -1;
		long najboljseSemeVrednost = -1;
		
		for(int i = a; i <= b; i++) {
			long semeValue = seedGenerator(i, n);
			
			if(semeValue > najboljseSemeVrednost) {
				najboljseSeme = i;
				najboljseSemeVrednost = semeValue;			
			} 
		}
		
		System.out.println(najboljseSeme);
	
	}
	
	public static long seedGenerator(int x, int n) {
		Random rand = new Random(x);
		long seed = 0;
		long base = (long) Math.pow(10, n-1);
		
		for(int i = 0; i < n; i++) {
			seed += rand.nextInt(10)*base;
			base /= 10;
		}
		
		return seed;
	}
}