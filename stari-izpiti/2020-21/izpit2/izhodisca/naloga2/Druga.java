import java.util.*;

public class Druga 
{
	public static final int ZEMLJA = 1;
	public static final int NEBO = 0;

    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		
		int[][] matrix = new int[h][w];
		for(int i = 0; i < h; i++)
		{
			for(int j = 0; j < w; j++)
			{
				matrix[i][j] = sc.nextInt();
			}
		}
		
		int[] visine = visineStolpcov(matrix);
		
		System.out.println(dolzine(visine)[0]);
		System.out.println(dolzine(visine)[1]);
    }
	
	private static int[] dolzine(int[] array)
	{
		int[] dolzine = new int[2];
		
		for(int i = 1; i < array.length; i++)
		{
			int delta =  array[i] - array[i - 1];
			if(delta > 0) dolzine[0] += delta;
			if(delta < 0) dolzine[1] += -delta;
		}
		
		return dolzine;
	}
		
	private static int[] visineStolpcov(int[][] matrix)
	{
		int[] visine = new int[matrix[0].length];
		
		for(int x = 0; x < matrix[0].length; x++)
		{
			for(int y = 0; y < matrix.length; y++)
			{
				if(matrix[y][x] == NEBO) continue;
				
				visine[x] = matrix.length - y;
				break;
			}
		}
		
		return visine;
	}
}
