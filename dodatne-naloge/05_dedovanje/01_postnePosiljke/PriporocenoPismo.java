public class PriporocenoPismo extends Pismo {
	private String posiljatelj;
	
	public PriporocenoPismo(String naslovnik, String vsebina, String razdalja, String posiljatelj) {
		super(naslovnik, vsebina, razdalja);
		this.posiljatelj = posiljatelj;
		
		setCena(calculateCena());
	}
	
	public String getPosiljatelj() {
		return this.posiljatelj;
	}
	
	@Override
	public int calculateCena() {
		int c = super.calculateCena();
		int cena = c * P;
		
		return cena;
	}
	
	@Override
	public String izpisi() {
		return String.format("PP | %s | %s | %d | %s | %d", getNaslovnik(), getVsebina(), getRazdalja(), posiljatelj, getCena());
	}
}