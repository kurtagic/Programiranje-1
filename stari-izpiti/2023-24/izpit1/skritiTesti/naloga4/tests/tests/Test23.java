
import java.util.*;

public class Test23 {

    public static void main(String[] args) {
        List<Integer> la = List.of(2, 6, 10, 34, 41, 43, 45, 49, 52, 63, 75, 96, 100, 113, 122, 125, 131, 138, 141, 145, 149, 153, 163, 168, 174, 182, 187, 190, 194, 205, 219, 224, 226, 236, 242, 248, 256, 259, 261, 270, 274, 291, 302, 308, 313, 316, 333, 337, 341, 345, 352, 357, 361, 366, 373, 385, 387, 390, 399, 407, 413, 420, 429, 433, 441, 447, 457, 460, 466, 470, 476, 478, 482, 490, 492, 501, 506, 521, 531, 534, 539, 545, 551, 561, 568, 583, 585, 594, 613, 621, 626, 636, 650, 653, 658, 664, 666, 671, 674, 690, 704, 709, 711, 722, 725, 731, 737, 746, 751, 757, 760, 773, 777, 796, 804, 808, 821, 833, 840, 851, 853, 856, 862, 869, 873, 875, 881, 886, 893, 902, 911, 913, 919, 925, 933, 940, 945, 955, 960, 974, 985, 997);
        List<Integer> lb = List.of(3, 7, 24, 39, 42, 44, 47, 51, 58, 73, 79, 98, 110, 119, 123, 129, 136, 139, 142, 147, 151, 157, 166, 172, 178, 186, 189, 192, 197, 217, 220, 225, 234, 239, 246, 254, 258, 260, 265, 273, 290, 297, 304, 311, 314, 322, 334, 338, 343, 346, 356, 358, 363, 372, 379, 386, 389, 398, 401, 408, 419, 427, 430, 440, 446, 451, 459, 463, 467, 475, 477, 479, 486, 491, 500, 503, 519, 528, 533, 536, 540, 546, 558, 564, 579, 584, 587, 596, 619, 622, 634, 646, 652, 657, 660, 665, 667, 673, 678, 698, 708, 710, 719, 723, 728, 734, 739, 748, 755, 758, 771, 774, 783, 799, 805, 815, 825, 839, 842, 852, 854, 857, 868, 871, 874, 876, 885, 888, 894, 909, 912, 915, 924, 927, 934, 941, 947, 957, 965, 982, 995, 998);
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
