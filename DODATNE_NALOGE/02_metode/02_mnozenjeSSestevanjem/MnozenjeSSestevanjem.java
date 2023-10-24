import java.util.*;

public class MnozenjeSSestevanjem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int vrednost = 0;
		for(int i = 0; i < m; i++) {
			vrednost = sumOf2(vrednost, n);
		}
		
		System.out.println(vrednost);
	}
	
	private static int sumOf2(int a, int b) {
		return a + b;
	}
}