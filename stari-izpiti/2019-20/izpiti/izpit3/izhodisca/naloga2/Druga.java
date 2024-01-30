import java.util.*;

public class Druga 
{
    public static int stPresezkov(int[][] r, int meja) 
	{
		int count = 0;
        for(int i = 0; i < r.length; i++)
		{
			for(int j = 0; j < r[i].length; j++)
			{
				if(r[i][j] > meja) count++;
			}
		}
		
		return count;
    }

	public static int nedeljskoPovprecje(int[][] r) 
	{
		int prvaNedeljaIndex = 6;
        int delci = 0;
        int nedelje = 0;
		
        for (int i = 0; i < r.length; i++) {
            for (int j = prvaNedeljaIndex; j < r[i].length; j += 7) 
			{
                delci += r[i][j];
                nedelje++;
                if (r[i].length - 7 <= j) prvaNedeljaIndex = j - r[i].length + 7;      
            }
        }
		
        return (int) delci / nedelje;
    }
}
