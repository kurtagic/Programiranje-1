import java.util.*;

public class PravilniTrikotnik {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int d = sc.nextInt();
		int n = sc.nextInt();
		
		int[][] points = new int[n][2];
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < 2; j++) {
				points[i][j] = sc.nextInt();
			}
		}
		
		printList(getRightTriangles(points, d));
	}
	
	private static void printList(List<int[]> list) {
		if(list.isEmpty()) {
			System.out.println("BREZ"); 
			return;
		}
		
		for(int[] triangle : list) {
			System.out.printf("%d %d %d\n", triangle[0], triangle[1], triangle[2]);
		}
	}
	
	private static List<int[]> getRightTriangles(int[][] points, int d) {
		List<int[]> rightTriangles = new ArrayList<>();
		
		List<int[]> triangles = generateCombinations(points); 
		for(int[] triangle : triangles) {
			if(isRightTriangle(points, triangle, d)) rightTriangles.add(triangle);
		}
		
		return rightTriangles;
	}
	
	private static List<int[]> generateCombinations(int[][] matrix) {
		List<int[]> combinations = new ArrayList<>();
		for(int i = 0; i < matrix.length; i++) {
			for(int j = i + 1; j < matrix.length; j++) {
				for(int k = j + 1; k < matrix.length; k++) {
					combinations.add(new int[]{i, j, k});
				}
			}
		}
		
		return combinations;
	}
	
	
	private static boolean isRightTriangle(int[][] points, int[] triangle, int d) {
		
		double[] sides = new double[3];
		int A = triangle[0];
		int B = triangle[1];
		int C = triangle[2];
        sides[0] = getDistance(points[A], points[B]);
        sides[1] = getDistance(points[A], points[C]);
        sides[2] = getDistance(points[B], points[C]);
		
		Arrays.sort(sides);
		return sides[2] - sides[0] < Math.pow(10, -d) * sides[0];
	}
	
	private static double getDistance(int[] A, int[] B) {
		return Math.sqrt(Math.pow(A[0] - B[0], 2) + Math.pow(A[1] - B[1], 2));
	}
}