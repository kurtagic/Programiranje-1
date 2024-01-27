import java.util.*;

public class Trihotomija {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		int result = 1;
		if(a == b) result = 0;
		else if(a < b) result = -1;
		
		System.out.println(result);
	}
}