public class Pismo extends Posiljka {
	private int razdalja;
	
	public Pismo(String naslovnik, String vsebina, String razdalja) {
		super(naslovnik, vsebina);
		this.razdalja = Integer.parseInt(razdalja);

		setCena(calculateCena());
	}
	
	public int getRazdalja() {
		return this.razdalja;
	}
	
	@Override
	public int calculateCena() {
		int pot = razdalja;		
		int cena = Z;
		int delta = R;
		
		while(pot > delta - 1) {
			cena += D;
			pot -= R;
		}
		
		return cena;
	}
	
	@Override
	public String izpisi() {
		return String.format("NP | %s | %s | %d | %d", getNaslovnik(), getVsebina(), getRazdalja(), getCena());
	}
}