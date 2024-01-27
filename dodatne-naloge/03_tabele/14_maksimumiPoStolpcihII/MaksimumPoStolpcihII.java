import java.util.*;

public class MaksimumPoStolpcihII {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[][] matrika = new int[n][];
		int maksDolzina = 0;
		for(int i = 0; i < n; i++) {			
			int d = sc.nextInt();
			if(d > maksDolzina) maksDolzina = d;
			
			int[] vrstica = new int[d];
			for(int j = 0; j < d; j++) {
				vrstica[j] = sc.nextInt();
			}
			
			matrika[i] = vrstica;
		}
		
		makeRectangle(matrika, maksDolzina);
		System.out.println(Arrays.toString(getMaximums(matrika)));
	}
	
	private static void makeRectangle(int[][] matrix, int length) {
		for(int i = 0; i < matrix.length; i++) {
			if(length - matrix[i].length == 0) continue;
			
			int[] modifiedRow = new int[length];
			for(int j = 0; j < length; j++) {
				if(j < matrix[i].length) modifiedRow[j] = matrix[i][j];
				else modifiedRow[j] = Integer.MIN_VALUE;
			}
			
			matrix[i] = modifiedRow;
		}
	}
	
	private static int[] getMaximums(int[][] matrix) {
		int[] maximums = new int[matrix[0].length];
		Arrays.fill(maximums, Integer.MIN_VALUE);
		
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				if(matrix[i][j] > maximums[j]) maximums[j] = matrix[i][j];
			}
		}
		
		return maximums;
	}
}