
import java.util.*;

public class Test43 {

    public static void main(String[] args) {
        List<Integer> la = List.of(0, 1, 3, 11, 12, 13, 15, 17, 21, 22, 23, 25, 27, 29, 30, 31, 33, 35, 38, 46, 47, 48, 51, 53, 57, 60, 65, 66, 68, 69, 71, 77, 79, 81, 83, 84, 85, 86, 87, 92, 96, 104, 105, 107, 112, 113, 115, 116, 121, 122, 124, 129, 132, 133, 135, 136, 139, 143, 144, 146, 150, 153, 154, 156, 158, 162, 163, 165, 167, 168, 171, 172, 173, 174, 175, 177, 178, 179, 180, 181, 182, 184, 185, 186, 190, 193, 194, 196, 204, 205, 207, 208, 209, 213, 215, 222, 223, 225, 228, 229, 232, 236, 237, 242, 243, 245, 247, 248, 249, 250, 252, 259, 263, 266, 267, 271, 272, 273, 274, 276, 282, 285, 287, 291, 292, 293, 295, 298, 299, 301, 304, 305, 306, 318, 322, 323, 324, 325, 327, 328, 330, 333, 337, 344, 348, 349, 350, 352, 353, 355, 356, 361, 362, 363, 366, 369, 370, 371, 372, 373, 376, 377, 381, 390, 391, 393, 394, 396, 397, 398, 399, 402, 405, 409, 411, 413, 415, 417, 421, 422, 423, 425, 426, 428, 429, 432, 440, 444, 448, 449, 451, 454, 459, 461, 462, 463, 464, 467, 470, 471, 474, 477, 481, 485, 489, 490, 492, 494, 495, 497, 500, 501, 503, 507, 509, 510, 511, 512, 514, 515, 516, 520, 522, 526, 527, 531, 533, 534, 538, 539, 542, 543, 544, 547, 548, 550, 553, 560, 561, 563, 567, 568, 569, 570, 576, 580, 593, 594, 595, 599, 603, 604, 607, 608, 609, 610, 613, 614, 620, 621, 623, 628, 632, 637, 639, 642, 650, 652, 659, 661, 662, 663, 665, 669, 670, 672, 674, 676, 680, 681, 682, 688, 689, 690, 691, 695, 696, 697, 701, 702, 707, 708, 710, 712, 716, 718, 719, 720, 721, 724, 728, 729, 737, 741, 742, 743, 748, 749, 750, 751, 754, 759, 760, 764, 765, 768, 770, 774, 775, 779, 782, 783, 788, 790, 792, 793, 796, 797, 799, 802, 804, 807, 808, 810, 822, 823, 825, 828, 831, 832, 835, 837, 838, 839, 842, 843, 845, 848, 850, 851, 853, 854, 856, 857, 861, 862, 863, 866, 868, 869, 870, 871, 876, 877, 878, 880, 886, 889, 890, 893, 895, 896, 899, 901, 903, 905, 908, 909, 910, 911, 912, 913, 914, 919, 920, 923, 925, 928, 931, 932, 933, 936, 939, 940, 941, 945, 951, 953, 954, 956, 957, 958, 960, 964, 969, 970, 971, 973, 975, 976, 981, 984, 986, 989, 990, 993, 994, 997);
        List<Integer> lb = List.of(0, 2, 6, 8, 9, 12, 17, 18, 19, 20, 22, 27, 29, 32, 33, 35, 38, 40, 44, 46, 47, 52, 53, 54, 57, 60, 66, 68, 70, 71, 76, 80, 89, 90, 92, 93, 112, 113, 114, 115, 117, 119, 130, 134, 143, 144, 146, 151, 160, 161, 164, 168, 172, 176, 181, 189, 190, 195, 200, 202, 203, 204, 209, 210, 213, 216, 220, 223, 227, 229, 230, 235, 240, 241, 242, 243, 250, 255, 261, 262, 264, 265, 267, 268, 274, 283, 288, 289, 290, 292, 295, 297, 298, 302, 310, 312, 313, 315, 316, 326, 329, 332, 335, 336, 344, 345, 346, 347, 349, 354, 360, 362, 369, 371, 374, 382, 384, 388, 389, 390, 392, 393, 394, 399, 400, 406, 415, 416, 419, 422, 425, 428, 430, 432, 437, 438, 439, 441, 442, 443, 445, 447, 448, 449, 450, 452, 454, 456, 464, 469, 470, 471, 475, 478, 486, 490, 492, 496, 502, 506, 507, 508, 510, 511, 512, 515, 521, 525, 526, 527, 531, 536, 537, 540, 547, 550, 551, 553, 557, 561, 564, 570, 571, 573, 581, 583, 584, 585, 588, 592, 593, 594, 600, 603, 606, 609, 610, 614, 615, 618, 619, 620, 621, 622, 623, 626, 627, 628, 630, 634, 639, 642, 644, 645, 651, 653, 655, 661, 662, 675, 678, 680, 689, 693, 694, 700, 701, 707, 710, 711, 712, 717, 725, 729, 733, 742, 743, 744, 746, 751, 752, 753, 757, 758, 760, 764, 774, 775, 776, 780, 788, 789, 793, 794, 796, 798, 801, 802, 807, 811, 812, 815, 821, 822, 823, 824, 827, 829, 831, 832, 841, 849, 854, 855, 857, 858, 862, 863, 865, 872, 875, 878, 879, 886, 887, 889, 891, 893, 895, 896, 897, 898, 900, 909, 911, 913, 914, 916, 917, 918, 919, 924, 925, 927, 928, 933, 936, 942, 949, 952, 956, 959, 962, 963, 964, 966, 967, 968, 973, 974, 975, 977, 980, 982, 986, 988, 989, 990, 992, 993, 995);
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
