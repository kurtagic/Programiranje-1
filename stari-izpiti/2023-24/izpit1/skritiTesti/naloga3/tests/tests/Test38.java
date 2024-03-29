
import java.util.*;

public class Test38 {

    public static void main(String[] args) {

        Tretja.Dogodek[] dogodki = {
            new Tretja.Malica(47, new Cas(0, 7), true),
            new Tretja.Malica(24, new Cas(0, 12), true),
            new Tretja.SluzbenaPot(14, new Cas(0, 13), true),
            new Tretja.Rekreacija(6, new Cas(0, 13), true),
            new Tretja.SluzbenaPot(48, new Cas(0, 16), true),
            new Tretja.Rekreacija(39, new Cas(0, 20), true),
            new Tretja.Rekreacija(15, new Cas(0, 22), true),
            new Tretja.SluzbenaPot(37, new Cas(0, 22), true),
            new Tretja.Malica(10, new Cas(0, 23), true),
            new Tretja.SluzbenaPot(25, new Cas(0, 25), true),
            new Tretja.SluzbenaPot(23, new Cas(0, 28), true),
            new Tretja.SluzbenaPot(3, new Cas(0, 28), true),
            new Tretja.SluzbenaPot(23, new Cas(0, 37), false),
            new Tretja.SluzbenaPot(16, new Cas(0, 40), true),
            new Tretja.SluzbenaPot(34, new Cas(0, 41), true),
            new Tretja.Malica(10, new Cas(0, 44), false),
            new Tretja.SluzbenaPot(30, new Cas(0, 46), true),
            new Tretja.SluzbenaPot(19, new Cas(0, 47), true),
            new Tretja.SluzbenaPot(45, new Cas(0, 51), true),
            new Tretja.Malica(8, new Cas(0, 58), true),
            new Tretja.Rekreacija(44, new Cas(1, 0), true),
            new Tretja.SluzbenaPot(20, new Cas(1, 3), true),
            new Tretja.Malica(23, new Cas(1, 12), true),
            new Tretja.Rekreacija(31, new Cas(1, 17), true),
            new Tretja.Malica(41, new Cas(1, 20), true),
            new Tretja.Rekreacija(36, new Cas(1, 23), true),
            new Tretja.SluzbenaPot(43, new Cas(1, 24), true),
            new Tretja.Rekreacija(27, new Cas(1, 28), true),
            new Tretja.Rekreacija(15, new Cas(1, 30), false),
            new Tretja.Malica(28, new Cas(1, 30), true),
            new Tretja.SluzbenaPot(11, new Cas(1, 43), true),
            new Tretja.SluzbenaPot(29, new Cas(1, 47), true),
            new Tretja.Malica(5, new Cas(1, 49), true),
            new Tretja.Malica(13, new Cas(1, 50), true),
            new Tretja.Rekreacija(38, new Cas(1, 50), true),
            new Tretja.SluzbenaPot(3, new Cas(1, 50), false),
            new Tretja.Malica(8, new Cas(1, 52), false),
            new Tretja.Malica(32, new Cas(1, 59), true),
            new Tretja.SluzbenaPot(22, new Cas(2, 8), true),
            new Tretja.Rekreacija(1, new Cas(2, 12), true),
            new Tretja.Malica(15, new Cas(2, 13), true),
            new Tretja.Rekreacija(17, new Cas(2, 20), true),
            new Tretja.SluzbenaPot(33, new Cas(2, 23), true),
            new Tretja.Rekreacija(9, new Cas(2, 26), true),
            new Tretja.SluzbenaPot(0, new Cas(2, 27), true),
            new Tretja.Rekreacija(8, new Cas(2, 27), true),
            new Tretja.SluzbenaPot(4, new Cas(2, 29), true),
            new Tretja.SluzbenaPot(7, new Cas(2, 41), true),
            new Tretja.Rekreacija(2, new Cas(2, 42), true),
            new Tretja.Malica(26, new Cas(2, 43), true),
            new Tretja.SluzbenaPot(49, new Cas(2, 48), true),
            new Tretja.SluzbenaPot(19, new Cas(2, 51), false),
            new Tretja.Malica(13, new Cas(2, 56), false),
            new Tretja.SluzbenaPot(42, new Cas(2, 57), true),
            new Tretja.Rekreacija(3, new Cas(3, 3), true),
            new Tretja.Rekreacija(12, new Cas(3, 7), true),
            new Tretja.SluzbenaPot(29, new Cas(3, 9), false),
            new Tretja.Rekreacija(10, new Cas(3, 14), true),
            new Tretja.SluzbenaPot(25, new Cas(3, 16), false),
            new Tretja.SluzbenaPot(33, new Cas(3, 18), false),
            new Tretja.Rekreacija(25, new Cas(3, 23), true),
            new Tretja.Rekreacija(13, new Cas(3, 25), true),
            new Tretja.Rekreacija(36, new Cas(3, 29), false),
            new Tretja.SluzbenaPot(30, new Cas(3, 30), false),
            new Tretja.Rekreacija(46, new Cas(3, 31), true),
            new Tretja.SluzbenaPot(30, new Cas(3, 34), true),
            new Tretja.Rekreacija(2, new Cas(3, 35), false),
            new Tretja.Rekreacija(27, new Cas(3, 39), false),
            new Tretja.SluzbenaPot(30, new Cas(3, 40), false),
            new Tretja.Rekreacija(40, new Cas(3, 44), true),
            new Tretja.Rekreacija(2, new Cas(3, 47), true),
            new Tretja.Rekreacija(19, new Cas(3, 49), true),
            new Tretja.SluzbenaPot(11, new Cas(3, 52), false),
            new Tretja.Rekreacija(44, new Cas(3, 53), false),
            new Tretja.Rekreacija(21, new Cas(3, 54), true),
            new Tretja.SluzbenaPot(36, new Cas(4, 4), true),
            new Tretja.Rekreacija(39, new Cas(4, 6), false),
            new Tretja.Rekreacija(18, new Cas(4, 12), true),
            new Tretja.Rekreacija(8, new Cas(4, 19), false),
            new Tretja.Rekreacija(35, new Cas(4, 21), true),
            new Tretja.SluzbenaPot(39, new Cas(4, 24), true),
            new Tretja.SluzbenaPot(45, new Cas(4, 24), false),
            new Tretja.SluzbenaPot(11, new Cas(4, 24), true),
            new Tretja.Rekreacija(12, new Cas(4, 28), false),
            new Tretja.Rekreacija(13, new Cas(4, 30), false),
            new Tretja.SluzbenaPot(27, new Cas(4, 38), true),
            new Tretja.Malica(12, new Cas(4, 40), true),
            new Tretja.SluzbenaPot(13, new Cas(5, 7), true),
            new Tretja.SluzbenaPot(29, new Cas(5, 7), true),
            new Tretja.SluzbenaPot(8, new Cas(5, 8), true),
            new Tretja.SluzbenaPot(33, new Cas(5, 10), true),
            new Tretja.Rekreacija(31, new Cas(5, 15), false),
            new Tretja.Malica(23, new Cas(5, 16), false),
            new Tretja.SluzbenaPot(43, new Cas(5, 17), false),
            new Tretja.Rekreacija(38, new Cas(5, 21), false),
            new Tretja.Rekreacija(25, new Cas(5, 21), false),
            new Tretja.SluzbenaPot(48, new Cas(5, 23), false),
            new Tretja.Rekreacija(44, new Cas(5, 24), true),
            new Tretja.Malica(48, new Cas(5, 25), true),
            new Tretja.Malica(30, new Cas(5, 27), true),
            new Tretja.Malica(43, new Cas(5, 27), true),
            new Tretja.SluzbenaPot(7, new Cas(5, 31), false),
            new Tretja.SluzbenaPot(11, new Cas(5, 47), false),
            new Tretja.SluzbenaPot(39, new Cas(5, 47), false),
            new Tretja.SluzbenaPot(33, new Cas(5, 50), false),
            new Tretja.Rekreacija(23, new Cas(5, 51), true),
            new Tretja.Malica(11, new Cas(5, 54), true),
            new Tretja.SluzbenaPot(42, new Cas(5, 55), false),
            new Tretja.Malica(48, new Cas(6, 1), false),
            new Tretja.SluzbenaPot(25, new Cas(6, 6), true),
            new Tretja.SluzbenaPot(31, new Cas(6, 7), true),
            new Tretja.SluzbenaPot(13, new Cas(6, 10), false),
            new Tretja.Malica(28, new Cas(6, 26), false),
            new Tretja.Malica(11, new Cas(6, 27), false),
            new Tretja.Rekreacija(17, new Cas(6, 27), false),
            new Tretja.SluzbenaPot(38, new Cas(6, 28), true),
            new Tretja.SluzbenaPot(39, new Cas(6, 31), true),
            new Tretja.Malica(7, new Cas(6, 34), true),
            new Tretja.SluzbenaPot(0, new Cas(6, 36), false),
            new Tretja.Malica(33, new Cas(6, 37), true),
            new Tretja.SluzbenaPot(25, new Cas(6, 37), false),
            new Tretja.SluzbenaPot(4, new Cas(6, 38), false),
            new Tretja.Rekreacija(45, new Cas(6, 45), true),
            new Tretja.Rekreacija(1, new Cas(6, 45), false),
            new Tretja.SluzbenaPot(25, new Cas(6, 46), true),
            new Tretja.SluzbenaPot(42, new Cas(6, 59), true),
            new Tretja.Rekreacija(2, new Cas(7, 0), false),
            new Tretja.Rekreacija(2, new Cas(7, 2), true),
            new Tretja.Rekreacija(48, new Cas(7, 3), true),
            new Tretja.SluzbenaPot(31, new Cas(7, 12), false),
            new Tretja.Rekreacija(11, new Cas(7, 13), true),
            new Tretja.SluzbenaPot(36, new Cas(7, 16), false),
            new Tretja.SluzbenaPot(36, new Cas(7, 17), true),
            new Tretja.Rekreacija(31, new Cas(7, 20), true),
            new Tretja.SluzbenaPot(0, new Cas(7, 21), true),
            new Tretja.Malica(4, new Cas(7, 22), true),
            new Tretja.Rekreacija(13, new Cas(7, 30), true),
            new Tretja.SluzbenaPot(17, new Cas(7, 35), true),
            new Tretja.SluzbenaPot(42, new Cas(7, 38), false),
            new Tretja.Malica(7, new Cas(7, 41), false),
            new Tretja.SluzbenaPot(39, new Cas(7, 41), false),
            new Tretja.Rekreacija(7, new Cas(7, 45), true),
            new Tretja.Rekreacija(13, new Cas(7, 45), false),
            new Tretja.Malica(24, new Cas(7, 50), false),
            new Tretja.Malica(1, new Cas(7, 53), true),
            new Tretja.Rekreacija(28, new Cas(7, 53), true),
            new Tretja.SluzbenaPot(29, new Cas(7, 57), false),
            new Tretja.Rekreacija(23, new Cas(8, 6), false),
            new Tretja.Rekreacija(13, new Cas(8, 8), true),
            new Tretja.Rekreacija(9, new Cas(8, 17), false),
            new Tretja.SluzbenaPot(37, new Cas(8, 19), false),
            new Tretja.Malica(39, new Cas(8, 37), true),
            new Tretja.SluzbenaPot(27, new Cas(8, 41), false),
            new Tretja.Malica(29, new Cas(8, 42), true),
            new Tretja.Rekreacija(45, new Cas(8, 47), false),
            new Tretja.Rekreacija(6, new Cas(9, 1), false),
            new Tretja.Rekreacija(45, new Cas(9, 3), true),
            new Tretja.Rekreacija(37, new Cas(9, 20), true),
            new Tretja.Rekreacija(19, new Cas(9, 22), false),
            new Tretja.Rekreacija(27, new Cas(9, 24), true),
            new Tretja.Rekreacija(31, new Cas(9, 30), false),
            new Tretja.Rekreacija(23, new Cas(9, 33), true),
            new Tretja.SluzbenaPot(6, new Cas(9, 34), true),
            new Tretja.Rekreacija(46, new Cas(9, 41), false),
            new Tretja.Rekreacija(42, new Cas(9, 43), true),
            new Tretja.Rekreacija(19, new Cas(9, 48), true),
            new Tretja.SluzbenaPot(24, new Cas(10, 2), true),
            new Tretja.Rekreacija(13, new Cas(10, 3), false),
            new Tretja.Rekreacija(46, new Cas(10, 8), true),
            new Tretja.Rekreacija(40, new Cas(10, 8), false),
            new Tretja.Rekreacija(37, new Cas(10, 13), false),
            new Tretja.SluzbenaPot(40, new Cas(10, 14), true),
            new Tretja.Rekreacija(13, new Cas(10, 14), true),
            new Tretja.Malica(31, new Cas(10, 27), true),
            new Tretja.Rekreacija(45, new Cas(10, 27), false),
            new Tretja.Rekreacija(42, new Cas(10, 29), false),
            new Tretja.SluzbenaPot(40, new Cas(10, 31), false),
            new Tretja.Malica(37, new Cas(10, 32), true),
            new Tretja.SluzbenaPot(42, new Cas(10, 33), true),
            new Tretja.Rekreacija(40, new Cas(10, 37), true),
            new Tretja.SluzbenaPot(42, new Cas(10, 38), false),
            new Tretja.Rekreacija(35, new Cas(10, 46), false),
            new Tretja.SluzbenaPot(9, new Cas(10, 52), true),
            new Tretja.Malica(5, new Cas(10, 54), false),
            new Tretja.SluzbenaPot(42, new Cas(10, 59), true),
            new Tretja.SluzbenaPot(45, new Cas(11, 0), true),
            new Tretja.SluzbenaPot(17, new Cas(11, 0), false),
            new Tretja.Rekreacija(17, new Cas(11, 6), true),
            new Tretja.SluzbenaPot(5, new Cas(11, 7), true),
            new Tretja.Rekreacija(40, new Cas(11, 8), false),
            new Tretja.SluzbenaPot(36, new Cas(11, 9), false),
            new Tretja.Rekreacija(35, new Cas(11, 13), true),
            new Tretja.SluzbenaPot(20, new Cas(11, 13), false),
            new Tretja.SluzbenaPot(5, new Cas(11, 28), false),
            new Tretja.SluzbenaPot(24, new Cas(11, 32), false),
            new Tretja.Rekreacija(17, new Cas(11, 34), false),
            new Tretja.SluzbenaPot(5, new Cas(11, 43), true),
            new Tretja.Malica(40, new Cas(11, 49), true),
            new Tretja.Rekreacija(35, new Cas(11, 53), false),
            new Tretja.Rekreacija(20, new Cas(11, 53), true),
            new Tretja.Malica(36, new Cas(12, 0), true),
            new Tretja.SluzbenaPot(0, new Cas(12, 0), false),
            new Tretja.SluzbenaPot(35, new Cas(12, 4), true),
            new Tretja.Malica(26, new Cas(12, 5), false),
            new Tretja.SluzbenaPot(17, new Cas(12, 5), true),
            new Tretja.SluzbenaPot(42, new Cas(12, 16), false),
            new Tretja.Rekreacija(27, new Cas(12, 22), false),
            new Tretja.Rekreacija(46, new Cas(12, 32), false),
            new Tretja.Malica(46, new Cas(12, 34), true),
            new Tretja.SluzbenaPot(24, new Cas(12, 37), true),
            new Tretja.SluzbenaPot(0, new Cas(12, 40), true),
            new Tretja.SluzbenaPot(26, new Cas(12, 42), true),
            new Tretja.Malica(37, new Cas(12, 45), false),
            new Tretja.Malica(29, new Cas(12, 45), false),
            new Tretja.Malica(12, new Cas(12, 58), false),
            new Tretja.Malica(27, new Cas(12, 58), true),
            new Tretja.SluzbenaPot(29, new Cas(13, 16), true),
            new Tretja.Rekreacija(23, new Cas(13, 19), false),
            new Tretja.Rekreacija(12, new Cas(13, 20), true),
            new Tretja.SluzbenaPot(35, new Cas(13, 26), false),
            new Tretja.SluzbenaPot(17, new Cas(13, 34), false),
            new Tretja.SluzbenaPot(23, new Cas(13, 35), true),
            new Tretja.Malica(33, new Cas(13, 37), false),
            new Tretja.Rekreacija(44, new Cas(13, 38), false),
            new Tretja.SluzbenaPot(6, new Cas(13, 47), false),
            new Tretja.Rekreacija(13, new Cas(13, 54), false),
            new Tretja.SluzbenaPot(33, new Cas(13, 55), true),
            new Tretja.SluzbenaPot(38, new Cas(14, 3), false),
            new Tretja.Malica(43, new Cas(14, 12), false),
            new Tretja.Rekreacija(17, new Cas(14, 15), true),
            new Tretja.Malica(42, new Cas(14, 15), true),
            new Tretja.SluzbenaPot(49, new Cas(14, 20), false),
            new Tretja.SluzbenaPot(26, new Cas(14, 20), false),
            new Tretja.Malica(42, new Cas(14, 31), false),
            new Tretja.Malica(31, new Cas(14, 33), false),
            new Tretja.SluzbenaPot(49, new Cas(14, 39), true),
            new Tretja.SluzbenaPot(43, new Cas(14, 44), true),
            new Tretja.Rekreacija(12, new Cas(14, 45), false),
            new Tretja.Malica(46, new Cas(14, 47), false),
            new Tretja.SluzbenaPot(45, new Cas(14, 52), false),
            new Tretja.Rekreacija(42, new Cas(14, 52), true),
            new Tretja.SluzbenaPot(12, new Cas(14, 54), true),
            new Tretja.Rekreacija(48, new Cas(14, 57), false),
            new Tretja.Rekreacija(37, new Cas(15, 0), true),
            new Tretja.SluzbenaPot(31, new Cas(15, 0), true),
            new Tretja.SluzbenaPot(26, new Cas(15, 4), true),
            new Tretja.SluzbenaPot(24, new Cas(15, 4), false),
            new Tretja.Malica(35, new Cas(15, 10), true),
            new Tretja.SluzbenaPot(24, new Cas(15, 11), true),
            new Tretja.Rekreacija(13, new Cas(15, 13), true),
            new Tretja.Malica(30, new Cas(15, 21), false),
            new Tretja.Malica(27, new Cas(15, 23), false),
            new Tretja.SluzbenaPot(49, new Cas(15, 28), false),
            new Tretja.Rekreacija(46, new Cas(15, 32), true),
            new Tretja.Rekreacija(38, new Cas(15, 43), true),
            new Tretja.SluzbenaPot(23, new Cas(15, 54), false),
            new Tretja.Malica(6, new Cas(16, 8), true),
            new Tretja.Malica(1, new Cas(16, 10), false),
            new Tretja.Rekreacija(1, new Cas(16, 17), true),
            new Tretja.Rekreacija(48, new Cas(16, 19), true),
            new Tretja.Rekreacija(44, new Cas(16, 26), true),
            new Tretja.Rekreacija(28, new Cas(16, 34), false),
            new Tretja.Rekreacija(13, new Cas(16, 35), false),
            new Tretja.SluzbenaPot(43, new Cas(16, 46), false),
            new Tretja.Rekreacija(23, new Cas(16, 52), true),
            new Tretja.SluzbenaPot(24, new Cas(16, 52), false),
            new Tretja.Rekreacija(11, new Cas(17, 0), false),
            new Tretja.SluzbenaPot(28, new Cas(17, 7), true),
            new Tretja.Rekreacija(30, new Cas(17, 9), true),
            new Tretja.SluzbenaPot(11, new Cas(17, 10), true),
            new Tretja.Rekreacija(27, new Cas(17, 11), true),
            new Tretja.Rekreacija(13, new Cas(17, 18), true),
            new Tretja.Rekreacija(30, new Cas(17, 21), false),
            new Tretja.SluzbenaPot(49, new Cas(17, 23), true),
            new Tretja.Rekreacija(43, new Cas(17, 29), true),
            new Tretja.SluzbenaPot(28, new Cas(17, 33), false),
            new Tretja.Rekreacija(24, new Cas(17, 37), true),
            new Tretja.SluzbenaPot(0, new Cas(17, 38), false),
            new Tretja.SluzbenaPot(8, new Cas(17, 39), false),
            new Tretja.SluzbenaPot(26, new Cas(17, 41), false),
            new Tretja.Rekreacija(45, new Cas(17, 44), true),
            new Tretja.Malica(35, new Cas(17, 45), false),
            new Tretja.Malica(41, new Cas(17, 51), false),
            new Tretja.SluzbenaPot(11, new Cas(17, 54), false),
            new Tretja.Rekreacija(13, new Cas(18, 0), false),
            new Tretja.Malica(36, new Cas(18, 0), false),
            new Tretja.SluzbenaPot(28, new Cas(18, 1), true),
            new Tretja.Rekreacija(11, new Cas(18, 1), true),
            new Tretja.Rekreacija(30, new Cas(18, 6), true),
            new Tretja.Rekreacija(20, new Cas(18, 9), false),
            new Tretja.Rekreacija(17, new Cas(18, 9), false),
            new Tretja.Malica(17, new Cas(18, 18), true),
            new Tretja.Malica(39, new Cas(18, 23), false),
            new Tretja.Rekreacija(41, new Cas(18, 27), true),
            new Tretja.SluzbenaPot(8, new Cas(18, 31), true),
            new Tretja.SluzbenaPot(49, new Cas(18, 44), false),
            new Tretja.Malica(40, new Cas(19, 1), false),
            new Tretja.Rekreacija(1, new Cas(19, 6), false),
            new Tretja.Rekreacija(39, new Cas(19, 8), true),
            new Tretja.SluzbenaPot(1, new Cas(19, 9), true),
            new Tretja.Rekreacija(0, new Cas(19, 12), true),
            new Tretja.Rekreacija(13, new Cas(19, 12), true),
            new Tretja.SluzbenaPot(14, new Cas(19, 14), false),
            new Tretja.Malica(49, new Cas(19, 15), true),
            new Tretja.Rekreacija(0, new Cas(19, 16), false),
            new Tretja.SluzbenaPot(8, new Cas(19, 25), false),
            new Tretja.Rekreacija(41, new Cas(19, 26), false),
            new Tretja.Rekreacija(21, new Cas(19, 36), false),
            new Tretja.SluzbenaPot(25, new Cas(19, 37), false),
            new Tretja.SluzbenaPot(14, new Cas(19, 41), true),
            new Tretja.SluzbenaPot(31, new Cas(19, 41), false),
            new Tretja.SluzbenaPot(35, new Cas(19, 43), true),
            new Tretja.Rekreacija(38, new Cas(19, 47), false),
            new Tretja.Rekreacija(19, new Cas(19, 50), false),
            new Tretja.Rekreacija(10, new Cas(19, 50), false),
            new Tretja.SluzbenaPot(1, new Cas(19, 51), false),
            new Tretja.Rekreacija(46, new Cas(19, 52), false),
            new Tretja.SluzbenaPot(20, new Cas(19, 57), true),
            new Tretja.Rekreacija(48, new Cas(19, 58), false),
            new Tretja.Rekreacija(30, new Cas(20, 8), false),
            new Tretja.Malica(49, new Cas(20, 17), false),
            new Tretja.SluzbenaPot(49, new Cas(20, 20), true),
            new Tretja.Malica(47, new Cas(20, 33), false),
            new Tretja.Rekreacija(42, new Cas(20, 39), false),
            new Tretja.Malica(19, new Cas(20, 42), true),
            new Tretja.SluzbenaPot(5, new Cas(20, 46), false),
            new Tretja.SluzbenaPot(28, new Cas(20, 48), false),
            new Tretja.SluzbenaPot(36, new Cas(20, 50), true),
            new Tretja.Rekreacija(39, new Cas(20, 51), false),
            new Tretja.SluzbenaPot(14, new Cas(20, 51), false),
            new Tretja.Malica(19, new Cas(21, 3), false),
            new Tretja.Rekreacija(0, new Cas(21, 3), true),
            new Tretja.Rekreacija(45, new Cas(21, 4), false),
            new Tretja.Malica(15, new Cas(21, 5), false),
            new Tretja.SluzbenaPot(29, new Cas(21, 8), false),
            new Tretja.Malica(6, new Cas(21, 15), false),
            new Tretja.SluzbenaPot(20, new Cas(21, 35), false),
            new Tretja.Rekreacija(7, new Cas(21, 45), false),
            new Tretja.Rekreacija(13, new Cas(21, 49), false),
            new Tretja.Rekreacija(3, new Cas(21, 56), false),
            new Tretja.Malica(4, new Cas(22, 11), false),
            new Tretja.Rekreacija(2, new Cas(22, 14), false),
            new Tretja.SluzbenaPot(14, new Cas(22, 21), true),
            new Tretja.SluzbenaPot(36, new Cas(22, 23), false),
            new Tretja.Rekreacija(11, new Cas(22, 25), false),
            new Tretja.SluzbenaPot(22, new Cas(22, 25), false),
            new Tretja.Rekreacija(37, new Cas(22, 29), false),
            new Tretja.Rekreacija(10, new Cas(22, 33), true),
            new Tretja.SluzbenaPot(13, new Cas(22, 39), true),
            new Tretja.SluzbenaPot(33, new Cas(22, 40), false),
            new Tretja.Rekreacija(0, new Cas(22, 41), false),
            new Tretja.Rekreacija(10, new Cas(22, 50), false),
            new Tretja.SluzbenaPot(13, new Cas(22, 51), false),
            new Tretja.Rekreacija(27, new Cas(22, 56), false),
            new Tretja.SluzbenaPot(34, new Cas(23, 9), false),
            new Tretja.Rekreacija(44, new Cas(23, 12), false),
            new Tretja.SluzbenaPot(35, new Cas(23, 14), false),
            new Tretja.Rekreacija(43, new Cas(23, 23), false),
            new Tretja.SluzbenaPot(12, new Cas(23, 23), false),
            new Tretja.SluzbenaPot(14, new Cas(23, 24), false),
            new Tretja.Rekreacija(24, new Cas(23, 28), false),
            new Tretja.Rekreacija(23, new Cas(23, 30), false),
            new Tretja.Malica(32, new Cas(23, 35), false),
            new Tretja.SluzbenaPot(49, new Cas(23, 38), false),
            new Tretja.Rekreacija(18, new Cas(23, 51), false),
            new Tretja.SluzbenaPot(16, new Cas(23, 52), false),
            new Tretja.Malica(17, new Cas(23, 53), false),
            new Tretja.SluzbenaPot(9, new Cas(23, 53), false),
        };

        int stZaposlenih = 50;
        Tretja.Dnevnik dnevnik = new Tretja.Dnevnik(stZaposlenih, dogodki);

        List<Cas> casi = new ArrayList<>();
        casi.add(new Cas(2, 6));
        casi.add(new Cas(2, 21));
        casi.add(new Cas(2, 45));
        casi.add(new Cas(4, 53));
        casi.add(new Cas(5, 24));
        casi.add(new Cas(5, 40));
        casi.add(new Cas(6, 19));
        casi.add(new Cas(6, 41));
        casi.add(new Cas(8, 28));
        casi.add(new Cas(9, 18));
        casi.add(new Cas(9, 30));
        casi.add(new Cas(10, 57));
        casi.add(new Cas(12, 4));
        casi.add(new Cas(12, 8));
        casi.add(new Cas(12, 25));
        casi.add(new Cas(12, 58));
        casi.add(new Cas(13, 22));
        casi.add(new Cas(13, 28));
        casi.add(new Cas(16, 51));
        casi.add(new Cas(16, 52));
        casi.add(new Cas(17, 56));
        casi.add(new Cas(19, 38));
        casi.add(new Cas(20, 15));
        casi.add(new Cas(21, 44));
        casi.add(new Cas(22, 49));
        casi.add(new Cas(22, 52));
        casi.add(new Cas(23, 32));
        casi.add(new Cas(23, 33));
        casi.add(new Cas(23, 47));
        casi.add(new Cas(23, 49));

        for (Cas cas: casi) {
            System.out.printf("%s -> %s%n", cas, Arrays.toString(dnevnik.prisotnost(cas)));
        }
    }
}
