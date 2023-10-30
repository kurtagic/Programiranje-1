import java.util.*;

public class VrazeverniBoris {
	
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);

		int s = sc.nextInt();
		int n = sc.nextInt();

		Random rand = new Random(s);

		for(int i = 1; i <= n; i++) {
			String D = String.format("%4d", i);
	
			boolean jeNedelja = i % 7 == 0;
			String T = jeNedelja ? "N" : "D";
			int lihoMetov = jeNedelja ? 5 : 3;

			String M = generateDiceRolls(rand, lihoMetov);
			int S = M.length()/2;

			System.out.printf("%s (%s): %s[%d]%n", D, T, M, S);
		}
	}

	private static String generateDiceRolls(Random random, int oddRolls) {
		String str = "";
		int oddRollsCounter = 0;
		while(oddRollsCounter < oddRolls) {
			int roll = random.nextInt(1, 6+1);
			str += roll + " ";
			if(roll % 2 == 1) oddRollsCounter++;
		}
		
		return str;
	}	
}