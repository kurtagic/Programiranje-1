public class BesedilnaDatoteka extends Datoteka {
    private int stZnakov;

    public BesedilnaDatoteka(String name, int charCount) {
        super(name);
        this.stZnakov = charCount;
    }

    @Override
    public int velikost() {
        return stZnakov;
    }

    @Override
    public String toString() {
        return String.format("%s [b %d]", getIme(), stZnakov);
    }
}