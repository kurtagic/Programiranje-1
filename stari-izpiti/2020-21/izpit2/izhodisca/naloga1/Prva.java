import java.util.*;

public class Prva 
{
	public static final String ZVEZDA = "*";
	public static final String PRESLEDEK = " ";
	
    public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		narisiH(a, b);
	}
	
	private static void narisiH(int a, int b)
	{
		narisiDel(a, b);	
		
		for(int i = 0; i < a; i++)
		{
			System.out.println(ZVEZDA.repeat(4*b));
		}
		
		narisiDel(a, b);
		
	}
	
	private static void narisiDel(int a, int b)
	{
		for(int i = 0; i < 2*a; i++)
		{
			String row = "";
			row += ZVEZDA.repeat(b);
			row += PRESLEDEK.repeat(2*b);
			row += ZVEZDA.repeat(b);
			
			System.out.println(row);
		}
	}
}
