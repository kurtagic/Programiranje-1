import java.util.*;

public class MaksimumPoStolpcihI {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int v = sc.nextInt();
		int s = sc.nextInt();
		
		int[][] matrika = new int[v][s];
		
		for(int i = 0; i < v; i++) {			
			for(int j = 0; j < s; j++) {
				matrika[i][j] = sc.nextInt();
			}
		}
		
		System.out.println(Arrays.toString(getMaximums(matrika)));
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