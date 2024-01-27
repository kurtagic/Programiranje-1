import java.util.*;

public class Druga 
{
	public static final int[] END_STATE_COORDINATE = new int[]{-1, -1};
	
    public static int[] poLomljenki(boolean[][] matrika) 
	{	
		return poLomljenkiRekurzivno(matrika, new int[4], new int[]{1, 1});
    }
	
	private static int[] poLomljenkiRekurzivno(boolean[][] matrix, int[] steps, int[] coords)
	{
		// nocemo se vracati po poti nazaj, zato pot za sabo brisemo
		matrix[coords[1]][coords[0]] = false;
		
		// najdi naslednjo koordinato, 
		// ker smo brisali za sabo ne rabimo preverjati ali gremo po poti naprej ali nazaj
		int[] next = findNextCoords(matrix, steps, coords);
		
		// naslednja kordinata ne obstaja, smo na koncu poti
		if(Arrays.equals(next, END_STATE_COORDINATE)) return steps;
		
		return poLomljenkiRekurzivno(matrix, steps, next);
	}	
	
	private static int[] findNextCoords(boolean[][] matrix, int[] steps, int[] coords)
	{
		// levo, desno, gor, dol
		int[][] directions = { {-1, 0}, {1, 0}, {0, -1}, {0, 1} };
		
		for (int[] direction : directions) 
		{
			int x = coords[0] + direction[0];
			int y = coords[1] + direction[1];
			
			// naslednja koordinata je (edini) sosed
			if(matrix[y][x]) 
			{
				// ponastavi nove korake
				updateSteps(steps, direction);
				
				return new int[]{x, y};
			}
		}
		
		// nima sosedov, smo na koncu
		return END_STATE_COORDINATE;
	}
	
	private static void updateSteps(int[] steps, int[] direction)
	{		
		int k = -1;
		int x = direction[0];
		int y = direction[1];

		if(y == 0) k = x < 0 ? 0 : 2; // levo, desno
		if(x == 0) k = y < 0 ? 1 : 3; // gor, dol
		
		steps[k]++;
	}
}