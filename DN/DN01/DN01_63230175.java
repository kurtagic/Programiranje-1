import java.util.*;

public class DN01_63230175 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println(squaresCounter(sc.nextInt(), sc.nextInt()));
	}
	
	private static int squaresCounter(int a, int b) {
		
		if(a == b) return a*(a-1)*(2*a-1)/6; // n(n+1)(2n+1)/6 ,  { n=a-1 }
		
		int c = (a > b) ? a : b;
		int d = (a > b) ? b : a;
		
		return d*(d-1)*(3*c-d-1)/6; // m(m+1)(3n-m+1)/6 , { n > m, n=c-1, m=d-1 }
	}
}