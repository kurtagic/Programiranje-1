import java.util.*;

public class Cetrta 
{
	
    public static void main(String[] args) 
	{
		Map<String, List<Integer>> map = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++)
		{			
			doddajGlas(map, sc.next(), 0);
			doddajGlas(map, sc.next(), 1);
		}
		
		Map<String, List<Integer>> urejene = new TreeMap<>((s1, s2) -> {
			List<Integer> glasovi1 = map.get(s1);
			List<Integer> glasovi2 = map.get(s2);
			
			int primarno = Integer.compare(glasovi2.get(0), glasovi1.get(0));
			int sekundarno = Integer.compare(glasovi2.get(1), glasovi1.get(1));
			
			if(primarno != 0) return primarno;
			if(sekundarno != 0) return sekundarno;
			
			return s1.compareTo(s2);
		});
		
		urejene.putAll(map);
		
		String[] stranke = urejene.keySet().toArray(new String[0]);
		
		System.out.println(Arrays.toString(stranke));
	}
	
	private static void doddajGlas(Map<String, List<Integer>> map, String stranka, int index) 
	{
		map.computeIfAbsent(stranka, k -> new ArrayList<>(Arrays.asList(0, 0)))
			.set(index, map.get(stranka).get(index) + 1);
	}
}
