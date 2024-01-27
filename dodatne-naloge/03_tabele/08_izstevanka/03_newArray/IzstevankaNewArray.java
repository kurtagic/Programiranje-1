import java.util.*;

public class IzstevankaNewArray {
	
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
			
			otroci = otrociBrezIzpade(otroci, izpade);
        }
    }
	
	private static String[] otrociBrezIzpade(String[] array, int izbranIndex) {
		String[] newArray = new String[array.length-1];
		int k = 0;
		
		for(int i = 0; i < array.length; i++) {
			if(i == izbranIndex) continue;
			
			newArray[k] = array[i];
			k++;	
		}
		
		return newArray;
	}
}