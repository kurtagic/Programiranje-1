import java.util.*;

public class Piramida {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			String presledki = stringGenerator((n - i - 1), " ");
			String zvezdice = stringGenerator((2*i + 1), "*");
			
			System.out.println(presledki + zvezdice);
		}
	}
	
	private static String stringGenerator(int n, String value) {
		String str = "";
		
		for(int i = 0; i < n; i++) {
			str += value;
		}
		
		return str;
	}
}