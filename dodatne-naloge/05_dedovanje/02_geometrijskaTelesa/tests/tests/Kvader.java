public class Kvader extends GeometrijskoTelo {
	private int a;
	private int b;
	private int c;
	
	public Kvader(int a, int b, int c) {
		super("kvader");
		this.a = a;
		this.b = b;
		this.c = c;
		setArea(calculateArea());
		setVolume(calculateVolume());
	}
	
	public int getA() {
		return this.a;
	}
	
	public int getB() {
		return this.b;
	}
	
	public int getC() {
		return this.c;
	}
	
	@Override
	public int calculateArea() {
		return 2 * (a*b + a*c + b*c);
	}
	
	@Override
	public int calculateVolume() {
		return a*b*c;
	}
	
	@Override
	public void izpisi() {
		System.out.println(getType());
		System.out.printf("a = %d\n", getA());
		System.out.printf("b = %d\n", getB());
		System.out.printf("c = %d\n", getC());
		System.out.printf("V = %d\n", getVolume());
		System.out.printf("P = %d\n", getArea());
	}
	
	public void narisi() {
		
	}
}