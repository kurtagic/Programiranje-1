import java.util.*;

public class Prva 
{

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
		
		while (digitsSum(stevilo) != vsota) 
		{
			stevilo++;
		}
		
		return stevilo;
	}
	
	private static int digitsSum(int n)
	{
		int sum = 0;

        while (n > 0) 
		{
            sum += n % 10;
            n /= 10;
        }

        return sum;
	}
}
