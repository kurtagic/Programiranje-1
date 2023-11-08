import java.util.*;

public class VsiRazlicniII {
	private static final int MAX_NUMBER = 10*1000;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int seed = sc.nextInt();
		int n = sc.nextInt();
		
		Random random = new Random(seed);
		
		List<Integer> modes = getModes(random, n);
		
		System.out.println((modes.size() == n) ? "RAZLICNI" : getMininum(modes));
	}
	
	private static int getMininum(List<Integer> list) {
		return Collections.min(list, null);
	}

	private static List<Integer> getModes(Random random, int n) {
		Map<Integer, Integer> frequencyMap = new HashMap<>();
		List<Integer> modes = new ArrayList<>();
		int maxFrequency = 0;
		
		for(int i = 0; i < n; i++)  {
			int term = random.nextInt(2*MAX_NUMBER + 1) - MAX_NUMBER;
			int frequency = frequencyMap.getOrDefault(term, 0) + 1;
        
			frequencyMap.put(term, frequency);
		
			if(frequency == maxFrequency) modes.add(term);
			else if (frequency > maxFrequency) {
				maxFrequency = frequency;
				modes.clear();
				modes.add(term);
			}
		}
		
		return modes;
	}
}