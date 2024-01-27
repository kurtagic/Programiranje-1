import java.util.*;

public class PoliticnaNasprotjaI {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int d = sc.nextInt();
        int c = sc.nextInt();

		System.out.println(getArrangements(new int[]{l, c, d}, new int[l + c + d], 0));
    }

    public static int getArrangements(int[] politicians, int[] arrangement, int index) {
		if(index == arrangement.length) return 1;
		
        int arrangements = 0;
		int previousPolitician = index == 0 ? 1 : arrangement[index - 1];
		
		for (int politician = 0; politician < 3; politician++) {
			if(politicians[politician] < 1) continue;  
			if(Math.abs(politician - previousPolitician) > 1) continue; 

			arrangement[index] = politician;
            politicians[politician]--;
            arrangements += getArrangements(politicians, arrangement, index + 1);
            politicians[politician]++;
		}

        return arrangements;
    }
}