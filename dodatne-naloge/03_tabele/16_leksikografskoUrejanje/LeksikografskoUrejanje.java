import java.util.*;

public class LeksikografskoUrejanje {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d = sc.nextInt();
		
		int[][] vectors = new int[n][d];
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < d; j++) {
				vectors[i][j] = sc.nextInt();
			}
		}

		sortLexicographically(vectors, d);
		printMatrix(vectors);
	}
	
	private static void sortLexicographically(int[][] matrix, int rowLength) {
		Arrays.sort(matrix, (a, b) -> {
			for (int i = 0; i < rowLength; i++) {
                if (a[i] != b[i]) return Integer.compare(a[i], b[i]);
            }
			
			return 0;
        });
	}
	
	private static void printMatrix(int[][] matrix) {		
		for(int[] row : matrix) {
			System.out.println(Arrays.toString(row));
		}
	}
}