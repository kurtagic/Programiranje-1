import java.util.*;

public class Cetrta {

    public static <T> List<T> odsek(Iterator<T> it, int p, int q) 
	{
		List<T> list = new ArrayList<>();
        for (int i = 0; i < p; i++) {
            it.next();
        }
        for (int i = p; i <= q; i++) {
            list.add(it.next());
        }
        return list;
    }

    public static Iterator<Integer> manjkajoci(Iterator<Integer> it, int zacetek) 
	{
		return new Iterator<Integer>() 
		{
            int vrni = zacetek;
            Collection<Integer> zbirka = new HashSet<>();

            @Override
            public Integer next() 
			{
                zbirka.add(it.next());
                if (!zbirka.contains(vrni)) 
				{
                    return vrni++;
                }
				
                vrni++;
                return next();
            }
			
			
            @Override
            public boolean hasNext() 
			{
                return true;
            }
        };
    }
}
