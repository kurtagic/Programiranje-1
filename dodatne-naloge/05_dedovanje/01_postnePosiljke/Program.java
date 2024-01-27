import java.util.*;

public class Program {
	
	public static final String TELEGRAM = "T";
	public static final String NAVADNO_PISMO = "NP";
	public static final String PRIPOROCENO_PISMO = "PP";
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Z = sc.nextInt();
		int R = sc.nextInt();
		int D = sc.nextInt();
		int P = sc.nextInt();
		int T = sc.nextInt();
		
		Posiljka.setVars(Z, R, D, P, T);
		
		int n = sc.nextInt();
	
		sc.nextLine(); // read the rest of the line "n..."
		
		String[] vhodi = new String[n];
		for(int i = 0; i < n; i++) {
			vhodi[i] = sc.nextLine();
		}

		int ukaz = sc.nextInt();
		
		managePackages(vhodi, ukaz);
	}
	
	private static void managePackages(String[] vhodi, int ukaz) {
		
		String[][] entries = formatEntries(vhodi);
			switch (ukaz) {
			case 1:
				printPackages(entries);
				break;
			case 2:
				printNajdrazjiPackage(entries);
				break;
			case 3:
				printPovratnice(entries);
				break;
		}
	}
	
	private static String[][] formatEntries(String[] vhodi) {
		String[][] output = new String[vhodi.length][];
		
		for(int i = 0; i < vhodi.length; i++) {
			String[] values = vhodi[i].split(" ");
			
			String posiljka = values[0];
			String posiljkaType = getPosiljkaType(posiljka);
			String naslovnik = values[1];
			String vsebina = values[2];
				
			if(posiljkaType == TELEGRAM) {
				output[i] = new String[]{posiljkaType, naslovnik, vsebina};
				continue;
			}
			
			String razdalja = values[3];
			if(posiljkaType == NAVADNO_PISMO) {
				output[i] = new String[]{posiljkaType, naslovnik, vsebina, razdalja};
				continue;
			}
			
			String posiljatelj = values[4];
			if(posiljkaType == PRIPOROCENO_PISMO) {
				output[i] = new String[]{posiljkaType, naslovnik, vsebina, razdalja, posiljatelj};
				continue;
			}
		}
		
		return output;
	}
	
	private static String getPosiljkaType(String posiljka) {
		if(posiljka.equals("telegram")) return TELEGRAM;
		if(posiljka.equals("navadnoPismo")) return NAVADNO_PISMO;
		if(posiljka.equals("priporocenoPismo")) return PRIPOROCENO_PISMO;
		
		return "";
	}
	
	private static void printPackages(String[][] entries) {
		for(String[] entry : entries) {
			Posiljka posiljka = createPosiljka(entry);
			
			System.out.println(posiljka.izpisi());
		}
	}
	
	private static Posiljka createPosiljka(String[] entry) {
		String posiljkaType = entry[0];
		String naslovnik = entry[1];
		String vsebina = entry[2];
		String razdalja = "";
		String posiljatelj = "";
		
		if(posiljkaType.equals(TELEGRAM)) return new Telegram(naslovnik, vsebina);
		
		razdalja = entry[3];
		if(posiljkaType.equals(NAVADNO_PISMO)) return new Pismo(naslovnik, vsebina, razdalja);
		
		posiljatelj = entry[4];
		if(posiljkaType.equals(PRIPOROCENO_PISMO)) return new PriporocenoPismo(naslovnik, vsebina, razdalja, posiljatelj);

		return null;
	}
	
	private static void printNajdrazjiPackage(String[][] entries) {
		Posiljka najdrazja = null;
		
		for(String[] entry : entries) {
			Posiljka posiljka = createPosiljka(entry);
			if(najdrazja == null) najdrazja = posiljka;
			
			najdrazja = posiljka.getCena() > najdrazja.getCena() ? posiljka : najdrazja;
		}
		
		System.out.println(najdrazja.izpisi());
	}
	
	private static void printPovratnice(String[][] entries) {
		for(String[] entry : entries) {
			Posiljka posiljka = createPosiljka(entry);		
			if(!(posiljka instanceof PriporocenoPismo)) continue;
			
			PriporocenoPismo pp = (PriporocenoPismo) posiljka;
			
			String naslovnik = pp.getPosiljatelj();
			String vsebina = "povratnica"; 
			String razdalja = String.valueOf(pp.getRazdalja());
			String posiljatelj = pp.getNaslovnik();
			
			Posiljka povratnica = new PriporocenoPismo(naslovnik, vsebina, razdalja, posiljatelj);
			
			System.out.println(povratnica.izpisi());
		}
	}
}