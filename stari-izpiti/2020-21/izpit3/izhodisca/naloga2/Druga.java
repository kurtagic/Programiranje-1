
import java.util.*;

public class Druga {

    public static int steviloShranjenih(int[] h, int[] w, int[] a, int[] b) {
		List<Predal> predali = zgenerirajPredale(h, w);
		List<Predmet> predmeti = zgenerirajPredmete(a, b);
		
		Collections.sort(predmeti);
		
		int count = 0;
		
		for(Predal predal : predali)
		{
			boolean naselPredalZaPredmet = false;
			for(Predmet predmet : predmeti)
			{
				if(predmet.jeShranjen) continue;
				if(!predal.jeDovoljVelik(predmet)) continue;
	
				count++;
				naselPredalZaPredmet = true;
				predmet.shrani();
				break;
			}
			if(!naselPredalZaPredmet) break;
		}
		
        return count;
    }
	
	private static List<Predal> zgenerirajPredale(int[] heights, int[] widths)
	{
		List<Predal> predali = new ArrayList<>();	
		for(int i = 0; i < heights.length; i++)
		{
			for(int j = 0; j < widths.length; j++)
			{
				predali.add(new Predal(heights[i], widths[j]));
			}
		}
		
		return predali;
	}
	
	private static List<Predmet> zgenerirajPredmete(int[] a, int[] b)
	{		
		List<Predmet> predmeti = new ArrayList<>();
		for (int i = 0; i < a.length; i++) 
		{
			predmeti.add(new Predmet(a[i], b[i]));
		}
		return predmeti;
	}
	
	private static class Pravokotnik
	{
		int a;
		int b;
		
		public Pravokotnik(int a, int b) 
		{
            this.a = a;
            this.b = b;
        }
		public int povrsina()
		{
			return this.a * this.b;
		}
		
		@Override
		public String toString()
		{
			return String.format("%d, %d: %d", this.a, this.b, this.povrsina());
		}
	}
	
	private static class Predmet extends Pravokotnik implements Comparable<Predmet>
	{
        
        boolean jeShranjen;

        public Predmet(int a, int b) 
		{
            super(a, b);
			this.jeShranjen = false;
        }
		
        public void shrani() 
		{
            this.jeShranjen = true;
        }
		
		@Override
		public String toString()
		{
			return String.format("PREDMET: %d, %d: %d", this.a, this.b, this.povrsina());
		}
		
		@Override
		public int compareTo(Predmet p)
		{
			if (this.povrsina() == p.povrsina()) return 0;
			if (this.povrsina() > p.povrsina()) return -1;
         
			return 1;
		}
    }
	
	private static class Predal extends Pravokotnik
	{		
        public Predal(int a, int b) 
		{
            super(a, b);
			
        }
		
        public boolean jeDovoljVelik(Predmet p) 
		{
			if(this.povrsina() < p.povrsina()) return false;
			if(this.a >= p.a && this.b >= p.b) return true;
			if(this.b >= p.a && this.a >= p.b) return true;
			
			return false;
        }
		
		@Override
		public String toString()
		{
			return String.format("PREDAL: %d, %d: %d", this.a, this.b, this.povrsina());
		}
    }
}