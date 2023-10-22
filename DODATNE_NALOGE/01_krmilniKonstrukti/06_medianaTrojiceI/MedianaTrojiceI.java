import java.util.*;

public class MedianaTrojiceI {
	   public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] stevila = new int[3];
        
        for (int i = 0; i < 3; i++) {
            stevila[i] = scanner.nextInt();
        }

        Arrays.sort(stevila);
        
        System.out.println(stevila[1]);
        
		scanner.close();
    }
	
}
