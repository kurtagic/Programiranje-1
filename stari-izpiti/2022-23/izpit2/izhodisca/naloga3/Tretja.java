import java.util.*;

public class Tretja {

    //=========================================================================

    public static class Igrisce {
        private Igralo[] igrala;

        public Igrisce(Igralo[] igrala) {
            this.igrala = igrala;
        }

        public boolean poPredpisih() {
			for(Igralo igr1 : igrala)
			{
				for(Igralo igr2 : igrala)
				{
					if(igr1.equals(igr2)) continue;
					int minDistance = Math.max(igr1.minRazdalja2(), igr2.minRazdalja2());
					int razdalja = igr1.razdalja2(igr2);
					
					if(razdalja < minDistance) return false;
				}
			}
			
            return true;
        }

        public int najTip() 
		{
			int[] frekvence = new int[4];
            for(Igralo igr : igrala)
			{
				int tip = -1;
				if(igr instanceof Gugalnica) tip = 0;
				if(igr instanceof Tobogan) tip = 1;
				if(igr instanceof Plezalo) tip = 2;
				if(igr instanceof Vzmetnik) tip = 3;
					
				frekvence[tip]++;
			}

			int[] maxTip = new int[2];
			for(int i = 0; i < frekvence.length; i++)
			{
				if(frekvence[i] > maxTip[1])
				{
					maxTip = new int[]{ i, frekvence[i] };
				}
			}
			
            return maxTip[0];
        }

        // po potrebi dopolnite ...
    }

    //=========================================================================

    public static abstract class Igralo {
        private int x;
        private int y;

        protected Igralo(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public abstract int minRazdalja2();

        public int razdalja2(Igralo igr) {
            int a = (int) Math.pow((this.x - igr.x), 2);
			int b = (int) Math.pow((this.y - igr.y), 2);
            return a + b;
        }

        // po potrebi dopolnite ...
    }

    //=========================================================================

    public static class Gugalnica extends Igralo {
        public Gugalnica(int x, int y) {
            super(x, y);
        }

        @Override
        public int minRazdalja2() {
            return 200 * 200;
        }

        // po potrebi dopolnite ...
    }

    //=========================================================================

    public static class Tobogan extends Igralo {
        public Tobogan(int x, int y) {
            super(x, y);
        }

        @Override
        public int minRazdalja2() {
            return 150 * 150;
        }

        // po potrebi dopolnite ...
    }

    //=========================================================================

    public static class Plezalo extends Igralo {
        public Plezalo(int x, int y) {
            super(x, y);
        }

        @Override
        public int minRazdalja2() {
            return 130 * 130;
        }

        // po potrebi dopolnite ...
    }

    //=========================================================================

    public static class Vzmetnik extends Igralo {
        public Vzmetnik(int x, int y) {
            super(x, y);
        }

        @Override
        public int minRazdalja2() {
            return 100 * 100;
        }

        // po potrebi dopolnite ...
    }

    //=========================================================================
}
