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
	
		public Kvader(int a) {
		super("kocka");
		this.a = a;
		this.b = a;
		this.c = a;
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
		drawStranica(c + b, c, b, '*');
	
		drawStranice3(2*c + b, a, c, c + b, '+', 'o');
		
		drawStranica(c + b, c, b, '*');
		
		drawStranica(c + b, a, b, 'o');
	}
	
	private void drawStranica(int xRazpon, int yRazpon, int offset, char symbol) {
		for(int y = 0; y < yRazpon; y++) {
			String row = "";
			for(int x = 0; x < xRazpon; x++) {
				row += x < xRazpon - offset ? ' ' : symbol;
				if(x < xRazpon - 1) row += ' ';
			}
			
			System.out.println(row);
		}
	}
	
	private void drawStranice3(int xRazpon, int yRazpon, int offset1, int offset2, char symbolA, char symbolB) {
		for(int y = 0; y < yRazpon; y++) {
			String row = "";
			for(int x = 0; x < xRazpon; x++) {
				if(x < offset1 || x > offset2 - 1) row += symbolA;
				else row += symbolB;
				
				if(x < xRazpon - 1) row += " ";
			}
			System.out.println(row);
		}
	}
}