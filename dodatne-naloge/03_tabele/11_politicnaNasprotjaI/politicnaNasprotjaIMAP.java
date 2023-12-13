import java.util.*;

public class PoliticnaNasprotjaIMAP {
	
	public enum Politician {
		LEFT, CENTER, RIGHT
	}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int d = sc.nextInt();
        int c = sc.nextInt();
		
		Map<Politician, Integer> seats = new HashMap<>();
		seats.put(Politician.LEFT, l);
		seats.put(Politician.CENTER, c);
		seats.put(Politician.RIGHT, d);

		System.out.println(getArrangements(seats, new Politician[l + c + d], 0));
    }

    public static int getArrangements(Map<Politician, Integer> seats, Politician[] arrangement, int index) {
	   
        if (index == arrangement.length) return isValid(arrangement) ? 1 : 0;

        int arrangements = 0;
   	
		for (Politician politician : seats.keySet()) {
			if (seats.get(politician) < 1) continue;
            arrangement[index] = politician;
            seats.put(politician, seats.get(politician) - 1);
            arrangements += getArrangements(seats, arrangement, index + 1);
            seats.put(politician, seats.get(politician) + 1);
		}

        return arrangements;
    }

    private static boolean isValid(Politician[] array) {
        for (int i = 1; i < array.length; i++) {
			if (array[i] == Politician.LEFT && array[i - 1] == Politician.RIGHT) return false;
			if (array[i] == Politician.RIGHT && array[i - 1] == Politician.LEFT) return false;
		}

        return true;
    }
}