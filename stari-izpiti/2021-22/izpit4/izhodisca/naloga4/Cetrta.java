import java.util.*;

public class Cetrta 
{

    public static Set<Integer> vecji(Map<Integer, Integer> slovar) 
	{
		Set<Integer> mnozica = new HashSet<>();
        for(Map.Entry<Integer, Integer> entry : slovar.entrySet())
		{
			Integer key  = entry.getKey();
			Integer value = entry.getValue();
			if(key > value) mnozica.add(key);
		}
        return mnozica;
    }

    public static <T> Set<T> vecjiPrim(Map<T, T> slovar, Comparator<T> prim) 
	{
		Set<T> mnozica = new HashSet<>();
        for(Map.Entry<T, T> entry : slovar.entrySet())
		{
			T key  = entry.getKey();
			T value = entry.getValue();
			if(prim.compare(key, value) > 0) mnozica.add(key);
		}
        return mnozica;
    }

    public static <T> Comparator<T> primerjalnik(Map<T, T> slovar, Set<T> mnozica) 
	{
       return (a, b) -> (slovar.keySet().contains(a) && slovar.get(a) == b && mnozica.contains(a) ? 1 : -1);
    }
}
