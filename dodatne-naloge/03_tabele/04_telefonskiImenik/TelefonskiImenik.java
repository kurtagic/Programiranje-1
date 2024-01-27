import java.util.*;

public class TelefonskiImenik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Map<String, String> imenik = new HashMap<>();
		
        for (int i = 0; i < n; i++) {
            imenik.put(sc.next(), sc.next());
        }
		
		int k = sc.nextInt();
		
        for (int i = 0; i < k; i++) {
			String st = imenik.get(sc.next());	
			System.out.println((st != null) ? st : "NEZNANA");
        }
    }
}