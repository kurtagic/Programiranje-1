import java.util.*;

public class Prva
{

  public static void main (String args[])
  {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();

      while(sc.hasNext())
      {
        if(jeSkorajKvadrat(sc.nextInt())) 
        {
          System.out.println("DA");
          continue;
        }
        
        System.out.println("NE");
      }
  }

  private static boolean jeSkorajKvadrat(int ploscina)
  {
    for(int i = 1; i <= Math.sqrt(ploscina); i++) 
    { 
      if(ploscina % i != 0) continue;
      int k = ploscina / i;

      if(i == k) return true;
      int daljsa = i > k ? i : k;
      int krajsa = i < k ? i : k;

      if(krajsa > daljsa/2) return true;
    }

    return false;
  }
}
