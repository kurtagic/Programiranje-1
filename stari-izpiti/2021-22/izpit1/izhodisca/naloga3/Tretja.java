import java.util.*;

public class Tretja {

    public static class Tocka {
        private double x;
        private double y;

        public Tocka(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public double vrniX() {
            return this.x;
        }

        public double vrniY() {
            return this.y;
        }
    }

    public static class Najdba {
        private String najditelj;
        private int cas;

        public Najdba(String najditelj, int cas) {
            this.najditelj = najditelj;
            this.cas = cas;
        }

        public String vrniNajditelja() {
            return this.najditelj;
        }

        public int vrniCas() {
            return this.cas;
        }
    }

    public static class Zaklad {
        private String id;
        private Tocka polozaj;
        private Najdba[] najdbe;

        public Zaklad(String id, Tocka polozaj, Najdba[] najdbe) {
            this.id = id;
            this.polozaj = polozaj;
            this.najdbe = najdbe;
        }

        public Tocka vrniPolozaj() {
            return this.polozaj;
        }

        public Najdba[] vrniNajdbe() {
            return this.najdbe;
        }

        public String[] najditelji() 
		{
			String[] array = new String[najdbe.length];
			
			for(int i = 0; i < najdbe.length; i++)
			{
				array[i] = najdbe[i].vrniNajditelja();
			}
            return array;
        }

        @Override
        public String toString() {
            return this.id;
        }
    }

    public static class Geolov {
        private Zaklad[] zakladi;

        public Geolov(Zaklad[] zakladi) {
            this.zakladi = zakladi;
        }

        public Zaklad[] vrniZaklade() {
            return this.zakladi;
        }

        public double pot(Tocka zacetna) 
		{				
			double path = calculateDistance(zacetna, this.zakladi[0].polozaj);
			
			for(int i = 0; i < this.zakladi.length; i++)
			{
				if(i + 1 == this.zakladi.length) break;
				Tocka t1 = this.zakladi[i].polozaj;
				Tocka t2 = this.zakladi[i + 1].polozaj;
				
				path += calculateDistance(t1, t2);
			}
				
			path += calculateDistance(this.zakladi[this.zakladi.length - 1].polozaj, zacetna);
			
			return path;
		}
		
		private double calculateDistance(Tocka t1, Tocka t2)
		{
			return Math.sqrt( Math.pow(t1.x - t2.x, 2) + Math.pow(t1.y - t2.y, 2) );
		}

        public Zaklad nazadnjeOdkrit() 
		{
			if(this.zakladi == null) return null;
            
			Zaklad nazadnji = null;
			
			for(Zaklad zaklad : this.zakladi)
			{
				Najdba[] najdbe = zaklad.vrniNajdbe();
				if(najdbe.length == 0) continue;
				if(nazadnji == null) nazadnji = zaklad;
				
				int casPrveNajdbe = najdbe[0].vrniCas();
				if(casPrveNajdbe > nazadnji.vrniNajdbe()[0].vrniCas()) nazadnji = zaklad;
			}
			
            return nazadnji;
        }
    }

    public static void main(String[] args) {
        // koda za ro"cno testiranje (po potrebi)
    }
}
