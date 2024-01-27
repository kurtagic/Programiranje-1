public class Druga {
	public static int potZoge(int strelec, boolean[][] igralci, int smer) {
		int minR = strelec;
		if (smer == 1) {
			minR = igralci[0].length - strelec - 1;
		}
		for (int i = 0; i < igralci.length; i++) {
			for (int j = 0; j < igralci[0].length; j++) {
				if (igralci[i][j] && Math.abs(j - strelec) >= Math.abs(i - igralci.length / 2) && Math.abs(j - strelec) < minR && Math.abs(strelec + smer - j) < Math.abs(strelec - j)) {
					minR = Math.abs(j - strelec);
				}
			}
		}
		return minR;
	}
}