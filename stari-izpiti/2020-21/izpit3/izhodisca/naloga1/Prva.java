
import java.util.*;

public class Prva {

    public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int d = sc.nextInt();
		int v = sc.nextInt();	
		
		System.out.println(minStevilo(d, v));
    }
	
	private static int minStevilo(int dolzina, int vsota)
	{	
		int stevilo = (int) Math.pow(10, dolzina - 1);
		
		while (true) 
		{
			int sum = 0;

			for (char digit : Integer.toString(stevilo).toCharArray()) 
			{
				sum += digit - '0';
			}

			if (sum == vsota) break;
			
			stevilo++;
		}
		
		return stevilo;
	}
}
