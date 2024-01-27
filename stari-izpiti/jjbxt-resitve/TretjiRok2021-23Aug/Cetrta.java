
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

        @Override
        public String toString() {
            return String.format("%d. nadstropje / %s m^2 / %s",
                    this.nadstropje, this.kvadratura, this.namembnost);
        }

        public String vrniNamembnost() {
            return this.namembnost;
        }

        public int vrniNadstropje() {
            return this.nadstropje;
        }

        public int vrniKvadraturo() {
            return this.kvadratura;
        }

        // po potrebi dopolnite ...
    }

    public static Set<String> namembnosti(List<Prostor> prostori) {
        Set<String> nami = new HashSet<>();
        for (Prostor p: prostori) {
            nami.add(p.vrniNamembnost());
        }
        return nami;
    }

    public static void uredi(List<Prostor> prostori) {
        Set<Prostor> urejen = new TreeSet<>((p1, p2) -> (p1.vrniNadstropje() != p2.vrniNadstropje() ? p1.vrniNadstropje() - p2.vrniNadstropje() : p2.vrniKvadraturo() - p1.vrniKvadraturo()));
        for (Prostor p: prostori) {
            urejen.add(p);
        }
        int i = 0;
        for (Prostor p: urejen) {
            prostori.set(i, p);
            i++;
        }
    }

    public static Map<Integer, Map<String, Integer>> statistika(List<Prostor> prostori) {
        Map<Integer, Map<String, Integer>> slovar = new HashMap<>();
        for (Prostor p: prostori) {
            Map<String, Integer> vnos = slovar.get(p.vrniNadstropje());
            if (vnos == null) {
                vnos = new HashMap<String, Integer>();
                vnos.put(p.vrniNamembnost(), 1);
            } else {
                Integer nam = vnos.get(p.vrniNamembnost());
                if (nam == null) {
                    nam = 1;
                } else {
                    nam++;
                }
                vnos.put(p.vrniNamembnost(), nam);
            }
            slovar.put(p.vrniNadstropje(), vnos);
        }
        return slovar;
    }
}
