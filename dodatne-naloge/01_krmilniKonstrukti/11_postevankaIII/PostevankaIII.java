import java.util.*;

public class PostevankaIII {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		int a = sc.nextInt();
		int b = sc.nextInt();
			
		for(int i = 1; a*i <= b; i++) {
			System.out.printf("%d * %d = %d%n", a, i, a*i);
		}
	}
}