
import java.util.*;

public class Test07 {

    public static void main(String[] args) {
        List<Cetrta.Lik> liki = new ArrayList<>(List.of(
            new Cetrta.Pravokotnik(new Cetrta.Barva(115, 112, 23), 2, 56),
            new Cetrta.Pravokotnik(new Cetrta.Barva(133, 55, 125), 83, 66),
            new Cetrta.Krog(new Cetrta.Barva(226, 47, 109), 80),
            new Cetrta.Kvadrat(new Cetrta.Barva(202, 241, 107), 98),
            new Cetrta.Pravokotnik(new Cetrta.Barva(10, 108, 43), 94, 55),
            new Cetrta.Kvadrat(new Cetrta.Barva(94, 184, 237), 17),
            new Cetrta.Krog(new Cetrta.Barva(236, 214, 43), 59),
            new Cetrta.Pravokotnik(new Cetrta.Barva(15, 156, 252), 18, 20),
            new Cetrta.Krog(new Cetrta.Barva(67, 86, 20), 30),
            new Cetrta.Kvadrat(new Cetrta.Barva(161, 8, 188), 30),
            new Cetrta.Kvadrat(new Cetrta.Barva(107, 145, 201), 37),
            new Cetrta.Krog(new Cetrta.Barva(116, 197, 122), 88),
            new Cetrta.Krog(new Cetrta.Barva(192, 200, 133), 93),
            new Cetrta.Kvadrat(new Cetrta.Barva(51, 130, 139), 81),
            new Cetrta.Pravokotnik(new Cetrta.Barva(38, 14, 223), 43, 38),
            new Cetrta.Pravokotnik(new Cetrta.Barva(146, 42, 54), 59, 17),
            new Cetrta.Kvadrat(new Cetrta.Barva(78, 153, 188), 78),
            new Cetrta.Krog(new Cetrta.Barva(221, 67, 20), 76),
            new Cetrta.Pravokotnik(new Cetrta.Barva(213, 66, 249), 39, 97),
            new Cetrta.Krog(new Cetrta.Barva(214, 117, 97), 75),
            new Cetrta.Krog(new Cetrta.Barva(251, 102, 217), 36),
            new Cetrta.Krog(new Cetrta.Barva(77, 39, 142), 47),
            new Cetrta.Kvadrat(new Cetrta.Barva(116, 132, 36), 31),
            new Cetrta.Kvadrat(new Cetrta.Barva(212, 46, 95), 62),
            new Cetrta.Kvadrat(new Cetrta.Barva(71, 208, 12), 66),
            new Cetrta.Kvadrat(new Cetrta.Barva(120, 163, 112), 25),
            new Cetrta.Krog(new Cetrta.Barva(122, 56, 53), 66),
            new Cetrta.Krog(new Cetrta.Barva(231, 123, 29), 8),
            new Cetrta.Pravokotnik(new Cetrta.Barva(66, 245, 227), 42, 34),
            new Cetrta.Kvadrat(new Cetrta.Barva(72, 9, 102), 52),
            new Cetrta.Krog(new Cetrta.Barva(206, 28, 78), 13),
            new Cetrta.Pravokotnik(new Cetrta.Barva(25, 22, 140), 62, 60),
            new Cetrta.Pravokotnik(new Cetrta.Barva(117, 120, 147), 39, 59),
            new Cetrta.Pravokotnik(new Cetrta.Barva(50, 0, 13), 75, 1),
            new Cetrta.Kvadrat(new Cetrta.Barva(211, 115, 85), 76),
            new Cetrta.Kvadrat(new Cetrta.Barva(120, 54, 167), 4),
            new Cetrta.Kvadrat(new Cetrta.Barva(76, 196, 244), 49),
            new Cetrta.Pravokotnik(new Cetrta.Barva(48, 2, 9), 49, 40),
            new Cetrta.Kvadrat(new Cetrta.Barva(61, 101, 148), 91),
            new Cetrta.Kvadrat(new Cetrta.Barva(87, 12, 172), 36),
            new Cetrta.Krog(new Cetrta.Barva(156, 113, 9), 22),
            new Cetrta.Krog(new Cetrta.Barva(78, 130, 47), 24),
            new Cetrta.Kvadrat(new Cetrta.Barva(47, 180, 3), 18),
            new Cetrta.Kvadrat(new Cetrta.Barva(247, 134, 201), 35),
            new Cetrta.Kvadrat(new Cetrta.Barva(26, 74, 160), 26),
            new Cetrta.Kvadrat(new Cetrta.Barva(124, 116, 209), 45),
            new Cetrta.Kvadrat(new Cetrta.Barva(217, 42, 214), 63),
            new Cetrta.Pravokotnik(new Cetrta.Barva(40, 116, 88), 23, 58),
            new Cetrta.Krog(new Cetrta.Barva(34, 156, 186), 87),
            new Cetrta.Krog(new Cetrta.Barva(96, 53, 88), 7),
            new Cetrta.Kvadrat(new Cetrta.Barva(113, 212, 130), 10),
            new Cetrta.Pravokotnik(new Cetrta.Barva(215, 64, 113), 97, 72),
            new Cetrta.Krog(new Cetrta.Barva(57, 54, 33), 19),
            new Cetrta.Krog(new Cetrta.Barva(111, 195, 80), 39),
            new Cetrta.Krog(new Cetrta.Barva(108, 247, 105), 10),
            new Cetrta.Pravokotnik(new Cetrta.Barva(86, 189, 71), 84, 10),
            new Cetrta.Kvadrat(new Cetrta.Barva(3, 179, 4), 79),
            new Cetrta.Krog(new Cetrta.Barva(43, 97, 54), 82),
            new Cetrta.Pravokotnik(new Cetrta.Barva(19, 69, 24), 31, 25),
            new Cetrta.Kvadrat(new Cetrta.Barva(30, 199, 38), 13),
            new Cetrta.Pravokotnik(new Cetrta.Barva(35, 67, 233), 7, 94),
            new Cetrta.Kvadrat(new Cetrta.Barva(50, 43, 203), 43),
            new Cetrta.Krog(new Cetrta.Barva(83, 74, 220), 96),
            new Cetrta.Pravokotnik(new Cetrta.Barva(111, 178, 129), 89, 48),
            new Cetrta.Krog(new Cetrta.Barva(151, 225, 5), 48),
            new Cetrta.Krog(new Cetrta.Barva(25, 17, 141), 2),
            new Cetrta.Pravokotnik(new Cetrta.Barva(49, 101, 93), 2, 33),
            new Cetrta.Krog(new Cetrta.Barva(161, 236, 150), 95),
            new Cetrta.Kvadrat(new Cetrta.Barva(25, 18, 17), 3),
            new Cetrta.Pravokotnik(new Cetrta.Barva(236, 202, 205), 66, 95),
            new Cetrta.Krog(new Cetrta.Barva(136, 188, 184), 3),
            new Cetrta.Kvadrat(new Cetrta.Barva(139, 179, 41), 2),
            new Cetrta.Kvadrat(new Cetrta.Barva(81, 176, 228), 60),
            new Cetrta.Krog(new Cetrta.Barva(217, 66, 81), 28),
            new Cetrta.Pravokotnik(new Cetrta.Barva(244, 105, 132), 62, 87),
            new Cetrta.Krog(new Cetrta.Barva(173, 99, 40), 67),
            new Cetrta.Pravokotnik(new Cetrta.Barva(135, 176, 151), 77, 23),
            new Cetrta.Krog(new Cetrta.Barva(109, 216, 93), 55)
        ));

        Cetrta.urediNaravno(liki);
        for (Cetrta.Lik lik: liki) {
            System.out.println(lik);
        }
    }
}
