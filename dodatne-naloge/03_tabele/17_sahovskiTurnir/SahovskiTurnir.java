import java.util.*;

public class SahovskiTurnir {
	
	public static final int DRAW_VALUE = 0;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		List<int[]> results = new ArrayList<>();
		while(sc.hasNext()) {
			int[] game = new int[3];
			for(int i = 0; i < 3; i++) {
				game[i] = sc.nextInt();
			}
			results.add(game);
		}
		
		int[][] scoreboard = getScoreboard(results, n);
		
		Arrays.sort(scoreboard, (a, b) -> Integer.compare(b[1], a[1]));
		printMatrix(scoreboard);
	}
	
	private static int[][] getScoreboard(List<int[]> matrix, int players) {
		int[][] scoreboard = new int[players][2];
		for(int i = 0; i <  players; i++) {
			scoreboard[i][0] = i+1;
		}
		for(int[] game : matrix) {
			int player1 = game[0] - 1;
			int player2 = game[1] - 1;
			
			if(game[2] == DRAW_VALUE) {
				scoreboard[player1][1]++;
				scoreboard[player2][1]++;
				continue;
			}
			
			int gameWinner = game[2] > 0 ? player1 : player2;
			scoreboard[gameWinner][1] += 2;
		}
		
		return scoreboard;
	}
	
	private static void printMatrix(int[][] matrix) {
		for(int[] player : matrix) {
			System.out.printf("%d %d\n", player[0], player[1]);
		}
	}
}