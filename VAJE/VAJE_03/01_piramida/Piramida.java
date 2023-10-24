import java.util.*;

public class Piramida {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			String vrstica = "";
			String presledki = "";
			for(int j = 0; j < (n - 1 - i); j++) {
				presledki += " ";
			}
			
			String zvezdice = "";
			for(int k = 0; k < (2*i + 1); k++) {
				zvezdice += "*";
			}
			
			vrstica = presledki + zvezdice;
			
			System.out.println(vrstica);
		}
	}
}