
public class Test22 {

    public static void main(String[] args) {
        int[] h = {679, 791, 921, 376, 512, 535, 752, 611, 862, 28, 282, 797, 952, 74, 84, 611, 450, 436, 646, 397, 892, 701, 657, 508, 496, 173, 473, 271, 525, 408, 270, 999, 224, 763, 940, 589, 782, 544, 491, 454, 490, 108, 248, 391, 950, 970, 368, 344, 707, 532, 22, 904, 373, 987, 825, 307, 769, 528, 963, 486, 681, 69, 917, 321, 92, 453, 227, 930, 510, 667, 538, 508, 938, 828, 419, 919, 923, 520, 688, 773, 358, 873, 494, 545, 276, 50, 511, 760, 405, 902, 506, 386, 263, 488};
        int[] w = {329, 670, 101, 113, 272, 982, 526, 957, 450, 73, 245, 770, 180, 816, 104, 526, 186, 425, 619, 735, 42, 393, 324, 871, 236, 638, 296, 368, 234, 713, 414, 483, 164, 138, 490, 241, 874, 399, 776, 844, 193, 551, 479, 362, 998, 78, 198, 717, 198, 962, 767, 624, 98, 960, 713, 686, 438, 109, 927, 884, 680, 541, 129, 674, 634, 222, 635, 958, 237, 787, 914, 825, 712, 406, 453, 557, 443, 998, 60, 645, 747, 251, 477, 979, 787, 959, 869, 413, 965, 854, 36, 105, 802, 382, 815, 334, 703, 42, 289, 958, 122, 773, 153, 723, 725, 589, 389, 259, 619, 127, 554, 279, 748, 694, 574, 120, 914, 669, 256, 979, 214, 635, 8, 733, 127, 95, 125, 674, 619, 79, 371, 799, 730, 610, 435, 360, 196, 915, 108, 895, 736, 875, 721, 95, 279, 323, 174};
        int[] a = {868, 634, 315, 629, 3, 88, 861, 266, 896, 563, 297, 412, 171, 846, 534, 741, 74, 81, 781, 993, 47, 538, 715, 294, 179, 78, 122, 425, 673, 42, 491, 297, 665, 824, 180, 275, 956, 851, 866, 209, 938, 702, 997, 202, 41, 902, 562, 834, 275, 971, 700, 106, 623, 723, 811, 508, 236, 449, 425, 411, 316, 974, 574, 309, 776, 155, 470, 622, 214, 547, 689, 339, 697, 63, 431, 65, 876, 910, 323, 645, 362, 303, 996, 35, 466, 322, 545, 165, 627, 306, 528, 535, 774, 307, 217, 933, 742, 997, 126, 847, 899, 87, 395, 592, 678, 389, 846, 521, 462, 251, 928, 272, 123, 887, 172, 213, 724, 307, 759, 900, 951, 648, 830, 894, 156, 286, 473, 656, 333, 705, 767, 511, 612, 736, 425, 145, 880, 683, 835, 111, 191, 981, 585, 129, 958, 523, 931, 141, 778, 631, 109, 788, 325, 62, 579, 921, 447, 514, 373, 688, 699, 651, 643, 721, 71};
        int[] b = {868, 634, 315, 629, 3, 88, 861, 266, 896, 563, 297, 412, 171, 846, 534, 741, 74, 81, 781, 993, 47, 538, 715, 294, 179, 78, 122, 425, 673, 42, 491, 297, 665, 824, 180, 275, 956, 851, 866, 209, 938, 702, 997, 202, 41, 902, 562, 834, 275, 971, 700, 106, 623, 723, 811, 508, 236, 449, 425, 411, 316, 974, 574, 309, 776, 155, 470, 622, 214, 547, 689, 339, 697, 63, 431, 65, 876, 910, 323, 645, 362, 303, 996, 35, 466, 322, 545, 165, 627, 306, 528, 535, 774, 307, 217, 933, 742, 997, 126, 847, 899, 87, 395, 592, 678, 389, 846, 521, 462, 251, 928, 272, 123, 887, 172, 213, 724, 307, 759, 900, 951, 648, 830, 894, 156, 286, 473, 656, 333, 705, 767, 511, 612, 736, 425, 145, 880, 683, 835, 111, 191, 981, 585, 129, 958, 523, 931, 141, 778, 631, 109, 788, 325, 62, 579, 921, 447, 514, 373, 688, 699, 651, 643, 721, 71};
        System.out.println(Druga.steviloShranjenih(h, w, a, b));
    }
}