import java.util.*;

public class PiramidaRekurzija {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int zvezdice = 1;
		int presledki = n - 1;
		
		piramidaGenerator(zvezdice, presledki);
	}
	
	private static void piramidaGenerator(int zvezdice, int presledki) {
		if(presledki < 0) return;
		System.out.println(" ".repeat(presledki) + "*".repeat(zvezdice));
		piramidaGenerator(zvezdice + 2, presledki - 1);
	}
}