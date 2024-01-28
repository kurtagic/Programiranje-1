/*
 * Samodejno testiranje:
 * tj.exe
 *
 * Javni testni primeri:
 * 01: primer iz besedila
 * 02..04: kli"cejo samo metodo dolzinaVrste
 * 05..07: kli"cejo samo metodo steviloDokumentov
 * 08..10: kli"cejo samo metodo natisni
 *
 * Skriti testni primeri: 
 * 01..16: kli"cejo samo metodo dolzinaVrste
 * 17..33: kli"cejo samo metodo steviloDokumentov
 * 34..50: kli"cejo samo metodo natisni
 *
 * (Vsi testni primeri kli"cejo konstruktor in metodo prejmi, a ta dva se ne to"ckujeta.)
 */

import java.util.*;

public class Tretja {

    public static abstract class Pedagog {
        // po potrebi dopolnite ...
    }

    public static class Profesor extends Pedagog {
        // po potrebi dopolnite ...
    }

    public static class Docent extends Pedagog {
        // po potrebi dopolnite ...
    }

    public static class Asistent extends Pedagog {
        // po potrebi dopolnite ...
    }

    public static class Tiskalnik 
	{

		private Map<Pedagog, List<String>> vrsta;
		
        private Profesor profesor;
        private Docent docent;
        private Asistent asistent;
		
		public Tiskalnik()
		{	
			this.vrsta = new HashMap<>();
			
			this.profesor = new Profesor();
			this.docent = new Docent();
			this.asistent = new Asistent();
		
			this.vrsta.put(profesor, new LinkedList<>());
			this.vrsta.put(docent, new LinkedList<>());
			this.vrsta.put(asistent, new LinkedList<>());
		}

		public void prejmi(Pedagog pedagog, String dokument) 
		{
            if (pedagog instanceof Profesor) vrsta.get(profesor).add(dokument);
			if (pedagog instanceof Docent) vrsta.get(docent).add(dokument);
			if (pedagog instanceof Asistent) vrsta.get(asistent).add(dokument);
        }

        public int dolzinaVrste() 
		{
			int sum = 0;
			for(Pedagog pedagog : vrsta.keySet())
			{
				sum += steviloDokumentov(pedagog);
			}
			
           return sum;
        }

        public int steviloDokumentov(Pedagog pedagog) 
		{
            if (pedagog instanceof Profesor) return vrsta.get(profesor).size();
			if (pedagog instanceof Docent) return vrsta.get(docent).size();
			if (pedagog instanceof Asistent) return vrsta.get(asistent).size();
			
			return -1; 
        }

        public String natisni() 
		{
           if(steviloDokumentov(profesor) > 0) return vrsta.get(profesor).remove(0);
		   if(steviloDokumentov(docent) > 0) return vrsta.get(docent).remove(0);
		   if(steviloDokumentov(asistent) > 0) return vrsta.get(asistent).remove(0);
		   
		   return null;
        }
    }
}
