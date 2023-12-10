import java.util.*;

public class Kombinacije {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        getCombinations(n, k, new int[k], 0, 1);
    }

    private static void getCombinations(int n, int k, int[] combination, int index, int start) {
        if (index == k) {
            System.out.println(Arrays.toString(combination));
            return;
        }

        for (int i = start; i <= n; i++) {
            combination[index] = i;
            getCombinations(n, k, combination, index + 1, i + 1);
        }
    }
}
