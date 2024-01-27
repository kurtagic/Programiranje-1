import java.util.*;
public class Knjiznica {

    private int stClanov;
    private int stNaslovov;
    private int stIzvodovNaNaslov;

    private int[][] clanisokreteni;
    private int[] naslovi;
    private int[] popularnost;

    public Knjiznica(int stClanov, int stNaslovov, int stIzvodovNaNaslov) {
        this.stClanov = stClanov;
        this.stNaslovov = stNaslovov;
        this.stIzvodovNaNaslov = stIzvodovNaNaslov;

        clani = new int[stClanov][stNaslovov];
        naslovi = new int[stNaslovov];
        popularnost = new int[stNaslovov];

        Arrays.fill(naslovi, stIzvodovNaNaslov);
    }

    public boolean posodi(int clan, int naslov) {
            if(naslovi[naslov] > 0 && clani[clan][naslov] == 0) {
                naslovi[naslov]--;
                clani[clan][naslov] = 1;
                popularnost[naslov]++;

                return true;
            }

           return false;
    }

    public void clanVrne(int clan) {
        for(int i = 0; i < stNaslovov; i++) {
            if(clani[clan][i] == 1) {
                clani[clan][i] = 0;
                naslovi[i]++;
            }
        }
    }

    public int posojeni(int naslov) {
        return stIzvodovNaNaslov - naslovi[naslov];
    }

    public int priClanu(int clan) {
        return Arrays.stream(clani[clan]).sum();
    }

    public int najNaslov() {
       int index = 0;

       for(int i = 0; i < stNaslovov; i++) {
           if(popularnost[i] > popularnost[index]) index = i;
       }

       return index;
    }
}