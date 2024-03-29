
import java.util.*;

public class Test27 {

    public static void main(String[] args) {

        Tretja.Dogodek[] dogodki = {
            new Tretja.SluzbenaPot(49, new Cas(0, 4), true),
            new Tretja.SluzbenaPot(44, new Cas(0, 6), true),
            new Tretja.Rekreacija(12, new Cas(0, 9), true),
            new Tretja.Malica(23, new Cas(0, 17), true),
            new Tretja.Rekreacija(35, new Cas(0, 23), true),
            new Tretja.Malica(30, new Cas(0, 39), true),
            new Tretja.Malica(22, new Cas(1, 4), true),
            new Tretja.Rekreacija(19, new Cas(1, 11), true),
            new Tretja.Rekreacija(31, new Cas(1, 12), true),
            new Tretja.Malica(46, new Cas(1, 15), true),
            new Tretja.Malica(37, new Cas(1, 16), true),
            new Tretja.Rekreacija(26, new Cas(1, 22), true),
            new Tretja.SluzbenaPot(38, new Cas(1, 31), true),
            new Tretja.Rekreacija(47, new Cas(1, 40), true),
            new Tretja.SluzbenaPot(14, new Cas(1, 47), true),
            new Tretja.SluzbenaPot(43, new Cas(1, 49), true),
            new Tretja.SluzbenaPot(17, new Cas(1, 50), true),
            new Tretja.Rekreacija(8, new Cas(1, 50), true),
            new Tretja.SluzbenaPot(6, new Cas(1, 51), true),
            new Tretja.Rekreacija(3, new Cas(2, 5), true),
            new Tretja.Malica(16, new Cas(2, 10), true),
            new Tretja.SluzbenaPot(41, new Cas(2, 10), true),
            new Tretja.Rekreacija(21, new Cas(2, 20), true),
            new Tretja.SluzbenaPot(32, new Cas(2, 21), true),
            new Tretja.SluzbenaPot(2, new Cas(2, 22), true),
            new Tretja.Rekreacija(15, new Cas(2, 25), true),
            new Tretja.SluzbenaPot(34, new Cas(2, 27), true),
            new Tretja.Rekreacija(1, new Cas(2, 34), true),
            new Tretja.Malica(45, new Cas(2, 35), true),
            new Tretja.Rekreacija(42, new Cas(2, 38), true),
            new Tretja.Rekreacija(5, new Cas(2, 45), true),
            new Tretja.Malica(16, new Cas(2, 50), false),
            new Tretja.Malica(29, new Cas(2, 55), true),
            new Tretja.SluzbenaPot(10, new Cas(3, 2), true),
            new Tretja.Rekreacija(31, new Cas(3, 3), false),
            new Tretja.Rekreacija(13, new Cas(3, 3), true),
            new Tretja.SluzbenaPot(4, new Cas(3, 5), true),
            new Tretja.SluzbenaPot(32, new Cas(3, 10), false),
            new Tretja.Malica(18, new Cas(3, 27), true),
            new Tretja.Rekreacija(7, new Cas(3, 28), true),
            new Tretja.Rekreacija(16, new Cas(3, 30), true),
            new Tretja.Rekreacija(27, new Cas(3, 32), true),
            new Tretja.Malica(36, new Cas(3, 39), true),
            new Tretja.Rekreacija(7, new Cas(3, 41), false),
            new Tretja.Rekreacija(0, new Cas(3, 43), true),
            new Tretja.SluzbenaPot(38, new Cas(3, 44), false),
            new Tretja.Rekreacija(0, new Cas(3, 46), false),
            new Tretja.SluzbenaPot(20, new Cas(3, 48), true),
            new Tretja.Rekreacija(15, new Cas(3, 49), false),
            new Tretja.Rekreacija(0, new Cas(3, 52), true),
            new Tretja.SluzbenaPot(15, new Cas(3, 55), true),
            new Tretja.SluzbenaPot(32, new Cas(3, 55), true),
            new Tretja.Rekreacija(31, new Cas(3, 56), true),
            new Tretja.SluzbenaPot(33, new Cas(3, 58), true),
            new Tretja.Malica(30, new Cas(3, 59), false),
            new Tretja.Rekreacija(24, new Cas(4, 1), true),
            new Tretja.Malica(9, new Cas(4, 2), true),
            new Tretja.SluzbenaPot(20, new Cas(4, 6), false),
            new Tretja.SluzbenaPot(30, new Cas(4, 6), true),
            new Tretja.SluzbenaPot(10, new Cas(4, 9), false),
            new Tretja.Rekreacija(48, new Cas(4, 10), true),
            new Tretja.Rekreacija(11, new Cas(4, 14), true),
            new Tretja.Rekreacija(11, new Cas(4, 18), false),
            new Tretja.SluzbenaPot(39, new Cas(4, 19), true),
            new Tretja.SluzbenaPot(28, new Cas(4, 27), true),
            new Tretja.SluzbenaPot(20, new Cas(4, 27), true),
            new Tretja.Rekreacija(10, new Cas(4, 29), true),
            new Tretja.SluzbenaPot(14, new Cas(4, 34), false),
            new Tretja.Rekreacija(40, new Cas(4, 39), true),
            new Tretja.SluzbenaPot(38, new Cas(4, 46), true),
            new Tretja.Rekreacija(42, new Cas(4, 55), false),
            new Tretja.SluzbenaPot(20, new Cas(5, 0), false),
            new Tretja.Rekreacija(16, new Cas(5, 5), false),
            new Tretja.Malica(29, new Cas(5, 6), false),
            new Tretja.Malica(42, new Cas(5, 8), true),
            new Tretja.Malica(25, new Cas(5, 13), true),
            new Tretja.SluzbenaPot(43, new Cas(5, 14), false),
            new Tretja.Rekreacija(43, new Cas(5, 21), true),
            new Tretja.Rekreacija(29, new Cas(5, 24), true),
            new Tretja.SluzbenaPot(6, new Cas(5, 25), false),
            new Tretja.SluzbenaPot(30, new Cas(5, 31), false),
            new Tretja.Rekreacija(14, new Cas(5, 33), true),
            new Tretja.Malica(36, new Cas(5, 40), false),
            new Tretja.SluzbenaPot(41, new Cas(5, 41), false),
            new Tretja.Rekreacija(40, new Cas(5, 47), false),
            new Tretja.Rekreacija(7, new Cas(5, 49), true),
            new Tretja.Malica(37, new Cas(5, 50), false),
            new Tretja.Malica(11, new Cas(5, 55), true),
            new Tretja.Rekreacija(21, new Cas(5, 55), false),
            new Tretja.Malica(40, new Cas(5, 59), true),
            new Tretja.SluzbenaPot(39, new Cas(6, 1), false),
            new Tretja.Rekreacija(31, new Cas(6, 2), false),
            new Tretja.Malica(46, new Cas(6, 6), false),
            new Tretja.Malica(39, new Cas(6, 14), true),
            new Tretja.Rekreacija(24, new Cas(6, 15), false),
            new Tretja.SluzbenaPot(33, new Cas(6, 17), false),
            new Tretja.Rekreacija(31, new Cas(6, 24), true),
            new Tretja.SluzbenaPot(24, new Cas(6, 24), true),
            new Tretja.SluzbenaPot(33, new Cas(6, 25), true),
            new Tretja.SluzbenaPot(33, new Cas(6, 27), false),
            new Tretja.SluzbenaPot(37, new Cas(6, 31), true),
            new Tretja.SluzbenaPot(6, new Cas(6, 39), true),
            new Tretja.Rekreacija(1, new Cas(6, 46), false),
            new Tretja.Malica(41, new Cas(6, 48), true),
            new Tretja.SluzbenaPot(33, new Cas(6, 49), true),
            new Tretja.Rekreacija(21, new Cas(6, 50), true),
            new Tretja.Rekreacija(12, new Cas(6, 50), false),
            new Tretja.Rekreacija(48, new Cas(6, 53), false),
            new Tretja.Rekreacija(47, new Cas(6, 54), false),
            new Tretja.SluzbenaPot(16, new Cas(6, 54), true),
            new Tretja.Rekreacija(0, new Cas(6, 55), false),
            new Tretja.Malica(41, new Cas(6, 55), false),
            new Tretja.Rekreacija(8, new Cas(7, 3), false),
            new Tretja.SluzbenaPot(30, new Cas(7, 3), true),
            new Tretja.SluzbenaPot(0, new Cas(7, 15), true),
            new Tretja.Rekreacija(41, new Cas(7, 19), true),
            new Tretja.Rekreacija(46, new Cas(7, 28), true),
            new Tretja.SluzbenaPot(8, new Cas(7, 41), true),
            new Tretja.Malica(11, new Cas(7, 46), false),
            new Tretja.Rekreacija(10, new Cas(7, 46), false),
            new Tretja.Rekreacija(20, new Cas(7, 51), true),
            new Tretja.SluzbenaPot(47, new Cas(7, 51), true),
            new Tretja.Rekreacija(36, new Cas(7, 53), true),
            new Tretja.Malica(10, new Cas(7, 54), true),
            new Tretja.Rekreacija(41, new Cas(8, 11), false),
            new Tretja.SluzbenaPot(16, new Cas(8, 16), false),
            new Tretja.SluzbenaPot(15, new Cas(8, 21), false),
            new Tretja.Malica(40, new Cas(8, 23), false),
            new Tretja.SluzbenaPot(2, new Cas(8, 32), false),
            new Tretja.Malica(18, new Cas(8, 41), false),
            new Tretja.Rekreacija(48, new Cas(8, 47), true),
            new Tretja.Malica(10, new Cas(8, 47), false),
            new Tretja.SluzbenaPot(2, new Cas(8, 47), true),
            new Tretja.Rekreacija(11, new Cas(8, 55), true),
            new Tretja.Rekreacija(15, new Cas(9, 2), true),
            new Tretja.Rekreacija(12, new Cas(9, 16), true),
            new Tretja.Malica(1, new Cas(9, 19), true),
            new Tretja.Rekreacija(18, new Cas(9, 23), true),
            new Tretja.SluzbenaPot(24, new Cas(9, 24), false),
            new Tretja.Rekreacija(35, new Cas(9, 28), false),
            new Tretja.SluzbenaPot(33, new Cas(9, 30), false),
            new Tretja.SluzbenaPot(33, new Cas(9, 31), true),
            new Tretja.Rekreacija(3, new Cas(9, 34), false),
            new Tretja.SluzbenaPot(35, new Cas(9, 35), true),
            new Tretja.Rekreacija(13, new Cas(9, 47), false),
            new Tretja.SluzbenaPot(3, new Cas(9, 48), true),
            new Tretja.Rekreacija(48, new Cas(9, 48), false),
            new Tretja.SluzbenaPot(8, new Cas(9, 58), false),
            new Tretja.SluzbenaPot(47, new Cas(9, 59), false),
            new Tretja.Rekreacija(8, new Cas(10, 1), true),
            new Tretja.Rekreacija(41, new Cas(10, 5), true),
            new Tretja.SluzbenaPot(44, new Cas(10, 8), false),
            new Tretja.Rekreacija(18, new Cas(10, 13), false),
            new Tretja.Rekreacija(11, new Cas(10, 22), false),
            new Tretja.Rekreacija(47, new Cas(10, 25), true),
            new Tretja.Rekreacija(15, new Cas(10, 26), false),
            new Tretja.SluzbenaPot(4, new Cas(10, 26), false),
            new Tretja.Rekreacija(40, new Cas(10, 42), true),
            new Tretja.SluzbenaPot(44, new Cas(10, 45), true),
            new Tretja.Rekreacija(20, new Cas(10, 49), false),
            new Tretja.SluzbenaPot(0, new Cas(10, 53), false),
            new Tretja.Rekreacija(16, new Cas(10, 55), true),
            new Tretja.Rekreacija(46, new Cas(11, 5), false),
            new Tretja.Rekreacija(10, new Cas(11, 8), true),
            new Tretja.Rekreacija(18, new Cas(11, 9), true),
            new Tretja.Rekreacija(46, new Cas(11, 12), true),
            new Tretja.SluzbenaPot(35, new Cas(11, 13), false),
            new Tretja.SluzbenaPot(0, new Cas(11, 14), true),
            new Tretja.Malica(48, new Cas(11, 18), true),
            new Tretja.Rekreacija(46, new Cas(11, 36), false),
            new Tretja.SluzbenaPot(0, new Cas(11, 38), false),
            new Tretja.Malica(15, new Cas(11, 40), true),
            new Tretja.Rekreacija(4, new Cas(11, 45), true),
            new Tretja.Malica(24, new Cas(11, 50), true),
            new Tretja.Malica(35, new Cas(11, 53), true),
            new Tretja.Rekreacija(10, new Cas(12, 11), false),
            new Tretja.SluzbenaPot(0, new Cas(12, 15), true),
            new Tretja.Rekreacija(13, new Cas(12, 16), true),
            new Tretja.Rekreacija(4, new Cas(12, 17), false),
            new Tretja.Malica(20, new Cas(12, 18), true),
            new Tretja.SluzbenaPot(2, new Cas(12, 20), false),
            new Tretja.SluzbenaPot(44, new Cas(12, 27), false),
            new Tretja.Rekreacija(2, new Cas(12, 31), true),
            new Tretja.Malica(44, new Cas(12, 39), true),
            new Tretja.SluzbenaPot(11, new Cas(12, 42), true),
            new Tretja.Malica(1, new Cas(12, 46), false),
            new Tretja.Rekreacija(47, new Cas(12, 57), false),
            new Tretja.SluzbenaPot(3, new Cas(12, 58), false),
            new Tretja.SluzbenaPot(47, new Cas(13, 1), true),
            new Tretja.Malica(44, new Cas(13, 2), false),
            new Tretja.SluzbenaPot(46, new Cas(13, 3), true),
            new Tretja.Rekreacija(4, new Cas(13, 9), true),
            new Tretja.SluzbenaPot(10, new Cas(13, 13), true),
            new Tretja.SluzbenaPot(47, new Cas(13, 31), false),
            new Tretja.Rekreacija(3, new Cas(13, 36), true),
            new Tretja.SluzbenaPot(47, new Cas(13, 47), true),
            new Tretja.SluzbenaPot(1, new Cas(13, 49), true),
            new Tretja.Rekreacija(3, new Cas(13, 51), false),
            new Tretja.SluzbenaPot(0, new Cas(14, 3), false),
            new Tretja.SluzbenaPot(3, new Cas(14, 11), true),
            new Tretja.SluzbenaPot(38, new Cas(14, 12), false),
            new Tretja.Rekreacija(26, new Cas(14, 26), false),
            new Tretja.Rekreacija(44, new Cas(14, 31), true),
            new Tretja.Rekreacija(44, new Cas(14, 32), false),
            new Tretja.Malica(9, new Cas(14, 37), false),
            new Tretja.SluzbenaPot(26, new Cas(14, 38), true),
            new Tretja.SluzbenaPot(37, new Cas(14, 41), false),
            new Tretja.SluzbenaPot(44, new Cas(14, 42), true),
            new Tretja.SluzbenaPot(1, new Cas(14, 43), false),
            new Tretja.SluzbenaPot(1, new Cas(14, 45), true),
            new Tretja.SluzbenaPot(37, new Cas(14, 48), true),
            new Tretja.Malica(0, new Cas(14, 56), true),
            new Tretja.Rekreacija(13, new Cas(14, 56), false),
            new Tretja.Malica(22, new Cas(15, 4), false),
            new Tretja.SluzbenaPot(33, new Cas(15, 7), false),
            new Tretja.SluzbenaPot(9, new Cas(15, 9), true),
            new Tretja.SluzbenaPot(28, new Cas(15, 12), false),
            new Tretja.Malica(38, new Cas(15, 14), true),
            new Tretja.SluzbenaPot(34, new Cas(15, 16), false),
            new Tretja.Rekreacija(28, new Cas(15, 17), true),
            new Tretja.Malica(0, new Cas(15, 25), false),
            new Tretja.Rekreacija(31, new Cas(15, 25), false),
            new Tretja.SluzbenaPot(1, new Cas(15, 25), false),
            new Tretja.SluzbenaPot(1, new Cas(15, 32), true),
            new Tretja.SluzbenaPot(22, new Cas(15, 33), true),
            new Tretja.SluzbenaPot(0, new Cas(15, 39), true),
            new Tretja.Rekreacija(33, new Cas(15, 45), true),
            new Tretja.Rekreacija(27, new Cas(15, 48), false),
            new Tretja.Rekreacija(4, new Cas(15, 50), false),
            new Tretja.Rekreacija(4, new Cas(15, 53), true),
            new Tretja.Rekreacija(7, new Cas(15, 57), false),
            new Tretja.SluzbenaPot(0, new Cas(16, 4), false),
            new Tretja.SluzbenaPot(44, new Cas(16, 5), false),
            new Tretja.Rekreacija(7, new Cas(16, 5), true),
            new Tretja.SluzbenaPot(26, new Cas(16, 14), false),
            new Tretja.SluzbenaPot(22, new Cas(16, 15), false),
            new Tretja.SluzbenaPot(13, new Cas(16, 23), true),
            new Tretja.SluzbenaPot(44, new Cas(16, 25), true),
            new Tretja.Rekreacija(33, new Cas(16, 25), false),
            new Tretja.Rekreacija(34, new Cas(16, 29), true),
            new Tretja.SluzbenaPot(1, new Cas(16, 40), false),
            new Tretja.SluzbenaPot(37, new Cas(16, 43), false),
            new Tretja.Rekreacija(37, new Cas(16, 52), true),
            new Tretja.SluzbenaPot(31, new Cas(16, 55), true),
            new Tretja.Rekreacija(5, new Cas(16, 58), false),
            new Tretja.Rekreacija(33, new Cas(16, 59), true),
            new Tretja.SluzbenaPot(1, new Cas(17, 2), true),
            new Tretja.Malica(48, new Cas(17, 14), false),
            new Tretja.SluzbenaPot(44, new Cas(17, 14), false),
            new Tretja.SluzbenaPot(10, new Cas(17, 19), false),
            new Tretja.Rekreacija(4, new Cas(17, 23), false),
            new Tretja.Rekreacija(21, new Cas(17, 25), false),
            new Tretja.Rekreacija(28, new Cas(17, 25), false),
            new Tretja.Rekreacija(27, new Cas(17, 33), true),
            new Tretja.SluzbenaPot(9, new Cas(17, 39), false),
            new Tretja.SluzbenaPot(9, new Cas(17, 41), true),
            new Tretja.Rekreacija(44, new Cas(17, 44), true),
            new Tretja.Rekreacija(7, new Cas(17, 49), false),
            new Tretja.Malica(35, new Cas(17, 51), false),
            new Tretja.SluzbenaPot(5, new Cas(17, 52), true),
            new Tretja.SluzbenaPot(5, new Cas(17, 54), false),
            new Tretja.Rekreacija(21, new Cas(17, 58), true),
            new Tretja.Malica(28, new Cas(17, 58), true),
            new Tretja.SluzbenaPot(17, new Cas(17, 59), false),
            new Tretja.Malica(26, new Cas(18, 6), true),
            new Tretja.SluzbenaPot(10, new Cas(18, 7), true),
            new Tretja.Rekreacija(5, new Cas(18, 9), true),
            new Tretja.Malica(4, new Cas(18, 11), true),
            new Tretja.SluzbenaPot(48, new Cas(18, 11), true),
            new Tretja.Rekreacija(43, new Cas(18, 12), false),
            new Tretja.SluzbenaPot(22, new Cas(18, 13), true),
            new Tretja.SluzbenaPot(43, new Cas(18, 14), true),
            new Tretja.SluzbenaPot(47, new Cas(18, 18), false),
            new Tretja.Rekreacija(34, new Cas(18, 20), false),
            new Tretja.Rekreacija(19, new Cas(18, 20), false),
            new Tretja.SluzbenaPot(0, new Cas(18, 23), true),
            new Tretja.Rekreacija(33, new Cas(18, 30), false),
            new Tretja.Rekreacija(8, new Cas(18, 34), false),
            new Tretja.Rekreacija(35, new Cas(18, 34), true),
            new Tretja.Rekreacija(16, new Cas(18, 42), false),
            new Tretja.SluzbenaPot(32, new Cas(18, 43), false),
            new Tretja.Malica(8, new Cas(18, 47), true),
            new Tretja.SluzbenaPot(9, new Cas(18, 50), false),
            new Tretja.Malica(47, new Cas(18, 51), true),
            new Tretja.Rekreacija(14, new Cas(18, 53), false),
            new Tretja.SluzbenaPot(13, new Cas(18, 53), false),
            new Tretja.SluzbenaPot(9, new Cas(18, 59), true),
            new Tretja.Rekreacija(7, new Cas(19, 1), true),
            new Tretja.Rekreacija(44, new Cas(19, 7), false),
            new Tretja.Malica(19, new Cas(19, 15), true),
            new Tretja.SluzbenaPot(0, new Cas(19, 15), false),
            new Tretja.Rekreacija(0, new Cas(19, 16), true),
            new Tretja.Rekreacija(36, new Cas(19, 19), false),
            new Tretja.Rekreacija(12, new Cas(19, 20), false),
            new Tretja.SluzbenaPot(1, new Cas(19, 23), false),
            new Tretja.Malica(24, new Cas(19, 29), false),
            new Tretja.Rekreacija(2, new Cas(19, 30), false),
            new Tretja.Malica(47, new Cas(19, 36), false),
            new Tretja.SluzbenaPot(36, new Cas(19, 38), true),
            new Tretja.SluzbenaPot(24, new Cas(19, 39), true),
            new Tretja.Rekreacija(41, new Cas(19, 43), false),
            new Tretja.SluzbenaPot(17, new Cas(19, 44), true),
            new Tretja.SluzbenaPot(6, new Cas(19, 46), false),
            new Tretja.SluzbenaPot(34, new Cas(19, 53), true),
            new Tretja.Rekreacija(5, new Cas(20, 2), false),
            new Tretja.SluzbenaPot(31, new Cas(20, 3), false),
            new Tretja.Rekreacija(18, new Cas(20, 4), false),
            new Tretja.SluzbenaPot(46, new Cas(20, 13), false),
            new Tretja.SluzbenaPot(34, new Cas(20, 15), false),
            new Tretja.Malica(26, new Cas(20, 15), false),
            new Tretja.Rekreacija(29, new Cas(20, 18), false),
            new Tretja.Rekreacija(35, new Cas(20, 18), false),
            new Tretja.SluzbenaPot(3, new Cas(20, 19), false),
            new Tretja.Malica(19, new Cas(20, 23), false),
            new Tretja.Malica(28, new Cas(20, 23), false),
            new Tretja.SluzbenaPot(48, new Cas(20, 25), false),
            new Tretja.Malica(39, new Cas(20, 35), false),
            new Tretja.SluzbenaPot(35, new Cas(20, 43), true),
            new Tretja.SluzbenaPot(17, new Cas(20, 44), false),
            new Tretja.Malica(5, new Cas(20, 46), true),
            new Tretja.Rekreacija(14, new Cas(20, 46), true),
            new Tretja.Malica(5, new Cas(20, 58), false),
            new Tretja.Malica(25, new Cas(21, 6), false),
            new Tretja.SluzbenaPot(36, new Cas(21, 8), false),
            new Tretja.Rekreacija(21, new Cas(21, 8), false),
            new Tretja.Rekreacija(41, new Cas(21, 15), true),
            new Tretja.Rekreacija(37, new Cas(21, 18), false),
            new Tretja.Malica(38, new Cas(21, 28), false),
            new Tretja.SluzbenaPot(35, new Cas(21, 28), false),
            new Tretja.SluzbenaPot(49, new Cas(21, 36), false),
            new Tretja.SluzbenaPot(47, new Cas(21, 38), true),
            new Tretja.SluzbenaPot(30, new Cas(21, 42), false),
            new Tretja.Rekreacija(41, new Cas(21, 49), false),
            new Tretja.Rekreacija(0, new Cas(21, 52), false),
            new Tretja.Rekreacija(40, new Cas(21, 52), false),
            new Tretja.Rekreacija(39, new Cas(21, 58), true),
            new Tretja.Malica(42, new Cas(22, 0), false),
            new Tretja.Malica(8, new Cas(22, 0), false),
            new Tretja.Malica(45, new Cas(22, 0), false),
            new Tretja.SluzbenaPot(11, new Cas(22, 2), false),
            new Tretja.SluzbenaPot(43, new Cas(22, 6), false),
            new Tretja.SluzbenaPot(47, new Cas(22, 6), false),
            new Tretja.Malica(15, new Cas(22, 9), false),
            new Tretja.Rekreacija(27, new Cas(22, 22), false),
            new Tretja.Rekreacija(39, new Cas(22, 32), false),
            new Tretja.SluzbenaPot(24, new Cas(22, 50), false),
            new Tretja.Rekreacija(7, new Cas(23, 1), false),
            new Tretja.SluzbenaPot(10, new Cas(23, 4), false),
            new Tretja.Malica(4, new Cas(23, 11), false),
            new Tretja.Rekreacija(14, new Cas(23, 16), false),
            new Tretja.SluzbenaPot(22, new Cas(23, 30), false),
            new Tretja.Malica(20, new Cas(23, 46), false),
            new Tretja.Malica(23, new Cas(23, 52), false),
            new Tretja.SluzbenaPot(37, new Cas(23, 52), true),
            new Tretja.SluzbenaPot(37, new Cas(23, 55), false),
            new Tretja.SluzbenaPot(9, new Cas(23, 59), false),
        };

        int stZaposlenih = 50;
        Tretja.Dnevnik dnevnik = new Tretja.Dnevnik(stZaposlenih, dogodki);

        for (int i = 0; i < stZaposlenih; i++) {
            System.out.printf("%d -> %d%n", i, dnevnik.kolikoRekreacije(i));
        }
        System.out.println();
    }
}
