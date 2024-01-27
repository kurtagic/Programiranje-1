public class Posta {
	private int postnaStevilka;
	private String naziv;
	
	public Posta(int postnaStevilka, String naziv) {
		this.postnaStevilka = postnaStevilka;
		this.naziv = naziv;
	}
	
	public int vrniStevilko() {
		return this.postnaStevilka;
	}
	
	public String vrniNaziv() {
		return this.naziv;
	}
	
	@Override
	public String toString() {
		return String.format("%s %s", postnaStevilka, naziv);
	}
}