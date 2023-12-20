import java.util.*;

public class SahovskiPopoldnevi {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int p = sc.nextInt();
		int z = sc.nextInt();
		int d = sc.nextInt();
		
		Random rand = new Random(s);
		
		for(int i = 1; i <= d; i++) {
			String zaporedje = chessSequence(rand, a, b, p, z);
			int N = zaporedje.length();
			
			System.out.printf("%d. dan: %s (%d)%n", i, zaporedje, N);
		}
	}
	
	private static String chessSequence(Random random, int a, int b, int p, int z) {
		String str = "";
		int winsA = 0;
		int winsB = 0;
		
		for(int i = 0; (i < p) && (winsA != z && winsB != z); i++) {			
			String result = getRoundResult(random, a, b);
			
			if(result == "A") winsA++;
			if(result == "B") winsB++;
			
			str += result;
		}
		
		return str;
	}
	
	private static String getRoundResult(Random random, int a, int b) {
		int chance = random.nextInt(0, 99 + 1);
		
		if(chance < a) return "A";
		if(chance >= a && chance < a + b) return "B";
		return "r";
	}
}