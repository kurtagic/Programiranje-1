import java.util.*;

public class Cetrta {

    public static void main(String[] args) {
        // koda za ro"cno testiranje (po "zelji)
    }

    public static class Celica implements Comparable<Celica> {
        private int vrstica;
        private int stolpec;

        public Celica(int vrstica, int stolpec) {
            this.vrstica = vrstica;
            this.stolpec = stolpec;
        }
		
		public int getVrstica()
		{
			return this.vrstica;
		}
		
		public int getStolpec()
		{
			return this.stolpec;
		}


        @Override
        public String toString() {
            return String.format("(%d, %d)", this.vrstica, this.stolpec);
        }

		@Override
		public int compareTo(Celica c) 
		{
			int vrstica = Integer.compare(this.getVrstica(), c.getVrstica());
			int stolpec = Integer.compare(this.getStolpec(), c.getStolpec());
			
			return vrstica != 0 ? vrstica : stolpec;
		}
		
		public int razdalja(int center) 
		{
			return Math.abs(center - this.vrstica) + Math.abs(center - this.stolpec);
        }
    }

	public static class Ovojnik implements Iterable<Celica>
	{
        private boolean[][] tabela;

        public Ovojnik(boolean[][] tabela) 
		{
            this.tabela = tabela;
        }

        public Iterator<Celica> iterator() 
		{
            NavigableSet<Celica> mnozica = new TreeSet<>();
			
            for (int i = 0; i < this.tabela.length; i++) 
			{
                for (int j = 0; j < this.tabela.length; j++) 
				{
                    if (this.tabela[i][j]) mnozica.add(new Celica(i, j));
                }
            }
			
            return mnozica.iterator();
        }

        public NavigableSet<Celica> enice() 
		{
			int sredina = this.tabela.length / 2;
			
            NavigableSet<Celica> mnozica = new TreeSet<>((c1, c2) -> {
				int manhattanskaRazdlja = Integer.compare(c1.razdalja(sredina), c2.razdalja(sredina));
				
				return (manhattanskaRazdlja != 0) ? manhattanskaRazdlja : c1.compareTo(c2);
			});
            
			for (int i = 0; i < this.tabela.length; i++) 
			{
                for (int j = 0; j < this.tabela.length; j++) 
				{
                    if (this.tabela[i][j]) mnozica.add(new Celica(i, j));
                }
            }
			
            return mnozica;
        }
    }
}