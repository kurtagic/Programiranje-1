import java.util.*;

public class Druga 
{
    public static int najCas(int[][] t, int krog) 
	{
		int[] min = new int[2];
		Arrays.fill(min, Integer.MAX_VALUE);
		for(int i = 0; i < t.length; i++)
		{
			int cas = t[i][krog];
			if(cas < min[0]) min = new int[]{cas, i};  
		}
	
        return min[0];
    }

    public static int[][] kumulativa(int[][] t) 
	{
		int[][] array = new int[t.length][t[0].length];
		for(int i = 0; i < array.length; i++)
		{
			array[i][0] = t[i][0];
			for(int j = 1; j < array[0].length; j++)
			{
				array[i][j] = array[i][j-1] + t[i][j];
			}
		}
		
		return array;
    }
}
