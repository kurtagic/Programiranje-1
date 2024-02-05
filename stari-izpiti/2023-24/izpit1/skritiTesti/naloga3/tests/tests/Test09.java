
import java.util.*;

public class Test09 {

    public static void main(String[] args) {

        Tretja.Dogodek[] dogodki = {
            new Tretja.Malica(17, new Cas(0, 1), true),
            new Tretja.SluzbenaPot(7, new Cas(0, 2), true),
            new Tretja.Rekreacija(25, new Cas(0, 2), true),
            new Tretja.Malica(16, new Cas(0, 8), true),
            new Tretja.SluzbenaPot(43, new Cas(0, 13), true),
            new Tretja.SluzbenaPot(28, new Cas(0, 47), true),
            new Tretja.Rekreacija(48, new Cas(1, 2), true),
            new Tretja.Malica(30, new Cas(1, 21), true),
            new Tretja.Rekreacija(39, new Cas(1, 23), true),
            new Tretja.Rekreacija(5, new Cas(1, 25), true),
            new Tretja.Rekreacija(11, new Cas(1, 35), true),
            new Tretja.SluzbenaPot(22, new Cas(1, 57), true),
            new Tretja.Rekreacija(14, new Cas(1, 59), true),
            new Tretja.Malica(18, new Cas(2, 2), true),
            new Tretja.SluzbenaPot(7, new Cas(2, 7), false),
            new Tretja.Rekreacija(26, new Cas(2, 7), true),
            new Tretja.Rekreacija(33, new Cas(2, 8), true),
            new Tretja.Malica(19, new Cas(2, 27), true),
            new Tretja.Rekreacija(5, new Cas(2, 39), false),
            new Tretja.Malica(5, new Cas(2, 52), true),
            new Tretja.SluzbenaPot(15, new Cas(3, 2), true),
            new Tretja.SluzbenaPot(7, new Cas(3, 2), true),
            new Tretja.Malica(36, new Cas(3, 17), true),
            new Tretja.Malica(0, new Cas(3, 29), true),
            new Tretja.SluzbenaPot(49, new Cas(3, 33), true),
            new Tretja.SluzbenaPot(9, new Cas(3, 36), true),
            new Tretja.Rekreacija(37, new Cas(4, 4), true),
            new Tretja.SluzbenaPot(12, new Cas(4, 7), true),
            new Tretja.SluzbenaPot(34, new Cas(4, 16), true),
            new Tretja.Rekreacija(46, new Cas(4, 19), true),
            new Tretja.Rekreacija(20, new Cas(4, 23), true),
            new Tretja.SluzbenaPot(12, new Cas(4, 43), false),
            new Tretja.SluzbenaPot(38, new Cas(4, 48), true),
            new Tretja.Malica(32, new Cas(4, 52), true),
            new Tretja.SluzbenaPot(44, new Cas(4, 57), true),
            new Tretja.Malica(12, new Cas(5, 5), true),
            new Tretja.Rekreacija(27, new Cas(5, 18), true),
            new Tretja.Rekreacija(37, new Cas(5, 20), false),
            new Tretja.Rekreacija(10, new Cas(5, 24), true),
            new Tretja.SluzbenaPot(1, new Cas(5, 58), true),
            new Tretja.Rekreacija(26, new Cas(6, 5), false),
            new Tretja.SluzbenaPot(45, new Cas(6, 14), true),
            new Tretja.SluzbenaPot(6, new Cas(6, 27), true),
            new Tretja.Malica(12, new Cas(6, 33), false),
            new Tretja.Malica(36, new Cas(7, 1), false),
            new Tretja.Rekreacija(46, new Cas(7, 23), false),
            new Tretja.Malica(2, new Cas(7, 43), true),
            new Tretja.Malica(5, new Cas(7, 50), false),
            new Tretja.Rekreacija(3, new Cas(8, 1), true),
            new Tretja.SluzbenaPot(47, new Cas(8, 17), true),
            new Tretja.SluzbenaPot(12, new Cas(9, 7), true),
            new Tretja.Rekreacija(10, new Cas(9, 12), false),
            new Tretja.Malica(8, new Cas(9, 24), true),
            new Tretja.SluzbenaPot(43, new Cas(9, 52), false),
            new Tretja.SluzbenaPot(38, new Cas(9, 57), false),
            new Tretja.Rekreacija(24, new Cas(9, 59), true),
            new Tretja.Malica(17, new Cas(10, 13), false),
            new Tretja.Malica(2, new Cas(10, 15), false),
            new Tretja.Malica(42, new Cas(10, 18), true),
            new Tretja.SluzbenaPot(35, new Cas(10, 22), true),
            new Tretja.Rekreacija(38, new Cas(10, 28), true),
            new Tretja.Malica(21, new Cas(10, 48), true),
            new Tretja.SluzbenaPot(17, new Cas(10, 51), true),
            new Tretja.Rekreacija(41, new Cas(11, 4), true),
            new Tretja.SluzbenaPot(36, new Cas(11, 24), true),
            new Tretja.Rekreacija(5, new Cas(11, 27), true),
            new Tretja.Rekreacija(29, new Cas(11, 43), true),
            new Tretja.Rekreacija(29, new Cas(12, 13), false),
            new Tretja.Rekreacija(20, new Cas(12, 20), false),
            new Tretja.SluzbenaPot(47, new Cas(12, 28), false),
            new Tretja.Rekreacija(25, new Cas(12, 29), false),
            new Tretja.Malica(32, new Cas(12, 34), false),
            new Tretja.Rekreacija(41, new Cas(12, 34), false),
            new Tretja.Malica(23, new Cas(12, 38), true),
            new Tretja.Rekreacija(3, new Cas(12, 59), false),
            new Tretja.SluzbenaPot(49, new Cas(13, 14), false),
            new Tretja.SluzbenaPot(40, new Cas(13, 31), true),
            new Tretja.Malica(4, new Cas(13, 50), true),
            new Tretja.SluzbenaPot(36, new Cas(14, 0), false),
            new Tretja.SluzbenaPot(22, new Cas(14, 15), false),
            new Tretja.Rekreacija(27, new Cas(14, 26), false),
            new Tretja.Rekreacija(41, new Cas(14, 39), true),
            new Tretja.SluzbenaPot(17, new Cas(14, 41), false),
            new Tretja.Rekreacija(43, new Cas(14, 41), true),
            new Tretja.Rekreacija(14, new Cas(14, 49), false),
            new Tretja.Malica(14, new Cas(14, 54), true),
            new Tretja.SluzbenaPot(27, new Cas(14, 58), true),
            new Tretja.Malica(29, new Cas(15, 26), true),
            new Tretja.Rekreacija(38, new Cas(15, 33), false),
            new Tretja.SluzbenaPot(31, new Cas(15, 35), true),
            new Tretja.SluzbenaPot(36, new Cas(15, 47), true),
            new Tretja.Rekreacija(39, new Cas(15, 50), false),
            new Tretja.Rekreacija(22, new Cas(16, 1), true),
            new Tretja.SluzbenaPot(17, new Cas(16, 14), true),
            new Tretja.Malica(46, new Cas(16, 17), true),
            new Tretja.Malica(19, new Cas(16, 18), false),
            new Tretja.SluzbenaPot(32, new Cas(16, 20), true),
            new Tretja.SluzbenaPot(35, new Cas(16, 31), false),
            new Tretja.SluzbenaPot(12, new Cas(16, 34), false),
            new Tretja.SluzbenaPot(6, new Cas(16, 45), false),
            new Tretja.Malica(18, new Cas(17, 11), false),
            new Tretja.SluzbenaPot(27, new Cas(17, 15), false),
            new Tretja.Malica(46, new Cas(17, 22), false),
            new Tretja.SluzbenaPot(35, new Cas(17, 23), true),
            new Tretja.Malica(16, new Cas(17, 28), false),
            new Tretja.Rekreacija(13, new Cas(17, 36), true),
            new Tretja.SluzbenaPot(32, new Cas(17, 39), false),
            new Tretja.Rekreacija(11, new Cas(17, 41), false),
            new Tretja.Rekreacija(43, new Cas(17, 44), false),
            new Tretja.SluzbenaPot(49, new Cas(17, 44), true),
            new Tretja.Malica(38, new Cas(17, 44), true),
            new Tretja.SluzbenaPot(17, new Cas(18, 0), false),
            new Tretja.Malica(4, new Cas(18, 12), false),
            new Tretja.Malica(42, new Cas(18, 23), false),
            new Tretja.Malica(21, new Cas(18, 25), false),
            new Tretja.SluzbenaPot(40, new Cas(18, 27), false),
            new Tretja.Malica(23, new Cas(18, 37), false),
            new Tretja.Malica(30, new Cas(18, 42), false),
            new Tretja.SluzbenaPot(36, new Cas(19, 5), false),
            new Tretja.SluzbenaPot(1, new Cas(19, 13), false),
            new Tretja.SluzbenaPot(35, new Cas(19, 31), false),
            new Tretja.SluzbenaPot(28, new Cas(19, 47), false),
            new Tretja.Rekreacija(22, new Cas(19, 49), false),
            new Tretja.Rekreacija(48, new Cas(20, 29), false),
            new Tretja.SluzbenaPot(49, new Cas(20, 31), false),
            new Tretja.Malica(0, new Cas(20, 32), false),
            new Tretja.SluzbenaPot(31, new Cas(21, 17), false),
            new Tretja.Rekreacija(4, new Cas(21, 27), true),
            new Tretja.Rekreacija(4, new Cas(21, 43), false),
            new Tretja.SluzbenaPot(9, new Cas(22, 11), false),
            new Tretja.SluzbenaPot(44, new Cas(22, 22), false),
            new Tretja.Malica(29, new Cas(22, 23), false),
            new Tretja.Rekreacija(5, new Cas(22, 29), false),
            new Tretja.SluzbenaPot(15, new Cas(22, 42), false),
            new Tretja.Malica(8, new Cas(22, 47), false),
            new Tretja.Rekreacija(24, new Cas(22, 53), false),
            new Tretja.SluzbenaPot(45, new Cas(22, 54), false),
            new Tretja.Malica(38, new Cas(23, 1), false),
            new Tretja.Rekreacija(41, new Cas(23, 3), false),
            new Tretja.SluzbenaPot(34, new Cas(23, 5), false),
            new Tretja.Rekreacija(13, new Cas(23, 17), false),
            new Tretja.SluzbenaPot(7, new Cas(23, 28), false),
            new Tretja.Malica(14, new Cas(23, 30), false),
            new Tretja.Rekreacija(33, new Cas(23, 55), false),
        };

        int stZaposlenih = 50;
        Tretja.Dnevnik dnevnik = new Tretja.Dnevnik(stZaposlenih, dogodki);

        System.out.println(dnevnik.steviloMalicarjev());
        System.out.println();
    }
}
