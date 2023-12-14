import java.util.*;

public class VrstaZbor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] vrsta = new int[n];
        for (int i = 0; i < n; i++) {
            vrsta[i] = sc.nextInt();
        }

        List<Integer> inOrder = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if(isInOrder(i, n, vrsta)) inOrder.add(i);
        }

        printResults(inOrder);
    }

    private static boolean isInOrder(int i, int n, int[] vrsta) {
        if(i == 0) return vrsta[i] <= vrsta[i + 1];
        if(i == n - 1) return vrsta[i] >= vrsta[i - 1];

        return vrsta[i - 1] <= vrsta[i] && vrsta[i] <= vrsta[i + 1];
    }

    private static <T> void printResults(List<T> list) {
        list.forEach(element -> System.out.println(element));
        if (list.isEmpty()) System.out.println("NOBEDEN");
    }
}