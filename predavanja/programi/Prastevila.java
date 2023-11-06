import java.util.*;

public class Prastevila {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
			
		int meja = scanner.nextInt();
		
		System.out.println(2);
		for(int kandidat = 3; kandidat <= meja; kandidat += 2) {
			
			boolean jePrastevilo = true;
			int koren = (int) Math.round(Math.sqrt(kandidat));
			
			for(int delitelj = 3; delitelj < kandidat; delitelj += 2) {
				if(kandidat % delitelj == 0) {	
					jePrastevilo = false;
					break;
				}
			}
			
			if(jePrastevilo) {
				System.out.println(kandidat);
			}
		}
	
	}
}