public class StiriVVrsto {
	
	private static final int EMPTY = -1;
	private static final int PLAYER_1 = 0;
	private static final int PLAYER_2 = 1;
	private static final int THRESHOLD = 4;
	private static final int DRAW = -1;
	
	private int rows;
	private int columns;
	private int[][] board;
	
	private int currentPlayer;
		
	public StiriVVrsto(int stVrstic, int stStolpcev) {
		this.currentPlayer = PLAYER_1;
		
		this.rows = stVrstic;
		this.columns = stStolpcev;
		
		this.board = new int[rows][columns];
		
		for(int[] row : board) {
			java.util.Arrays.fill(row, EMPTY);
		}
	}
	
	public int vrniSteviloVrstic() {
		return this.rows;
	}
	
	public int vrniSteviloStolpcev() {
		return this.columns;
	}
	
	public boolean vrzi(int stolpec) {
		if(getHeight(stolpec) >= rows) return false;
		increaseHeight(stolpec);
		switchPlayer();
		
		return true;
	}
	
	private void switchPlayer() {
		currentPlayer = (currentPlayer == PLAYER_1) ? PLAYER_2 : PLAYER_1;
	}
	
	private int getHeight(int column) {
        int height = 0;
        for (int row = 0; row < rows; row++) {
            if (board[row][column] == EMPTY) break;
            height++;
        }
        return height;
    }
	
	private void increaseHeight(int column) {
        for (int row = 0; row < rows; row++) {
            if (board[row][column] != EMPTY) continue;
			board[row][column] = currentPlayer;
            break;
        }
    }
	
	public int naPotezi() {
		return currentPlayer;
	}
	
	public int vsebina(int vrstica, int stolpec) {
		return board[vrstica][stolpec];
	}
	
	public int najdaljseZaporedje(int igralec) {		
		int length = 0;
		
		for (int column = 0; column < columns; column++) {
			for (int row = 0; row < rows; row++) {
				int vertical = getLength(row, column, 0, 1, igralec);
				int horizontal = getLength(row, column, 1, 0, igralec);
				int diagonalAscending = getLength(row, column, 1, 1, igralec);
				int diagonalDescending = getLength(row, column, 1, -1, igralec);
				
				int straightMax = Math.max(vertical, horizontal);
				int diagonalMax = Math.max(diagonalAscending, diagonalDescending);
				int tokenMax = Math.max(straightMax, diagonalMax);
				
				length = Math.max(length, tokenMax);
			}
		}
		
		return length;
	}
	
	private int getLength(int row, int column, int deltaRow, int deltaColumn, int player) {
		if(row >= rows) return 0;
		if(column < 0 || column >= columns) return 0;
		if(vsebina(row, column) != player) return 0;
		
        return getLength(row + deltaRow, column + deltaColumn, deltaRow, deltaColumn, player) + 1;
    }
	
	public int izid() {
		int length1 = najdaljseZaporedje(PLAYER_1);
		int length2 = najdaljseZaporedje(PLAYER_2);
		
		if(length1 >= THRESHOLD && length2 < THRESHOLD) return PLAYER_1;
		if(length2 >= THRESHOLD && length1 < THRESHOLD) return PLAYER_2;
		
		return DRAW;
	}
}