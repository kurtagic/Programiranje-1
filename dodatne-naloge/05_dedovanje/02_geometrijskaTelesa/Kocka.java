public class Kocka extends Kvader {
	public Kocka(int a) {
		super(a);
	}
	
	@Override
	public void izpisi() {
		System.out.println(getType());
		System.out.printf("a = %d\n", getA());
		System.out.printf("V = %d\n", getVolume());
		System.out.printf("P = %d\n", getArea());
	}
}