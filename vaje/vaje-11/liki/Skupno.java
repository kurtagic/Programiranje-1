
import java.util.*;

public class Skupno {

    public static <T extends Comparable<T>> void uredi(Vektor<T> vektor) {
        int stElementov = vektor.steviloElementov();
        for (int i = 1;  i < stElementov;  i++) {
            T element = vektor.vrni(i);
            int j = i - 1;
            while (j >= 0 && vektor.vrni(j).compareTo(element) > 0) {
                vektor.nastavi(j + 1, vektor.vrni(j));
                j--;
            }
            vektor.nastavi(j + 1, element);
        }
    }

    public static <T> void uredi(Vektor<T> vektor, Comparator<T> primerjalnik) {
        int stElementov = vektor.steviloElementov();
        for (int i = 1;  i < stElementov;  i++) {
            T element = vektor.vrni(i);
            int j = i - 1;
            while (j >= 0 && primerjalnik.compare(vektor.vrni(j), element) > 0) {
                vektor.nastavi(j + 1, vektor.vrni(j));
                j--;
            }
            vektor.nastavi(j + 1, element);
        }
    }
	
	public static <T extends Object & Comparable<? super T>> T max(Vektor<? extends T> vektor) {
		int stElementov = vektor.steviloElementov();
		if(stElementov == 0) return null;
		
		T maxElement = vektor.vrni(0);
		for(int i = 0; i < stElementov; i++) {
			T element = vektor.vrni(i);
			if(element.compareTo(maxElement) > 0) maxElement = element;
		}
	
		return maxElement;
	}
	
	
	public static <T> T max(Vektor<? extends T> vektor, Comparator<? super T> primerjalnik) {
		int stElementov = vektor.steviloElementov();
		if(stElementov == 0) return null;
		
		T maxElement = vektor.vrni(0);
		for(int i = 0; i < stElementov; i++) {
			T element = vektor.vrni(i);
			if(primerjalnik.compare(element, maxElement) > 0) maxElement = element;
		}
	
		return maxElement;
	}
	
	public static <T> Comparator<T> kompozitum(Comparator<T> prim1, Comparator<T> prim2) {
		// return prim1.thenComparing(prim2);
		Comparator<T> comparator = new Comparator<T>() {
			
			@Override
            public int compare(T obj1, T obj2) {
                int res = prim1.compare(obj1, obj2);
   
                return (res != 0) ? res : prim2.compare(obj1, obj2);
            }
        };
		
		return comparator;
	}
}
