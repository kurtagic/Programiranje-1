import java.util.*;

public class Smreka {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
				
		System.out.println(drawSmreka(n));
	}
	
	private static String drawSmreka(int height) {
		String str = "";
		for(int i = 0; i < height; i++) {
			str += piramida(i + 1, height - i - 1);
		}
		
		return str;
	}
	
	private static String piramida(int height, int offset) {
		String str = "";
		
		for(int i = 0; i < height; i++) {
			str += znaki(' ', offset);
			str += znaki(' ', height-1-i);
			str += znaki('*', 2*i + 1);
			
			str += "\n";
		}
		
		return str;
		
	}
	
	private static String znaki(char c, int length) {
		String str = "";
		
		for(int i = 0; i < length; i++) {
			str += c;
		}
		
		return str;
	}
}