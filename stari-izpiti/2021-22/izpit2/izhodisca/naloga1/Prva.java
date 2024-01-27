import java.util.*;

public class Prva 
{

    public static void main(String[] args) 
	{
       Scanner sc = new Scanner(System.in);
	   int s = sc.nextInt();
	   int k = sc.nextInt();
	   
	   int branjevka = 1;
	   int branjevkaZaloga = s;
	   
	   while(sc.hasNext())
	   {
			int nakup = sc.nextInt();
			if(branjevkaZaloga - nakup < 0)
			{
				branjevka++;
				branjevkaZaloga = s;
				
			}
			
			branjevkaZaloga -= nakup;
		}
		
		System.out.println(branjevka);
    }
}
