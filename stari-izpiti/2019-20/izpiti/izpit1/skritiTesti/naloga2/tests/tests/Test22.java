
public class Test22 {

    public static void main(String[] args) {
        int[][] t = {
            { 28, 56, 67, 69, 56, 53, 88, 31, 58, 87, 26, 92, 41, 65, 27, 47,  1, 83, 74, 47, 38,  9, 88, 63 },
            { 63, 14, 55, 31, 95, 32, 87, 96, 22, 72, 88,  6, 66, 49, 76, 55, 75, 79, 39, 29, 13, 70, 52, 67 },
            { 29, 67, 66, 37, 26, 22, 49, 11, 11, 27, 38, 98,  5, 97, 13, 93, 12, 34, 92, 23, 87, 51, 20, 83 },
            {  5, 63, 84, 57, 74, 16, 75, 67, 87, 92, 64, 61, 58, 55,  3, 52, 29, 54, 61, 25, 91, 14, 73, 56 },
            { 76,  6, 52, 97, 45, 32, 97, 39, 73, 29, 31, 58, 28, 87, 66, 30, 46, 98,  2, 83, 99, 86, 15, 22 },
            { 48, 97, 36, 74, 23, 76, 41, 85, 37, 12, 52, 78, 71, 65, 92, 58, 53, 48, 49, 83, 37,  6, 34, 27 },
            { 26, 30, 19, 12, 76, 17, 59, 75, 38, 94, 35, 15, 34, 23, 14,  6, 42, 83, 34, 89, 27, 41, 80,  8 },
            { 59, 11, 76, 26, 51, 36, 40, 17, 31, 35, 17, 56, 64, 60, 23,  3, 31, 86, 11, 10, 13, 98, 68, 80 },
            { 16, 32, 79, 34, 67, 64, 47, 85, 90,  4, 42, 91, 38, 76, 78, 52, 22, 53, 42, 74, 77, 88, 23, 78 },
        };

        for (int krog = 0;  krog < 24;  krog++) {
            System.out.println(Druga.najCas(t, krog));
        }
    }
}
