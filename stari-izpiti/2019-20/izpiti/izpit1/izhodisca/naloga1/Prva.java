import java.util.*;

public class Prva 
{

    public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int k = sc.nextInt();
		
		System.out.println(getKup(a, b, k));
    }
	
	private static int getKup(int a, int b, int k)
	{  
        int kup = 1;
        int kupVelikost = a;
		
        while(k > kupVelikost) 
		{
            kupVelikost += kup * b + a;
            kup++;
        }
		
		return kup;
	}
}
