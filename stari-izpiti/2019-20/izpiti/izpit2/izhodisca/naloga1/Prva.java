import java.util.*;

public class Prva 
{

    public static void main(String[] args) 
	{   
		Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = -1;
        int index = 1;
		
        while(sc.hasNextInt()) 
		{
			b = sc.nextInt();
			if(b % a != 0) break;
			a = b;
			index++;
        }
        
        System.out.println(index);
    }
}
