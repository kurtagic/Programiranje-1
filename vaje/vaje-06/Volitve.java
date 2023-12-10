import java.util.*;
public class Volitve {

    public static int steviloGlasov(int[][][] t, int leto, int stranka) {
        return Arrays.stream(t[leto][stranka]).sum();
    }

    public static int[][] glasovi(int[][][] t) {
       int[][] res = new int[t.length][t[0].length];

       for(int leto = 0; leto < t.length; leto++) {
            for(int stranka = 0; stranka < t[leto].length; stranka++) {
               res[leto][stranka] = steviloGlasov(t, leto, stranka);
           }
       }

        return res;
    }

    public static int najVolisce(int[][][] t, int stranka) {
        int[] res = new int[2];

        for(int volisce = 0; volisce < t[0][stranka].length; volisce++) {
            int glasovi = 0;

            for(int leto = 0; leto < t.length; leto++) {
                glasovi += t[leto][stranka][volisce];
            }

            if(glasovi > res[1]) res = new int[]{volisce, glasovi};
        }

        return res[0];
    }

    public static int vsotaUvrstitev(int[][][] t, int stranka, int volisce) {
        int uvrstitev = t.length;

        for(int leto = 0; leto < t.length; leto++) {
            for(int[] party : t[leto]) {
                if(party[volisce] > t[leto][stranka][volisce]) uvrstitev++;
            }
        }

        return uvrstitev;
    }
}
