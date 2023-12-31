import java.util.*;

public class Telegram extends Posiljka {
	public Telegram(String naslovnik, String vsebina) {
		super(naslovnik, vsebina);
		
		setCena(calculateCena());
	}

	@Override
	public int calculateCena() {		
		int c = getLettersCount(getVsebina());
		int cena = c * T;
		
		return cena;
	}
	
	private int getLettersCount(String str) {
		int count = 0;
		  for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) count++;
        }
		
		return count;
	}
	
	@Override
	public String izpisi() {
		return String.format("T | %s | %s | %d", getNaslovnik(), getVsebina(), getCena());
	}
}