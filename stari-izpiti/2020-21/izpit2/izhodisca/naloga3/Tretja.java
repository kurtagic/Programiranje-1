
import java.util.*;

public class Tretja {

    public static class Oseba {
        private String ip;
        private String drzava;

        public Oseba(String ip, String drzava) {
            this.ip = ip;
            this.drzava = drzava;
        }
		
		public String getDrzava()
		{
			return this.drzava;
		}
    }

    public static class Cilj {
        private String kraj;
        private String drzava;

        public Cilj(String kraj, String drzava) {
            this.kraj = kraj;
            this.drzava = drzava;
        }
		
		public String getDrzava()
		{
			return this.drzava;
		}
		
		public String getKraj()
		{
			return this.kraj;
		}
		
		@Override
		public boolean equals(Object o)
		{
			if (this == o) return true;
			if (o == null) return false;
			if(!(o instanceof Cilj)) return false;

			Cilj cilj = (Cilj) o;
			if(!this.getDrzava().equals(cilj.getDrzava())) return false;
			if(!this.getKraj().equals(cilj.getKraj())) return false;
			
			return true;
		}
    }

    public static class Nocitev {
        private Oseba oseba;
        private Cilj cilj;
        private int leto;

        public Nocitev(Oseba oseba, Cilj cilj, int leto) {
            this.oseba = oseba;
            this.cilj = cilj;
            this.leto = leto;
        }
		
		public Cilj getCilj()
		{
			return this.cilj;
		}
		
		public Oseba getOseba()
		{
			return this.oseba;
		}
		
		public int getLeto()
		{
			return this.leto;
		}
    }

    public static int notranje(Nocitev[] nocitve) 
	{
		int count = 0;
        for(Nocitev nocitev : nocitve)
		{
			if(nocitev.getCilj().getDrzava().equals(nocitev.getOseba().getDrzava())) count++;
		}
		
        return count;
    }

    public static boolean jeZvesta(Nocitev[] nocitve, Oseba oseba) 
	{
		Cilj lokacija = null;
		for(Nocitev nocitev : nocitve)
		{
			if(!nocitev.getOseba().equals(oseba)) continue;
			
			Cilj trenutno = nocitev.getCilj();
			if(lokacija == null) lokacija = trenutno;
			if(!trenutno.equals(lokacija)) return false;
		}
		
        return true;
    }

    public static int[][] obiskanost(Nocitev[] nocitve, Cilj[] cilji, int minLeto, int maxLeto) 
	{
		int letoDelta = maxLeto - minLeto + 1;
        int[][] matrix = new int[cilji.length][letoDelta];
		
		for(int i = 0; i < matrix.length; i++)
		{
			for(int j = 0; j < matrix[0].length; j++)
			{
				matrix[i][j] = steviloNocitev(nocitve, cilji, i, j, minLeto + j);
			}
		}

		
        return matrix;
    }
	
	private static int steviloNocitev(Nocitev[] nocitve, Cilj[] cilji, int i, int j, int leto) 
	{
		int count = 0;
		for(Nocitev nocitev : nocitve)
		{
			if(!nocitev.getCilj().equals(cilji[i])) continue;
			if(nocitev.getLeto() != leto) continue;
			
			count++;
		}
		
		return count;
	}
}
