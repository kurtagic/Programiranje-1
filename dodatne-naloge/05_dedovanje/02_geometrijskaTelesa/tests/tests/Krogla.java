public class Krogla extends GeometrijskoTelo {
	
	public static final double PI = 3.14;
	
	private int premer;
	
	public Krogla(int premer) {
		super("krogla");
		this.premer = premer;
		
		setVolume(calculateVolume());
		setArea(calculateArea());
	}
	
	@Override
	public int calculateArea() {
		return (int) (PI * Math.pow(premer, 2));
	}
	
	@Override
	public int calculateVolume() {
		return (int) (4/3 * PI * Math.pow(premer, 3));
	}
	
	@Override
	public void izpisi() {
		System.out.println(getType());
		System.out.printf("r = %d\n", premer);
		System.out.printf("V = %d\n", getVolume());
		System.out.printf("P = %d\n", getArea());
	}
}