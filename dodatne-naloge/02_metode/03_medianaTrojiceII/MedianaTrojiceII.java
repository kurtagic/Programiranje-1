import java.util.*;

public class MedianaTrojiceII {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int median = max(min(a,b), min(max(a,b), c));
		
		System.out.println(median);
	}
	
	private static int min(int a, int b) {
		return a < b ? a : b;
	}
	
	private static int max(int a, int b) {
		return a > b ? a : b;
	}
	
}