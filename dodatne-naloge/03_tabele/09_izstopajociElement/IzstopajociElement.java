import java.util.*;
public class IzstopajociElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<Integer> zaporedje = new ArrayList<>();
        List<Integer> izstopajoci = new ArrayList<>();

        while (sc.hasNext()) {
            zaporedje.add(sc.nextInt());
        }

        for(int i = 0; i < n; i++) {
            List<Integer> ostali = new ArrayList<>(zaporedje);
            ostali.remove(i);

            int stevilka = zaporedje.get(i);
            int gcd = getGCD(ostali);

            if(gcd > 1 && stevilka % gcd != 0) izstopajoci.add(stevilka);
        }

        izstopajoci.forEach(element -> System.out.println(element));
        if(izstopajoci.isEmpty()) System.out.println("NIC");
    }
    private static int getGCD(List<Integer> list) {
        int result = list.get(0);

        for (int element : list) {
            result = calculateGCD(result, element);
            if(result == 1) return 1;
        }

        return result;
    }
    private static int calculateGCD(int a, int b) {
        return a == 0 ? b : calculateGCD(b % a, a);
    }
}