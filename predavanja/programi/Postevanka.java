import java.util.*;
public class Postevanka {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i - 1; j++) {
				System.out.print("_");
			}

			for(int j = i; j <= n; j++) {
				System.out.printf("%3d ",  i*j);
			} 	
			System.out.println();
		}
	}
}