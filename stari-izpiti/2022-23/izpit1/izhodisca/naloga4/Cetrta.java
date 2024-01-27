import java.util.*;

public class Cetrta {

    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int u = sc.nextInt();
        String a = u == 2 ? sc.next() : "";

        sc.nextLine();

        List<String[]> ponudnik_artikel_cena = new ArrayList<>();
		Set<String> ponudniki = new HashSet<>();
        
		while (sc.hasNext()) 
		{
			String ponudnik = sc.next();
			String artikel = sc.next();
			String cena = sc.next();
			
            ponudnik_artikel_cena.add(new String[]{ ponudnik, artikel, cena });
			if(!ponudniki.contains(ponudnik)) ponudniki.add(ponudnik);
        }
		
        if (u == 1) poAbecedi(ponudniki);
		if(u == 2) poArtiklu(ponudnik_artikel_cena, a);
    }

	private static void poAbecedi(Set<String> ponudniki) 
	{
        Set<String> sorted = new TreeSet<>(ponudniki);
        sorted.forEach(System.out::println);
	}
	
	    private static void poArtiklu(List<String[]> ponudnik_artikel_cena, String artikel) {
        List<String[]> ponudnik_cena = new ArrayList<>();

        for (String[] entry : ponudnik_artikel_cena) {
            if (entry[1].equals(artikel)) ponudnik_cena.add(new String[]{entry[0], entry[2]});
            
        }

        ponudnik_cena.sort(Comparator.comparingInt(entry -> Integer.parseInt(entry[1])));

        for (String[] ponudnik : ponudnik_cena) {
            System.out.println(ponudnik[0]);
        }
    }
}