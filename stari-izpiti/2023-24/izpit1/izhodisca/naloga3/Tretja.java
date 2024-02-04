import java.util.*;

public class Tretja {

    public static void main(String[] args) {
    }

    public abstract static class Dogodek {
        private int oseba;
        private Cas cas;
        private boolean odhod;

        protected Dogodek(int oseba, Cas cas, boolean odhod) {
            this.oseba = oseba;
            this.cas = cas;
            this.odhod = odhod;
        }

        public int vrniOsebo() {
            return this.oseba;
        }

        public Cas vrniCas() {
            return this.cas;
        }

        public boolean jeOdhod() {
            return this.odhod;
        }
    }

    public static class Malica extends Dogodek {
        public Malica(int oseba, Cas cas, boolean odhod) {
            super(oseba, cas, odhod);
        }
    }

    public static class Rekreacija extends Dogodek {
        public Rekreacija(int oseba, Cas cas, boolean odhod) {
            super(oseba, cas, odhod);
        }
    }

    public static class SluzbenaPot extends Dogodek {
        public SluzbenaPot(int oseba, Cas cas, boolean odhod) {
            super(oseba, cas, odhod);
        }
    }

    public static class Dnevnik {
        private int stZaposlenih;
        private Dogodek[] dogodki;

        public Dnevnik(int stZaposlenih, Dogodek[] dogodki) {
            this.stZaposlenih = stZaposlenih;
            this.dogodki = dogodki;
        }

        public int steviloMalicarjev() 
        {
          int count = 0;
          for(Dogodek dogodek : dogodki)
          { 
            if(!(dogodek instanceof Malica)) continue;
            if(dogodek.jeOdhod()) count++;
          }
          return count;
        }

        public int kolikoRekreacije(int oseba) 
        {
          int count = 0;

          Cas odhod = null;
          for(Dogodek dogodek : dogodki)
          {
            if(dogodek.vrniOsebo() != oseba) continue;
            if(!(dogodek instanceof Rekreacija)) continue;
            if(dogodek.jeOdhod())
            {
              odhod = dogodek.vrniCas();
              continue;
            }
            
            Cas prihod = dogodek.vrniCas();
            count += prihod.razlikaVMin(odhod);

          }

          return count;
        }
        
        public boolean[] prisotnost(Cas cas) 
        {
          boolean[] prisotonosti = new boolean[stZaposlenih];
          Arrays.fill(prisotonosti, true);

          for(Dogodek dogodek : dogodki)
          {
            if(dogodek.vrniCas().compareTo(cas) > 0) break;
            prisotonosti[dogodek.vrniOsebo()] = !dogodek.jeOdhod();
          }

          return prisotonosti;
        }
    }
}
