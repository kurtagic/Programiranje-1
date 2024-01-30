import java.util.*;

public class Cetrta 
{

    public static interface Generator 
	{
        public int naslednji();
    }

    public static int stKlicev(Generator gen, int k) 
	{
		Map<Integer, Integer> map = new HashMap<>();
		
		int ponovitve = 0;
		int klici = 0;
		
		while(ponovitve < k)
		{
			klici++;
			int n = gen.naslednji();
			map.put(n, map.getOrDefault(n, 0) + 1);
			
			for(Integer key : map.keySet())
			{
				if(map.get(key) > ponovitve) ponovitve++;
			}
		}
		
        return klici;
    }
}
