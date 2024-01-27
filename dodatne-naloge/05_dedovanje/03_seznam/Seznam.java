public abstract class Seznam {
	public int glava() {
		if(this instanceof Neprazen) return this.glava;
		
		throw new java.util.NoSuchElementException();
	}
	
	public Seznam rep() {
		if(this instanceof Neprazen) return this.rep;
		
		throw new java.util.NoSuchElementException();
	}
	
	public booleanJePrazen() {
		return this instanceof Prazen;
	}
	
	public Seznam dodajZ(int element) {
		return new Neprazen(element, this);
	}
	
	return dodajK(int element) {
		if(this instanceof Prazen) return this.dodajZ(element);
		
		Seznam rep = getNoviRep(this.rep, element);
		
		return new Neprazen(this.glava, rep);
	}
	
	private Seznam getNoviRep(Seznam seznam, int element) {
		if(this instanceof Prazen) return new Neprazen(element, new Prazen());
		
		seznam = new Neprazen(element, seznam);
		getNoviRep(seznam, element);
	}
}
