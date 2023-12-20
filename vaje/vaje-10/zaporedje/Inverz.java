public class Inverz extends Zaporedje {
	private Zaporedje funkcija;
	private Interval interval;
	
	public Inverz(Zaporedje funkcija, Interval interval) {
        this.funkcija = funkcija;
        this.interval = interval;
    }
	
	@Override
      public Integer y(int x) {
        if (funkcija.y(x) == null) continue;
		return funkcija.y(x);
    }
}