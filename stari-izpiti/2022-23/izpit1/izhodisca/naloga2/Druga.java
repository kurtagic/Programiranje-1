import java.util.*;

public class Druga 
{
	
	public static final char VODORAVNO = 'v';
	public static final char NAVPICNO = 'n';

    public static boolean krizankaOK(char[][] besede, char[][] polozaji) {
		
		Map<List<Integer>, Character> tockeCrke = new HashMap<>();
		for(int i = 0; i < besede.length; i++)
		{
			char[] beseda = besede[i];
			
			List<Integer[]> tocke = zgenerirajTocke(polozaji[i], beseda.length);
			
			for(int k = 0; k < tocke.size(); k++)
			{
				List<Integer> tocka = Arrays.asList(tocke.get(k));
				char crka = beseda[k];
				
				if(!tockeCrke.containsKey(tocka))
				{
					tockeCrke.put(tocka, crka);
					continue;
				}

				if(tockeCrke.get(tocka) != crka) return false;	
			}
		}
		
		return true;
    }
	
	private static List<Integer[]> zgenerirajTocke(char[] polozaj, int dolzina)
	{
		int startX = polozaj[1] - '0';
		int startY = polozaj[0] - '0';
		char smer = polozaj[2];
		
		List<Integer[]> tocke = new ArrayList<>();
		
		for(int i = 0; i < dolzina; i++)
		{
			tocke.add((smer == VODORAVNO) ? new Integer[]{startX++, startY} : new Integer[]{startX, startY++});
		}

		return tocke;
	}	
}