import java.util.*;

public class CasovnaRazlikaII {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int h1 = scanner.nextInt();
		int m1 = scanner.nextInt();
		
		int h2 = scanner.nextInt();
		int m2 = scanner.nextInt();
		
		int casovnaRazlika = (h2-h1)*60 + m2-m1;
		
		int deltaH = casovnaRazlika / 60;
		int deltaM = casovnaRazlika % 60;
		
		System.out.printf("%d:%02d", deltaH, deltaM);
	}
}