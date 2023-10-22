import java.util.*;

public class UrejanjeTrojice {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			int[] trojica = new int[3];
			
			for(int i = 0; i < 3; i++) {
				trojica[i] = sc.nextInt();
			}
			
			Arrays.sort(trojica);
			
			System.out.printf("%d %d %d%n", trojica[0], trojica[1], trojica[2]);
		}
}