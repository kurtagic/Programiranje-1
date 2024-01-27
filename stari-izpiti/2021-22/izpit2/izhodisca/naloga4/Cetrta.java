import java.util.*;

public class Cetrta {

    public static class Tocka {
        private int x;
        private int y;

        public Tocka(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return String.format("(%d, %d)", this.x, this.y);
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Tocka)) {
                return false;
            }
            Tocka druga = (Tocka) obj;
            return this.x == druga.x && this.y == druga.y;
        }

        @Override
        public int hashCode() {
            return 17 * this.x + 31 * this.y;
        }

        public Map<Boolean, List<Tocka>> razdeli(Collection<Tocka> tocke)
		{
            Map<Boolean, List<Tocka>> map = new HashMap<>();
			List<Tocka> vecje = new ArrayList<>();
			List<Tocka> ostale = new ArrayList<>();
			
			for(Tocka tocka : tocke)
			{
				List<Tocka> list = (tocka.x > this.x) ? vecje : ostale;
				
				list.add(tocka);
			}
			
			map.put(true, vecje);
			map.put(false, ostale);
			
            return map;
        }

		public static Comparator<Tocka> polarno() 
		{
			return Comparator.comparing(Tocka::razdalja).thenComparing(Tocka::kot);
		}
		
		// r = sqrt(x^2 + y^2)
		public double razdalja() 
		{
			return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
		}

		// kot = arctan(x/y);
		// Math.atan2 sam zracuna predznak, ce je neg. kot pristej PI (180) ker more kot bit na intervalu [0, pi]
		public double kot()
		{
			double theta = Math.atan2(y, x);
			if(theta < 0) theta += 180;
			return theta;
		}
	}
}