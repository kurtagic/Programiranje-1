import java.util.*;

public class Prva
{

    public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		while(sc.hasNext())
		{
			System.out.println( jePadajoceZaporedje(sc.nextInt()) ? "DA" : "NE" );
		}
    }
	
	private static boolean jePadajoceZaporedje(int n)
	{
		int trenutna = 0;
		int prejsna = 0;
		
		while(n > 0)
		{
			trenutna = n % 10;
			n /= 10;
			
			if(prejsna > trenutna) return false;
			prejsna = trenutna;		
		}
		
		return true;
	}
}
