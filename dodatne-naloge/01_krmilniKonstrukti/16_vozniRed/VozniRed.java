import java.util.*;

public class VozniRed {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int h1 = sc.nextInt();
		int m1 = sc.nextInt();
		int h2 = sc.nextInt();
		int m2 = sc.nextInt();
		int d = sc.nextInt();
		
		int zacetniCas = h1*60 + m1;
		int koncniCas = h2*60 + m2;
		
		int trenutniCas = zacetniCas;
		int h3 = h1;
		int m3 = m1;
		
		while(trenutniCas <= koncniCas) {
			System.out.printf("%02d:%02d%n", h3, m3);
			
			trenutniCas += d;
			
			h3 = trenutniCas / 60;
			m3 = trenutniCas % 60;
		}
	}
}