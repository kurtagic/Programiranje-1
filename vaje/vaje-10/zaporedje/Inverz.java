public class Inverz extends Zaporedje {
	private Zaporedje zaporedje;
	private Interval interval;
	
	public Inverz(Zaporedje zaporedje, Interval interval) {
		this.zaporedje = zaporedje;
		this.interval = interval;
	}

	@Override
	public Integer y(int x) {
		int a = interval.vrniZacetek();
		int b = interval.vrniKonec();
		for (int i = a; i <= b; i++) {
			Integer fx = zaporedje.y(i);
			if (fx == null) continue;
			if(fx == x) return i;
		}
		return null;
	}
}