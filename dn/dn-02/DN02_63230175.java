import java.util.*;

public class DN02_63230175 {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		int b = sc.nextInt();
		int d = sc.nextInt();
		int n = sc.nextInt();

		int[][] keyCoordinates = new int[n][2];

		for (int i = 0; i < n; i++) {
			keyCoordinates[i] = getKeyCoordinates(sc.nextInt(), b, d);
		}

		System.out.println(totalPath(keyCoordinates));
	}
	
	private static int totalPath(int[][] coordinates) {
		int distance = 0;
		
		for(int i = 0; i < coordinates.length - 1; i++) {
			distance += Math.abs(coordinates[i][0] - coordinates[i+1][0]) + Math.abs(coordinates[i][1] - coordinates[i+1][1]);
		}
		
		return distance;
	}
	
	private static int[] getKeyCoordinates(int number, int keyboardType, int keyboardSize) {
		int[] keyCoordinates = new int[2];

		switch (keyboardType) {
			case 1 -> keyCoordinates = ravnovrstnica(number);
			case 2 -> keyCoordinates = kvadratnica(number, keyboardSize);
			case 3 -> keyCoordinates = piramidnica(number);
			case 4 -> keyCoordinates = spiralnica(number);
		}

		return keyCoordinates;
}
	private static int[] ravnovrstnica(int key) {
		return new int[]{key, 0};
	}
	
	private static int[] kvadratnica(int key, int size) {
		return new int[]{key % size, -key / size};
	}
	
	private static int[] piramidnica(int key) {
		int root = (int) Math.sqrt(key);
		
		return new int[]{-root, key - root - root*root};
	}
	
	private static int[] spiralnica (int key) {
		int ring = (int) (Math.sqrt(key) + 1)/2;
		int offset = (key == 0) ? 0 : key - (2*ring - 1)*(2*ring - 1);
		
		if(offset == 0) return new int[]{-ring, ring};     
        if(offset <= 2*ring) return new int[]{offset - ring, ring};
        if(offset <= 4*ring) return new int[]{ring, -offset + 3*ring};
        if(offset <= 6*ring) return new int[]{-offset + 5*ring, -ring};    
		if(offset <= 8*ring) return new int[]{-ring, offset - 7*ring};
		
		return new int[2];
	}
}