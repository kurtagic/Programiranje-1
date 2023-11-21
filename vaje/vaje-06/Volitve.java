import java.util.*;
public class Volitve {

    public static void main(String[] args) {
    }

    public static int steviloGlasov(int[][][] t, int leto, int stranka) {
        int glasovi = 0;
       for(int volisce: t[leto][stranka]) {
           glasovi += volisce;
       }

        return glasovi;
    }

    public static int[][] glasovi(int[][][] t) {

       int[][] seznam = new int[t.length][];
       for(int leto = 0; leto < t.length; leto++) {

           seznam[leto] = new int[t[leto].length];
            for(int stranka = 0; stranka < t[leto].length; stranka++) {
               seznam[leto][stranka] = steviloGlasov(t, leto, stranka);
           }
       }

        return seznam;
    }

    public static int najVolisce(int[][][] t, int stranka) {
        int[] najVolisce = new int[2];
        for(int volisce = 0; volisce < t[0][stranka].length; volisce++) {

            int glasovi = 0;
            for(int leto = 0; leto < t.length; leto++) {
                glasovi += t[leto][stranka][volisce];
            }

            if(glasovi > najVolisce[1]) najVolisce = new int[]{volisce, glasovi};
        }

        return najVolisce[0];
    }

    public static int vsotaUvrstitev(int[][][] t, int stranka, int volisce) {
        int vsota = 0;
        for(int leto = 0; leto < t.length; leto++) {
            vsota += getPartyPosition(t, leto, stranka, volisce);
        }

        return vsota;
    }

    private static int getPartyPosition(int[][][] array, year, party, poll) {
        int position = 0;
        int[] yearlyVotes = new int[array[0].length];
        for(int i = 0; i < yearlyVotes.length; i++) {
            yearlyVotes[i] = steviloGlasov(array, year, i);
        }


        return position;
    }
}
