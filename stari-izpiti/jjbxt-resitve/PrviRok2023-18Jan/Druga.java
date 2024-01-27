public class Druga {
	public static void main(String[] args) {

	}

	public static boolean krizankaOK(char[][] besede, char[][] polozaji) {
		char[][] kriz = new char[20][20];
		for (int i = 0; i < besede.length; i++) {
			int zacX = polozaji[i][1] - '0';
			int zacY = polozaji[i][0] - '0';
			for (int j = 0; j < besede[i].length; j++) {
				char crka = besede[i][j];
				if (kriz[zacY][zacX] == 0) {
					kriz[zacY][zacX] = crka;
				} else if (kriz[zacY][zacX] != crka) {
					return false;
				}
				if (polozaji[i][2] == 'n') {
					zacY++;
				} else {
					zacX++;
				}
			}
		}
		return true;
	}
}