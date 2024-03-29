
import java.util.*;

public class Test15 {

    public static void main(String[] args) {

        Tretja.Dogodek[] dogodki = {
            new Tretja.Rekreacija(1, new Cas(0, 3), true),
            new Tretja.SluzbenaPot(45, new Cas(0, 16), true),
            new Tretja.Rekreacija(46, new Cas(0, 25), true),
            new Tretja.Rekreacija(8, new Cas(0, 27), true),
            new Tretja.Rekreacija(9, new Cas(0, 34), true),
            new Tretja.Malica(48, new Cas(0, 38), true),
            new Tretja.SluzbenaPot(26, new Cas(0, 43), true),
            new Tretja.Rekreacija(27, new Cas(0, 44), true),
            new Tretja.SluzbenaPot(30, new Cas(0, 53), true),
            new Tretja.Malica(2, new Cas(0, 54), true),
            new Tretja.Malica(40, new Cas(0, 55), true),
            new Tretja.SluzbenaPot(7, new Cas(0, 55), true),
            new Tretja.SluzbenaPot(4, new Cas(0, 58), true),
            new Tretja.Malica(2, new Cas(1, 11), false),
            new Tretja.Rekreacija(28, new Cas(1, 11), true),
            new Tretja.Rekreacija(22, new Cas(1, 12), true),
            new Tretja.SluzbenaPot(0, new Cas(1, 16), true),
            new Tretja.SluzbenaPot(17, new Cas(1, 17), true),
            new Tretja.SluzbenaPot(39, new Cas(1, 21), true),
            new Tretja.Rekreacija(21, new Cas(1, 23), true),
            new Tretja.Rekreacija(18, new Cas(1, 28), true),
            new Tretja.SluzbenaPot(49, new Cas(1, 40), true),
            new Tretja.SluzbenaPot(36, new Cas(1, 56), true),
            new Tretja.Rekreacija(23, new Cas(1, 56), true),
            new Tretja.Rekreacija(29, new Cas(1, 58), true),
            new Tretja.Malica(3, new Cas(2, 3), true),
            new Tretja.Rekreacija(5, new Cas(2, 12), true),
            new Tretja.Rekreacija(23, new Cas(2, 16), false),
            new Tretja.Rekreacija(33, new Cas(2, 16), true),
            new Tretja.SluzbenaPot(43, new Cas(2, 41), true),
            new Tretja.SluzbenaPot(7, new Cas(2, 52), false),
            new Tretja.Malica(19, new Cas(2, 52), true),
            new Tretja.SluzbenaPot(43, new Cas(2, 55), false),
            new Tretja.Rekreacija(37, new Cas(3, 2), true),
            new Tretja.SluzbenaPot(20, new Cas(3, 5), true),
            new Tretja.Malica(34, new Cas(3, 5), true),
            new Tretja.Rekreacija(1, new Cas(3, 7), false),
            new Tretja.SluzbenaPot(11, new Cas(3, 16), true),
            new Tretja.Rekreacija(15, new Cas(3, 23), true),
            new Tretja.Malica(43, new Cas(3, 28), true),
            new Tretja.SluzbenaPot(10, new Cas(3, 31), true),
            new Tretja.Rekreacija(35, new Cas(3, 43), true),
            new Tretja.Rekreacija(44, new Cas(3, 43), true),
            new Tretja.Malica(7, new Cas(3, 46), true),
            new Tretja.Rekreacija(5, new Cas(3, 49), false),
            new Tretja.SluzbenaPot(38, new Cas(3, 51), true),
            new Tretja.SluzbenaPot(49, new Cas(4, 2), false),
            new Tretja.Rekreacija(2, new Cas(4, 4), true),
            new Tretja.Malica(5, new Cas(4, 10), true),
            new Tretja.SluzbenaPot(16, new Cas(4, 14), true),
            new Tretja.Rekreacija(41, new Cas(4, 18), true),
            new Tretja.Rekreacija(13, new Cas(4, 22), true),
            new Tretja.Malica(34, new Cas(4, 24), false),
            new Tretja.Rekreacija(6, new Cas(4, 29), true),
            new Tretja.SluzbenaPot(24, new Cas(4, 35), true),
            new Tretja.Rekreacija(41, new Cas(4, 38), false),
            new Tretja.SluzbenaPot(45, new Cas(4, 41), false),
            new Tretja.Rekreacija(23, new Cas(4, 42), true),
            new Tretja.Rekreacija(31, new Cas(4, 52), true),
            new Tretja.Malica(5, new Cas(4, 54), false),
            new Tretja.Rekreacija(49, new Cas(4, 58), true),
            new Tretja.SluzbenaPot(1, new Cas(5, 0), true),
            new Tretja.Malica(3, new Cas(5, 5), false),
            new Tretja.Rekreacija(12, new Cas(5, 6), true),
            new Tretja.Rekreacija(37, new Cas(5, 16), false),
            new Tretja.Rekreacija(32, new Cas(5, 20), true),
            new Tretja.SluzbenaPot(3, new Cas(5, 32), true),
            new Tretja.SluzbenaPot(5, new Cas(5, 40), true),
            new Tretja.Malica(25, new Cas(5, 40), true),
            new Tretja.Malica(25, new Cas(5, 41), false),
            new Tretja.Rekreacija(46, new Cas(5, 43), false),
            new Tretja.SluzbenaPot(17, new Cas(5, 45), false),
            new Tretja.SluzbenaPot(1, new Cas(5, 47), false),
            new Tretja.SluzbenaPot(45, new Cas(5, 49), true),
            new Tretja.SluzbenaPot(26, new Cas(5, 51), false),
            new Tretja.SluzbenaPot(0, new Cas(5, 52), false),
            new Tretja.SluzbenaPot(42, new Cas(5, 53), true),
            new Tretja.SluzbenaPot(11, new Cas(5, 55), false),
            new Tretja.Malica(26, new Cas(5, 58), true),
            new Tretja.Rekreacija(21, new Cas(6, 0), false),
            new Tretja.Rekreacija(49, new Cas(6, 5), false),
            new Tretja.SluzbenaPot(5, new Cas(6, 10), false),
            new Tretja.SluzbenaPot(47, new Cas(6, 10), true),
            new Tretja.Rekreacija(15, new Cas(6, 20), false),
            new Tretja.Rekreacija(14, new Cas(6, 27), true),
            new Tretja.Malica(41, new Cas(6, 29), true),
            new Tretja.Rekreacija(2, new Cas(6, 45), false),
            new Tretja.Rekreacija(11, new Cas(6, 50), true),
            new Tretja.Rekreacija(23, new Cas(6, 53), false),
            new Tretja.SluzbenaPot(30, new Cas(6, 56), false),
            new Tretja.SluzbenaPot(5, new Cas(6, 58), true),
            new Tretja.SluzbenaPot(37, new Cas(6, 59), true),
            new Tretja.Rekreacija(29, new Cas(7, 2), false),
            new Tretja.SluzbenaPot(49, new Cas(7, 3), true),
            new Tretja.Rekreacija(2, new Cas(7, 7), true),
            new Tretja.SluzbenaPot(29, new Cas(7, 8), true),
            new Tretja.Rekreacija(34, new Cas(7, 10), true),
            new Tretja.SluzbenaPot(42, new Cas(7, 17), false),
            new Tretja.SluzbenaPot(1, new Cas(7, 18), true),
            new Tretja.Rekreacija(30, new Cas(7, 22), true),
            new Tretja.Rekreacija(23, new Cas(7, 28), true),
            new Tretja.SluzbenaPot(42, new Cas(7, 30), true),
            new Tretja.SluzbenaPot(21, new Cas(7, 32), true),
            new Tretja.Rekreacija(46, new Cas(7, 37), true),
            new Tretja.SluzbenaPot(20, new Cas(7, 41), false),
            new Tretja.Malica(43, new Cas(7, 44), false),
            new Tretja.Malica(15, new Cas(7, 46), true),
            new Tretja.SluzbenaPot(10, new Cas(7, 52), false),
            new Tretja.SluzbenaPot(29, new Cas(7, 53), false),
            new Tretja.Rekreacija(18, new Cas(8, 13), false),
            new Tretja.Rekreacija(43, new Cas(8, 16), true),
            new Tretja.Malica(20, new Cas(8, 35), true),
            new Tretja.SluzbenaPot(4, new Cas(8, 35), false),
            new Tretja.SluzbenaPot(4, new Cas(8, 36), true),
            new Tretja.SluzbenaPot(29, new Cas(8, 38), true),
            new Tretja.Rekreacija(44, new Cas(8, 41), false),
            new Tretja.Malica(17, new Cas(8, 43), true),
            new Tretja.Malica(0, new Cas(8, 46), true),
            new Tretja.Malica(18, new Cas(8, 55), true),
            new Tretja.Malica(10, new Cas(8, 56), true),
            new Tretja.Rekreacija(13, new Cas(8, 59), false),
            new Tretja.Rekreacija(28, new Cas(9, 4), false),
            new Tretja.SluzbenaPot(4, new Cas(9, 4), false),
            new Tretja.Rekreacija(34, new Cas(9, 8), false),
            new Tretja.SluzbenaPot(25, new Cas(9, 9), true),
            new Tretja.SluzbenaPot(38, new Cas(9, 14), false),
            new Tretja.SluzbenaPot(5, new Cas(9, 21), false),
            new Tretja.Rekreacija(5, new Cas(9, 34), true),
            new Tretja.Rekreacija(27, new Cas(9, 48), false),
            new Tretja.SluzbenaPot(13, new Cas(9, 52), true),
            new Tretja.Rekreacija(35, new Cas(10, 4), false),
            new Tretja.Rekreacija(4, new Cas(10, 6), true),
            new Tretja.SluzbenaPot(34, new Cas(10, 7), true),
            new Tretja.Rekreacija(32, new Cas(11, 0), false),
            new Tretja.SluzbenaPot(27, new Cas(11, 4), true),
            new Tretja.Rekreacija(22, new Cas(11, 18), false),
            new Tretja.SluzbenaPot(38, new Cas(11, 23), true),
            new Tretja.Rekreacija(28, new Cas(11, 25), true),
            new Tretja.SluzbenaPot(35, new Cas(11, 26), true),
            new Tretja.Rekreacija(46, new Cas(11, 27), false),
            new Tretja.SluzbenaPot(42, new Cas(11, 31), false),
            new Tretja.SluzbenaPot(32, new Cas(11, 35), true),
            new Tretja.SluzbenaPot(22, new Cas(11, 35), true),
            new Tretja.Rekreacija(44, new Cas(11, 36), true),
            new Tretja.Malica(0, new Cas(11, 42), false),
            new Tretja.Rekreacija(6, new Cas(11, 52), false),
            new Tretja.SluzbenaPot(21, new Cas(11, 56), false),
            new Tretja.Rekreacija(21, new Cas(12, 9), true),
            new Tretja.Rekreacija(0, new Cas(12, 11), true),
            new Tretja.SluzbenaPot(38, new Cas(12, 21), false),
            new Tretja.Rekreacija(11, new Cas(12, 24), false),
            new Tretja.Malica(38, new Cas(12, 25), true),
            new Tretja.SluzbenaPot(47, new Cas(12, 34), false),
            new Tretja.Rekreacija(21, new Cas(12, 47), false),
            new Tretja.SluzbenaPot(22, new Cas(12, 50), false),
            new Tretja.Rekreacija(31, new Cas(12, 50), false),
            new Tretja.Malica(42, new Cas(12, 57), true),
            new Tretja.Malica(11, new Cas(13, 8), true),
            new Tretja.Malica(19, new Cas(13, 21), false),
            new Tretja.SluzbenaPot(46, new Cas(13, 24), true),
            new Tretja.Rekreacija(14, new Cas(13, 32), false),
            new Tretja.Rekreacija(6, new Cas(13, 39), true),
            new Tretja.Rekreacija(19, new Cas(13, 39), true),
            new Tretja.Malica(10, new Cas(13, 46), false),
            new Tretja.Rekreacija(6, new Cas(13, 51), false),
            new Tretja.Rekreacija(31, new Cas(13, 57), true),
            new Tretja.SluzbenaPot(6, new Cas(13, 58), true),
            new Tretja.Malica(11, new Cas(14, 12), false),
            new Tretja.Rekreacija(43, new Cas(14, 14), false),
            new Tretja.Rekreacija(44, new Cas(14, 14), false),
            new Tretja.Rekreacija(47, new Cas(14, 20), true),
            new Tretja.Malica(17, new Cas(14, 33), false),
            new Tretja.SluzbenaPot(1, new Cas(14, 41), false),
            new Tretja.SluzbenaPot(11, new Cas(14, 42), true),
            new Tretja.SluzbenaPot(44, new Cas(14, 47), true),
            new Tretja.Rekreacija(23, new Cas(14, 49), false),
            new Tretja.Rekreacija(10, new Cas(14, 55), true),
            new Tretja.Malica(21, new Cas(15, 1), true),
            new Tretja.Malica(1, new Cas(15, 2), true),
            new Tretja.Rekreacija(17, new Cas(15, 2), true),
            new Tretja.SluzbenaPot(43, new Cas(15, 2), true),
            new Tretja.Malica(23, new Cas(15, 4), true),
            new Tretja.Rekreacija(12, new Cas(15, 6), false),
            new Tretja.SluzbenaPot(44, new Cas(15, 11), false),
            new Tretja.SluzbenaPot(25, new Cas(15, 20), false),
            new Tretja.Malica(22, new Cas(15, 25), true),
            new Tretja.Rekreacija(28, new Cas(15, 29), false),
            new Tretja.Malica(12, new Cas(15, 34), true),
            new Tretja.Rekreacija(14, new Cas(15, 35), true),
            new Tretja.SluzbenaPot(37, new Cas(15, 37), false),
            new Tretja.Rekreacija(17, new Cas(15, 42), false),
            new Tretja.Rekreacija(19, new Cas(15, 43), false),
            new Tretja.SluzbenaPot(49, new Cas(15, 44), false),
            new Tretja.Rekreacija(0, new Cas(15, 59), false),
            new Tretja.SluzbenaPot(3, new Cas(16, 8), false),
            new Tretja.Rekreacija(3, new Cas(16, 11), true),
            new Tretja.Rekreacija(0, new Cas(16, 15), true),
            new Tretja.SluzbenaPot(28, new Cas(16, 32), true),
            new Tretja.SluzbenaPot(17, new Cas(16, 41), true),
            new Tretja.SluzbenaPot(25, new Cas(16, 43), true),
            new Tretja.Rekreacija(19, new Cas(16, 48), true),
            new Tretja.Malica(48, new Cas(16, 49), false),
            new Tretja.SluzbenaPot(24, new Cas(16, 52), false),
            new Tretja.SluzbenaPot(43, new Cas(17, 13), false),
            new Tretja.SluzbenaPot(34, new Cas(17, 14), false),
            new Tretja.SluzbenaPot(37, new Cas(17, 15), true),
            new Tretja.Malica(21, new Cas(17, 22), false),
            new Tretja.Rekreacija(43, new Cas(17, 23), true),
            new Tretja.Rekreacija(49, new Cas(17, 30), true),
            new Tretja.SluzbenaPot(48, new Cas(17, 50), true),
            new Tretja.SluzbenaPot(46, new Cas(17, 54), false),
            new Tretja.Rekreacija(14, new Cas(17, 58), false),
            new Tretja.Malica(18, new Cas(18, 6), false),
            new Tretja.SluzbenaPot(32, new Cas(18, 7), false),
            new Tretja.Malica(14, new Cas(18, 16), true),
            new Tretja.SluzbenaPot(11, new Cas(18, 23), false),
            new Tretja.Rekreacija(3, new Cas(18, 42), false),
            new Tretja.Rekreacija(3, new Cas(18, 43), true),
            new Tretja.SluzbenaPot(48, new Cas(18, 43), false),
            new Tretja.SluzbenaPot(48, new Cas(18, 44), true),
            new Tretja.SluzbenaPot(6, new Cas(18, 44), false),
            new Tretja.Rekreacija(2, new Cas(18, 50), false),
            new Tretja.SluzbenaPot(27, new Cas(18, 54), false),
            new Tretja.SluzbenaPot(34, new Cas(18, 55), true),
            new Tretja.SluzbenaPot(36, new Cas(19, 5), false),
            new Tretja.Malica(44, new Cas(19, 6), true),
            new Tretja.Malica(23, new Cas(19, 11), false),
            new Tretja.Malica(26, new Cas(19, 18), false),
            new Tretja.Malica(40, new Cas(19, 19), false),
            new Tretja.Rekreacija(0, new Cas(19, 25), false),
            new Tretja.SluzbenaPot(21, new Cas(19, 30), true),
            new Tretja.Malica(38, new Cas(19, 34), false),
            new Tretja.Rekreacija(46, new Cas(19, 34), true),
            new Tretja.SluzbenaPot(21, new Cas(19, 41), false),
            new Tretja.Malica(36, new Cas(19, 43), true),
            new Tretja.Rekreacija(9, new Cas(19, 50), false),
            new Tretja.Rekreacija(3, new Cas(19, 56), false),
            new Tretja.Malica(7, new Cas(19, 58), false),
            new Tretja.Rekreacija(4, new Cas(19, 59), false),
            new Tretja.SluzbenaPot(17, new Cas(20, 1), false),
            new Tretja.SluzbenaPot(21, new Cas(20, 1), true),
            new Tretja.Rekreacija(33, new Cas(20, 12), false),
            new Tretja.SluzbenaPot(39, new Cas(20, 17), false),
            new Tretja.SluzbenaPot(34, new Cas(20, 19), false),
            new Tretja.Malica(36, new Cas(20, 19), false),
            new Tretja.SluzbenaPot(21, new Cas(20, 22), false),
            new Tretja.Rekreacija(31, new Cas(20, 22), false),
            new Tretja.Rekreacija(43, new Cas(20, 37), false),
            new Tretja.Malica(22, new Cas(20, 38), false),
            new Tretja.Malica(20, new Cas(20, 44), false),
            new Tretja.SluzbenaPot(29, new Cas(20, 45), false),
            new Tretja.SluzbenaPot(45, new Cas(20, 45), false),
            new Tretja.Rekreacija(5, new Cas(20, 46), false),
            new Tretja.Rekreacija(47, new Cas(20, 51), false),
            new Tretja.SluzbenaPot(16, new Cas(20, 59), false),
            new Tretja.Malica(42, new Cas(21, 6), false),
            new Tretja.Malica(14, new Cas(21, 11), false),
            new Tretja.Malica(41, new Cas(21, 12), false),
            new Tretja.Rekreacija(8, new Cas(21, 15), false),
            new Tretja.SluzbenaPot(17, new Cas(21, 16), true),
            new Tretja.SluzbenaPot(35, new Cas(21, 35), false),
            new Tretja.Rekreacija(2, new Cas(21, 37), true),
            new Tretja.SluzbenaPot(26, new Cas(21, 43), true),
            new Tretja.Rekreacija(11, new Cas(21, 46), true),
            new Tretja.SluzbenaPot(28, new Cas(21, 46), false),
            new Tretja.SluzbenaPot(48, new Cas(21, 58), false),
            new Tretja.Malica(44, new Cas(22, 2), false),
            new Tretja.Rekreacija(18, new Cas(22, 3), true),
            new Tretja.Rekreacija(10, new Cas(22, 5), false),
            new Tretja.SluzbenaPot(17, new Cas(22, 5), false),
            new Tretja.Rekreacija(46, new Cas(22, 13), false),
            new Tretja.Rekreacija(11, new Cas(22, 14), false),
            new Tretja.Rekreacija(44, new Cas(22, 20), true),
            new Tretja.Malica(1, new Cas(22, 24), false),
            new Tretja.SluzbenaPot(13, new Cas(22, 26), false),
            new Tretja.Rekreacija(44, new Cas(22, 50), false),
            new Tretja.Malica(4, new Cas(22, 50), true),
            new Tretja.SluzbenaPot(26, new Cas(22, 52), false),
            new Tretja.Rekreacija(30, new Cas(22, 53), false),
            new Tretja.SluzbenaPot(23, new Cas(22, 58), true),
            new Tretja.Rekreacija(19, new Cas(22, 59), false),
            new Tretja.Rekreacija(18, new Cas(23, 1), false),
            new Tretja.Rekreacija(2, new Cas(23, 4), false),
            new Tretja.SluzbenaPot(25, new Cas(23, 7), false),
            new Tretja.SluzbenaPot(0, new Cas(23, 11), true),
            new Tretja.Malica(12, new Cas(23, 13), false),
            new Tretja.SluzbenaPot(0, new Cas(23, 16), false),
            new Tretja.Malica(15, new Cas(23, 24), false),
            new Tretja.Rekreacija(49, new Cas(23, 31), false),
            new Tretja.SluzbenaPot(23, new Cas(23, 36), false),
            new Tretja.SluzbenaPot(37, new Cas(23, 44), false),
            new Tretja.Malica(4, new Cas(23, 59), false),
        };

        int stZaposlenih = 50;
        Tretja.Dnevnik dnevnik = new Tretja.Dnevnik(stZaposlenih, dogodki);

        System.out.println(dnevnik.steviloMalicarjev());
        System.out.println();
    }
}
