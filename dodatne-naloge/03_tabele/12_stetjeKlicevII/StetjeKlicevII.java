import java.util.*;

public class StetjeKlicevII {
	private static Set<Integer> calls = new HashSet<>();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int n = sc.nextInt();
		
		function(a, b, n);
		
		System.out.println(calls.size());
	}
	
	private static int function(int a, int b, int n) {
		calls.add(n);
		if(n == 0) return 1;
	
		return function(a, b, n/a) + function(a, b, n/b);
	}
}