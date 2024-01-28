
import java.util.*;

public class Prva 
{

    public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int veckotniki = 0;
		Tocka prva = null;
		
		while(sc.hasNext())
		{
			Tocka tocka = new Tocka(sc.nextInt(), sc.nextInt());
			
			if(prva == null)
			{
				prva = tocka;
				continue;
			}
			
			if(tocka.equals(prva))
			{
				veckotniki++;
				prva = null;
			}		
		}
		
		System.out.println(veckotniki);
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
		
		@Override
		public boolean equals(Object o)
		{
			Tocka t = (Tocka) o;			
			return this.x == t.x && this.y == t.y;
		}
	}
}