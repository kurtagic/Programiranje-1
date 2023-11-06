import java.util.*;

public class Ugibanje {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
			
		System.out.print("zgornja meja: ");
		int zgornjaMeja = scanner.nextInt();
		
		int randomSt = random.nextInt(zgornjaMeja) + 1;		
		int poskus = -1;
		int stevec = 0;
		
		do {
			stevec++;
			System.out.print("poskus: ");
			poskus = scanner.nextInt();
			
			String result = "prevelik";
			if(poskus < randomSt) result = "premajhen";
			System.out.printf("%s poskus %n", result);
			
		} while(poskus != randomSt);
		
		System.out.printf("zadeli ste stevilo %d v %d poskusih! %n", poskus, stevec);
	}
}