
import java.util.*;

public class Tretja {

    public static abstract class Zival {
		
		private String zvok;
		public Zival(String zvok) 
		{
			this.zvok = zvok;
		}

		public String oglasiSe()
		{
			return zvok;
		}
    }

    public static class Pes extends Zival {
		public Pes() 
		{
			super("hov");
		}
    }

    public static class Macka extends Zival {
        public Macka()
		{
			super("mijav");
		}
    }

    public static class RodovniskiPes extends Pes {
        private String pasma;
        private RodovniskiPes oce;
        private RodovniskiPes mati;

        public RodovniskiPes(String pasma, RodovniskiPes oce, RodovniskiPes mati) {
            this.pasma = pasma;
            this.oce = oce;
            this.mati = mati;
        }
		
		public String getPasma()
		{
			return this.pasma;
		}

        public boolean preveri() 
		{
            if(this.oce == null || this.mati == null) return true;
			if(!this.oce.getPasma().equals(this.getPasma())) return false;
			if(!this.mati.getPasma().equals(this.getPasma())) return false;
			
			if(this.oce.preveri() && this.mati.preveri()) return true;
			
            return false;
        }
    }

    public static int prestej(RodovniskiPes[] psi, String pasma) 
	{
		int counter = 0;
        for(RodovniskiPes pes : psi)
		{
			if(pes.getPasma().equals(pasma)) counter++;
		}
        return counter;
    }
}
