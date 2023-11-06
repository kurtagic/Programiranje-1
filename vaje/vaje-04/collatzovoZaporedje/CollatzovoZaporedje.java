import java.util.*;

public class CollatzovoZaporedje {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int[] najdaljseZaporedje = getLongestSequence(a, b);
		
		System.out.println(najdaljseZaporedje[0]);
		System.out.println(najdaljseZaporedje[1]);
	}
	
	private static int[] getLongestSequence(int start, int end) {
		int[] longest = {0, 0};
		
		for(int i = start; i <= end; i++) {
			int term = getSequence(i).size();
			if(term > longest[1]) longest = new int[]{i, term};
		}
		
		return longest;
	}
	
	private static List<Integer> getSequence(int n) {
		List<Integer> sequence = new ArrayList<>();
		
		while(n != 1) {
			sequence.add(n);
			n = function(n);
		}
		
		sequence.add(1);
		
		return sequence;
	}
	
	 private static int function(int n) {
        return (n % 2 == 0) ? n/2 : 3*n + 1;
    }
}