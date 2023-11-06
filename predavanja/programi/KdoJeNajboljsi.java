import java.util.*;

public class KdoJeNajboljsi {
		
	public static void main(String[] args) {

			Scanner scanner = new Scanner(System.in);

			System.out.print("st atletov: ");
			
			int steviloAtletov = scanner.nextInt();
			int najAtlet = 0;
			int najDolzina = 0;
			
			for(int i = 1;i <= steviloAtletov;i++) {
				System.out.print("atlet " + i + " dolzina skoka: ");
				int dolzinaSkoka = scanner.nextInt();
				if(dolzinaSkoka > najDolzina) {
					najAtlet = i;
					najDolzina = dolzinaSkoka;
				}
			}
			
			System.out.printf("NAJBOLJSI: Atlet %s (%dm) %n", najAtlet, najDolzina);
	}
}