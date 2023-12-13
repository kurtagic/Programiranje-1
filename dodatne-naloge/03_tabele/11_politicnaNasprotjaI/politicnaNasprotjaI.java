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
        if (index == arrangement.length) return isValid(arrangement) ? 1 : 0;

        int arrangements = 0;
		for (int politician = 0; politician < 3; politician++) {
			if(politicians[politician] < 1) continue;  
			if(index > 0 && Math.abs(politician - arrangement[index - 1]) > 1) continue; 

            arrangement[index] = politician;			
			
			int[] updatedPoliticians = Arrays.copyOf(politicians, politicians.length);
            updatedPoliticians[politician]--;
            arrangements += getArrangements(updatedPoliticians, arrangement, index + 1);
		}

        return arrangements;
    }
	
    private static boolean isValid(int[] array) {
        for (int i = 1; i < array.length; i++) {
			if(Math.abs(array[i] - array[i - 1]) > 1) return false; 
        }

        return true;
    }
}