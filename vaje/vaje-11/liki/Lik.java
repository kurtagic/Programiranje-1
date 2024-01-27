
import java.util.*;

public abstract class Lik implements Comparable<Lik> {

	public abstract int tipKonstanta();
    
	public abstract int ploscina();

    public abstract int obseg();
	
	@Override
    public String toString() {
        return String.format("%s [%s]", this.vrsta(), this.podatki());
    }
	
	public int compareTo(Lik lik) {
		return Integer.compare(this.ploscina(), lik.ploscina());
	}
	
	public static Comparator<Lik> poObsegu() {
		return Comparator.comparingInt(Lik::obseg);
	}
	
	public static Comparator<Lik> poTipu() {
		return Comparator.comparingInt(Lik::tipKonstanta);
	}
		
	public static void urediPoTipuInObsegu(Vektor<Lik> vektor) {
		Skupno.uredi(vektor, Skupno.kompozitum(Lik.poTipu(), Lik.poObsegu()));
	}
	
	public static Lik vrniKrogZMinimalnimObsegom(Vektor<Lik> vektor) {
		Krog minKrog = null;
		for(int i = 0; i < vektor.steviloElementov(); i++) {
			Lik lik = vektor.vrni(i);
			if(lik == null) continue;
			if(!(lik instanceof Krog)) continue;
			
			Krog krog = (Krog) lik;
			if(minKrog == null) minKrog = krog;
			
			// minKrog = Math.min(minKrog.obseg(), krog.obseg());
			if(Lik.poObsegu().compare(krog, minKrog) < 0) minKrog = krog;
		}
		
		return minKrog;
	}
	 
    // Vrne vrsto lika <this> (npr. "pravokotnik").
    public abstract String vrsta();

    // Vrne niz s podatki o liku <this> 
    // (npr. "širina = 3.0, višina = 4.0").
    public abstract String podatki();

    public static void izpisi(Vektor<Lik> vektor) {
        int stElementov = vektor.steviloElementov();
        for (int i = 0;  i < stElementov;  i++) {
            Lik lik = vektor.vrni(i);
            System.out.printf("%s | p = %d | o = %d%n",
                    lik.toString(), lik.ploscina(), lik.obseg());
        }
    }
}
