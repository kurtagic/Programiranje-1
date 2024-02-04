import java.util.*;

public class Druga 
{

    public static void main(String[] args) 
    {
      Scanner sc = new Scanner(System.in);
      int u = sc.nextInt();
      int m = sc.nextInt();
      int n = sc.nextInt();
      int k = sc.nextInt(); 
      
      int[][] drazbe = new int[n][3];

      for(int i = 0; i < k; i++)
      {
        int drazitelj = sc.nextInt();
        int izdelek = sc.nextInt();
        int znesek = sc.nextInt();
        
        if(drazbe[izdelek][1] >= znesek) continue;
        
        drazbe[izdelek] = new int[]{ drazitelj, znesek };
      }

      int[] izhod = (u == 1) ? cene(drazbe, n) : stevilo(drazbe, m);

      System.out.println(Arrays.toString(izhod));
    }

    private static int[] cene(int[][] drazbe, int n)
    {
      int[] cene = new int[n];

      for(int i = 0; i < n; i++)
      {
        cene[i] = drazbe[i][1];
      }

      return cene;
    }
 
    private static int[] stevilo(int[][] drazbe, int m)
    {
      int[] drazitelji = new int[m];

      for(int[] drazba : drazbe)
      {
        int drazitelj = drazba[0];
        int cena = drazba[1];
        if(cena > 0) drazitelji[drazitelj]++;
      }

      return drazitelji;
    }
}
