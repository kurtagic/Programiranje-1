import java.util.*;

public class IzstopajociElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<> zaporedje = new ArrayList<int>();

        int limit = Collections.max(zaporedje) / 2 + 1;

        while(sc.hasNext()) {
            int a = sc.nextInt();
            zaporedje.add(a);
        }

        for(int i = 2; i < limit; i++) {
            boolean isDevisable = false;
            for (int element : zaporedje) {
                if(element % i == 0) {
                    isDevisable = true;
                }

            }
        }
    }
}