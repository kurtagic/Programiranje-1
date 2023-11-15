import java.util.*;

public class Zgoscenke {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] zgoscenke = new int[n];
        while(sc.hasNext()) {
            int datoteka = sc.nextInt();
            int stevilkaZgoscenke = getMinimumIndex(zgoscenke);

            if(k - zgoscenke[stevilkaZgoscenke] < datoteka) break;

            zgoscenke[stevilkaZgoscenke] += datoteka;

            System.out.printf("%d EP -> zgoscenka %d %s%n", datoteka, stevilkaZgoscenke+1, Arrays.toString(zgoscenke));
        }
    }

    private static int getMinimumIndex(int[] array) {
        int index = 0;

        for (int i = 1; i < array.length; i++) {
            if(array[i] < array[index]) index = i;
        }

        return index;
    }
}