import java.util.*;

public class DN05_63230175 {
	private static final int[][][] BLOCKS = {
		{{1, 1, 1, 1}}, // 0 (1)
		{{1, 1}, {1, 1}}, // 2
		{{0, 1, 0},{1, 1, 1}}, // 3 (4, 5, 6)
		{{1, 0},{1, 0},{1, 0},{1, 1}} // 7 (8, 9, 10, 11, 12, 13, 14)
		{{1, 1, 0}{0, 1, 1}}// 15 (16, 17, 18)
    };
	
	private static final int[] BLOCK_DEFAULTS {
		0, 2, 3, 7, 15
	};

    private static final int ODMIK_X = 1000;
    private static final int MAX_RAZPON_X = 2010;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int blocks = sc.nextInt();
        int[] columns = new int[MAX_RAZPON_X];

        for (int i = 0; i < blocks; i++) {
            int block = sc.nextInt();
            placeBlock(columns, block, sc.nextInt() + ODMIK_X);
        }

        for (int i = 0; i < columns.length; i++) {
            if (columns[i] > 0) System.out.printf("%d: %d%n", i - ODMIK_X, columns[i]);
            
        }
    }

    private static void placeBlock(int[] columns, int block, int x) {
        // int[] visine = HEIGHTS[block];
        // int[] odmiki = OFFSETS[block];
        int[] heights = getBlockHeight(block);
		int[] offsets = getBlockOffset(block);
		int base = 0;

        for (int i = 0; i < heights.length; i++) {
            base = Math.max(base, columns[x + i] - offsets[i]);
        }

        for (int i = 0; i < heights.length; i++) {
            columns[x + i] = base + heights[i];
        }
    }
	
	private static int[] getBlockHeight(int block) {
		int blockShape[][] = getBlockShape(int block);		
	}
	
	private static int[][] getBlockShape(int block) {
		int type = 0;
		
		if(block < 2) type = 0;
		else if(block == 2) type = 2;
		else if(block < 7) type = 3;
		else if(block < 15) type = 7;
		else if(block < 19) type = 15;
		
	}
}