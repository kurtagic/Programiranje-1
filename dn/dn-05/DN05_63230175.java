import java.util.*;

public class DN05_63230175 {
	private static final int[][][] BLOCKS = {
		{{1, 1, 1, 1}}, // 0 (1)
		{{1, 1}, {1, 1}}, // 2
		{{0, 1, 0},{1, 1, 1}}, // 3 (4, 5, 6)
		{{1, 0},{1, 0},{1, 0},{1, 1}} // 7 (8, 9, 10, 11, 12, 13, 14)
		{{1, 1, 0}{0, 1, 1}}// 15 (16, 17, 18)
    };

    private static final int[][] HEIGHTS = {
        {1, 1, 1, 1},
        {4},
        {2, 2},
        {1, 2, 1},
        {2, 3},
        {2, 2, 2},
        {3, 2},
        {3, 1},
        {1, 1, 2},
        {3, 3},
        {2, 2, 2},
        {1, 3},
        {2, 2, 2},
        {3, 3},
        {2, 1, 1},
        {2, 2, 1},
        {2, 3},
        {1, 2, 2},
        {3, 2}
    };

    private static final int[][] OFFSETS = {
        {0, 0, 0, 0},
        {0},
        {0, 0},
        {0, 0, 0},
        {1, 0},
        {1, 0, 1},
        {0, 1},
        {0, 0},
        {0, 0, 0},
        {2, 0},
        {0, 1, 1},
        {0, 0},
        {1, 1, 0},
        {0, 2},
        {0, 0, 0},
        {1, 0, 0},
        {0, 1},
        {0, 0, 1},
        {1, 0}
    };

    private static final int ODMIK_X = 1000;
    private static final int MAX_RAZPON_X = 2010;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int stSpustov = sc.nextInt();
        int[] stolpci = new int[MAX_RAZPON_X];

        for (int i = 0; i < stSpustov; i++) {
            int lik = sc.nextInt();
            int x = sc.nextInt() + ODMIK_X;
            postavi(stolpci, lik, x);
        }

        for (int i = 0; i < stolpci.length; i++) {
            if (stolpci[i] > 0) System.out.printf("%d: %d%n", i - ODMIK_X, stolpci[i]);
            
        }
    }

    private static void postavi(int[] stolpci, int ixLik, int x) {
        int[] visine = HEIGHTS[ixLik];
        int[] odmiki = OFFSETS[ixLik];
        int base = 0;

        for (int i = 0; i < visine.length; i++) {
            base = Math.max(base, stolpci[x + i] - odmiki[i]);
        }

        for (int i = 0; i < visine.length; i++) {
            stolpci[x + i] = base + visine[i];
        }
    }
}