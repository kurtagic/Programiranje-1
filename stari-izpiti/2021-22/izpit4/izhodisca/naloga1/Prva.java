import java.util.*;

public class Prva 
{
	
	public static final String ZNAK = "*";
	public static final String PRAZNO = " ";

    public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);		
		int h = sc.nextInt();
		int d = sc.nextInt();
		
		int width = d;
		
		System.out.println(PRAZNO.repeat(h - 1) + ZNAK.repeat(width));
		
		for(int i = 1; i < h - 1; i++)
		{
			String row = "";			
			row += PRAZNO.repeat(h - 1 - i);
			row += ZNAK;
			row +=  PRAZNO.repeat(width);
			row += ZNAK;	
			
			System.out.println(row);
			
			width += 2;
		}
		
		int base = d + (h - 1) * 2;
		
		System.out.println(ZNAK.repeat(base));	
	}
}
