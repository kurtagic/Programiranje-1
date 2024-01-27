import java.util.*;

public class VsiRazlicniI {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> zaporedje = new ArrayList<>();
		
		for(int i = 0; i < n; i++) {
			zaporedje.add(sc.nextInt());
		}
		
		System.out.println(hasDuplicates(zaporedje) ? getSmallestElement(getDuplicates(zaporedje)) : "RAZLICNI");
	}
	
	private static boolean hasDuplicates(List<Integer> list) {		
        return new HashSet(list).size() < list.size();
		
	}
	
	private static List<Integer> getDuplicates(List<Integer> list) {
		List<Integer> duplicates = new ArrayList<>();
		Set<Integer> set = new HashSet<>();
		
		list.forEach(element -> { 
			if (!set.add(element)) duplicates.add(element); 
		});
		
		return duplicates;
	}
	
	  private static int getSmallestElement(List<Integer> list) {
        return Collections.min(list, null);
    }
}