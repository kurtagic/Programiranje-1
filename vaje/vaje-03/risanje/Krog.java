import java.util.*;

public class Krog {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int width = 2*a;
		
		for(int i = 0; i < width; i++) {
			String presledki = stringGenerator(width - i, " ");
			String zvezdice = stringGenerator(2*i-1, "*");
			String crticeX = stringGenerator(a, "-");
			
			System.out.println(presledki+ zvezdice + presledki);
			
		}
		
		for(int i = width; i > 0; i--) {
			String presledki = stringGenerator(width - i, " ");
			String zvezdice = stringGenerator(2*i-1, "*");
			
			System.out.println(presledki + zvezdice + presledki);
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