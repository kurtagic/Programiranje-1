import java.util.*;

public class ZlataSredina {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int sequenceLength = 2*k+1;
		int[] zaporedje = new int[sequenceLength];
		
		for(int i = 0; i < sequenceLength; i++) {
			zaporedje[i] = sc.nextInt();
		}
		
		Arrays.sort(zaporedje);
		
		System.out.println(zaporedje[k]);
		
	}
}