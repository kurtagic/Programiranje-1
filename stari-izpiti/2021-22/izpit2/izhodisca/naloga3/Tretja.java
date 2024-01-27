public class Tretja {

    public static abstract class Predavalnica {
        private String oznaka;
        private int stMest;

        protected Predavalnica(String oznaka, int stMest) {
            this.oznaka = oznaka;
            this.stMest = stMest;
        }

        public String vrniOznako() {
            return this.oznaka;
        }

        public int vrniSteviloMest() {
            return this.stMest;
        }

        public int casCiscenja() 
		{
			int cas = 0;
			
			cas += this.stMest * 2;
			
			if(this instanceof Racunalnica) cas += ((Racunalnica) this).stRacunalnikov * 3;
			if(this instanceof Garaza) cas += ((Garaza) this).povrsina;
			
			return cas;
        }
    }

    public static class Avditorna extends Predavalnica {

        public Avditorna(String oznaka, int stMest) {
            super(oznaka, stMest);
        }
    }

    public static class Racunalnica extends Predavalnica {
        private int stRacunalnikov;

        public Racunalnica(String oznaka, int stMest, int stRacunalnikov) {
            super(oznaka, stMest);
            this.stRacunalnikov = stRacunalnikov;
        }

        public int vrniSteviloRacunalnikov() {
            return this.stRacunalnikov;
        }
    }

    public static class Garaza extends Predavalnica {
        private int povrsina;

        public Garaza(String oznaka, int stMest, int povrsina) {
            super(oznaka, stMest);
            this.povrsina = povrsina;
        }
    }

    public static class Stavba {
        private Predavalnica[] predavalnice;

        public Stavba(Predavalnica[] predavalnice) {
            this.predavalnice = predavalnice;
        }

        public int casCiscenja() {
            int cas = 0;
            for (Predavalnica predavalnica: this.predavalnice) {
                cas += predavalnica.casCiscenja();
            }
            return cas;
        }

        public int[] razporedi(int stStudentov, int[] ostanek) 
		{
			int[] razpored = new int[this.predavalnice.length];
			int[] studentiHolder = new int[]{stStudentov};
			
			poTipihPredavalnic(Avditorna.class, razpored, studentiHolder);
			poTipihPredavalnic(Racunalnica.class, razpored, studentiHolder);
			poTipihPredavalnic(Garaza.class, razpored, studentiHolder);
			
			ostanek[0] = studentiHolder[0];
			
			return razpored;
        }
		
		private int poTipihPredavalnic(Class<?> type, int razpored[], int[] studenti)
		{
			for(int i = 0; i < this.predavalnice.length; i++)
			{
				Predavalnica predavalnica = this.predavalnice[i];
				if(!type.isInstance(predavalnica)) continue;
				
				int mesta = predavalnica.vrniSteviloMest();
				razpored[i] = mesta < studenti[0] ? mesta : studenti[0];
                studenti[0] -= razpored[i];
			}
			
			return studenti[0];
		}
    }
}
