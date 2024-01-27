public class Pismo {
	private Posta izvornaPosta;
	private Posta ciljnaPosta;
	private boolean jePriporoceno;
	private char statusPriporocenosti;
	private int razdalja;
	
	private static int enotaRazdalje;
	private static int enotaCene;
	private static int priporocnina;
	
	public Pismo(Posta izvornaPosta, Posta ciljnaPosta, boolean jePriporoceno, int razdalja) {
		this.izvornaPosta = izvornaPosta;
		this.ciljnaPosta = ciljnaPosta;
		this.jePriporoceno = jePriporoceno;
		this.razdalja = razdalja;
		
		statusPriporocenosti = jePriporoceno ? 'P' : 'N';
	}
	
	@Override
	public String toString() {
		return String.format("%s -> %s (%d km) [%c]", izvornaPosta, ciljnaPosta, razdalja, statusPriporocenosti);
	}
	
	public boolean izviraOd(Posta posta) {
		return posta.equals(this.izvornaPosta);
	}
	
	public boolean staIzvorInCiljIsta() {
		return this.izvornaPosta.equals(this.ciljnaPosta);
	}
	
	public boolean imaIstiCiljKot(Pismo pismo) {
		return pismo.ciljnaPosta.equals(this.ciljnaPosta);
	}
	
	public static boolean imataIstiCilj(Pismo p1, Pismo p2) {
		return p1.ciljnaPosta.equals(p2.ciljnaPosta);
	}
	
	public int cena() {
		int cena = jePriporoceno ? priporocnina : 0;
		cena += (razdalja / enotaRazdalje + 1) * enotaCene;
		return cena;
	}
	
	public static void nastaviKonstanteZaCeno(int r, int c, int p) {
		enotaRazdalje = r;
		enotaCene = c;
		priporocnina = p;
	}
	
	public boolean jeDrazjeOd(Pismo pismo) {
		return this.cena() > pismo.cena();
	}
	
	
	public static Pismo vrniDrazje(Pismo p1, Pismo p2) {
		int c1 = p1.cena();
		int c2 = p2.cena();
		if(c1 == c2) return p2;
		return c1 > c2 ? p1 : p2;
	}
	
	public Pismo izdelajPovratno() {
		return new Pismo(this.ciljnaPosta, this.izvornaPosta, jePriporoceno, razdalja);
	}
}