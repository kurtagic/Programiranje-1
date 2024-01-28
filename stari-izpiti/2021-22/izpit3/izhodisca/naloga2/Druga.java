
import java.util.*;

public class Druga 
{

    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int w = sc.nextInt();
		
		int[][] slika = new int[h][w];
		
		for(int i = 0; i < h; i++)
		{
			for(int j = 0; j < w; j++)
			{
				if (sc.nextInt() == 1) slika[i][j] = 1;
			}
		}
		
		System.out.println(prestejMejneTocke(slika));
    }
	
	private static int prestejMejneTocke(int[][] slika)
	{
		int height = slika.length;
		int width = slika[0].length;
		int mejneTocke = 0;
		
		for (int i = 0; i < height; i++) 
		{
            for (int j = 0; j < width; j++) 
			{
                if (slika[i][j] != 1) continue;
                
				if (i * j == 0 || i == height - 1 || j == width - 1) 
				{
                   mejneTocke++;
				   continue;
                } 
				
				if(jeSosedNic(slika, i, j)) mejneTocke++;
            }
        }
		
		return mejneTocke;
	}
	
	private static boolean jeSosedNic(int[][] slika, int i, int j) 
	{
		int[][] directions = {
			{-1, 0}, {1, 0},
			{0, -1}, {0, 1},
			{-1, -1}, {-1, 1},
			{1, -1}, {1, 1}
		};

		int height = slika.length;
		int width = slika[0].length;

		for (int[] direction : directions) 
		{
			int y = i + direction[0];
			int x = j + direction[1];

			if(slika[y][x] != 0) continue;
			if (x * y >= 0 && y < height && x < width) return true;	
		}

		return false;
	}
}