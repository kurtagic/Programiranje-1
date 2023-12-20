public class Vsota extends Zaporedje {
	private Zaporedje funkcija1;
	private Zaporedje funkcija2;
	
	public Vsota(Zaporedje f, Zaporedje g) {
        this.funkcija1 = f;
        this.funkcija2 = g;
    }
	
	@Override
    public Integer y(int x) {
        Integer fx = funkcija1.y(x);
        Integer gx = funkcija2.y(x);
		
		if(fx == null || gx == null) return null;
        return fx + gx;
    }
}