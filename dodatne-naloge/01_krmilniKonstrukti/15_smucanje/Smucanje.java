import java.util.*;

public class Smucanje {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int n = sc.nextInt();
		
		int najCas = Integer.MAX_VALUE;
		int najTekmovalec = 0;
		
		for(int i = 1; i <= n; i++) {
			int cas1 = sc.nextInt();
			
			if(cas1 == 0) continue;
			
			int cas2 = sc.nextInt();
			
			if(cas2 == 0) continue;
			int vsota = cas1 + cas2;
			
			if(vsota < najCas) {
				najCas = vsota;
				najTekmovalec = i;
			}
		}
		
		if(najCas == Integer.MAX_VALUE) {
			System.out.println("NIHCE");
			return;
		}
		
		System.out.println(najTekmovalec);
		System.out.println(najCas);
	}
}