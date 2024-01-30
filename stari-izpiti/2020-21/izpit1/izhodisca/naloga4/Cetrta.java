import java.util.*;

public class Cetrta {

    public static class Barva {
        private int r;
        private int g;
        private int b;

        public Barva(int r, int g, int b) {
            this.r = r;
            this.g = g;
            this.b = b;
        }
		
		public int getR()
		{
			return this.r;
		}
		
		public int getG()
		{
			return this.g;
		}

		public int getB()
		{
			return this.b;
		}
        @Override
        public String toString() {
            return String.format("(%d, %d, %d)", this.r, this.g, this.b);
        }
    }

    public static abstract class Lik {
        private Barva barva;

        protected Lik(Barva barva) {
            this.barva = barva;
        }
		
		public Barva getBarva()
		{
			return this.barva;
		}
		
		public abstract int getPovrsina();
		public abstract int getType();
        public abstract String vrsta(); 
        public abstract String mere(); 

        @Override
        public String toString() {
            return String.format("%s [%s, %s]", this.vrsta(), this.barva, this.mere());
        }
		
    }

    public static class Pravokotnik extends Lik {
        private int a;
        private int b;

        public Pravokotnik(Barva barva, int a, int b) {
            super(barva);
            this.a = a;
            this.b = b;
        }

        public int vrniA() {
            return this.a;
        }
		
		public int getPovrsina()
		{
			return this.a * this.b;
		}
		
		public int getType()
		{
			return 0;
		}
		
        @Override
        public String vrsta() {
            return "pravokotnik";
        }

        @Override
        public String mere() {
            return String.format("a = %d, b = %d", this.a, this.b);
        }
    }

    public static class Kvadrat extends Pravokotnik {
        public Kvadrat(Barva barva, int a) {
            super(barva, a, a);
        }
		
		public int getType()
		{
			return 1;
		}

        @Override
        public String vrsta() {
            return "kvadrat";
        }

        @Override
        public String mere() {
            return String.format("a = %d", this.vrniA());
        }
    }

    public static class Krog extends Lik {
        private int r;

        public Krog(Barva barva, int r) {
            super(barva);
            this.r = r;
        }
		
		public int getPovrsina()
		{
			return (int) Math.round(r*r*Math.PI);
		}
		
		public int getType()
		{
			return 2;
		}

        @Override
        public String vrsta() {
            return "krog";
        }

        @Override
        public String mere() {
            return String.format("r = %d", this.r);
        }
    }

    public static void urediNaravno(List<Lik> liki) 
	{
        liki.sort((l1, l2) -> Integer.compare(l1.getPovrsina(), l2.getPovrsina()));
    }

    public static Collection<Lik> poTipuInBarvi(Collection<Lik> liki) 
	{
		List<Lik> kopija = new ArrayList<>(liki);

        kopija.sort(Comparator.comparing(Lik::getType)
			.thenComparing(Comparator.comparing(Lik -> Lik.getBarva().getR()))
			.thenComparing(Comparator.comparing(Lik -> Lik.getBarva().getG()))
			.thenComparing(Comparator.comparing(Lik -> Lik.getBarva().getB())));
			
        return kopija;
    }
}