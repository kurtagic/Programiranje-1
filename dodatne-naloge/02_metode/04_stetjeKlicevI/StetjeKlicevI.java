import java.util.*;

public class StetjeKlicevI {
	private static int counter = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int n = sc.nextInt();
		
		function(a, b, n);
		
		System.out.println(counter);
	}
	
	private static int function(int a, int b, int n) {
		counter++;
		if(n == 0) return 1;
	
		return function(a, b, n/a) + function(a, b, n/b);
	}
}