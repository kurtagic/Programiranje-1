public class Imenik extends Datoteka {
   private Datoteka[] datoteke;

    public Imenik (String name, Datoteka[] directories) {
        super(name);
        this.datoteke = directories;
    }
	
	public Datoteka[] getDatoteke() {
		return datoteke;
	}

    @Override
    public int velikost() {
        int sum = 256;
        for (Datoteka directory : datoteke) {
            sum += directory.velikost();
        }

        return sum;
    }

    @Override
    public String toString() {
        return String.format("%s [i %d]", getIme(), datoteke.length);
    }
	
	public int steviloVecjihSlik(int minimum) {
		int sum = 0;
		for(Datoteka directory : datoteke) {
			if(!(directory instanceof SlikovnaDatoteka)) continue;
			SlikovnaDatoteka slika = (SlikovnaDatoteka) directory;
			
			if(slika.getSirina() >= minimum && slika.getVisina() >= minimum) sum++;
		}
		
		return sum;
	}
	
		
	public String poisci(String name) {
		return poisci(".", name);
	}
	
	public String poisci(String path, String name) {
		for (Datoteka directory : this.datoteke) {
			String dirPath = String.format("%s/%s", path, directory.getIme());

			if(directory.getIme().equals(name)) return dirPath;
			
			if (!(directory instanceof Imenik)) continue;
			
			Imenik subdirectory = (Imenik) directory;
			String pathFound = subdirectory.poisci(dirPath, name);
			
			if (pathFound != null) return pathFound;
		}
		
		return null;
	}
}