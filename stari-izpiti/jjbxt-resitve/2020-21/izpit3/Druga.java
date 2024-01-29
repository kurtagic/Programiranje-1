
import java.util.*;

public class Druga {

    public static int steviloShranjenih(int[] h, int[] w, int[] a, int[] b) {
        int stevec = 0;
        Predmet[] predmeti = new Predmet[a.length];
        for (int i = 0; i < a.length; i++) {
            predmeti[i] = new Predmet(a[i], b[i]);
        }

        for (int i = 1; i < predmeti.length; i++) {
            Predmet x = predmeti[i];
            int j = i - 1;
            while(j >= 0 && x.p() > predmeti[j].p()) {
                predmeti[j + 1] = predmeti[j];
                j--;
            }
            predmeti[j + 1] = x;
        }

        for (int i = 0; i < h.length; i++) {
            for (int j = 0; j < w.length; j++) {
                boolean nasel = false;
                for (Predmet p: predmeti) {
                    if (!p.zeShranjen && (p.x <= h[i] && p.y <= w[j] || p.x <= w[j] && p.y <= h[i])) {
                        p.shrani();
                        stevec++;
                        nasel = true;
                        break;
                    }
                }
                if (!nasel) {
                    return stevec;
                }
            }
        }
        return stevec;
    }

    private static class Predmet {
        
        int x;
        int y;
        boolean zeShranjen;

        public Predmet(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int p() {
            return this.x * this.y;
        }

        public void shrani() {
            this.zeShranjen = true;
        }

        public String toString() {
            return String.format("%dx%d", this.x, this.y);
        }
    }
}
