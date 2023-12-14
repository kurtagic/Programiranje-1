public class SlikovnaDatoteka extends Datoteka {
    private int sirina;
    private int visina;

    public SlikovnaDatoteka(String name, int width, int height) {
        super(name);
        this.sirina = width;
        this.visina = height;
    }

	public int getSirina() {
       return sirina;
    }
	
	public int getVisina() {
       return visina;
    }

    @Override
    public int velikost() {
        return 3 * sirina * visina + 54;
    }

    @Override
    public String toString() {
        return String.format("%s [s %d x %d]", getIme(), sirina, visina);
    }
}