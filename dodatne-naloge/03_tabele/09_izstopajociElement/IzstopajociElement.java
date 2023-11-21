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

        List<>[] denomiantors = new ArrayList<Integer>()[zaporedje.size()];
        for(int i = 0; i < zaporedje.size(); i++) {
            denominators[i] = getDenominators(zaporedje.get(i));
        }
    }
}