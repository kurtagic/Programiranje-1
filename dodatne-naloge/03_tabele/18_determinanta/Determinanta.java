import java.util.*;

public class Determinanta {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[][] matrix = new int[n][n];
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		
		System.out.println(getDeterminant(matrix));
	}
	
	private static int getDeterminant(int[][] matrix) {
		if(matrix.length == 1) return matrix[0][0];
		int determinant = 0;
		
		for(int i = 0; i < matrix.length; i++) {
			int[][] iMatrix = getReducedMatrix(matrix, i);
			int scalar = (int) Math.pow(-1, i) * matrix[0][i];
			determinant += scalar * getDeterminant(iMatrix);
		}
		
		return determinant;
	}
	
	private static int[][] getReducedMatrix(int matrix[][], int n) {
		int nMatrixSize = matrix.length-1;
		int[][] nMatrix = new int[nMatrixSize][nMatrixSize];
		
		for(int i = 1, k = 0; i < matrix.length; i++) {
			for(int j = 0, l = 0; j < matrix[i].length; j++) {
				if(j == n) continue;
				nMatrix[k][l] = matrix[i][j];
				l++;
			}
			k++;
		}

		return nMatrix;
	}
}