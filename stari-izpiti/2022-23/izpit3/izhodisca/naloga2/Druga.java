import java.util.*;

public class Druga {

    public static int[] manhattan(boolean[][] t) 
	{
		int h = t.length;
		int w = t[0].length;
		int dolzina = h + w - 1;
		int[] razdalje = new int[dolzina];
		
		List<Tocka> tocke = zgenerirajTocke(t);
		
		for(int i = 0; i < dolzina; i++)
		{
			razdalje[i] = steviloRazdalj(tocke, i);
		}
		
        return razdalje;
    }
	
	private static List<Tocka> zgenerirajTocke(boolean[][] matrix)
	{
		List<Tocka> tocke = new ArrayList<>();
		
		for(int i = 0; i < matrix.length; i++)
		{
			for(int j = 0; j < matrix[0].length; j++)
			{
				if(matrix[i][j] == true) tocke.add(new Tocka(j, i));
			}
		}
		
		return tocke;
	}
	
	private static int steviloRazdalj(List<Tocka> tocke, int target)
	{
		int count = 0;

		for(int i = 0; i < tocke.size() - 1; i++)
		{
			for(int j = i + 1; j < tocke.size(); j++)
			{
				Tocka t1 = tocke.get(i);
				Tocka t2 = tocke.get(j);
				
				if(t1.razdalja(t2) == target) count++;
			}
		}
		
		return count;
	}
	
	private static class Tocka 
	{
		int x;
		int y;
		
		public Tocka(int x, int y)
		{
			this.x = x;
			this.y = y;
		}
		
		public int razdalja(Tocka t)
		{
			return Math.abs(this.x - t.x) + Math.abs(this.y - t.y);
		}
	}
}
