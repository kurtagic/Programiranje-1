import java.util.*;

public class Prva {

	public static final char PYRAMID_CHARACTER = '1';
	
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		String[] rows = input.split("2");
		
		int height = rows.length;
		int offset = rows[height - 1].replaceAll("[1 ]", "").length();
		
		System.out.println(height);
		System.out.println(offset);
    }
}
