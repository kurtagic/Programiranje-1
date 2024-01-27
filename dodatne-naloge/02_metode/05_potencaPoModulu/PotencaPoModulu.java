import java.util.*;

public class PotencaPoModulu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int m = sc.nextInt();

		System.out.println(modularExponentiation(a, b, m));
	}

	private static int modularExponentiation(int a, int b, int m) { 
		if (a == 0) return 0; 
		if (b == 0) return 1; 
		
		long x = -1;
		
		if (b % 2 == 0) { 
			x = modularExponentiation(a, b/2, m); 
			x = (x * x) % m; 
		} else { 
			x = a % m; 
			x = (x * modularExponentiation(a, b-1, m) % m) % m; 
		} 

		return (int) x % m;
	}
}