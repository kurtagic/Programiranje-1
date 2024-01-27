import java.util.*;

public class NajvecjiSkupniDelitelj {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int g = sc.nextInt();
		
		List<int[]> pairs = getPairs(n, g);
		
		for(int[] pair : pairs) {
			System.out.printf("(%d, %d)%n", pair[0], pair[1]);
		}
	}
	
	private static List<int[]> getPairs(int range, int targetGCD) {
		List<int[]> pairs = new ArrayList<>();
		
		for(int p = targetGCD; p <= range; p += targetGCD) {
			for(int q = p; q <= range; q += targetGCD) {
				if(getGCD(p, q) == targetGCD) pairs.add(new int[]{p, q});
			}
		}
		
		return pairs;
		
	}
	
	private static int getGCD(int a, int b) {
		return b == 0 ? a : getGCD(b, a % b);
	}

}