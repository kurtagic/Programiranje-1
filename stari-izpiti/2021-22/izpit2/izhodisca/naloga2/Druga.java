import java.util.*;

public class Druga 
{
    public static int stolpecZNajvecPrevladujoceZelenimi(int[][][] slika) 
	{
		int[] max = new int[2];
		
		for(int col = 0; col < slika[0].length; col++)
		{
			int kandidat = 0;
			
			for(int row = 0; row < slika.length; row++)
			{
				int[] komponente = slika[row][col];
				
				int rdeca = komponente[0];
				int zelena = komponente[1];
				int modra = komponente[2];
				
				if(zelena > rdeca && zelena > modra) kandidat++;
			}
			
			if(kandidat > max[1]) max = new int[]{col, kandidat};
		}
		
		return max[0];
    }
}
