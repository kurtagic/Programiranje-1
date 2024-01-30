import java.util.*;

public class Tretja 
{

    public static abstract class Ukaz 
	{
		public abstract void izvedi(int[] stolpci);

        public static int bilanca(Ukaz[] ukazi) 
		{
			int delta = 0;
            for(Ukaz ukaz : ukazi)
			{
				if(ukaz instanceof Postavi) delta++;
				if(ukaz instanceof Odvzemi) delta--;
			}
			
			return delta;
        }

        public Ukaz zaporedje(Ukaz drugi) 
		{
            return  new Zaporedje(this, drugi);
        }
    }
	
	public static class Zaporedje extends Ukaz 
	{
        private Ukaz u1;
        private Ukaz u2;

        public Zaporedje(Ukaz u1, Ukaz u2) 
		{
            this.u1 = u1;
            this.u2 = u2;
        }

        @Override
        public void izvedi(int[] stolpi) 
		{
            this.u1.izvedi(stolpi);
            this.u2.izvedi(stolpi);
        }

        @Override
        public String toString() {
            return String.format("[%s, %s]", this.u1.toString(), this.u2.toString());
        }
    }

    public static class Postavi extends Ukaz 
	{
        private int kam;

        public Postavi(int kam) 
		{
            this.kam = kam;
        }
		
		public void izvedi(int[] stolpci)
		{
			if(stolpci.length <= kam) return;
			stolpci[kam]++;
		}
		
		@Override
		public String toString()
		{
			return String.format("+%d", kam);
		}

    }

    public static class Odvzemi extends Ukaz 
	{
        private int odkod;

        public Odvzemi(int odkod) 
		{
            this.odkod = odkod;
        }
		
		@Override
		public String toString()
		{
			return String.format("-%d", odkod);
		}
		
		public void izvedi(int[] stolpci)
		{
			if(stolpci.length <= odkod) return;
			if(stolpci[odkod] == 0) return;
			
			stolpci[odkod]--;
		}

    }
}
