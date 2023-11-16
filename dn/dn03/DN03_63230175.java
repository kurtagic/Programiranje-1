import java.util.*;

public class DN03_63230175 {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		int h =  sc.nextInt();
		int w = sc.nextInt();
		int k = sc.nextInt();

		System.out.println(getTiles(h, w, k));
	}

	private static long getTiles(long height, long width, int k) {
		if(height == 0 || width == 0) return 0;
		if(height == 1 || width == 1) return height*width;

		int tileSize  = 1 << k;

		long tilesInHeight = height/tileSize;
		long restHeight = height % tileSize;
		long tilesInWidth = width/tileSize;
		long restWidth = width % tileSize;

		long res = tilesInHeight * tilesInWidth;

		res += getTiles(tilesInHeight*tileSize, restWidth, k - 1);
		res += getTiles(restHeight, tilesInWidth*tileSize, k - 1);
		res += getTiles(restHeight, restWidth, k - 1);
		
		return res;
	}
}