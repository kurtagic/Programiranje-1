import java.util.*;

public class Prva {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		List<Integer> chenovaPrastevila = najdiChenovaPrastevila(a, b);
		
		System.out.println(chenovaPrastevila.size());
    }
	
	private static List<Integer> najdiChenovaPrastevila(int a, int b)
	{
		List<Integer> list = new ArrayList<>();
		
		for(int n = a; n <= b; n++)
		{
			if(!isPrime(n)) continue;
			if(!najvecjStirjeDelitelji(n + 2)) continue;
			list.add(n);
		}
		
		return list;
	}
	
	private static boolean isPrime(int n)
	{
		for(int i = 2; i <= Math.sqrt(n); i++)
		{
			if(n % i == 0) return false;
		}
		
		return true;
	}
	
	private static boolean najvecjStirjeDelitelji(int n)
	{
		// 1 in n bosta vedno, ne rabimo preverjati
		int delitelji = 2;
		for(int i = 2; i < n; i++)
		{
			if(n % i == 0) delitelji++;
		}
		
		return delitelji <= 4;
	}
}
