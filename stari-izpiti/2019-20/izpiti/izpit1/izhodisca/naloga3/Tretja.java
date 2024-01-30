import java.util.*;

public class Tretja {
    public static class Zaposleni {
        private String ip;
        private int placa;
        private Vodja nadrejeni;

        public Zaposleni(String ip, int placa, Vodja nadrejeni) {
            this.ip = ip;
            this.placa = placa;
            this.nadrejeni = nadrejeni;
        }
		
		public int getPlaca()
		{
			return this.placa;
		}
		
		public Vodja getNadrejeni()
		{
			return this.nadrejeni;
		}

        @Override
        public String toString() {
            return this.ip;
        }

        public int placaNadrejenega() 
		{
			if(this.getNadrejeni() == null) return -1;
			return this.getNadrejeni().getPlaca();
        }

        public static int steviloAnomalij(Zaposleni[] zaposleni)
		{
			int counter = 0;
			for(Zaposleni zap1 : zaposleni)
			{
				for(Zaposleni zap2 : zaposleni)
				{
					if(zap1.equals(zap2)) continue;
					if(!(zap1 instanceof Delavec)) continue;
					if(!(zap2 instanceof Vodja)) continue;
					
					if(zap1.getPlaca() > zap2.getPlaca()) counter++;
				}
			}
			
			return counter;
        }
    }

    public static class Delavec extends Zaposleni {
        public Delavec(String ip, int placa, Vodja nadrejeni) {
            super(ip, placa, nadrejeni);
        }
    }

    public static class Vodja extends Zaposleni {
        public Vodja(String ip, int placa, Vodja nadrejeni) {
            super(ip, placa, nadrejeni);
        }

        public Vodja vrhovni() 
		{
			if(this.getNadrejeni() == null) return this;
			
			return this.getNadrejeni().vrhovni();
        }
    }
}
