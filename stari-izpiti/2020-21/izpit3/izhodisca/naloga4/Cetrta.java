
import java.util.*;

public class Cetrta {

    public static class Prostor {
        private int nadstropje;
        private int kvadratura;
        private String namembnost;

        public Prostor(int nadstropje, int kvadratura, String namembnost) {
            this.nadstropje = nadstropje;
            this.kvadratura = kvadratura;
            this.namembnost = namembnost;
        }
		
		public String getNamembnost()
		{
			return this.namembnost;
		}
		
		
		public int getKvadratura()
		{
			return this.kvadratura;
		}
		
		
		public int getNadstropje()
		{
			return this.nadstropje;
		}

        @Override
        public String toString() {
            return String.format("%d. nadstropje / %s m^2 / %s",
                    this.nadstropje, this.kvadratura, this.namembnost);
        }

        // po potrebi dopolnite ...
    }

    public static Set<String> namembnosti(List<Prostor> prostori) 
	{
		Set mnozica = new HashSet<>();
		for(Prostor prostor : prostori)
		{
			mnozica.add(prostor.getNamembnost());
		}
        return mnozica;
    }

    public static void uredi(List<Prostor> prostori) {
        prostori.sort(new ProstorComparator());
    }

    private static class ProstorComparator implements Comparator<Prostor> 
	{
        @Override
        public int compare(Prostor p1, Prostor p2)
		{
            int result = Integer.compare(p1.getNadstropje(), p2.getNadstropje());
            if (result == 0) result = Integer.compare(p2.getKvadratura(), p1.getKvadratura());
            
            return result;
        }
    }

    public static Map<Integer, Map<String, Integer>> statistika(List<Prostor> prostori)
	{

        Map<Integer, Map<String, Integer>> map = new HashMap<>();

        for (Prostor prostor : prostori) 
		{
            map.computeIfAbsent(prostor.getNadstropje(), key -> new HashMap<>());
			Map<String, Integer> innerMap = map.get(prostor.getNadstropje());
            innerMap.put(prostor.getNamembnost(), innerMap.getOrDefault(prostor.getNamembnost(), 0) + 1);
        }
	
        return map;
    }
}
