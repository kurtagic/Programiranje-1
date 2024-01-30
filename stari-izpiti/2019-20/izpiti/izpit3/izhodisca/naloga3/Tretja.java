public class Tretja {

    public static abstract class Drevo {
        private int x;
        private int y;

        protected Drevo(int x, int y) {
            this.x = x;
            this.y = y;
        }
		
		public int getX()
		{
			return this.x;
		}
		
		public int getY()
		{
			return this.y;
		}

        public abstract String vrsta();

        @Override
        public String toString() {
            return String.format("%s(%d, %d)", this.vrsta(), this.x, this.y);
        }

        public int d2(Drevo drevo) 
		{
			if(this.equals(drevo)) return 0;
			return (int) ( Math.pow(this.getX() - drevo.getX(), 2) + Math.pow(this.getY() - drevo.getY(), 2) );
        }

        // po potrebi dopolnite ...
    }

    public static abstract class Listavec extends Drevo {
        protected Listavec(int x, int y) {
            super(x, y);
        }
        // po potrebi dopolnite ...
    }

    public static abstract class Iglavec extends Drevo {
        protected Iglavec(int x, int y) {
            super(x, y);
        }
        // po potrebi dopolnite ...
    }

    public static class Hrast extends Listavec {
        public Hrast(int x, int y) {
            super(x, y);
        }

        @Override
        public String vrsta() {
            return "Hrast";
        }

        // po potrebi dopolnite ...
    }

    public static class Bukev extends Listavec {
        public Bukev(int x, int y) {
            super(x, y);
        }

        @Override
        public String vrsta() {
            return "Bukev";
        }

        // po potrebi dopolnite ...
    }

    public static class Breza extends Listavec {
        public Breza(int x, int y) {
            super(x, y);
        }

        @Override
        public String vrsta() {
            return "Breza";
        }

        // po potrebi dopolnite ...
    }

    public static class Smreka extends Iglavec {
        public Smreka(int x, int y) {
            super(x, y);
        }

        @Override
        public String vrsta() {
            return "Smreka";
        }

        // po potrebi dopolnite ...
    }

    public static class Jelka extends Iglavec {
        public Jelka(int x, int y) {
            super(x, y);
        }

        @Override
        public String vrsta() {
            return "Jelka";
        }

        // po potrebi dopolnite ...
    }

    public static class Bor extends Iglavec {
        public Bor(int x, int y) {
            super(x, y);
        }

        @Override
        public String vrsta() {
            return "Bor";
        }

        // po potrebi dopolnite ...
    }

    public static class Gozd {
        private Drevo[] drevesa;

        public Gozd(Drevo[] drevesa) {
            this.drevesa = drevesa;
        }

        public boolean jeListnat() 
		{
           for(Drevo drevo : drevesa)
		   {
			   if(!(drevo instanceof Listavec)) return false;
		   }
	   
			return true;
        }

        public Drevo najblizjeIstovrstno(Drevo drevo) 
		{
			Drevo najblizje = null;
			for(Drevo d : drevesa)
			{
				if(drevo.equals(d)) continue;
				if(!drevo.vrsta().equals(d.vrsta())) continue;
			   
				if(najblizje == null) najblizje = d;
				if(drevo.d2(d) < drevo.d2(najblizje)) najblizje = d;
			}
	   
			return najblizje;
        }
    }
}
