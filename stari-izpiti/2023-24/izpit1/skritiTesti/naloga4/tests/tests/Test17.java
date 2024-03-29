
import java.util.*;

public class Test17 {

    public static void main(String[] args) {
        List<Integer> la = List.of(4, 22, 23, 33, 37, 47, 50, 52, 53, 59, 69, 77, 78, 81, 92, 96, 97, 112, 115, 132, 133, 134, 140, 147, 152, 153, 159, 168, 172, 186, 191, 201, 210, 212, 224, 228, 232, 233, 265, 275, 277, 282, 289, 317, 319, 321, 338, 343, 358, 363, 375, 381, 386, 389, 390, 394, 399, 406, 409, 418, 436, 439, 440, 441, 446, 450, 461, 465, 468, 480, 481, 483, 486, 489, 490, 495, 499, 515, 517, 519, 523, 526, 527, 532, 539, 540);
        List<Integer> lb = List.of(549, 551, 574, 586, 591, 598, 606, 607, 610, 612, 615, 623, 627, 630, 642, 649, 650, 658, 671, 677, 678, 689, 692, 701, 703, 705, 709, 712, 728, 731, 732, 744, 755, 759, 760, 762, 766, 767, 770, 772, 773, 775, 776, 778, 787, 788, 789, 791, 794, 799, 803, 806, 808, 816, 820, 831, 837, 843, 845, 846, 851, 862, 870, 872, 875, 888, 899, 900, 908, 911, 913, 917, 925, 928, 930, 932, 950, 953, 955, 957, 963, 972, 982, 988, 993, 996);
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
