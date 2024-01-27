import java.util.*;

public class Prva {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int previous = -1;
		int max = Integer.MIN_VALUE;
		
		while(sc.hasNext())
		{
			int n = sc.nextInt();
			if(previous == -1)
			{
				previous = n;
				continue;
			}

			int sum = previous + n;
			previous = n;
			if(sum > max) max = sum;
		}
		
		System.out.println(max);
    }
}
