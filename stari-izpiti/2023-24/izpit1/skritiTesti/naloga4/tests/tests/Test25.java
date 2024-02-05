
import java.util.*;

public class Test25 {

    public static void main(String[] args) {
        List<Integer> la = List.of(0, 6, 11, 13, 17, 23, 26, 31, 34, 36, 39, 49, 51, 54, 61, 67, 72, 75, 83, 96, 101, 110, 115, 119, 121, 125, 128, 141, 144, 149, 152, 159, 163, 169, 171, 176, 185, 192, 196, 199, 202, 206, 208, 216, 220, 223, 228, 230, 245, 251, 253, 258, 264, 274, 278, 287, 298, 300, 302, 309, 312, 315, 321, 327, 331, 336, 341, 345, 350, 359, 363, 378, 380, 384, 386, 390, 394, 397, 400, 407, 410, 414, 419, 423, 427, 430, 433, 439, 441, 448, 452, 456, 461, 464, 475, 478, 481, 485, 488, 492, 496, 498, 501, 506, 511, 518, 523, 529, 536, 539, 542, 545, 553, 556, 564, 572, 575, 584, 588, 594, 597, 603, 609, 612, 620, 625, 631, 636, 639, 642, 647, 653, 658, 665, 667, 669, 672, 675, 680, 686, 692, 698, 702, 705, 708, 714, 716, 723, 729, 732, 736, 739, 741, 746, 752, 756, 762, 768, 773, 777, 783, 787, 793, 802, 811, 816, 820, 822, 832, 834, 836, 842, 844, 849, 859, 861, 870, 880, 885, 889, 891, 894, 898, 902, 908, 913, 915, 917, 925, 928, 935, 940, 943, 950, 953, 955, 958, 961, 967, 973, 982, 985, 987, 991, 995, 998);
        List<Integer> lb = List.of(2, 7, 12, 15, 20, 24, 30, 33, 35, 37, 47, 50, 52, 57, 62, 70, 73, 79, 95, 98, 108, 114, 116, 120, 123, 126, 139, 143, 147, 151, 153, 162, 165, 170, 172, 183, 187, 194, 198, 201, 205, 207, 211, 219, 221, 227, 229, 243, 250, 252, 257, 263, 267, 277, 280, 292, 299, 301, 308, 310, 313, 316, 322, 328, 335, 338, 342, 348, 355, 360, 375, 379, 382, 385, 389, 391, 396, 398, 401, 408, 412, 417, 422, 426, 429, 431, 435, 440, 442, 450, 455, 459, 463, 468, 477, 479, 484, 487, 491, 494, 497, 499, 504, 510, 515, 519, 528, 533, 538, 540, 543, 551, 555, 561, 567, 573, 576, 586, 590, 596, 600, 608, 611, 615, 621, 629, 632, 637, 641, 643, 650, 654, 659, 666, 668, 670, 674, 677, 682, 688, 693, 700, 703, 706, 713, 715, 718, 724, 730, 735, 737, 740, 744, 751, 754, 761, 766, 770, 775, 781, 785, 792, 799, 807, 812, 818, 821, 828, 833, 835, 839, 843, 845, 856, 860, 869, 871, 884, 886, 890, 892, 895, 901, 903, 909, 914, 916, 921, 927, 932, 936, 942, 947, 951, 954, 956, 959, 966, 971, 978, 983, 986, 989, 993, 996, 999);
        List<Integer> lc = it2list(Cetrta.zlitje(la.iterator(), lb.iterator()));
        System.out.println(lc);
    }

    private static <T> List<T> it2list(Iterator<T> it) {
        List<T> seznam = new ArrayList<>();
        while (it.hasNext()) {
            T element = it.next();
            seznam.add(element);
        }
        return seznam;
    }
}
