
public class Test11 {

    public static void main(String[] args) {
        char[][] krizanka0 = {
            {'a', 'k', 'd', 'e', 's', 'h', 'e', 'h', 'o', 'i', 'c', 'y', 'i', 'b', 't', 'k', 'w', 'b', 'q', 'z'},
            {'y', 'c', 'e', 't', 'z', 'm', 'n', 's', 'y', 'v', '-', 'a', 'a', 'd', 'h', 'e', 't', 'i', 'a', 't'},
            {'i', 'k', 'j', '-', 'c', 'u', 'k', 'a', 'a', 'j', 'b', 'o', 'm', 'g', 'b', 'y', 'f', '-', '-', 's'},
            {'f', 'l', 'j', 'n', 's', 'j', 'm', 'v', 't', 'h', 'z', 't', 'j', 'i', 'u', 'g', 'u', 'h', 'c', '-'},
            {'o', 'n', 'x', 'm', 'h', 'z', 'y', 'd', 'g', 'k', 'l', 'd', 'q', 'k', 'p', 'k', 'z', 'k', 's', '-'},
            {'z', 'g', 'd', 'b', 'w', 'z', 'd', 'q', 'r', 'w', 'j', 'w', 'c', 'j', 'i', 'w', 'i', 'f', 'u', 'v'},
            {'k', 'z', 'j', 'g', 'g', 's', 'b', 'k', 'c', 'u', 'h', 'r', 'g', 'h', 'a', 't', 'q', 'y', 'f', 'p'},
            {'d', 'l', 'f', '-', 's', 'g', 'w', 'i', 'x', 'b', 'n', 'f', 'y', 'z', 'm', 'k', 'f', 'v', 'g', 'e'},
            {'f', 'o', 'w', 't', 'f', 'o', 'b', 'j', 'o', 'i', 't', 'p', '-', 'u', 's', 'v', 's', 'u', 'j', 'j'},
            {'-', 'q', 'n', 'g', 'd', 'p', 'k', 'l', 'j', 'u', 'q', 'j', 'u', 'z', 'e', 'c', 'j', 't', 'y', 'q'},
            {'x', 'r', 'l', 'b', 'z', 'r', 'b', 'p', 's', 'u', 't', 'i', 'q', 'y', 'k', 'w', '-', 'd', 'a', '-'},
            {'t', 'g', 'b', 'q', 'p', 'q', 'j', 'w', 'o', 'r', 'g', 'z', 't', 'e', 'w', 'd', 'l', 'd', 'y', 'w'},
            {'f', 'u', 'w', 'b', 'g', 'v', 'p', 'o', 'o', 'd', 'u', 'q', 'e', 'a', 'z', 'p', 'n', 'z', 'h', 'c'},
            {'l', 'p', 'g', 'p', 'n', 'r', 'a', 's', 'a', 'c', 'r', 'c', 'g', 'o', 'n', 'x', 'm', 'g', 'o', 'h'},
            {'n', 'o', 'k', 'r', 'd', 'b', 'e', 'j', 'j', 'a', 'm', 'r', 'b', 'y', 't', 'w', 'u', 'j', 'l', 'o'},
            {'v', 'a', 'i', 'c', 'b', 'a', 'x', 'y', 'r', 'i', 'f', 'd', 'e', 'o', 'd', 'l', 'l', 'd', 'k', 'w'},
            {'f', 'x', 'q', 'k', 'f', 'c', 'e', 's', 'y', 'm', 'u', 'r', 'z', 'z', 'r', 's', 'u', 'z', 'h', 'o'},
            {'h', 'a', 'h', 'e', 'z', 't', 'q', 'g', 'l', 'd', 'l', 'k', 'p', 'z', 'i', 'z', 'm', 'j', 'g', 'e'},
            {'j', 'n', 'g', 'p', 'y', 't', 'f', 't', 'o', 'y', 'r', 'u', 't', 'g', 'f', 'a', 'h', 'h', 'p', 'j'},
            {'l', 'e', 'n', 'r', 'b', 'w', 'm', 'r', 'g', 'l', 'r', 'b', 'f', 'n', 'q', 'f', 'k', 'b', 'n', 'z'},
        };
        System.out.println(Druga.zadnjaVrsticaZLocilom(krizanka0));

        char[][] krizanka1 = {
            {'x', 'j', 'g', 'k', 'j', 'o', 'o', 'a', 'o', 'w', '-', 'q', 'c', 'q', 'f', 'c', 'o', 'd', 'h', '-'},
            {'y', 't', 'e', 'd', 's', 'x', 'x', '-', 'n', 'o', 'h', 't', 'm', 't', 's', 'p', 'p', 'x', 'g', 'b'},
            {'f', 'd', 'x', 's', 'i', 'd', 's', 'q', 'n', 'h', 'h', 'p', 'z', 'p', 'k', 'v', 'n', 't', 'r', 'o'},
            {'q', 'n', 'n', 'u', 'j', 'c', 'u', 'r', 'u', 'n', 'z', 'e', 'u', 'c', 'o', 'n', 'y', 't', 'p', 'p'},
            {'j', 'm', 'n', 'm', 'y', '-', 't', 'b', 'w', 'r', 'h', 'a', 'b', 'm', 'd', 'i', 'm', 'k', 't', 'w'},
            {'i', '-', 'q', 'k', 'u', 'd', 'a', 'f', 'i', 'r', 'x', 's', 'a', 't', 'm', 'j', 't', '-', 'i', 'q'},
            {'t', 'z', 'b', 'z', 'q', 's', 'e', 's', 'y', 'm', 'h', 'v', 'b', 'n', 'y', 'q', 'd', '-', 'o', 's'},
            {'u', 'd', 'm', 'x', 'l', 'h', 's', 'o', 'v', 'd', 't', 'u', 'j', 'j', 'g', 'y', 'w', 'w', 'p', 'q'},
            {'o', 's', 'g', 'i', 'r', 'a', 'b', 'j', 'h', 'q', 'f', 'y', 'o', 'b', 'q', 's', 'z', 'q', 'c', 'z'},
            {'j', 'k', 'f', 'z', 'a', 'f', 'a', 'o', 'b', 'h', 'o', 'o', 'v', 'm', 't', 'u', 'o', 't', 'g', 'h'},
            {'p', 's', 'k', 'j', 'x', 'f', 'u', 'q', 'r', 't', 'e', 's', 'u', 'r', 'm', 'k', 'i', 'p', 'z', 'y'},
            {'r', 'c', 'u', 'p', 'd', 'r', 'i', 'z', 'c', 'g', 'j', 'v', 'e', 'u', 's', 'h', 'h', 'e', 'a', 'r'},
            {'e', 'u', 'z', 'o', 'm', 't', 'y', 'd', 'g', 's', 'm', 'd', 'o', 'l', 'h', 's', 'u', 's', 'n', 'f'},
            {'g', 'a', 'q', 'l', 'a', 'n', 'k', 's', 'c', 'i', 'r', 'r', 'm', 'v', 'e', 'f', 'v', 's', 'g', 'p'},
            {'e', 's', 't', 'u', 'z', 'm', 'v', 'g', 's', 'g', 'x', 'k', 'e', 'v', 'r', 'f', 'w', 'y', 'k', 'g'},
            {'j', 'v', 'r', 'j', 's', 'n', 'r', 't', 'z', 'y', 's', 'd', 's', 'q', 't', 'a', 'x', 'k', 'i', 'e'},
            {'a', 'h', 'j', 'i', 'e', 'i', 's', 'i', 'p', 'm', 'm', 'f', 'a', 'w', 'n', 'w', 'h', 'z', 'h', 'e'},
            {'h', 'r', 'e', 'c', 'q', 'v', 'e', 'p', 'r', 'r', 'j', 'r', 'q', 'e', 'o', 'b', 'w', 'o', 'm', 's'},
            {'b', 'z', 'f', 'l', 'e', 'n', 'h', 'k', 'y', 'q', 'd', 'b', 'c', 'u', 'x', 'f', 'z', 'q', 'g', 'r'},
            {'k', 'y', 'u', 'm', 'n', 'q', 'o', 'x', 'd', 'o', 'w', 'a', 'l', 'a', 'c', 'i', 'k', 't', 'm', 'x'},
        };
        System.out.println(Druga.zadnjaVrsticaZLocilom(krizanka1));

        char[][] krizanka2 = {
            {'n', 'p', 'p', 'y', 'f', 't', 'k', 'k', 'q', 'r', 'k', 'o', 'z', 'x', 'e', 'y', 'z', 'w', 'n', 'b'},
            {'-', 'v', 'm', 'i', 'r', 'i', 'h', 'g', 'm', 'o', 'a', 'c', 'f', 'c', 'e', 'b', '-', 'a', 'r', 'b'},
            {'b', 'o', 'v', 'k', 's', 'w', 'r', 'r', 'b', 'w', 't', 'p', 'z', 'f', 'r', 'i', 'u', 'f', '-', 'g'},
            {'n', 's', 's', 'e', 'b', 'n', 'y', 'h', 'd', 'y', 'h', 'm', 'v', 'v', 'v', 'q', 'q', 's', 'g', 'u'},
            {'-', 'd', 'y', 'y', 'y', 'i', 'g', 'w', 'b', 'o', 'j', 'g', 'd', 't', 'y', 's', 's', 'g', 's', 'd'},
            {'y', 'q', 'l', 'k', 'o', 'e', 'd', 'n', 'l', 'z', 'w', 'y', 'l', 'p', 'd', 'o', 'g', 'a', 'r', 'e'},
            {'t', 'v', 'u', 'w', 'u', 'b', 'd', 'c', 'h', 'n', 'n', 'p', 'd', 'r', 'q', 'u', 'j', 'h', 'l', 'k'},
            {'t', 'r', 'h', 'r', 'k', 'e', 'o', 'm', 'c', 'j', 'g', 'k', 'd', 't', 'i', 'c', 'n', 'h', 'u', 'q'},
            {'u', 'l', 'x', 'b', 'c', 'p', 't', 'e', 'y', 'g', 's', 'n', 'j', 'm', 'f', 'c', 'x', 'l', 'o', 'x'},
            {'k', 'y', 't', 't', 'b', 't', 'u', 'x', 'k', 'u', 'f', 'o', 'l', 'p', 't', 'z', 'e', 'j', 'd', 'd'},
            {'s', 'y', 's', 'd', 'j', 'e', 'y', 'h', 'p', 'k', 'v', 'x', 'r', 'u', 'g', 'l', 'n', 'w', 'j', 'o'},
            {'m', 'f', 'f', 'g', 'c', 'j', 'h', 'e', 'd', 'v', 'k', 'h', 'y', 'o', 'f', 'i', 'l', 'j', 'p', 'o'},
            {'i', 'y', 'p', 'x', 'z', 't', 'p', 'h', 'u', 'o', 'p', 'g', 'n', 'i', 'o', 'c', 'l', 'c', 'q', 'i'},
            {'v', 'w', 'h', 'h', 'g', 'p', 'j', 'p', 'n', 'u', 'x', 'o', 'g', 'b', 'v', 'q', 'r', 'f', 'h', 'c'},
            {'k', 'o', 'b', 'i', 'o', 'a', 'd', 'g', 'q', 'd', 'z', 'y', 'z', 'e', 'h', 't', 'c', 'd', 'd', 'd'},
            {'j', 'q', 'p', 'f', 'x', 'v', 'l', 'r', 'd', 's', 'g', 'j', 'k', 'w', 'y', 'c', 'b', 'z', 'o', 'q'},
            {'u', 'h', 'c', 'k', 'h', 'b', 's', 'o', 'p', 't', 'm', 's', 'd', 't', 'q', 'q', 'f', 'w', 'k', 'k'},
            {'e', 'g', 'u', 'n', 'g', 'u', 'l', 'o', 'i', 'i', 'k', 'c', 'l', 'k', 'w', 'e', 'l', 'k', 'p', 'l'},
            {'n', 'h', 'w', 'r', 'f', 'q', 'r', 'j', 'n', 'h', 's', 'j', 'o', 'j', 'r', 'c', 'r', 'g', 'j', 'g'},
            {'h', 't', 'p', 'q', 'u', 'a', 'k', 'j', 'h', 't', 'p', 'c', 'n', 'k', 'w', 'm', 's', 'o', 'h', 'j'},
        };
        System.out.println(Druga.zadnjaVrsticaZLocilom(krizanka2));

        char[][] krizanka3 = {
            {'z', 'j', '-', 'r', 't', 'h', 'j', 'v', 'h', 'q', 's', 'e', '-', 'e', 'b', 'r', 'o', 'p', 'y', 'g'},
            {'u', 'q', 'w', 'l', 'b', 'u', 'o', 'o', 'a', 'g', 'z', '-', 'v', 'z', 's', 'n', 'k', 'k', 'f', 'r'},
            {'b', 'e', 'u', 'j', 's', 'y', 'n', 'r', 't', 'b', 'e', 'k', '-', 'h', 'y', 'm', 'w', 'x', 's', 'c'},
            {'e', 'a', 's', 'q', 'h', 'c', 'x', 'x', 'p', 'e', 'y', 't', 'h', 'j', 'a', 'r', 'p', 'b', 'r', 's'},
            {'i', 'h', 'x', 'w', 'v', 'c', 'd', 'x', 'i', 'y', 'v', '-', 'g', 'g', 'o', 'x', 'g', 'f', 'g', 'n'},
            {'c', 'f', 'y', 'a', 'w', 'i', 'i', 'x', 'p', 'q', 'r', 'o', 'a', 'i', 'p', 'p', 'x', 'f', 'b', 'v'},
            {'e', 'y', 'x', 'z', 'd', 't', 'm', 'p', 'd', 'u', 'c', 'c', 'p', 'd', 'q', 'k', 'c', 't', 'm', 'p'},
            {'g', 'x', 'x', 'm', 'l', 'b', 'h', 't', 'h', 'f', '-', 'a', 'i', 'v', 'g', 'e', 'u', 'v', 'm', 'g'},
            {'-', 'c', 'u', 'h', 't', 's', 'x', 'i', 'u', 'h', 'p', 'e', 'j', 'p', 'x', 'y', 'q', 'p', 'j', 'j'},
            {'c', 'e', 'm', '-', 'm', 'j', 'e', 'b', 'i', 'z', 't', 'g', 'q', 'v', 'u', 'l', 'n', 'e', 'h', '-'},
            {'o', 'b', 'h', 'y', 'e', 'z', 'x', 'j', 'k', 'v', 'q', 'i', '-', 'r', 'i', 'g', 't', 'g', 'j', 'r'},
            {'e', 'g', 'a', 'r', 'i', 'p', 'a', 'n', 'y', 'i', 'g', 'd', 'w', 'j', 'j', 'b', 'd', 'v', 'p', 'g'},
            {'r', 't', 'p', 'u', 'l', 'w', 'g', 'p', 'f', 'f', 'd', 'c', 'l', 'v', 'k', 't', 'v', 'v', 'q', 'x'},
            {'n', 'n', 'd', 't', 'a', '-', 'k', 'f', 'x', 'u', 'z', 'g', 't', 'i', 'f', 't', 'y', 'b', 'n', 'd'},
            {'q', 'c', 'c', '-', 'u', 'b', 'h', 'd', 'x', 'f', 'b', 'k', 'e', 'm', 'n', 'v', 'u', 't', 't', 'a'},
            {'x', 'f', '-', 'p', 'c', 'c', 'i', 'e', 'j', 'd', 'x', 'b', 'n', 'o', 'c', 'h', '-', 's', 'p', 'm'},
            {'j', 'd', 'e', 'o', 'f', 'a', 'y', 'v', 'x', 't', 'm', 'e', 'n', 'i', 'b', 'w', 'f', 'm', 'w', 'v'},
            {'a', 't', 'l', 'c', 'r', 'y', 'h', 'u', 'u', 'u', 'f', 'g', 's', 'w', 'p', 'h', 'f', 'l', 'j', 'm'},
            {'c', 'c', 'c', 'z', 'k', 'a', 'g', 'f', 't', 'q', 'u', 'a', 'r', 'i', 'v', 'a', 'f', 'a', 'w', 'u'},
            {'h', 'd', 'v', 'c', 'n', 'p', 't', 'b', 'k', 'g', 'e', 'f', 'i', 'j', 'j', 'f', 'a', 'z', 'c', 'u'},
        };
        System.out.println(Druga.zadnjaVrsticaZLocilom(krizanka3));

        char[][] krizanka4 = {
            {'q', 'u', 'k', '-', 'w', '-', 'e', 'k', 'x', 'v', 's', 'i', 'z', 'l', 'w', 'a', 'n', 'a', 'h', 'r'},
            {'s', 'd', 'y', 'b', 'u', 'r', 'd', 'w', 't', 'q', 'h', 'o', 'h', 'h', 'x', 't', 'k', 'y', 'h', 'a'},
            {'f', 'c', 'b', 'c', 'l', '-', 'l', 'w', 'k', 'v', 'n', 'e', 'w', 'x', 'm', 'l', 'm', 'x', 'q', 'b'},
            {'p', 'k', 'f', 'h', 'b', 'l', 'i', 'n', 'b', 'z', 'c', 'i', 'r', 's', 'r', 'v', 'l', 'g', 'y', 'z'},
            {'e', '-', 'o', 'y', 's', 'k', 'i', 'z', 'w', 'f', 'n', 'd', 'm', 'l', 's', '-', 'i', 'g', 'm', 'p'},
            {'n', 'x', 'u', 'h', 'j', 'h', 'm', 'q', 'h', 'e', 'n', 'q', 'f', 'i', 'c', 'b', 'x', '-', 'v', 'o'},
            {'b', 'l', 's', 'w', '-', 'j', 'l', '-', 'm', 'y', 't', 'o', 's', 's', 'f', 'n', 'b', 'z', 'q', 'y'},
            {'v', 'q', 'h', 'k', 'c', 'w', 'q', 'j', '-', 'z', 'e', 'j', 'r', 'a', 'i', 'n', 'h', 'b', 'm', 'p'},
            {'-', 'j', 'x', 'o', 'o', 'w', 'i', 'h', 'g', 'o', 'n', 'y', 'm', 'v', 'x', 't', 's', 'k', 's', 'g'},
            {'h', 'i', 'x', 'q', 'l', 'a', 'i', 'i', 'x', 'f', 'b', 'h', 'q', 'x', 'p', 'r', 'x', 'v', 'o', 'p'},
            {'m', 'h', 's', 'w', 'o', 'h', 'r', 'u', 'u', 's', 'd', 'r', 't', 'r', 'p', 'v', 'j', 'l', 'v', 'i'},
            {'l', 'd', 'x', 'x', 'j', 'l', 'f', 'p', 't', 'p', 'f', 'y', 'k', 'w', 'y', 'm', 'u', 'u', 't', 'k'},
            {'w', 'q', 'f', 'k', '-', 'b', 'h', 'v', 'e', '-', 'w', 't', 'w', 'f', '-', '-', 'j', 'x', 'e', 'y'},
            {'q', 'o', 'j', 'm', 'w', 'x', 'y', 's', 's', 'l', 'm', 'd', 'a', 'd', 'c', 'j', 'w', 'f', 'g', 'e'},
            {'b', 'z', 'p', 'r', 'i', 'v', 'v', 'k', 'f', 'n', 'k', 'o', 'h', 'l', 'a', 'z', 'y', 'g', 'd', 'q'},
            {'c', 'z', 'z', 'y', 'x', 'k', 'j', 'z', 'o', 'm', 'a', 'w', 'b', 's', 'i', 'i', 'm', '-', 'h', 'h'},
            {'n', 'u', 'k', 'g', 'p', 'r', 'h', 'n', 'l', 'c', 'z', 'f', 'b', 'r', 'x', 'j', 'p', 'm', 'l', 'z'},
            {'o', 'f', 'r', 'z', 'g', 'i', 'c', '-', 's', 'j', 'z', 'n', 'w', 'r', 'c', 'n', 'f', 'u', 'h', 'v'},
            {'s', 'q', 'r', 'q', 'i', 'v', 'n', '-', 'l', 'r', 'x', 'z', 't', 'd', '-', 'c', 'w', 'g', 'g', 'r'},
            {'u', 'v', 'i', 'j', 'u', 'f', 'a', 'd', 'z', 'w', 'y', 'e', 'e', 'e', 't', 'c', 'g', 't', 'x', 'h'},
        };
        System.out.println(Druga.zadnjaVrsticaZLocilom(krizanka4));

    }
}
