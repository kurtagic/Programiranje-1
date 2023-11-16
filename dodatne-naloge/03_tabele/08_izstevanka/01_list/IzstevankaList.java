import java.util.*;

public class IzstevankaList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        
       List<String> otroci = new ArrayList<>();
        
        while(sc.hasNext()) {
            otroci.add(sc.next());
        }
        
        while(otroci.size() > 1) {
            int izpade = (b - 1) % otroci.size();
            
            System.out.println(otroci.remove(izpade));
        }
    }
}