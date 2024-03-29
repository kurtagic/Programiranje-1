
import java.util.*;

public class Test22 {

    public static void main(String[] args) {

        Tretja.Dogodek[] dogodki = {
            new Tretja.Malica(1, new Cas(0, 8), true),
            new Tretja.Malica(17, new Cas(0, 16), true),
            new Tretja.Rekreacija(49, new Cas(0, 49), true),
            new Tretja.Malica(37, new Cas(0, 54), true),
            new Tretja.Malica(24, new Cas(1, 14), true),
            new Tretja.SluzbenaPot(35, new Cas(1, 19), true),
            new Tretja.SluzbenaPot(26, new Cas(1, 21), true),
            new Tretja.Malica(38, new Cas(1, 44), true),
            new Tretja.Malica(4, new Cas(1, 45), true),
            new Tretja.SluzbenaPot(27, new Cas(1, 50), true),
            new Tretja.SluzbenaPot(35, new Cas(1, 59), false),
            new Tretja.Rekreacija(6, new Cas(2, 3), true),
            new Tretja.Rekreacija(2, new Cas(2, 3), true),
            new Tretja.Rekreacija(10, new Cas(2, 3), true),
            new Tretja.Malica(17, new Cas(2, 14), false),
            new Tretja.SluzbenaPot(23, new Cas(2, 27), true),
            new Tretja.Rekreacija(29, new Cas(2, 35), true),
            new Tretja.Rekreacija(10, new Cas(3, 20), false),
            new Tretja.Malica(4, new Cas(3, 44), false),
            new Tretja.Malica(48, new Cas(3, 56), true),
            new Tretja.Rekreacija(4, new Cas(4, 8), true),
            new Tretja.SluzbenaPot(11, new Cas(4, 21), true),
            new Tretja.SluzbenaPot(39, new Cas(4, 27), true),
            new Tretja.Rekreacija(17, new Cas(4, 34), true),
            new Tretja.SluzbenaPot(44, new Cas(4, 50), true),
            new Tretja.Rekreacija(36, new Cas(4, 58), true),
            new Tretja.Rekreacija(41, new Cas(5, 1), true),
            new Tretja.Malica(28, new Cas(5, 7), true),
            new Tretja.Rekreacija(43, new Cas(5, 12), true),
            new Tretja.SluzbenaPot(46, new Cas(5, 37), true),
            new Tretja.SluzbenaPot(21, new Cas(5, 41), true),
            new Tretja.Rekreacija(0, new Cas(5, 45), true),
            new Tretja.SluzbenaPot(12, new Cas(5, 49), true),
            new Tretja.Malica(24, new Cas(5, 59), false),
            new Tretja.SluzbenaPot(45, new Cas(6, 3), true),
            new Tretja.Malica(22, new Cas(6, 17), true),
            new Tretja.SluzbenaPot(16, new Cas(6, 40), true),
            new Tretja.Rekreacija(9, new Cas(7, 6), true),
            new Tretja.Rekreacija(47, new Cas(7, 21), true),
            new Tretja.SluzbenaPot(8, new Cas(7, 23), true),
            new Tretja.Rekreacija(0, new Cas(7, 24), false),
            new Tretja.Malica(33, new Cas(7, 25), true),
            new Tretja.Rekreacija(40, new Cas(7, 35), true),
            new Tretja.Rekreacija(18, new Cas(7, 41), true),
            new Tretja.Rekreacija(43, new Cas(7, 58), false),
            new Tretja.SluzbenaPot(31, new Cas(8, 1), true),
            new Tretja.SluzbenaPot(11, new Cas(8, 10), false),
            new Tretja.Rekreacija(41, new Cas(8, 11), false),
            new Tretja.Malica(32, new Cas(8, 18), true),
            new Tretja.Malica(22, new Cas(8, 23), false),
            new Tretja.SluzbenaPot(15, new Cas(8, 30), true),
            new Tretja.Rekreacija(7, new Cas(8, 39), true),
            new Tretja.Rekreacija(49, new Cas(9, 0), false),
            new Tretja.Malica(13, new Cas(9, 14), true),
            new Tretja.SluzbenaPot(22, new Cas(9, 24), true),
            new Tretja.SluzbenaPot(44, new Cas(9, 41), false),
            new Tretja.Rekreacija(47, new Cas(9, 48), false),
            new Tretja.Rekreacija(36, new Cas(9, 48), false),
            new Tretja.Malica(48, new Cas(9, 58), false),
            new Tretja.Rekreacija(19, new Cas(9, 59), true),
            new Tretja.SluzbenaPot(31, new Cas(10, 8), false),
            new Tretja.Rekreacija(18, new Cas(10, 16), false),
            new Tretja.Malica(1, new Cas(10, 27), false),
            new Tretja.Malica(49, new Cas(10, 43), true),
            new Tretja.Malica(25, new Cas(10, 50), true),
            new Tretja.SluzbenaPot(43, new Cas(10, 53), true),
            new Tretja.Malica(36, new Cas(10, 56), true),
            new Tretja.Rekreacija(3, new Cas(11, 1), true),
            new Tretja.Rekreacija(5, new Cas(11, 4), true),
            new Tretja.SluzbenaPot(34, new Cas(11, 8), true),
            new Tretja.Rekreacija(2, new Cas(11, 13), false),
            new Tretja.Malica(18, new Cas(11, 19), true),
            new Tretja.Malica(18, new Cas(11, 30), false),
            new Tretja.Malica(20, new Cas(11, 47), true),
            new Tretja.SluzbenaPot(16, new Cas(11, 57), false),
            new Tretja.Rekreacija(10, new Cas(11, 58), true),
            new Tretja.SluzbenaPot(48, new Cas(11, 59), true),
            new Tretja.SluzbenaPot(14, new Cas(12, 0), true),
            new Tretja.Rekreacija(9, new Cas(12, 4), false),
            new Tretja.SluzbenaPot(8, new Cas(12, 5), false),
            new Tretja.Malica(37, new Cas(12, 15), false),
            new Tretja.SluzbenaPot(21, new Cas(12, 48), false),
            new Tretja.SluzbenaPot(26, new Cas(13, 2), false),
            new Tretja.Rekreacija(40, new Cas(13, 12), false),
            new Tretja.SluzbenaPot(43, new Cas(13, 20), false),
            new Tretja.SluzbenaPot(48, new Cas(13, 20), false),
            new Tretja.SluzbenaPot(15, new Cas(13, 38), false),
            new Tretja.SluzbenaPot(40, new Cas(13, 44), true),
            new Tretja.SluzbenaPot(12, new Cas(13, 58), false),
            new Tretja.Malica(44, new Cas(14, 2), true),
            new Tretja.SluzbenaPot(24, new Cas(14, 13), true),
            new Tretja.SluzbenaPot(39, new Cas(14, 16), false),
            new Tretja.Rekreacija(10, new Cas(14, 17), false),
            new Tretja.Malica(42, new Cas(14, 27), true),
            new Tretja.Malica(20, new Cas(14, 28), false),
            new Tretja.SluzbenaPot(22, new Cas(14, 51), false),
            new Tretja.Malica(38, new Cas(14, 55), false),
            new Tretja.Rekreacija(30, new Cas(14, 59), true),
            new Tretja.Malica(42, new Cas(15, 1), false),
            new Tretja.Malica(33, new Cas(15, 6), false),
            new Tretja.Rekreacija(11, new Cas(15, 13), true),
            new Tretja.Rekreacija(3, new Cas(15, 21), false),
            new Tretja.SluzbenaPot(1, new Cas(15, 25), true),
            new Tretja.Rekreacija(5, new Cas(15, 28), false),
            new Tretja.Rekreacija(33, new Cas(15, 41), true),
            new Tretja.Rekreacija(6, new Cas(16, 17), false),
            new Tretja.SluzbenaPot(5, new Cas(16, 53), true),
            new Tretja.SluzbenaPot(42, new Cas(17, 27), true),
            new Tretja.Rekreacija(4, new Cas(17, 33), false),
            new Tretja.Malica(25, new Cas(17, 33), false),
            new Tretja.Malica(35, new Cas(17, 35), true),
            new Tretja.Malica(36, new Cas(17, 35), false),
            new Tretja.Malica(44, new Cas(17, 44), false),
            new Tretja.SluzbenaPot(20, new Cas(17, 44), true),
            new Tretja.Rekreacija(41, new Cas(17, 54), true),
            new Tretja.Malica(28, new Cas(18, 7), false),
            new Tretja.SluzbenaPot(5, new Cas(18, 9), false),
            new Tretja.SluzbenaPot(8, new Cas(18, 13), true),
            new Tretja.Malica(47, new Cas(18, 23), true),
            new Tretja.SluzbenaPot(46, new Cas(18, 30), false),
            new Tretja.SluzbenaPot(14, new Cas(18, 34), false),
            new Tretja.Malica(49, new Cas(18, 39), false),
            new Tretja.SluzbenaPot(23, new Cas(18, 56), false),
            new Tretja.SluzbenaPot(45, new Cas(19, 0), false),
            new Tretja.Rekreacija(29, new Cas(19, 15), false),
            new Tretja.SluzbenaPot(40, new Cas(19, 23), false),
            new Tretja.SluzbenaPot(20, new Cas(19, 32), false),
            new Tretja.Rekreacija(30, new Cas(19, 37), false),
            new Tretja.Rekreacija(16, new Cas(19, 38), true),
            new Tretja.SluzbenaPot(34, new Cas(19, 48), false),
            new Tretja.SluzbenaPot(42, new Cas(20, 0), false),
            new Tretja.Rekreacija(19, new Cas(20, 0), false),
            new Tretja.Rekreacija(16, new Cas(20, 11), false),
            new Tretja.Rekreacija(41, new Cas(20, 51), false),
            new Tretja.Rekreacija(33, new Cas(20, 53), false),
            new Tretja.Malica(47, new Cas(20, 55), false),
            new Tretja.SluzbenaPot(1, new Cas(21, 19), false),
            new Tretja.Malica(35, new Cas(21, 25), false),
            new Tretja.Rekreacija(7, new Cas(21, 27), false),
            new Tretja.Malica(7, new Cas(22, 19), true),
            new Tretja.Rekreacija(17, new Cas(23, 6), false),
            new Tretja.SluzbenaPot(27, new Cas(23, 6), false),
            new Tretja.Malica(32, new Cas(23, 20), false),
            new Tretja.Rekreacija(11, new Cas(23, 23), false),
            new Tretja.SluzbenaPot(24, new Cas(23, 25), false),
            new Tretja.SluzbenaPot(8, new Cas(23, 29), false),
            new Tretja.Malica(7, new Cas(23, 39), false),
            new Tretja.Malica(13, new Cas(23, 53), false),
        };

        int stZaposlenih = 50;
        Tretja.Dnevnik dnevnik = new Tretja.Dnevnik(stZaposlenih, dogodki);

        for (int i = 0; i < stZaposlenih; i++) {
            System.out.printf("%d -> %d%n", i, dnevnik.kolikoRekreacije(i));
        }
        System.out.println();
    }
}
