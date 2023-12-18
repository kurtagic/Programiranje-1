import java.util.*;

public class Stevke {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long stevka = scanner.nextLong();
		
		int i = 10;
		while(stevka > 0) {
			System.out.println(stevka % i);
			stevka /= i;
		}
	}
}