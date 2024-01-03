
import java.util.*;

public abstract class Lik implements Comparable<Lik>{

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
		int n = vektor.steviloElementov();
		
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				Lik lik1 = vektor.vrni(j);
				Lik lik2 = vektor.vrni(j + 1);

				int tipComparison = poTipu().compare(lik1, lik2);

				if (tipComparison > 0) {
					vektor.zamenjaj(j, j + 1);
					continue;
				} 
				
				if (tipComparison == 0) {
					int obsegComparison = poObsegu().compare(lik1, lik2);
					if (obsegComparison > 0) vektor.zamenjaj(j, j + 1);
				}
            }
        }
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
