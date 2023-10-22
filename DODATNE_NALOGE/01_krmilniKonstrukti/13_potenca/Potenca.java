import java.util.*;

public class Potenca {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int a = sc.nextInt();
		int b = sc.nextInt();
		int n = a;
		
		if(b == 0 || a == 1) {
			System.out.println(1);
			return;
		}
		for(int i = 1; i < b; i++) {
			n *= a;
		}
		
		System.out.println(n);
		
	}
}