import java.util.*;

public class AnzetoveLedeneSvece {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int n = sc.nextInt();
		int d = (int) Math.pow(2, n-1) + 1;
		
		for(int i = 0; i < n; i++) {
			String vrstica = "";
			
			for(int j = 0; j < d; j++) {
				if(j % Math.pow(2, i) == 0) vrstica += "*";
				else vrstica += " ";
			}
	
			System.out.println(vrstica);
		}
	}
}