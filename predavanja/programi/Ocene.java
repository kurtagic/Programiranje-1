import java.util.*;

public class Ocene {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int ocena = sc.nextInt();
		
		switch(ocena) {
			case 10 -> System.out.println("odl");
			case 9, 8 -> System.out.println("prd");
			case 7 -> System.out.println("dbr");
			case 6 -> System.out.println("zad");
			default -> System.out.println("nzd");
		}	
	}
}