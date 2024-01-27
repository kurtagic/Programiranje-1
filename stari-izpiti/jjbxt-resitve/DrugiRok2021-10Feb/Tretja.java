
/*
 * tj.exe
 */

/*
 * Razli"cni objekti tipa Oseba, Cilj oz. Nocitev predstavljajo razli"cne
 * osebe, cilje oz. no"citve.
 *
 * Distinct objects of classes Oseba, Cilj, and Nocitev represent distinct
 * persons, destinations, and overnight stays.
 */

import java.util.*;

public class Tretja {

    //=========================================================================
    public static class Oseba {
        private String ip;
        private String drzava;

        public Oseba(String ip, String drzava) {
            this.ip = ip;
            this.drzava = drzava;
        }
    }

    //=========================================================================
    public static class Cilj {
        private String kraj;
        private String drzava;

        public Cilj(String kraj, String drzava) {
            this.kraj = kraj;
            this.drzava = drzava;
        }
    }

    //=========================================================================
    public static class Nocitev {
        private Oseba oseba;
        private Cilj cilj;
        private int leto;

        public Nocitev(Oseba oseba, Cilj cilj, int leto) {
            this.oseba = oseba;
            this.cilj = cilj;
            this.leto = leto;
        }
    }

    //=========================================================================
    public static int notranje(Nocitev[] nocitve) {
        int c = 0;
        for (Nocitev n: nocitve) {
            if (n.oseba.drzava.equals(n.cilj.drzava)) {
                c++;
            }
        }
        return c;
    }

    //=========================================================================
    public static boolean jeZvesta(Nocitev[] nocitve, Oseba oseba) {
        Cilj edenInEdini = null;
        boolean naselOsebo = false;
        for (Nocitev n: nocitve) {
            if (n.oseba == oseba) {
                if (!naselOsebo) {
                    edenInEdini = n.cilj;
                    naselOsebo = true;
                } else if (edenInEdini != n.cilj) {
                    return false;
                }
            }
        }
        return true;
    }

    //=========================================================================
    public static int[][] obiskanost(Nocitev[] nocitve, Cilj[] cilji,
                                     int minLeto, int maxLeto) {
        int[][] obiski = new int[cilji.length][maxLeto - minLeto + 1];
        for (int i = 0; i < obiski.length; i++) {
            for (int j = 0; j < obiski[0].length; j++) {
                for (Nocitev n: nocitve) {
                    if (n.cilj == cilji[i] && n.leto == minLeto + j) {
                        obiski[i][j]++;
                    }
                }
            }
        }
        return obiski;
    }

    //=========================================================================
    public static void main(String[] args) {
        // koda za ro"cno testiranje (po potrebi)
    }
}
