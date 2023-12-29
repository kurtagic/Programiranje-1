public class Filozof {
	
	private static final int MAX_STICKS_HELD = 2;
	
	private String name;
	private boolean holdsLeft;
	private boolean holdsRight;
	
	private Filozof leftNeighbour;
	private Filozof rightNeighbour;
	
	public Filozof(String ime) {
		this.name = ime;
		this.holdsLeft = false;
		this.holdsRight = false;
	}
	
	public String vrniIme() {
		return this.name;
	}
	
	public void nastaviSoseda(Filozof levi, Filozof desni) {
		this.leftNeighbour = levi;
		this.rightNeighbour = desni;
	}
	
	public boolean jeLeviSosedOd(Filozof f) {
		return f.leftNeighbour.equals(this);
	}
	
	public boolean jeDesniSosedOd(Filozof f) {
		return f.rightNeighbour.equals(this);
	}
	
	public Filozof[] vrniSoseda() {
		return new Filozof[]{leftNeighbour, rightNeighbour};
	}
	
	public int kolikoPalicicDrzi() {
        return (holdsLeft ? 1 : 0) + (holdsRight ? 1 : 0);
    }
	
	public boolean primiLevo() {
		if(holdsLeft) return true;
		if(this.leftNeighbour.holdsRight) return false;
		
		holdsLeft = true;
		return true;
	}
	
	
	public boolean primiDesno() {
		if(holdsRight) return true;
		if(this.rightNeighbour.holdsLeft) return false;
		
		holdsRight = true;
		return true;
	}
	
	
	public void izpustiLevo() {
		if(holdsLeft) holdsLeft = false;
	}
	
	public void izpustiDesno() {
		if(holdsRight) holdsRight = false;
	}
	
	public static int steviloJedcev(Filozof[] filozofi) {
		int count = 0;
		for(Filozof filozof : filozofi) {
			if(filozof.kolikoPalicicDrzi() == MAX_STICKS_HELD) count++;
		}
		
		return count;
	}
	
	public int steviloFilozofov() {
		return getPhilosophersCount(this, 1);
	}	
	
	private int getPhilosophersCount(Filozof current, int count) {
		Filozof next = current.leftNeighbour;
		if(next == this) return count;
		return getPhilosophersCount(next, count + 1);
	}
}