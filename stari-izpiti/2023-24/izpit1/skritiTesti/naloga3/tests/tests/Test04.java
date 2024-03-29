
import java.util.*;

public class Test04 {

    public static void main(String[] args) {

        Tretja.Dogodek[] dogodki = {
            new Tretja.Rekreacija(22, new Cas(0, 3), true),
            new Tretja.Rekreacija(31, new Cas(0, 8), true),
            new Tretja.Rekreacija(8, new Cas(0, 17), true),
            new Tretja.SluzbenaPot(49, new Cas(0, 21), true),
            new Tretja.Rekreacija(27, new Cas(0, 23), true),
            new Tretja.SluzbenaPot(26, new Cas(0, 23), true),
            new Tretja.Malica(44, new Cas(0, 24), true),
            new Tretja.Rekreacija(15, new Cas(0, 28), true),
            new Tretja.Rekreacija(36, new Cas(0, 30), true),
            new Tretja.SluzbenaPot(25, new Cas(0, 34), true),
            new Tretja.Malica(32, new Cas(0, 40), true),
            new Tretja.Malica(12, new Cas(0, 41), true),
            new Tretja.Malica(14, new Cas(0, 57), true),
            new Tretja.SluzbenaPot(48, new Cas(0, 58), true),
            new Tretja.SluzbenaPot(45, new Cas(1, 7), true),
            new Tretja.SluzbenaPot(0, new Cas(1, 21), true),
            new Tretja.Rekreacija(10, new Cas(1, 22), true),
            new Tretja.Rekreacija(18, new Cas(1, 29), true),
            new Tretja.Malica(21, new Cas(1, 36), true),
            new Tretja.SluzbenaPot(9, new Cas(1, 41), true),
            new Tretja.SluzbenaPot(11, new Cas(1, 42), true),
            new Tretja.Rekreacija(38, new Cas(1, 45), true),
            new Tretja.Rekreacija(13, new Cas(1, 46), true),
            new Tretja.SluzbenaPot(39, new Cas(1, 55), true),
            new Tretja.Rekreacija(19, new Cas(2, 22), true),
            new Tretja.Malica(46, new Cas(2, 28), true),
            new Tretja.Rekreacija(35, new Cas(2, 50), true),
            new Tretja.SluzbenaPot(34, new Cas(2, 53), true),
            new Tretja.Rekreacija(5, new Cas(2, 59), true),
            new Tretja.Rekreacija(4, new Cas(3, 5), true),
            new Tretja.Rekreacija(31, new Cas(3, 15), false),
            new Tretja.Malica(28, new Cas(3, 15), true),
            new Tretja.Rekreacija(31, new Cas(3, 17), true),
            new Tretja.Malica(33, new Cas(3, 19), true),
            new Tretja.Malica(3, new Cas(3, 21), true),
            new Tretja.SluzbenaPot(26, new Cas(3, 27), false),
            new Tretja.SluzbenaPot(29, new Cas(3, 30), true),
            new Tretja.Malica(6, new Cas(3, 35), true),
            new Tretja.Rekreacija(2, new Cas(3, 38), true),
            new Tretja.Malica(23, new Cas(3, 40), true),
            new Tretja.Rekreacija(47, new Cas(3, 53), true),
            new Tretja.Malica(23, new Cas(3, 55), false),
            new Tretja.Rekreacija(19, new Cas(3, 55), false),
            new Tretja.Malica(33, new Cas(3, 57), false),
            new Tretja.Rekreacija(30, new Cas(4, 1), true),
            new Tretja.Malica(17, new Cas(4, 3), true),
            new Tretja.Rekreacija(16, new Cas(4, 14), true),
            new Tretja.Rekreacija(27, new Cas(4, 18), false),
            new Tretja.Malica(32, new Cas(4, 18), false),
            new Tretja.Malica(1, new Cas(4, 19), true),
            new Tretja.Rekreacija(19, new Cas(4, 23), true),
            new Tretja.SluzbenaPot(20, new Cas(4, 42), true),
            new Tretja.Malica(26, new Cas(4, 42), true),
            new Tretja.Malica(43, new Cas(4, 48), true),
            new Tretja.SluzbenaPot(11, new Cas(4, 52), false),
            new Tretja.Rekreacija(32, new Cas(4, 53), true),
            new Tretja.Malica(42, new Cas(5, 0), true),
            new Tretja.Malica(24, new Cas(5, 2), true),
            new Tretja.Rekreacija(41, new Cas(5, 4), true),
            new Tretja.SluzbenaPot(27, new Cas(5, 5), true),
            new Tretja.Rekreacija(8, new Cas(5, 10), false),
            new Tretja.Malica(11, new Cas(5, 16), true),
            new Tretja.Malica(37, new Cas(5, 17), true),
            new Tretja.Rekreacija(36, new Cas(5, 30), false),
            new Tretja.SluzbenaPot(20, new Cas(5, 33), false),
            new Tretja.Rekreacija(36, new Cas(5, 49), true),
            new Tretja.Rekreacija(40, new Cas(5, 49), true),
            new Tretja.Rekreacija(38, new Cas(5, 57), false),
            new Tretja.Rekreacija(18, new Cas(5, 59), false),
            new Tretja.Rekreacija(40, new Cas(6, 1), false),
            new Tretja.Rekreacija(13, new Cas(6, 8), false),
            new Tretja.Rekreacija(7, new Cas(6, 9), true),
            new Tretja.SluzbenaPot(38, new Cas(6, 18), true),
            new Tretja.SluzbenaPot(23, new Cas(6, 24), true),
            new Tretja.Rekreacija(36, new Cas(6, 29), false),
            new Tretja.Malica(11, new Cas(6, 32), false),
            new Tretja.SluzbenaPot(23, new Cas(6, 36), false),
            new Tretja.Rekreacija(18, new Cas(6, 46), true),
            new Tretja.SluzbenaPot(36, new Cas(6, 50), true),
            new Tretja.Rekreacija(33, new Cas(6, 59), true),
            new Tretja.SluzbenaPot(29, new Cas(7, 5), false),
            new Tretja.Rekreacija(20, new Cas(7, 6), true),
            new Tretja.SluzbenaPot(9, new Cas(7, 22), false),
            new Tretja.Rekreacija(10, new Cas(7, 24), false),
            new Tretja.Rekreacija(32, new Cas(7, 29), false),
            new Tretja.Rekreacija(32, new Cas(7, 34), true),
            new Tretja.SluzbenaPot(8, new Cas(7, 36), true),
            new Tretja.Malica(24, new Cas(7, 39), false),
            new Tretja.SluzbenaPot(10, new Cas(7, 40), true),
            new Tretja.Malica(44, new Cas(7, 48), false),
            new Tretja.SluzbenaPot(24, new Cas(7, 54), true),
            new Tretja.SluzbenaPot(25, new Cas(8, 13), false),
            new Tretja.Malica(42, new Cas(8, 14), false),
            new Tretja.SluzbenaPot(23, new Cas(8, 17), true),
            new Tretja.Rekreacija(44, new Cas(8, 20), true),
            new Tretja.Malica(28, new Cas(8, 25), false),
            new Tretja.Malica(12, new Cas(8, 37), false),
            new Tretja.Rekreacija(13, new Cas(8, 40), true),
            new Tretja.Rekreacija(9, new Cas(8, 54), true),
            new Tretja.Malica(29, new Cas(9, 27), true),
            new Tretja.Rekreacija(16, new Cas(9, 34), false),
            new Tretja.SluzbenaPot(11, new Cas(9, 40), true),
            new Tretja.Malica(43, new Cas(9, 42), false),
            new Tretja.Rekreacija(31, new Cas(9, 43), false),
            new Tretja.Rekreacija(25, new Cas(9, 43), true),
            new Tretja.Malica(40, new Cas(9, 45), true),
            new Tretja.Rekreacija(4, new Cas(9, 47), false),
            new Tretja.Rekreacija(13, new Cas(9, 50), false),
            new Tretja.SluzbenaPot(48, new Cas(9, 51), false),
            new Tretja.Rekreacija(43, new Cas(9, 54), true),
            new Tretja.Rekreacija(16, new Cas(9, 59), true),
            new Tretja.Rekreacija(42, new Cas(10, 6), true),
            new Tretja.SluzbenaPot(13, new Cas(10, 12), true),
            new Tretja.SluzbenaPot(23, new Cas(10, 15), false),
            new Tretja.Malica(31, new Cas(10, 16), true),
            new Tretja.Rekreacija(23, new Cas(10, 18), true),
            new Tretja.Rekreacija(48, new Cas(10, 22), true),
            new Tretja.Rekreacija(19, new Cas(10, 29), false),
            new Tretja.Rekreacija(12, new Cas(10, 33), true),
            new Tretja.SluzbenaPot(0, new Cas(10, 36), false),
            new Tretja.Malica(26, new Cas(10, 36), false),
            new Tretja.Rekreacija(12, new Cas(10, 37), false),
            new Tretja.SluzbenaPot(28, new Cas(10, 39), true),
            new Tretja.Rekreacija(18, new Cas(10, 44), false),
            new Tretja.Malica(37, new Cas(10, 45), false),
            new Tretja.Rekreacija(5, new Cas(10, 45), false),
            new Tretja.Rekreacija(25, new Cas(10, 54), false),
            new Tretja.SluzbenaPot(13, new Cas(11, 5), false),
            new Tretja.Malica(17, new Cas(11, 8), false),
            new Tretja.SluzbenaPot(12, new Cas(11, 9), true),
            new Tretja.Rekreacija(20, new Cas(11, 9), false),
            new Tretja.Rekreacija(42, new Cas(11, 16), false),
            new Tretja.Rekreacija(48, new Cas(11, 21), false),
            new Tretja.Rekreacija(43, new Cas(11, 26), false),
            new Tretja.SluzbenaPot(26, new Cas(11, 29), true),
            new Tretja.SluzbenaPot(27, new Cas(11, 30), false),
            new Tretja.SluzbenaPot(48, new Cas(11, 33), true),
            new Tretja.Rekreacija(37, new Cas(11, 33), true),
            new Tretja.Rekreacija(15, new Cas(11, 41), false),
            new Tretja.Malica(13, new Cas(11, 43), true),
            new Tretja.Rekreacija(18, new Cas(11, 45), true),
            new Tretja.Malica(25, new Cas(11, 46), true),
            new Tretja.SluzbenaPot(27, new Cas(11, 47), true),
            new Tretja.Rekreacija(19, new Cas(11, 48), true),
            new Tretja.SluzbenaPot(5, new Cas(11, 51), true),
            new Tretja.SluzbenaPot(34, new Cas(11, 52), false),
            new Tretja.Rekreacija(17, new Cas(11, 54), true),
            new Tretja.Malica(20, new Cas(11, 56), true),
            new Tretja.SluzbenaPot(12, new Cas(12, 5), false),
            new Tretja.Rekreacija(32, new Cas(12, 7), false),
            new Tretja.SluzbenaPot(24, new Cas(12, 13), false),
            new Tretja.Malica(13, new Cas(12, 22), false),
            new Tretja.SluzbenaPot(42, new Cas(12, 28), true),
            new Tretja.Rekreacija(9, new Cas(12, 29), false),
            new Tretja.Rekreacija(2, new Cas(12, 39), false),
            new Tretja.SluzbenaPot(24, new Cas(12, 43), true),
            new Tretja.SluzbenaPot(8, new Cas(12, 47), false),
            new Tretja.Malica(0, new Cas(12, 49), true),
            new Tretja.SluzbenaPot(36, new Cas(12, 51), false),
            new Tretja.Rekreacija(37, new Cas(12, 52), false),
            new Tretja.SluzbenaPot(28, new Cas(12, 56), false),
            new Tretja.SluzbenaPot(28, new Cas(12, 59), true),
            new Tretja.Malica(46, new Cas(13, 8), false),
            new Tretja.SluzbenaPot(48, new Cas(13, 22), false),
            new Tretja.Malica(36, new Cas(13, 24), true),
            new Tretja.SluzbenaPot(48, new Cas(13, 27), true),
            new Tretja.Rekreacija(43, new Cas(13, 33), true),
            new Tretja.Rekreacija(41, new Cas(13, 36), false),
            new Tretja.Rekreacija(13, new Cas(13, 55), true),
            new Tretja.SluzbenaPot(26, new Cas(13, 55), false),
            new Tretja.Rekreacija(32, new Cas(13, 56), true),
            new Tretja.Malica(34, new Cas(13, 58), true),
            new Tretja.Malica(36, new Cas(14, 3), false),
            new Tretja.Rekreacija(12, new Cas(14, 14), true),
            new Tretja.SluzbenaPot(4, new Cas(14, 16), true),
            new Tretja.Rekreacija(36, new Cas(14, 20), true),
            new Tretja.Malica(21, new Cas(14, 27), false),
            new Tretja.Rekreacija(41, new Cas(14, 34), true),
            new Tretja.Rekreacija(19, new Cas(14, 36), false),
            new Tretja.SluzbenaPot(2, new Cas(14, 44), true),
            new Tretja.Rekreacija(21, new Cas(14, 52), true),
            new Tretja.Rekreacija(8, new Cas(15, 2), true),
            new Tretja.SluzbenaPot(38, new Cas(15, 5), false),
            new Tretja.SluzbenaPot(15, new Cas(15, 13), true),
            new Tretja.Malica(38, new Cas(15, 21), true),
            new Tretja.SluzbenaPot(9, new Cas(15, 21), true),
            new Tretja.Rekreacija(18, new Cas(15, 21), false),
            new Tretja.Rekreacija(26, new Cas(15, 22), true),
            new Tretja.Rekreacija(8, new Cas(15, 22), false),
            new Tretja.SluzbenaPot(18, new Cas(15, 27), true),
            new Tretja.Rekreacija(37, new Cas(15, 30), true),
            new Tretja.SluzbenaPot(46, new Cas(15, 47), true),
            new Tretja.Rekreacija(32, new Cas(15, 49), false),
            new Tretja.Malica(8, new Cas(15, 51), true),
            new Tretja.SluzbenaPot(32, new Cas(16, 9), true),
            new Tretja.SluzbenaPot(18, new Cas(16, 12), false),
            new Tretja.SluzbenaPot(32, new Cas(16, 16), false),
            new Tretja.Rekreacija(32, new Cas(16, 22), true),
            new Tretja.SluzbenaPot(19, new Cas(16, 24), true),
            new Tretja.SluzbenaPot(15, new Cas(16, 29), false),
            new Tretja.Rekreacija(26, new Cas(16, 32), false),
            new Tretja.SluzbenaPot(24, new Cas(16, 34), false),
            new Tretja.Malica(18, new Cas(16, 34), true),
            new Tretja.SluzbenaPot(39, new Cas(16, 43), false),
            new Tretja.Rekreacija(15, new Cas(16, 47), true),
            new Tretja.SluzbenaPot(24, new Cas(17, 3), true),
            new Tretja.Rekreacija(21, new Cas(17, 6), false),
            new Tretja.Rekreacija(15, new Cas(17, 12), false),
            new Tretja.Rekreacija(37, new Cas(17, 14), false),
            new Tretja.SluzbenaPot(42, new Cas(17, 14), false),
            new Tretja.Rekreacija(16, new Cas(17, 15), false),
            new Tretja.Rekreacija(22, new Cas(17, 20), false),
            new Tretja.Rekreacija(17, new Cas(17, 22), false),
            new Tretja.SluzbenaPot(21, new Cas(17, 25), true),
            new Tretja.SluzbenaPot(37, new Cas(17, 32), true),
            new Tretja.Rekreacija(26, new Cas(17, 42), true),
            new Tretja.Rekreacija(16, new Cas(17, 44), true),
            new Tretja.SluzbenaPot(42, new Cas(17, 46), true),
            new Tretja.SluzbenaPot(15, new Cas(17, 46), true),
            new Tretja.SluzbenaPot(17, new Cas(17, 49), true),
            new Tretja.Rekreacija(26, new Cas(17, 55), false),
            new Tretja.SluzbenaPot(48, new Cas(17, 59), false),
            new Tretja.SluzbenaPot(22, new Cas(18, 2), true),
            new Tretja.Malica(3, new Cas(18, 8), false),
            new Tretja.Malica(6, new Cas(18, 9), false),
            new Tretja.Malica(1, new Cas(18, 10), false),
            new Tretja.Malica(39, new Cas(18, 10), true),
            new Tretja.Malica(20, new Cas(18, 12), false),
            new Tretja.Malica(25, new Cas(18, 18), false),
            new Tretja.Malica(39, new Cas(18, 24), false),
            new Tretja.SluzbenaPot(2, new Cas(18, 24), false),
            new Tretja.Rekreacija(25, new Cas(18, 24), true),
            new Tretja.SluzbenaPot(22, new Cas(18, 27), false),
            new Tretja.Rekreacija(39, new Cas(18, 28), true),
            new Tretja.Rekreacija(44, new Cas(18, 43), false),
            new Tretja.Rekreacija(30, new Cas(18, 46), false),
            new Tretja.Malica(40, new Cas(18, 46), false),
            new Tretja.Rekreacija(44, new Cas(18, 53), true),
            new Tretja.SluzbenaPot(37, new Cas(18, 53), false),
            new Tretja.Rekreacija(33, new Cas(18, 55), false),
            new Tretja.SluzbenaPot(10, new Cas(18, 55), false),
            new Tretja.SluzbenaPot(2, new Cas(18, 58), true),
            new Tretja.SluzbenaPot(5, new Cas(19, 10), false),
            new Tretja.Malica(34, new Cas(19, 11), false),
            new Tretja.SluzbenaPot(1, new Cas(19, 27), true),
            new Tretja.Malica(31, new Cas(19, 28), false),
            new Tretja.Rekreacija(36, new Cas(19, 32), false),
            new Tretja.SluzbenaPot(19, new Cas(19, 45), false),
            new Tretja.Rekreacija(41, new Cas(19, 55), false),
            new Tretja.Malica(48, new Cas(20, 3), true),
            new Tretja.Rekreacija(44, new Cas(20, 8), false),
            new Tretja.Rekreacija(44, new Cas(20, 14), true),
            new Tretja.SluzbenaPot(28, new Cas(20, 19), false),
            new Tretja.Rekreacija(20, new Cas(20, 20), true),
            new Tretja.Rekreacija(16, new Cas(20, 26), false),
            new Tretja.Malica(38, new Cas(20, 28), false),
            new Tretja.Malica(0, new Cas(20, 38), false),
            new Tretja.Malica(29, new Cas(20, 41), false),
            new Tretja.Rekreacija(20, new Cas(20, 43), false),
            new Tretja.SluzbenaPot(0, new Cas(20, 44), true),
            new Tretja.SluzbenaPot(17, new Cas(20, 49), false),
            new Tretja.Malica(18, new Cas(20, 49), false),
            new Tretja.Rekreacija(16, new Cas(21, 6), true),
            new Tretja.SluzbenaPot(17, new Cas(21, 6), true),
            new Tretja.SluzbenaPot(11, new Cas(21, 6), false),
            new Tretja.SluzbenaPot(1, new Cas(21, 6), false),
            new Tretja.SluzbenaPot(4, new Cas(21, 11), false),
            new Tretja.Rekreacija(25, new Cas(21, 12), false),
            new Tretja.SluzbenaPot(26, new Cas(21, 13), true),
            new Tretja.Rekreacija(16, new Cas(21, 27), false),
            new Tretja.Malica(14, new Cas(21, 29), false),
            new Tretja.Rekreacija(44, new Cas(21, 29), false),
            new Tretja.Rekreacija(47, new Cas(21, 34), false),
            new Tretja.Rekreacija(1, new Cas(21, 38), true),
            new Tretja.Malica(16, new Cas(21, 44), true),
            new Tretja.SluzbenaPot(46, new Cas(21, 45), false),
            new Tretja.SluzbenaPot(45, new Cas(21, 50), false),
            new Tretja.Malica(16, new Cas(22, 5), false),
            new Tretja.Rekreacija(43, new Cas(22, 17), false),
            new Tretja.Rekreacija(35, new Cas(22, 24), false),
            new Tretja.SluzbenaPot(42, new Cas(22, 26), false),
            new Tretja.SluzbenaPot(11, new Cas(22, 32), true),
            new Tretja.Rekreacija(23, new Cas(22, 33), false),
            new Tretja.Rekreacija(1, new Cas(22, 48), false),
            new Tretja.SluzbenaPot(46, new Cas(22, 49), true),
            new Tretja.Malica(8, new Cas(22, 52), false),
            new Tretja.SluzbenaPot(24, new Cas(22, 55), false),
            new Tretja.SluzbenaPot(46, new Cas(23, 6), false),
            new Tretja.SluzbenaPot(17, new Cas(23, 8), false),
            new Tretja.Rekreacija(12, new Cas(23, 11), false),
            new Tretja.Rekreacija(13, new Cas(23, 13), false),
            new Tretja.SluzbenaPot(27, new Cas(23, 16), false),
            new Tretja.Rekreacija(32, new Cas(23, 17), false),
            new Tretja.SluzbenaPot(11, new Cas(23, 17), false),
            new Tretja.SluzbenaPot(9, new Cas(23, 18), false),
            new Tretja.Rekreacija(39, new Cas(23, 18), false),
            new Tretja.SluzbenaPot(15, new Cas(23, 20), false),
            new Tretja.SluzbenaPot(49, new Cas(23, 25), false),
            new Tretja.SluzbenaPot(26, new Cas(23, 26), false),
            new Tretja.SluzbenaPot(0, new Cas(23, 34), false),
            new Tretja.SluzbenaPot(21, new Cas(23, 35), false),
            new Tretja.SluzbenaPot(2, new Cas(23, 40), false),
            new Tretja.Malica(48, new Cas(23, 46), false),
            new Tretja.Rekreacija(7, new Cas(23, 59), false),
        };

        int stZaposlenih = 50;
        Tretja.Dnevnik dnevnik = new Tretja.Dnevnik(stZaposlenih, dogodki);

        System.out.println(dnevnik.steviloMalicarjev());
        System.out.println();
    }
}
