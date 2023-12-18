import java.util.*;

public class PoliticnaNasprotjaII {

    private static long[][][][] memo;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int levi = sc.nextInt();
        int desni = sc.nextInt();
        int centristi = sc.nextInt();

        memo = new long[levi +1][centristi +1][desni+1][3];
		
		for (int i = 0; i <= levi; i++) {
			for (int j = 0; j <= centristi; j++) {
				for (int k = 0; k <= desni; k++) {
					for(int p = 0; p < 3; p++) {
						memo[i][j][k][p] = -1;
					}
				}
			}
		}
		
        System.out.println(getArrangements(new int[]{levi, centristi, desni}, new int[levi + centristi + desni], 0));
    }

    private static long getArrangements(int[] politicians, int[] arrangement, int index) {
		if (index == arrangement.length) return 1;
		int left = politicians[0];
		int center = politicians[1];
		int right = politicians[2];
       
        long arrangements = 0;
        int previousPolitician = index == 0 ? 1 : arrangement[index - 1];
		
		if (memo[left][center][right][previousPolitician] != -1) return memo[left][center][right][previousPolitician];
		
        for (int politician = 0; politician < 3; politician++) {
            if (politicians[politician] < 1) continue;
            if (Math.abs(politician - previousPolitician) > 1) continue;
			
            arrangement[index] = politician;

            politicians[politician]--;
            arrangements += getArrangements(politicians, arrangement, index + 1);
            politicians[politician]++;

        }
		
		memo[left][center][right][previousPolitician] = arrangements;
        return arrangements;
    }
}