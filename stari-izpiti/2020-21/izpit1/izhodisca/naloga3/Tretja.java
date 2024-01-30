import java.util.*;

public class Tretja {

    public static class Opravilo {
        private String naziv;
        private int zahtevnost;

        public Opravilo(String naziv, int zahtevnost) {
            this.naziv = naziv;
            this.zahtevnost = zahtevnost;
        }
		
		public int getZahtevnost()
		{
			return this.zahtevnost;
		}
    }

    public static class Projekt {
        private String naziv;
        private Opravilo[] opravila;

        public Projekt(String naziv, Opravilo[] opravila) {
            this.naziv = naziv;
            this.opravila = opravila;
        }
		
		public Opravilo[] getOpravila()
		{
			return this.opravila;
		}
		
		public Set<Opravilo> getOpravilaSet()
		{
			Set<Opravilo> set = new HashSet<>();
			for(Opravilo opravilo : this.getOpravila())
			{
				set.add(opravilo);
			}
			
			return set;
		}

        public int zahtevnost()
		{
			int maxZahtevnost = 0;
			for(Opravilo opravilo : this.getOpravila())
			{
				int zahtevnost = opravilo.getZahtevnost();
				if(zahtevnost > maxZahtevnost) maxZahtevnost = zahtevnost;
			}
            return maxZahtevnost;
        }

        public boolean jePermutacijaOd(Object drugi) 
		{
            if(!(drugi instanceof Projekt)) return false;
			
			Set<Opravilo> set1 = this.getOpravilaSet();
			
			Projekt projekt2 = (Projekt) drugi;
			Set<Opravilo> set2 = projekt2.getOpravilaSet();
			
			if(set1.size() != set2.size()) return false;
			
			for(Opravilo opravilo : set1)
			{
				if(!set2.contains(opravilo)) return false;
			}
			
            return true;
        }
    }

    public static class Delavec {
        private String ip;
        private int usposobljenost;

        public Delavec(String ip, int usposobljenost) {
            this.ip = ip;
            this.usposobljenost = usposobljenost;
        }
		
		public int getUsposobljenost()
		{
			return this.usposobljenost;
		}
		
		public boolean jeUniverzalen(Projekt[] projekti)
		{
			for(Projekt projekt : projekti)
			{
				if(projekt.zahtevnost() > this.getUsposobljenost()) return false;
			}
			
			return true;
		}
    }

    public static class Delavnica {
        private Delavec[] delavci;

        public Delavnica(Delavec[] delavci) {
            this.delavci = delavci;
        }

        public int univerzalci(Projekt[] projekti) 
		{
			int count = 0;
			for(Delavec delavec : delavci)
			{
				if(delavec.jeUniverzalen(projekti)) count++;
			}
			
            return count;
        }
    }
}
