import java.util.*;

public class Romanje {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int romarskaPot = scanner.nextInt();
		int potDanes = scanner.nextInt(); 
		int utrujenost = scanner.nextInt();		
		int preostanekPoti = 1;
		int dneviStevec = 1;
		
		while(preostanekPoti > 0 && potDanes > 0) {	 
			preostanekPoti = romarskaPot - potDanes;

			if(preostanekPoti < 1) preostanekPoti = 0;
			
			System.out.printf("%d: %d -> %d%n", dneviStevec, romarskaPot, preostanekPoti);
			
			romarskaPot = preostanekPoti;
			potDanes -= utrujenost;				
			dneviStevec++;
		}

	}
}