import java.util.*;

public class RazbijanjeStevil {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long n = sc.nextLong();
		long m = sc.nextLong();
		
		long mDolzina = numberLength(m);
		
		for(long i = 0; i < mDolzina; i++) {
			long nizDolzina = getFirstNDigits(m, 1);
			m = removeFirstNDigits(m, 1);
			
			long niz = getFirstNDigits(n, nizDolzina);
			System.out.println(niz);
			
			n = removeFirstNDigits(n, nizDolzina);
		}
	}
	
	private static long numberLength(long a) {
		long length = 0;
		while (a > 0) {
            a /= 10;
            length++;
        }
		
		return length;
	}
	
	private static long getFirstNDigits(long number, long n) {
		long l = numberLength(number) - n;
	
		for(long i = 0; i < l; i++) {
			number /= 10;
		}
		
		return number;
	}
	
	private static long removeFirstNDigits(long number, long n) {
		long divisor = 1;
		long a = number;
		
		for(long i = 0; i < n; i++) {
			divisor = 1;
			number = a;
			while(number >= 10) {
				number /= 10;
				divisor *= 10;
			}
			
			long firstDigit = number % divisor;
		
			a -= firstDigit*divisor;
		}

		return a;
	}
}