public abstract class Datoteka {
    private String ime;

    public Datoteka(String name) {
        this.ime = name;
    }
	
	public String getIme() {
       return ime;
    }

    public abstract int velikost();
    public abstract String toString();
}
