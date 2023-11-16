import java.util.*;

public class IzstevankaShiftArray {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        
		String[] otroci = new String[n];        
        for(int i = 0; i < n; i++) {
			otroci[i] = sc.next();
		}
		
        for(int i = 0; i < n - 1; i++) {
			int dolzina = n - i;
            int izpade = (b - 1) % dolzina;
            
			System.out.println(otroci[izpade]);
			
			premakni(otroci, izpade, dolzina);

        }
    }
	
	private static void premakni(String[] array, int izbranIndex, int length) {
		for(int i = izbranIndex; i < length - 1; i++) {
			array[i] = array[i+1];
		}
	}
}