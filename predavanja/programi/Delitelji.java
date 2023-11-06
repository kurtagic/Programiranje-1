import java.util.*;

public class Delitelji {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int stevilo = scanner.nextInt();
		int stevec = 0;
		for(int i = 1; i<= stevilo; i++) {
			if(stevilo % i == 0) {
				System.out.println("delitelj: " + i);
				stevec++;
			}
		}
		
		System.out.println("stevilo deliteljev: " + stevec);
	}
}