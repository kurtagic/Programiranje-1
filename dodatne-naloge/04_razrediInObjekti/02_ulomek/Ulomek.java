public class Ulomek {
	private int stevec;
	private int imenovalec;
	private float vrednost;
	
	public Ulomek(int a, int b) {
		int g = gcd(a, b);
		
		a /= g;
		b /= g;
		
        if (b < 0) {
			a = -a;
			b = -b;
		}
		
		this.stevec = a;
		this.imenovalec = b;
		this.vrednost = a / b;
	}
	
	public int gcd(int a, int b) {
        if (b == 0) return a;
     
        return gcd(b, a % b);
    }
	
	@Override
	public String toString() {
		return String.format("%d/%d", stevec, imenovalec);
	}
	
	public boolean jeEnakKot(Ulomek u) {
		return this.toString().equals(u.toString());
	}
	
	public Ulomek negacija() {
		return new Ulomek(-stevec, imenovalec);
	}
	
	public Ulomek obrat() {
		return new Ulomek(imenovalec, stevec);
	}
	
	  public Ulomek vsota(Ulomek u) {
        int lcm = Math.abs(imenovalec * u.imenovalec) / gcd(imenovalec, u.imenovalec);
        return new Ulomek(stevec*(lcm/imenovalec) + u.stevec*(lcm/u.imenovalec), lcm);
    }

    public Ulomek razlika(Ulomek u) {
		return vsota(u.negacija());
    }

    public Ulomek zmnozek(Ulomek u) {
        return new Ulomek(this.stevec * u.stevec, this.imenovalec * u.imenovalec);
    }

    public Ulomek kolicnik(Ulomek u) {
        return zmnozek(u.obrat());
    }
	
	public Ulomek potenca (int eksponent) {
		Ulomek u = new Ulomek((int) Math.pow(stevec, Math.abs(eksponent)), (int) Math.pow(imenovalec, Math.abs(eksponent)));
		return eksponent > 0 ? u : u.obrat();
	}
	
	public boolean jeManjsiOd(Ulomek u) {
		return this.vrednost < u.vrednost;
	}
}