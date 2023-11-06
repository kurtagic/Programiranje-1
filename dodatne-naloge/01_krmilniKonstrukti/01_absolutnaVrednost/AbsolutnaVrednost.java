import java.util.*;

public class AbsolutnaVrednost {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int result = x;
		if(x < 0) x = -x;
		
		System.out.println(x);
	}
}