public class Oseba {
    private String ime;
    private String priimek;
    private char spol;
    private int letoRojstva;
    private Oseba oce;
    private Oseba mati;

    private static int stUstvarjenih = 0;

    public Oseba(String ime, String priimek, char spol, int letoRojstva, Oseba oce, Oseba mati) {
        this.ime = ime;
        this.priimek = priimek;
        this.spol = spol;
        this.letoRojstva = letoRojstva;
        this.oce = oce;
        this.mati = mati;
        stUstvarjenih++;
    }

    public String vrniIme() {
        return this.ime;
    }

    public void nastaviIme(String novoIme) {
        this.ime = novoIme;
    }

    public String toString() {
        return String.format("%s %s (%c), %d", this.ime, this.priimek, this.spol, this.letoRojstva);
    }

    public int starost(int leto) {
        return leto - this.letoRojstva;
    }

    public boolean jeStarejsaOd(Oseba os) {
       return this.letoRojstva < os.letoRojstva;
	}
    public String imeOceta() {
        return (this.oce != null) ? this.oce.ime : null;
    }


    public boolean jeBratAliSestraOd(Oseba os) {
		if(this == os) return false;
		if(this.oce == null || this.mati == null) return false;
		
		return this.oce == os.oce && this.mati == os.mati;
    }

    public boolean jeSestraOd(Oseba os) {
        return (this.jeBratAliSestraOd(os) && this.spol == 'Z');
    }
	
    public boolean jeTetaOd(Oseba os) {
		return jeSestraOd(os.oce);

    }

    public boolean jeOcetovskiPrednikOd(Oseba os) {		
		if(os.oce == null) return false;
        if(os.oce == this) return true;
        return jeOcetovskiPrednikOd((os.oce)) || jeOcetovskiPrednikOd(os.mati);
    }
	
	public boolean jeMaterinskiPrednikOd(Oseba os) {
		
		if(os.mati == null) return false;
        if(os.mati == this) return true;
        return jeMaterinskiPrednikOd((os.mati)) || jeMaterinskiPrednikOd(os.oce);
    }

    public static int steviloUstvarjenih() {
        return stUstvarjenih;
    }
	
    public int ocetovskaGeneracijskaRazlika(Oseba os) {
		if(this == os) return 0;
		if(this.jeOcetovskiPrednikOd(os)) return this.countGenerations(os, 0);
		if(os.jeOcetovskiPrednikOd(this)) return -os.countGenerations(this, 0);
		
		throw new IllegalArgumentException();
    }
	
	private int countGenerations(Oseba os, int generations) {
		if (os == null) return generations;
		if (os == this) return generations;

		return countGenerations(os.oce, generations + 1);
	}

    public boolean jePrednikOd(Oseba os) {
		if(this == os) return true;
		boolean ocePrednik = this.jeOcetovskiPrednikOd(os);
		boolean matiprednik = this.jeMaterinskiPrednikOd(os);

		return ocePrednik || matiprednik;
    }

    public void nastejPrednike() {
		this.nastejPrednike("this");
    }
	
	public void nastejPrednike(String path) {
		System.out.printf("%s: %s\n", path, this);
		
		if(this.oce != null) this.oce.nastejPrednike(path + ".oce");	
		if(this.mati != null) this.mati.nastejPrednike(path + ".mati");
	}

    public boolean jeSorodnikOd(Oseba os) {
        return staSorodnika(this, os);
    }
	
	private boolean staSorodnika(Oseba os1, Oseba os2) {
		if(os1 == null || os2  == null) return false;
		if(os1 == os2) return true;
		if(staSorodnika(os1.oce, os2) || staSorodnika(os1, os2.oce)) return true;
		if(staSorodnika(os1.mati, os2) || staSorodnika(os1, os2.mati)) return true;
        
		return false;
	}
}
