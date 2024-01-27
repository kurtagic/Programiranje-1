import java.util.*;

public class ZlataSredina {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int dolzina = 2*k+1;
		int[] zaporedje = new int[dolzina];
		
		for (int i = 0; i < dolzina; i++) {
			zaporedje[i] = sc.nextInt();
		}
		
		Arrays.sort(zaporedje);
		
		System.out.println(zaporedje[k]);
	}
}