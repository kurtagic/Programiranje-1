import java.util.*;

public class NajblizjiVeckratnik {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		int najbljizjiVeckratnik = closestMultiple(a, b);

		System.out.println(najbljizjiVeckratnik);
		
		scanner.close();
	}
	
	public static int closestMultiple(int a, int b) {
		int multiple = 0;
		
		if(a == b) return a;
		
		for(int i = 0; ; i++) {
			
			multiple = b-i;
			
			if(multiple % a == 0) return multiple;
			
			multiple = b + i;
			
			if(multiple % a == 0) return multiple;
		}
	}
}