import java.util.*;

public class Druga 
{
	public static final int DREVO = 1;
	public static final int PRAZNO = 0;
	public static final int CASOVNA_MEJA = 10_000;
    
    public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int k = sc.nextInt();
		
		int[][] matrix = new int[h][w];
		
		for(int i = 0; i < h; i++)
		{
			for(int j = 0; j < w; j++)
			{
				matrix[i][j] = sc.nextInt();
			}
		}
		
		System.out.println(steviloUrHoda(matrix, a, b, k));
	}
	
	private static int steviloUrHoda(int[][] matrix, int a, int b, int k)
	{
		int x = 0;
		int y = 0;
		int drevesa = 0;
		
		int ure = 0;
		for(; drevesa < k && ure < CASOVNA_MEJA; ure++)
		{
			x = (x + b) % matrix[0].length;
			y = (y + a) % matrix.length;
			
			if(matrix[y][x] == DREVO) drevesa++;
		}
		
		return ure;
	}
}