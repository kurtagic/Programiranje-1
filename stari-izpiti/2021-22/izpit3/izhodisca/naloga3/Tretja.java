
import java.util.*;

public class Tretja 
{

    public static class Oddajnik
	{
		List<Sprejemnik> sprejemniki;
		
		public Oddajnik() 
		{
			this.sprejemniki = new ArrayList<>();
		}
		
		public void doddaj(Sprejemnik sprejemnik)
		{
			sprejemniki.add(sprejemnik);
		}
		
		public void oddaj(char c)
		{
			for(Sprejemnik sprejemnik : this.sprejemniki)
			{
				sprejemnik.sprejmi(c);
			}
		}
    }

    public static class Sprejemnik 
	{
		Oddajnik oddajnik;
		
		String zadnjiZnaki;
		int count;
		
		public Sprejemnik(Oddajnik oddajnik)
		{
			this.oddajnik = oddajnik;
			
			oddajnik.doddaj(this);

			this.zadnjiZnaki = "";
			this.count = 0;
		}
		
		public void sprejmi(char c)
		{
			zadnjiZnaki += c;
			this.count++;
		}
		
		public int koliko()
		{
			return this.count;
		}
		
		public String odZadnjic()
		{
			String kopija = zadnjiZnaki;
			zadnjiZnaki = "";
			return kopija;
		}
    }
}
