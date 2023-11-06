import java.util.*;

public class Metaprogram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		String presledki = "";
		String indent = "    ";
		presledki += indent;
		
		System.out.println("public class Nizi {");
		System.out.println(presledki + "public static void main(String[] args) {");
		
		String sysPrint = "System.out.println(\"\""; 
		
		for(int i = 1; i <= n; i++) {
			presledki += indent;
			System.out.printf(presledki + "for (char c%d = \'A\';  c%d <= \'Z\';  c%d++) {%n", i, i ,i);
			sysPrint += " + c" + i;
		}
		
		sysPrint += ");";
		
		presledki += indent;
		System.out.println(presledki + sysPrint);
		
		for(int i = 1; i <= n; i++) {
			presledki = presledki.substring(4);
			System.out.println(presledki + "}");
		}
		
		presledki = presledki.substring(4);
		System.out.println(presledki + "}");
		
		presledki = presledki.substring(4);
		System.out.println(presledki + "}");
	}
}