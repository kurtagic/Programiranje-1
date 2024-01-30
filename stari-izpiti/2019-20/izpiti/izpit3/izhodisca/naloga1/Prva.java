import java.util.*;

public class Prva 
{

    public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		while(!jeObilno(n))
		{
			n++;
		}
		
		System.out.println(n);
    }
	
	private static boolean jeObilno(int n)
	{
		int vsotaDeliteljev = 0;
		for(int i = 1; i <= n / 2; i++)
		{
			if(n % i == 0) vsotaDeliteljev += i;
		}
		
		return n < vsotaDeliteljev;
	}
}
