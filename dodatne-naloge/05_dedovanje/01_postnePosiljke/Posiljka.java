public abstract class Posiljka {
	private String naslovnik;
	private String vsebina;
	private int cena;
	
	public static int Z;
	public static int R;
	public static int D;
	public static int P;
	public static int T;
	
	public Posiljka(String naslovnik, String vsebina) {
		this.naslovnik = naslovnik;
		this.vsebina = vsebina;
	}
	
	public abstract int calculateCena();
	
	public abstract String izpisi();
	
	public String getNaslovnik() {
		return this.naslovnik;
	}
	
	public String getVsebina() {
		return this.vsebina;
	}
	
	public void setCena(int cena) {
		this.cena = cena;
	}
	
	public int getCena() {
		return this.cena;
	}
	
	public static void setVars(int aZ, int aR, int aD, int aP, int aT) {
		Z = aZ;
		R = aR;
		D = aD;
		P = aP;
		T = aT;
	}
}