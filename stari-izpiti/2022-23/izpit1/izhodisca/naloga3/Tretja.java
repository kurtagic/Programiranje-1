import java.util.*;

public class Tretja {

    public static class Tablica {
        private char[] kraj;
        private int stevilo;
        private boolean zacasna;

        public Tablica(char[] kraj, int stevilo, boolean zacasna) {
            this.kraj = new char[]{kraj[0], kraj[1]};
            this.stevilo = stevilo;
            this.zacasna = zacasna;
        }

		@Override
		public String toString()
		{
		   String formatNumber = "" + this.stevilo;
		   String s1 = formatNumber.substring(0, 2);
		   String s2 = formatNumber.substring(2, 4);
		   return String.format("%s %s-%s", new String(this.kraj), s1, s2);
		}
		
		@Override
        public boolean equals(Object o) 
		{
            if (o == null) return false;
			if(this.getClass() != o.getClass()) return false;
			
            Tablica t = (Tablica) o;
			if(!this.toString().equals(t.toString())) return false;
			if(this.zacasna != t.zacasna) return false;
			
			return true;
        }
		
		@Override
		public int hashCode() 
		{
            return Objects.hash(this.toString(), this.zacasna);
        }
    }
}