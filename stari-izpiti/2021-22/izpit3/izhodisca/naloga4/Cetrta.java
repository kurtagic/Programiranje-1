
import java.util.*;

public class Cetrta {

    public static class Avtomat {
        private String zacetnoStanje;
        private Set<String> sprejemnaStanja;
        private Map<String, Map<Character, String>> prehodi;

        public Avtomat(String zacetnoStanje, Set<String> sprejemnaStanja,
                Map<String, Map<Character, String>> prehodi) {

            this.zacetnoStanje = zacetnoStanje;
            this.sprejemnaStanja = sprejemnaStanja;
            this.prehodi = prehodi;
        }

        public String vrniZacetnoStanje() {
            return this.zacetnoStanje;
        }

        public Set<String> vrniSprejemnaStanja() {
            return this.sprejemnaStanja;
        }

        public Map<String, Map<Character, String>> vrniPrehode() {
            return this.prehodi;
        }

        public boolean jeSprejemno(String stanje) 
		{
			for(String sprejemnoStanje : sprejemnaStanja)
			{
				if(sprejemnoStanje.equals(stanje)) return true;
			}
			
			return false;
        }

        public String kam(String beseda)
		{
			if(beseda.length() == 0) return this.zacetnoStanje;

			String stanje = this.zacetnoStanje;	
			
			for (int i = 0; i < beseda.length(); i++) 
			{
                stanje = this.prehodi.get(stanje).get(beseda.charAt(i));
                if (stanje == null) return null;   
            }
			
            return stanje;
        }

        public static Avtomat zaBesedo(String beseda) 
		{			
            Set<String> sprejemnaStanja = new HashSet<>();
				sprejemnaStanja.add(Integer.toString(beseda.length()));
			
            Map<String, Map<Character, String>> prehodi = new HashMap<>();
			
            for (int i = 1; i <= beseda.length(); i++) 
			{
				Map<Character, String> poti = new HashMap<>();
				
				poti.put(beseda.charAt(i - 1), Integer.toString(i));
				
				prehodi.put(Integer.toString(i - 1), poti);    
            }
			
            return new Avtomat("0", sprejemnaStanja, prehodi);
        }
    }
}
