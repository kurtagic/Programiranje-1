import java.util.*;

public class Druga 
{
    public static int najGlobina(int m, int[][] police) 
	{
        List<Integer> globine = new ArrayList<>(Collections.nCopies(m, m));
			
        for (int i = 0; i < m; i++) 
		{
            int stolpecGlobina = m;
            for (int[] polica : police) 
			{
				int policaX = polica[0];
				int policaY = polica[1];
				int policaLength = polica[2];
				
                if(policaX != i) continue;
				
				stolpecGlobina = policaY;
				for (int x = 0; x < policaLength; x++)
				{
					int stolpec = i + x;
					if (globine.get(stolpec) > stolpecGlobina) globine.set(stolpec, stolpecGlobina);	
				}
            }
        }
		
        return Collections.max(globine);
    }
}
