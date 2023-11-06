import java.util.*;

public class NajblizjiElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int n = sc.nextInt();
		
		int[] stevila = new int[n];
		int najblizji = 0;
		
		for(int i = 0; i < n; i++) {
			stevila[i] = sc.nextInt();
			if(Math.abs(k-stevila[i]) < Math.abs(k - stevila[najblizji])) {
				najblizji = i;
			}
		}
		
		System.out.println(najblizji);
	}
}