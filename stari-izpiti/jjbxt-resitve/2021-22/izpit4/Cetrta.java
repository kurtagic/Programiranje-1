
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

        public boolean jeSprejemno(String stanje) {
            return this.sprejemnaStanja.contains(stanje);
        }

        public String kam(String beseda) {// 4 pa 5 mi sfailiras
            if (beseda.length() == 0) {
                return this.zacetnoStanje;
            }
            String novoStanje = this.prehodi.get(this.zacetnoStanje).get(beseda.charAt(0));
            if (novoStanje == null) {
                return null;
            }
            for (int i = 1; i < beseda.length(); i++) {
                novoStanje = this.prehodi.get(novoStanje).get(beseda.charAt(i));
                if (novoStanje == null) {
                    return null;
                }
            }
            return novoStanje;
        }

        public static Avtomat zaBesedo(String beseda) {
            String novStane = null;
            String zacSt = null;
            Set<String> sprStanja = new HashSet<>();
            Map<String, Map<Character, String>> prehi = new HashMap<>();
            for (int i = 0; i <= beseda.length(); i++) {
                novStane = Integer.toString(i);
                if (i == 0) {
                    zacSt = novStane;
                } else {
                    Map<Character, String> m = new HashMap<>();
                    m.put(beseda.charAt(i - 1), novStane);
                    prehi.put(Integer.toString(i - 1), m);
                }
            }
            sprStanja.add(novStane);
            return new Avtomat(zacSt, sprStanja, prehi);
        }
    }

    public static void main(String[] args) {
        // koda za ro"cno testiranje (po potrebi)
    }
}
