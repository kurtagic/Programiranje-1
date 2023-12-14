import java.util.*;

public class Kvadrati {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		for(int i = a; i <= b; i++) {
			System.out.println(i*i);
		}

	}
}