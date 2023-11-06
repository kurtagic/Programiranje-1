import java.util.*;

public class PascalovTrikotnik {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 0; i < n + 1; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print(binomialCoeficient(i, j) + " ");
			}
			System.out.printf("1%n");
		}
	}
	
	private static int binomialCoeficient(int n, int k) {
		if(k == 0 || n == k) return 1;
		if(n == 1) return n;

		return binomialCoeficient(n-1, k-1) + binomialCoeficient(n-1, k);
	}
}