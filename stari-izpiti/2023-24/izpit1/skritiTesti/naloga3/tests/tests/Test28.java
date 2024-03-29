
import java.util.*;

public class Test28 {

    public static void main(String[] args) {

        Tretja.Dogodek[] dogodki = {
            new Tretja.SluzbenaPot(1, new Cas(0, 4), true),
            new Tretja.Rekreacija(7, new Cas(0, 11), true),
            new Tretja.Rekreacija(4, new Cas(0, 23), true),
            new Tretja.Rekreacija(5, new Cas(0, 45), true),
            new Tretja.SluzbenaPot(8, new Cas(0, 46), true),
            new Tretja.SluzbenaPot(6, new Cas(0, 48), true),
            new Tretja.SluzbenaPot(1, new Cas(0, 48), false),
            new Tretja.Rekreacija(5, new Cas(0, 49), false),
            new Tretja.Rekreacija(2, new Cas(1, 8), true),
            new Tretja.SluzbenaPot(6, new Cas(1, 8), false),
            new Tretja.Rekreacija(1, new Cas(1, 12), true),
            new Tretja.Malica(6, new Cas(1, 31), true),
            new Tretja.Malica(6, new Cas(1, 38), false),
            new Tretja.SluzbenaPot(6, new Cas(1, 40), true),
            new Tretja.SluzbenaPot(5, new Cas(1, 47), true),
            new Tretja.Rekreacija(0, new Cas(1, 54), true),
            new Tretja.Rekreacija(1, new Cas(2, 10), false),
            new Tretja.Rekreacija(4, new Cas(2, 10), false),
            new Tretja.SluzbenaPot(5, new Cas(2, 17), false),
            new Tretja.SluzbenaPot(5, new Cas(2, 24), true),
            new Tretja.SluzbenaPot(5, new Cas(2, 26), false),
            new Tretja.SluzbenaPot(4, new Cas(2, 29), true),
            new Tretja.Malica(3, new Cas(2, 32), true),
            new Tretja.SluzbenaPot(8, new Cas(2, 48), false),
            new Tretja.SluzbenaPot(5, new Cas(2, 49), true),
            new Tretja.Rekreacija(1, new Cas(3, 3), true),
            new Tretja.Malica(3, new Cas(3, 8), false),
            new Tretja.SluzbenaPot(3, new Cas(3, 12), true),
            new Tretja.Rekreacija(8, new Cas(3, 12), true),
            new Tretja.SluzbenaPot(3, new Cas(3, 37), false),
            new Tretja.Rekreacija(8, new Cas(3, 57), false),
            new Tretja.Rekreacija(8, new Cas(4, 0), true),
            new Tretja.SluzbenaPot(3, new Cas(4, 4), true),
            new Tretja.Rekreacija(2, new Cas(4, 6), false),
            new Tretja.SluzbenaPot(5, new Cas(4, 23), false),
            new Tretja.Malica(2, new Cas(4, 38), true),
            new Tretja.Rekreacija(5, new Cas(4, 57), true),
            new Tretja.SluzbenaPot(6, new Cas(5, 12), false),
            new Tretja.Rekreacija(5, new Cas(5, 21), false),
            new Tretja.Rekreacija(8, new Cas(5, 26), false),
            new Tretja.SluzbenaPot(5, new Cas(5, 36), true),
            new Tretja.SluzbenaPot(6, new Cas(5, 41), true),
            new Tretja.Malica(2, new Cas(5, 47), false),
            new Tretja.Rekreacija(2, new Cas(5, 52), true),
            new Tretja.Rekreacija(0, new Cas(5, 52), false),
            new Tretja.SluzbenaPot(8, new Cas(6, 17), true),
            new Tretja.SluzbenaPot(5, new Cas(6, 19), false),
            new Tretja.Rekreacija(7, new Cas(6, 20), false),
            new Tretja.Malica(7, new Cas(6, 29), true),
            new Tretja.Rekreacija(5, new Cas(6, 44), true),
            new Tretja.SluzbenaPot(0, new Cas(7, 11), true),
            new Tretja.SluzbenaPot(6, new Cas(7, 27), false),
            new Tretja.Rekreacija(6, new Cas(8, 12), true),
            new Tretja.Malica(7, new Cas(8, 34), false),
            new Tretja.Rekreacija(7, new Cas(9, 0), true),
            new Tretja.Rekreacija(7, new Cas(9, 45), false),
            new Tretja.SluzbenaPot(7, new Cas(9, 56), true),
            new Tretja.SluzbenaPot(7, new Cas(9, 58), false),
            new Tretja.SluzbenaPot(4, new Cas(10, 13), false),
            new Tretja.SluzbenaPot(7, new Cas(10, 30), true),
            new Tretja.Rekreacija(4, new Cas(10, 43), true),
            new Tretja.Rekreacija(5, new Cas(11, 39), false),
            new Tretja.SluzbenaPot(5, new Cas(11, 57), true),
            new Tretja.Rekreacija(4, new Cas(13, 13), false),
            new Tretja.SluzbenaPot(4, new Cas(13, 28), true),
            new Tretja.Rekreacija(2, new Cas(15, 19), false),
            new Tretja.Rekreacija(2, new Cas(15, 29), true),
            new Tretja.SluzbenaPot(0, new Cas(15, 36), false),
            new Tretja.Rekreacija(1, new Cas(15, 41), false),
            new Tretja.SluzbenaPot(0, new Cas(15, 48), true),
            new Tretja.SluzbenaPot(1, new Cas(16, 9), true),
            new Tretja.SluzbenaPot(1, new Cas(16, 20), false),
            new Tretja.SluzbenaPot(1, new Cas(16, 21), true),
            new Tretja.SluzbenaPot(3, new Cas(16, 23), false),
            new Tretja.SluzbenaPot(8, new Cas(16, 43), false),
            new Tretja.SluzbenaPot(5, new Cas(17, 22), false),
            new Tretja.Malica(5, new Cas(17, 44), true),
            new Tretja.SluzbenaPot(8, new Cas(17, 54), true),
            new Tretja.Rekreacija(2, new Cas(17, 54), false),
            new Tretja.SluzbenaPot(2, new Cas(18, 24), true),
            new Tretja.SluzbenaPot(3, new Cas(18, 28), true),
            new Tretja.SluzbenaPot(8, new Cas(18, 41), false),
            new Tretja.Rekreacija(8, new Cas(18, 45), true),
            new Tretja.Rekreacija(8, new Cas(18, 56), false),
            new Tretja.Malica(8, new Cas(19, 5), true),
            new Tretja.Malica(8, new Cas(19, 30), false),
            new Tretja.SluzbenaPot(0, new Cas(19, 33), false),
            new Tretja.Rekreacija(8, new Cas(19, 39), true),
            new Tretja.Malica(0, new Cas(19, 48), true),
            new Tretja.SluzbenaPot(4, new Cas(19, 51), false),
            new Tretja.SluzbenaPot(1, new Cas(19, 55), false),
            new Tretja.SluzbenaPot(4, new Cas(19, 59), true),
            new Tretja.Rekreacija(8, new Cas(20, 9), false),
            new Tretja.SluzbenaPot(2, new Cas(20, 12), false),
            new Tretja.SluzbenaPot(8, new Cas(20, 22), true),
            new Tretja.Malica(0, new Cas(20, 29), false),
            new Tretja.Rekreacija(2, new Cas(20, 44), true),
            new Tretja.Malica(1, new Cas(21, 0), true),
            new Tretja.SluzbenaPot(4, new Cas(21, 12), false),
            new Tretja.Rekreacija(4, new Cas(21, 13), true),
            new Tretja.Rekreacija(2, new Cas(21, 28), false),
            new Tretja.Rekreacija(4, new Cas(21, 30), false),
            new Tretja.Rekreacija(0, new Cas(21, 54), true),
            new Tretja.Rekreacija(0, new Cas(21, 55), false),
            new Tretja.Rekreacija(0, new Cas(21, 58), true),
            new Tretja.SluzbenaPot(7, new Cas(22, 6), false),
            new Tretja.Malica(1, new Cas(22, 33), false),
            new Tretja.Rekreacija(0, new Cas(22, 35), false),
            new Tretja.Malica(4, new Cas(22, 47), true),
            new Tretja.SluzbenaPot(3, new Cas(22, 52), false),
            new Tretja.Rekreacija(6, new Cas(22, 52), false),
            new Tretja.Malica(4, new Cas(23, 7), false),
            new Tretja.SluzbenaPot(8, new Cas(23, 10), false),
            new Tretja.Rekreacija(8, new Cas(23, 17), true),
            new Tretja.Rekreacija(8, new Cas(23, 18), false),
            new Tretja.Malica(5, new Cas(23, 37), false),
        };

        int stZaposlenih = 9;
        Tretja.Dnevnik dnevnik = new Tretja.Dnevnik(stZaposlenih, dogodki);

        for (int i = 0; i < stZaposlenih; i++) {
            System.out.printf("%d -> %d%n", i, dnevnik.kolikoRekreacije(i));
        }
        System.out.println();
    }
}
