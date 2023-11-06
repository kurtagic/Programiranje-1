import java.util.*;

public class CasovnaRazlikaI {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int h1 = scanner.nextInt();
		int m1 = scanner.nextInt();
		
		int h2 = scanner.nextInt();
		int m2 = scanner.nextInt();
		
		int casovnaRazlika = (h2-h1)*60 + m2-m1;
		
		System.out.println(casovnaRazlika);
	}
}