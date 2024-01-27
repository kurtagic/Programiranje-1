import java.util.*;

public class IgorjeviBloki {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int max = c > (a>b ? a:b) ? c:(a>b ? a:b);
		
		String nizA = stringGenerator(a, Integer.toString(a));
		String nizB = stringGenerator(b, Integer.toString(b));
		String nizC = stringGenerator(c, Integer.toString(c));
		
		String presledkiA = stringGenerator(a, " ");
		String presledkiB = stringGenerator(b, " ");
		
		for(int i = 0; i < max; i++) {
			String vrstica = (i < a) ? nizA : presledkiA;

			if(i < b) vrstica += " " + nizB; 
			else if(i < c) vrstica += " " + presledkiB; 
			
			if(i < c) vrstica += " " + nizC; 

			System.out.println(vrstica);
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