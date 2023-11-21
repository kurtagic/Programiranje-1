import java.util.*;

public class DN04_63230175 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();

		Map<Integer, Integer> frequencies = new HashMap<Integer, Integer>();

		for(int i = 0; i < n; i++) {
			int man = sc.nextInt();
			int frequency = frequencies.getOrDefault(man, 0) + 1;
			frequencies.put(man, frequency);
		}

		System.out.println(getPairs(frequencies, k));
	}

	private static long getPairs(Map<Integer, Integer> map, int sheikhNumber) {
		long pairs = 0;

		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			int partner = sheikhNumber - entry.getKey();

			if (map.containsKey(partner)) pairs += entry.getValue() * map.get(partner);

		}

		return pairs;
	}
}