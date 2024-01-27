public class Druga 
{
	public static int potZoge(int strelec, boolean[][] igralci, int smer) 
	{		
		int razdalja = smer == 1 ? igralci[0].length - strelec - 1 : strelec;
		
		for (int y = 0; y < igralci.length; y++) 
		{
			for (int x = 0; x < igralci[0].length; x++) 
			{
				if (!igralci[y][x]) continue; 
				if(Math.abs(x - strelec) < Math.abs(y - igralci.length / 2)) continue;
				if(Math.abs(x - strelec) >= razdalja) continue;
				if(Math.abs(strelec - x + smer) >= Math.abs(strelec - x)) continue;
				
				razdalja = Math.abs(x - strelec);	
			}
		}
		
		return razdalja;
	}
}