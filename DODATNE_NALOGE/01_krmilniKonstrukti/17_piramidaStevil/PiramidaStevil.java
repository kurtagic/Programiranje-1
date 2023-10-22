import java.util.*;

public class PiramidaStevil {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++) {
			
			String presledek = "";
			String stevilo = "";
			
			int x = (i % 10) - 1;

			for(int j = n; j > i; j--) {
				presledek += " ";
			}
			
			for(int k = 0; k < 2*i - 1; k++) {
				x++;
				x %= 10;
				stevilo += Integer.toString(x);
			}
			
			System.out.println(presledek + stevilo);
		}
	}
}