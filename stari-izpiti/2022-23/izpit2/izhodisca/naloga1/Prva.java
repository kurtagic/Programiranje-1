import java.util.*;

public class Prva {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt();
		
		while(sc.hasNext())
		{	
			char[] a = sc.next().toCharArray();
			char[] b = sc.next().toCharArray();
			
			if(!isPairLegal(a, b)) 
			{
				count--;
			}
		}
		
		sc.close();
		
		System.out.println(count);
    }
	
	private static boolean isPairLegal(char[] a, char[] b)
	{
		for(int i = 0; i < a.length; i++)
		{
			if(a[i] >= b[i]) return false;
		}
		
		return true;
	}
}
