import java.util.*;

public class Druga 
{
    public static int zadnjaVrsticaZLocilom(char[][] krizanka) 
	{
        
		for(int i = krizanka.length - 1; i >= 0; i--)
		{
			for(int j = 0; j < krizanka[0].length; j++)
			{
				if(krizanka[i][j] == '-') return i;
			}
		}
		
		return -1;
    }

    public static char[] ktaBeseda(char[][] krizanka, int stolpec, int k) 
	{
		String stolpecCrke = "";
		for(int i = 0; i < krizanka.length; i++)
		{
			stolpecCrke += krizanka[i][stolpec];	
		}
		
		String[] besede = stolpecCrke.split("-");

		if(besede.length < k) return null;

        return besede[k - 1].toCharArray();
    }
}