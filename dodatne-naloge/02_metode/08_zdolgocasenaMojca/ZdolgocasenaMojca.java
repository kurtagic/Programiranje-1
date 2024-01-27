import java.util.*;

public class ZdolgocasenaMojca {
	
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);

		int s = sc.nextInt();
		int k = sc.nextInt();
		int d = sc.nextInt();

		Random rand = new Random(s);
		
		for(int i = 1; i <= d; i++) {
			int V = 0;
			
			System.out.println(i + ". dan:");
			
			for(int j = 1; !isPrime(V); j++) {
				String kocke = generateNDiceRolls(rand, k);
				V = stringSum(kocke);
				System.out.printf("    %d. met: %s| vsota = %d%n", j, kocke, V);
			}
		}
	}
	
	private static String generateNDiceRolls(Random random, int n) {
		String str = "";
		for(int i = 0; i < n; i++) {
			int roll = random.nextInt(1, 6+1);
			str += roll + " ";
		}
		
		return str;
	}
	
	private static boolean isPrime(int n) {
		if(n < 2) return false;
      
		for(int i = 2; i<= Math.sqrt(n); i++) {
           if((n % i) == 0) return  false;
		}
		return true;
    }
	
	private static int stringSum(String str) {
		int sum = 0;

		for (char c : str.toCharArray()) {
			if(Character.isDigit(c)) sum += Character.getNumericValue(c);
		}
		
		return sum;
	}
}