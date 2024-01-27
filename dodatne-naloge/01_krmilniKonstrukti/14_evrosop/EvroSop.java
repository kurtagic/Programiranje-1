import java.util.*;

public class EvroSop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int blagajna = 0;		
		int eur2 = 0;
		
		while(sc.hasNextInt()) {
			int kovanec = sc.nextInt();
		
			if(kovanec == 1) { blagajna++; }
			else if(kovanec == 2) {
				blagajna--;
				eur2++;
			}
			
			if(blagajna < 0) {
				System.out.println("BANKROT");
				return;
			}
		}
		
		System.out.println(blagajna);
		System.out.println(eur2);
	}
}