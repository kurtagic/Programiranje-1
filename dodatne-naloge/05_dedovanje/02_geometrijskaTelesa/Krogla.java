public class Krogla extends GeometrijskoTelo {	
	private int premer;
	private int polmer;
	
	public Krogla(int polmer) {
		super("krogla");
		this.polmer = polmer;
		
		setVolume(calculateVolume());
		setArea(calculateArea());
	}
	
	@Override
	public int calculateArea() {
		return (int) Math.round( 4.0 * PI * Math.pow(polmer, 2) );
	}
	
	@Override
	public int calculateVolume() {
		return (int) Math.round( (4.0/3.0) * PI * Math.pow(polmer, 3) );
	}
	
	@Override
	public void izpisi() {
		System.out.println(getType());
		System.out.printf("r = %d\n", polmer);
		System.out.printf("V = %d\n", getVolume());
		System.out.printf("P = %d\n", getArea());
	}
}