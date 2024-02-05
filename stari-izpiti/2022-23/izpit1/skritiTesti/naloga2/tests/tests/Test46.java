
import java.util.*;

public class Test46 {

    public static void main(String[] args) {
        final char[][] B01 = {
            {'f', 'w'},
            {'l', 'z', 'l', 'n', 'r', 'o'},
            {'n', 'n', 'q', 'c', 'h', 'y', 'e', 'u'},
            {'r', 'b', 'j', 'b', 'b'},
            {'v', 'l', 'i', 'd', 'j'},
            {'p', 'h'},
            {'t', 'l', 'w', 'h', 'm', 'm', 's', 'v', 'a'},
            {'b', 'b', 'm', 'x', 'f'},
            {'g', 'p', 'u', 'j', 'v', 'j', 'p', 'a'},
            {'s', 'j', 'z', 'u', 'c', 'd'},
            {'h', 'm', 'm', 's', 'v', 'a'},
            {'k', 'v', 'l', 'i', 'd', 'j'},
            {'b', 'm', 'b', 's'},
            {'j', 'u', 'k', 'l'},
            {'y', 'p', 'j', 'b', 'm', 'b', 's', 'q'},
            {'d', 'z', 'b', 'x', 'v', 'o'},
            {'q', 'k', 'b', 'f', 'n', 'w'},
            {'l', 'q', 'q'},
            {'c', 'b', 'b', 'm'},
            {'t', 'l', 'w', 't', 'e', 'w'},
        };

        final char[][] P01 = {
            {'5', '3', 'n'},
            {'8', '4', 'n'},
            {'9', '0', 'n'},
            {'7', '3', 'n'},
            {'5', '2', 'n'},
            {'6', '7', 'v'},
            {'6', '1', 'n'},
            {'2', '9', 'n'},
            {'5', '7', 'n'},
            {'1', '5', 'v'},
            {'9', '1', 'n'},
            {'4', '2', 'n'},
            {'8', '8', 'v'},
            {'7', '6', 'v'},
            {'8', '5', 'v'},
            {'3', '7', 'v'},
            {'9', '9', 'n'},
            {'7', '9', 'v'},
            {'1', '9', 'n'},
            {'6', '1', 'v'},
        };

        final char[][] B02 = {
            {'b', 'b', 'a'},
            {'f', 'e', 'g', 'r', 'h', 'l', 'b'},
            {'e', 'j'},
            {'e', 'l', 'b', 'l', 'r', 's', 'b', 'q', 'm'},
            {'o', 'q', 'a', 'm', 'p', 'l', 't', 'a'},
            {'d', 'u'},
            {'p', 'j'},
            {'t', 'j', 'b', 'p', 'j', 'p'},
            {'y', 'm', 'v', 'g', 'c', 's', 'e', 'r', 'm'},
            {'s', 'b', 'q', 'm'},
            {'s', 'j', 'j', 'm', 'l', 'a', 'x', 'n'},
            {'u', 'e', 'q', 'y', 'c'},
            {'r', 'n', 'e'},
            {'p', 'b', 'b', 'a', 'm', 'o', 'k'},
            {'o', 'w', 'x', 'f', 'e', 'g', 'r', 'h', 'l'},
            {'m', 'l', 'd'},
            {'h', 'd', 'k', 'z', 'k', 'f', 'f'},
            {'i', 'w', 'h', 'l', 'g', 'g'},
            {'p', 'c', 'n', 'e', 'c', 'n', 'p', 's', 'x'},
            {'m', 'l', 'd', 'c'},
            {'n', 'e'},
            {'a', 'd', 'f', 't', 'c'},
            {'e', 'b'},
            {'n', 'e', 'j', 's', 'y', 'u', 'h', 'm'},
            {'m', 'l', 'd', 'c'},
            {'e', 'q', 'y', 'c', 't', 'o', 'p', 'x'},
            {'s', 'f', 'z', 'k', 'c', 'b', 'm'},
            {'z', 'n', 'q', 'k', 'l', 'z'},
            {'a', 'd', 'f'},
            {'l', 'b', 'l', 'r', 's', 'b'},
            {'f', 'b', 'r', 'u'},
            {'x', 's', 'p', 'c', 'n'},
            {'l', 'b', 'l', 'r', 's', 'b', 'q', 'm', 'l'},
            {'d', 'k', 'z', 'k', 'f', 'f', 'e'},
            {'g', 'c', 's', 'e', 'r', 'm', 'u'},
            {'b', 'a', 'm', 'o', 'k', 'h', 'n', 'h'},
            {'u', 'h', 'v', 'o', 'w', 'x', 'f'},
            {'m', 'v', 'g', 'c', 's'},
            {'s', 'e', 'r', 'm', 'u', 'o', 'a', 'b', 'y'},
            {'g', 'r', 'n', 'e'},
            {'l', 'o', 'g'},
            {'x', 'd', 'e', 'l'},
            {'a', 'm', 'p', 'l'},
        };

        final char[][] P02 = {
            {'2', '4', 'n'},
            {'7', '2', 'n'},
            {'9', '5', 'v'},
            {'2', '1', 'n'},
            {'4', '2', 'v'},
            {'1', '1', 'v'},
            {'8', '6', 'n'},
            {'5', '6', 'n'},
            {'3', '5', 'n'},
            {'7', '1', 'n'},
            {'9', '7', 'n'},
            {'2', '6', 'v'},
            {'9', '3', 'v'},
            {'1', '4', 'n'},
            {'4', '2', 'n'},
            {'7', '7', 'v'},
            {'1', '8', 'v'},
            {'8', '0', 'n'},
            {'0', '3', 'v'},
            {'7', '7', 'v'},
            {'0', '5', 'v'},
            {'4', '9', 'v'},
            {'4', '0', 'v'},
            {'9', '4', 'v'},
            {'7', '7', 'v'},
            {'2', '7', 'v'},
            {'7', '1', 'v'},
            {'2', '3', 'n'},
            {'4', '9', 'v'},
            {'3', '1', 'n'},
            {'5', '8', 'v'},
            {'0', '1', 'v'},
            {'3', '1', 'n'},
            {'1', '9', 'v'},
            {'6', '5', 'n'},
            {'3', '4', 'n'},
            {'1', '2', 'n'},
            {'4', '5', 'n'},
            {'8', '5', 'n'},
            {'9', '2', 'v'},
            {'6', '3', 'v'},
            {'0', '1', 'n'},
            {'4', '4', 'v'},
        };

        final char[][] B03 = {
            {'h', 'n', 'u', 'c'},
            {'h', 'n', 'u', 'c', 'k', 'f'},
            {'y', 'y', 'y', 'c', 'h', 'u', 'c', 'r'},
            {'k', 'c', 'i', 'u'},
            {'c', 'o'},
            {'f', 'n', 'w', 's', 'y'},
            {'k', 'o', 'b', 'u', 'u', 'j', 'a'},
            {'f', 'i', 'k', 'v', 'c'},
            {'o', 'g', 'f', 'r', 'g', 't', 'e', 'k'},
            {'h', 'q', 'u', 'c'},
            {'b', 't', 'u'},
            {'d', 'w', 't', 'r', 'c'},
            {'r', 'v', 'l', 'i', 'y', 'f', 'o', 'x'},
            {'n', 'b', 'd'},
            {'t', 'p', 'b'},
            {'e', 'c', 'c'},
            {'e', 'j', 'g'},
            {'s', 'y', 'k', 't', 'p', 'k', 'u'},
            {'u', 'z', 'c', 'q', 'c', 'r', 'v', 'l', 'i'},
            {'p', 'h', 'n', 'u', 'c', 'k', 'f', 'b', 't'},
            {'q', 'c', 'r', 'v', 'l'},
            {'h', 's', 'v', 'q', 's', 'o', 'y'},
            {'w', 's', 'y'},
            {'v', 'q', 's'},
            {'v', 'j', 'j', 'd', 'h', 'n', 'o'},
            {'c', 'c'},
            {'i', 'q', 'c'},
            {'j', 'l', 'v', 'j', 'j'},
            {'r', 'f', 'a', 'z', 'y', 's', 'v', 'k', 'd'},
            {'r', 's', 'c', 'n', 'b', 'd', 'e', 'c'},
            {'h', 'q', 'u', 'c'},
            {'r', 'v', 'l', 'i'},
            {'n', 'u'},
            {'r', 'v'},
            {'a', 'p'},
            {'j', 'l', 'v', 'j', 'j', 'd', 'h'},
            {'n', 'b', 'd', 'e', 'c', 'c', 'z'},
            {'q', 'u', 'i', 'q', 'c', 'o', 'r', 'f', 'a'},
            {'c', 'l', 'n', 'r'},
            {'h', 's', 'v', 'q', 's'},
            {'v', 'o', 'i', 'k', 'l'},
            {'y', 'y', 'c'},
            {'q', 'u', 'c', 'b', 'l'},
            {'t', 'r', 'c', 'j', 'l'},
            {'t', 'a'},
            {'y', 'y'},
            {'k', 'u', 'j', 'e', 'l', 'b'},
            {'j', 'l', 'v', 'j', 'j', 'd', 'h'},
            {'m', 't', 'p', 'v'},
            {'o', 'w', 't', 'g', 'q'},
            {'f', 'n', 'w', 's', 'y', 'k', 't', 'p'},
            {'n', 'e', 'g', 'd'},
            {'r', 'i', 'c', 't'},
            {'q', 'g', 'n', 'q', 'u'},
            {'s', 'y', 'k', 't'},
            {'w', 't', 'r', 'c', 'j'},
            {'l', 'v', 'j', 'j'},
            {'v', 's', 'y', 'y', 'y', 'c', 'h', 'u'},
            {'k', 'f', 'b', 't', 'u', 'w'},
            {'c', 'q', 'c'},
            {'j', 'd', 'h'},
            {'a', 'z', 'y', 's', 'v', 'k', 'd', 'z', 'd'},
            {'c', 'z', 'y', 'a', 'b', 'o', 'u', 'h', 'v'},
            {'r', 'y', 's', 'h', 'b', 'd', 'o'},
            {'l', 'g', 'p', 'v'},
            {'c', 'j'},
            {'r', 'i', 'c', 't', 'g', 'q', 'o', 'h', 'w'},
            {'f', 'l'},
            {'v', 'b', 'f'},
            {'k', 'c', 'i', 'u', 'z'},
            {'g', 'c', 'u'},
            {'u', 'c', 'b'},
            {'t', 'l', 'f', 'l', 'i', 't', 'q', 'v'},
            {'b', 'n'},
            {'n', 'b', 'd', 'e', 'c', 'c'},
            {'a', 'a', 'm', 'k', 'l', 'd', 'l'},
            {'u', 'j'},
            {'o', 'w', 't', 'g', 'q'},
            {'f', 'n', 'w'},
            {'r', 'y', 's', 'h', 'b', 'd', 'o', 'h'},
            {'t', 'r', 'c', 'j', 'l', 'v', 'j', 'j'},
            {'t', 'g', 'q'},
            {'b', 'n', 'e'},
            {'r', 'v', 'l', 'i', 'y', 'f', 'o', 'x', 'l'},
            {'b', 'n', 'e', 'g', 'd', 'm', 'l'},
            {'d', 'h', 'q', 'u', 'c', 'b'},
            {'f', 'i', 'k', 'v', 'c', 'l', 'o', 'o'},
        };

        final char[][] P03 = {
            {'1', '1', 'v'},
            {'1', '1', 'v'},
            {'8', '8', 'v'},
            {'5', '2', 'v'},
            {'9', '5', 'v'},
            {'0', '2', 'n'},
            {'1', '5', 'n'},
            {'9', '8', 'n'},
            {'2', '5', 'v'},
            {'4', '7', 'v'},
            {'1', '7', 'v'},
            {'6', '0', 'v'},
            {'6', '3', 'n'},
            {'3', '4', 'v'},
            {'0', '0', 'n'},
            {'3', '7', 'v'},
            {'5', '8', 'n'},
            {'3', '2', 'n'},
            {'1', '3', 'n'},
            {'1', '0', 'v'},
            {'4', '3', 'n'},
            {'4', '7', 'n'},
            {'2', '2', 'n'},
            {'6', '7', 'n'},
            {'6', '7', 'v'},
            {'3', '8', 'v'},
            {'9', '3', 'v'},
            {'6', '5', 'v'},
            {'9', '7', 'v'},
            {'3', '1', 'v'},
            {'4', '7', 'v'},
            {'6', '3', 'n'},
            {'1', '2', 'v'},
            {'6', '3', 'n'},
            {'7', '5', 'n'},
            {'6', '5', 'v'},
            {'3', '4', 'v'},
            {'9', '1', 'v'},
            {'1', '4', 'n'},
            {'4', '7', 'n'},
            {'8', '6', 'n'},
            {'8', '9', 'v'},
            {'4', '8', 'v'},
            {'6', '2', 'v'},
            {'7', '4', 'v'},
            {'8', '9', 'v'},
            {'8', '2', 'n'},
            {'6', '5', 'v'},
            {'7', '0', 'v'},
            {'5', '1', 'n'},
            {'0', '2', 'n'},
            {'3', '0', 'n'},
            {'4', '4', 'n'},
            {'7', '7', 'v'},
            {'3', '2', 'n'},
            {'6', '1', 'v'},
            {'6', '6', 'v'},
            {'8', '6', 'v'},
            {'1', '5', 'v'},
            {'3', '3', 'n'},
            {'6', '9', 'v'},
            {'9', '9', 'v'},
            {'3', '9', 'v'},
            {'9', '7', 'n'},
            {'8', '3', 'v'},
            {'6', '4', 'v'},
            {'4', '4', 'n'},
            {'0', '2', 'v'},
            {'0', '7', 'n'},
            {'5', '2', 'v'},
            {'2', '9', 'n'},
            {'4', '9', 'v'},
            {'0', '0', 'v'},
            {'2', '0', 'n'},
            {'3', '4', 'v'},
            {'9', '9', 'n'},
            {'9', '2', 'n'},
            {'5', '1', 'n'},
            {'0', '2', 'n'},
            {'9', '7', 'n'},
            {'6', '2', 'v'},
            {'7', '4', 'n'},
            {'2', '0', 'n'},
            {'6', '3', 'n'},
            {'2', '0', 'n'},
            {'4', '6', 'v'},
            {'9', '8', 'n'},
        };

        final char[][] B04 = {
            {'u', 's', 'f', 'r', 'k'},
            {'j', 'y', 'w', 'm', 'm', 'o', 'n'},
            {'h', 'i', 'h', 'q', 'h', 'i', 'j', 'j'},
            {'h', 't', 'z', 'h', 's'},
            {'y', 'e'},
            {'e', 'o'},
            {'q', 'u', 'f', 'j', 'y'},
            {'t', 'w', 'p', 'r', 'd', 'b', 'n'},
            {'l', 'e', 'h'},
            {'v', 'k', 'j', 'h', 'q', 'u', 'h', 'n', 'l'},
            {'e', 'l', 'a', 'h', 'e', 'l', 'd'},
            {'g', 'o', 'h'},
            {'q', 'w', 'x', 's', 'f'},
            {'z', 'y', 'l', 'm', 'z', 'm', 'q', 'u'},
            {'q', 'm', 'q', 'p', 'u', 'v', 'm', 'q'},
            {'o', 'd', 'b', 'y', 'e', 'p', 'j', 'd'},
            {'e', 'x', 'w', 'k', 'b'},
            {'z', 'k', 'z', 'o'},
            {'e', 'g', 'o', 'h', 'm', 'u', 's'},
            {'e', 'l'},
            {'k', 'j', 'h', 'q', 'u', 'h'},
            {'n', 'a', 'q', 'l', 'h', 'p', 'p'},
            {'p', 'p', 'v', 'b', 'f', 'd'},
            {'u', 's', 'f', 'r', 'k', 'p', 'a'},
            {'w', 'u', 'p', 'f', 'd', 'e'},
            {'u', 'd', 'f', 'y', 'c', 'h', 'y', 'l'},
            {'d', 'z', 'l'},
            {'j', 'v', 'v', 'q'},
            {'u', 'f', 'j', 'y', 'w', 'm', 'm', 'o', 'n'},
            {'n', 'a', 'q', 'l', 'h', 'p', 'p', 'v'},
            {'u', 'v'},
            {'k', 'm', 'm'},
            {'o', 'h', 'm', 'u', 's', 'p', 'p', 'h'},
            {'u', 'd'},
            {'h', 'c', 't', 'v', 'f'},
            {'d', 'p', 'p', 'e', 'c', 'h', 'd', 'r', 'd'},
            {'k', 'm', 'n', 'm', 'd'},
            {'e', 'g', 'o', 'h', 'm', 'u', 's'},
            {'c', 'e', 'x', 'w', 'k', 'b', 'x'},
            {'t', 'e', 'k', 'e', 'c', 'm'},
            {'u', 'u', 'p', 'w', 'u', 'p', 'f'},
            {'e', 'h', 'h', 'b', 'q', 'u', 'f'},
        };

        final char[][] P04 = {
            {'5', '8', 'n'},
            {'7', '9', 'v'},
            {'7', '3', 'n'},
            {'0', '5', 'n'},
            {'4', '9', 'n'},
            {'5', '4', 'n'},
            {'7', '6', 'v'},
            {'8', '5', 'v'},
            {'7', '1', 'v'},
            {'0', '2', 'v'},
            {'6', '1', 'n'},
            {'6', '3', 'v'},
            {'7', '6', 'n'},
            {'2', '0', 'v'},
            {'0', '6', 'n'},
            {'1', '9', 'n'},
            {'9', '5', 'v'},
            {'0', '0', 'n'},
            {'6', '2', 'v'},
            {'6', '1', 'n'},
            {'0', '3', 'v'},
            {'3', '1', 'v'},
            {'3', '6', 'v'},
            {'5', '8', 'n'},
            {'9', '7', 'n'},
            {'4', '6', 'v'},
            {'1', '4', 'n'},
            {'9', '0', 'n'},
            {'7', '7', 'v'},
            {'3', '1', 'v'},
            {'4', '6', 'n'},
            {'0', '3', 'n'},
            {'6', '4', 'v'},
            {'4', '6', 'v'},
            {'0', '8', 'n'},
            {'2', '9', 'v'},
            {'1', '0', 'v'},
            {'6', '2', 'v'},
            {'9', '4', 'v'},
            {'8', '5', 'n'},
            {'6', '7', 'n'},
            {'7', '2', 'v'},
        };

        final char[][] B05 = {
            {'i', 'u', 'n', 'q'},
            {'z', 'r', 'r', 'r', 'x', 'k', 'l', 'a', 'h'},
            {'y', 'h', 'f', 'a', 'h', 'x', 'x', 'j', 'd'},
            {'f', 'k', 'c', 'p'},
            {'f', 'o'},
            {'j', 's', 's', 'k', 'r', 'y', 'z'},
            {'x', 'u', 'z', 'z', 'k'},
            {'h', 'u'},
            {'g', 's', 'y'},
            {'o', 'z', 'g', 's', 'a', 'i'},
        };

        final char[][] P05 = {
            {'3', '5', 'n'},
            {'2', '7', 'n'},
            {'6', '9', 'n'},
            {'0', '9', 'n'},
            {'0', '5', 'n'},
            {'1', '0', 'n'},
            {'7', '3', 'v'},
            {'6', '1', 'v'},
            {'8', '6', 'n'},
            {'6', '6', 'n'},
        };

        final char[][] B06 = {
            {'c', 'l', 'j', 'i', 'd', 'r', 'a'},
            {'b', 'r', 'r', 'd'},
            {'j', 'i', 'o', 'h', 'b', 'w'},
            {'z', 'e', 'v', 'f', 'l', 'l', 'a', 'y'},
            {'d', 'b', 'f', 'e', 'u', 'n', 'd'},
            {'l', 'b', 'h'},
            {'e', 's', 'p', 'f'},
            {'j', 'o', 'f'},
            {'f', 'a', 's', 'w', 'b', 'r', 'z'},
            {'z', 'd', 'j'},
            {'m', 'l', 'i', 'z', 'n', 'i', 'l', 'r'},
            {'i', 'z', 'n', 'i', 'l', 'r', 'c', 'w', 'z'},
            {'n', 'b', 'u', 'b', 'p', 'e', 'i', 'g'},
            {'u', 'e', 's', 'p'},
            {'r', 'd', 'i', 'j'},
            {'o', 's', 'w', 'f', 'p', 'u', 'j'},
            {'y', 'm', 'b', 'z', 'h', 'x', 'c', 'l', 'o'},
            {'p', 'w', 'k', 'b'},
            {'v', 'o', 'z'},
            {'x', 'c', 'l', 'o'},
            {'z', 'f', 'q', 'e'},
            {'x', 'c', 'l', 'o', 'o', 'x'},
            {'t', 'a', 'p', 'e', 'p'},
            {'w', 'q', 'w', 'e', 'j', 'g', 'r'},
            {'w', 'd', 'r', 'n', 'o', 'z', 'e', 'v', 'f'},
            {'o', 'y', 'q', 'x', 'o', 'v'},
            {'g', 'p'},
            {'p', 'c', 'b', 'b', 'r'},
            {'u', 'e', 's', 'p', 'f', 'd', 'm'},
            {'h', 'b', 'h', 'i'},
            {'z', 'p'},
            {'p', 'c', 'b', 'b'},
            {'r', 'z', 'd', 'j', 'y', 'q', 'o', 'i', 'm'},
            {'d', 'u', 'h', 'p', 'w'},
            {'n', 'i'},
            {'i', 'z', 'p', 'u', 'x', 't', 'z', 'q', 'm'},
            {'g', 'j', 's', 'p', 'e', 'e', 'v', 'e'},
            {'m', 'l', 'i', 'z', 'n', 'i', 'l', 'r', 'c'},
            {'s', 'w', 'b', 'r', 'z', 'd', 'j'},
        };

        final char[][] P06 = {
            {'6', '6', 'v'},
            {'7', '1', 'v'},
            {'7', '6', 'v'},
            {'6', '0', 'n'},
            {'2', '0', 'v'},
            {'6', '1', 'v'},
            {'3', '4', 'n'},
            {'6', '8', 'n'},
            {'2', '2', 'n'},
            {'8', '2', 'n'},
            {'5', '7', 'n'},
            {'7', '7', 'n'},
            {'9', '7', 'v'},
            {'2', '4', 'n'},
            {'7', '3', 'v'},
            {'5', '0', 'v'},
            {'0', '4', 'v'},
            {'2', '9', 'v'},
            {'8', '0', 'v'},
            {'0', '9', 'v'},
            {'8', '7', 'v'},
            {'0', '9', 'v'},
            {'3', '1', 'v'},
            {'8', '6', 'n'},
            {'1', '0', 'n'},
            {'8', '3', 'n'},
            {'0', '3', 'n'},
            {'1', '3', 'v'},
            {'2', '4', 'n'},
            {'0', '8', 'n'},
            {'3', '9', 'v'},
            {'1', '3', 'v'},
            {'7', '2', 'n'},
            {'2', '6', 'v'},
            {'9', '7', 'n'},
            {'3', '8', 'v'},
            {'5', '8', 'v'},
            {'5', '7', 'n'},
            {'4', '2', 'n'},
        };

        final char[][] B07 = {
            {'n', 'l', 'a', 'y', 's', 'k', 'm', 'm'},
            {'e', 'n'},
            {'p', 'z', 't', 'b', 'h', 'r'},
            {'f', 'k', 'c', 'u', 'm', 'l', 'j'},
            {'c', 'k', 'n', 'n', 'k', 'z', 'f', 't'},
            {'j', 'c'},
        };

        final char[][] P07 = {
            {'0', '0', 'v'},
            {'4', '6', 'v'},
            {'7', '4', 'n'},
            {'3', '0', 'v'},
            {'7', '7', 'v'},
            {'9', '8', 'n'},
        };

        final char[][] B08 = {
            {'q', 'h', 'n', 'j'},
            {'r', 't', 's', 't', 'b', 'l', 'h', 'h'},
            {'g', 'k', 'g'},
            {'x', 'i', 'k', 'a', 'r', 'h'},
            {'z', 'c', 'r', 'q'},
            {'z', 'w', 'b', 'n', 'y'},
            {'s', 'z', 'y', 'n', 'w', 'v'},
            {'s', 'l', 'm', 'w', 'd', 'h', 'a', 'w', 'i'},
            {'l', 'i', 'j', 'f', 'k', 'z'},
            {'m', 'n', 'l'},
        };

        final char[][] P08 = {
            {'9', '6', 'n'},
            {'8', '6', 'v'},
            {'0', '1', 'v'},
            {'3', '0', 'n'},
            {'6', '6', 'n'},
            {'4', '5', 'n'},
            {'5', '3', 'v'},
            {'9', '7', 'n'},
            {'2', '5', 'v'},
            {'9', '1', 'v'},
        };

        final char[][] B09 = {
            {'k', 'v', 'g', 'c', 'p', 'l'},
            {'u', 'c'},
            {'g', 'r', 'y', 'b', 'u', 'l', 'g', 'u', 'z'},
            {'r', 'y', 'b', 'u', 'l', 'g', 'u', 'z'},
            {'f', 'q', 'y', 'd', 'o'},
            {'h', 'o', 'd', 't', 'y', 'w', 'z'},
            {'c', 'h', 'o', 'y', 'q'},
            {'l', 'q', 'z', 'w', 's', 'b', 'k'},
            {'q', 'k', 'w', 'v', 'y'},
            {'y', 'f', 'k', 'h', 'k', 'x'},
            {'l', 'z', 'w', 's', 'q', 't', 'e'},
            {'w', 'e', 'n', 'u', 't', 'z', 't'},
            {'q', 'z', 'w', 's', 'b', 'k'},
            {'c', 'v', 'i', 'h', 'i', 'c', 'j'},
            {'f', 'f', 'l', 'q', 'z'},
            {'b', 'x'},
            {'h', 'h', 'o', 'd', 't', 'y'},
            {'p', 'v', 'h', 'f', 'f'},
            {'j', 'f', 'f', 'l', 'q', 'z', 'w', 's'},
            {'p', 'p', 'l', 'd', 'd'},
            {'v', 'h', 'f', 'j'},
            {'g', 's', 'b', 'p', 'x', 'v', 'h'},
            {'h', 'w', 'r', 'c', 'n', 'a', 'c', 'i'},
            {'w', 'e', 'n', 'u', 't', 'z'},
            {'k', 'x', 'h', 'n'},
            {'s', 'a', 'w', 'o', 'd', 'v', 'h'},
            {'k', 'x', 'h', 'n', 'd', 'f', 'g', 'f'},
            {'l', 'u', 'e', 'k', 'x', 'h', 'n', 'd'},
            {'x', 'c', 'w', 'e', 'm'},
            {'j', 'q', 'h', 'c', 'm', 'w', 'k'},
            {'e', 'y'},
            {'q', 'd', 'q', 'a', 'p', 'r', 'p'},
            {'u', 'm', 'v', 'u', 't', 'm', 'd', 'y', 'a'},
            {'z', 'w', 's', 'q'},
            {'h', 'h', 'o', 'd', 't', 'y', 'w'},
            {'k', 'x', 'h'},
            {'c', 'p', 'l', 'm', 'i', 'w', 'n'},
            {'g', 'u', 'c', 'a', 'c', 'm', 'm', 'y', 'g'},
            {'p', 'p', 'l'},
            {'g', 'e', 'a', 'o', 'a'},
            {'v', 'g', 'c'},
            {'r', 'g', 'u'},
            {'a', 'c', 'm', 'm', 'y', 'g', 'i', 'z', 'l'},
            {'v', 'h', 'f', 'f', 'g', 's', 'b'},
            {'f', 'k', 'h', 'k', 'x', 'q', 'a', 'v'},
            {'g', 'r', 'y', 'b', 'u', 'l'},
            {'y', 'w', 'z', 'u', 'm', 'v', 'u'},
            {'q', 'g', 'e', 'h', 'f', 'l', 'd', 'f'},
            {'c', 'i', 'a', 'z', 'm', 'j', 't'},
            {'t', 'z', 't'},
            {'y', 'd', 'o', 'x', 'h', 'n', 'x', 'h', 'e'},
            {'r', 's', 'k', 'a', 'r', 'g', 'u', 'c', 'a'},
            {'h', 'h', 'o', 'd', 't'},
            {'f', 'g', 's', 'b'},
            {'q', 'y', 'd', 'o', 'x', 'h'},
            {'z', 'u', 'c', 's', 'a', 'w', 'o', 'd', 'v'},
            {'d', 'v', 'h', 'f', 'j', 'u', 'h', 'o'},
            {'w', 'r', 'c', 'n', 'a', 'c'},
            {'k', 'w', 'v', 'y', 'w'},
            {'w', 'o', 'd', 'v', 'h', 'f', 'j', 'u', 'h'},
            {'z', 'a'},
            {'o', 'x', 'p', 'v'},
            {'d', 'q', 'a'},
            {'i', 'x', 'n', 'e', 'b', 'o', 't'},
            {'h', 'j', 'f', 'f', 'l', 'q', 'z', 'w', 's'},
            {'h', 'o', 'd', 't', 'y'},
            {'e', 'k', 'x', 'h', 'n', 'd', 'f', 'g'},
            {'z', 'u', 'c', 's'},
            {'o', 'y'},
            {'z', 'y', 'b', 'q', 'k', 'w'},
            {'n', 'o', 'm', 'f', 'b'},
            {'m', 'v', 'u', 't', 'm', 'd', 'y', 'a', 'y'},
            {'h', 'i'},
            {'s', 'u', 'r', 'w', 'c'},
            {'c', 'u', 'w', 'o', 'k', 'l', 'c', 'v'},
            {'f', 'k', 'h'},
            {'q', 'a', 'p', 'r', 'p', 'y', 'f', 'c'},
            {'c', 'i'},
            {'h', 'o', 'x'},
            {'c', 'u', 'w', 'o', 'k', 'l', 'c', 'v', 'j'},
            {'y', 'd', 'n'},
            {'k', 'a', 'r', 'g'},
            {'n', 'o', 'm', 'f'},
            {'w', 'o', 'd', 'v', 'h', 'f', 'j'},
            {'v', 'g', 'c', 'p', 'l'},
            {'c', 'p'},
            {'g', 'e', 'h', 'f', 'l', 'd'},
            {'m', 'f', 'b', 'z', 'y', 'd', 'l', 'p', 'x'},
            {'o', 't', 'c', 'u', 'w'},
            {'s', 'a', 'w', 'o'},
            {'f', 'g'},
            {'n', 'a', 'c', 'i'},
            {'o', 'y', 'q', 'd', 'q', 'a'},
        };

        final char[][] P09 = {
            {'9', '5', 'v'},
            {'2', '1', 'n'},
            {'0', '7', 'v'},
            {'0', '8', 'v'},
            {'2', '2', 'n'},
            {'6', '1', 'v'},
            {'8', '1', 'v'},
            {'1', '4', 'v'},
            {'8', '5', 'n'},
            {'8', '4', 'n'},
            {'1', '4', 'n'},
            {'1', '7', 'n'},
            {'1', '5', 'v'},
            {'3', '1', 'n'},
            {'1', '2', 'v'},
            {'1', '9', 'n'},
            {'6', '0', 'v'},
            {'4', '0', 'n'},
            {'1', '1', 'v'},
            {'8', '9', 'n'},
            {'9', '6', 'n'},
            {'9', '0', 'n'},
            {'3', '3', 'v'},
            {'1', '7', 'n'},
            {'2', '8', 'v'},
            {'4', '6', 'n'},
            {'2', '8', 'v'},
            {'2', '5', 'v'},
            {'2', '9', 'n'},
            {'9', '1', 'n'},
            {'7', '4', 'n'},
            {'8', '5', 'v'},
            {'6', '8', 'v'},
            {'2', '4', 'n'},
            {'6', '0', 'v'},
            {'2', '8', 'v'},
            {'9', '8', 'v'},
            {'5', '8', 'n'},
            {'8', '9', 'n'},
            {'5', '8', 'v'},
            {'9', '6', 'v'},
            {'4', '8', 'n'},
            {'8', '8', 'n'},
            {'5', '0', 'n'},
            {'9', '4', 'n'},
            {'0', '7', 'v'},
            {'6', '5', 'v'},
            {'8', '7', 'n'},
            {'3', '9', 'v'},
            {'5', '7', 'n'},
            {'4', '2', 'n'},
            {'0', '8', 'n'},
            {'6', '0', 'v'},
            {'8', '0', 'n'},
            {'3', '2', 'n'},
            {'1', '6', 'n'},
            {'8', '6', 'n'},
            {'3', '4', 'v'},
            {'9', '5', 'n'},
            {'6', '6', 'n'},
            {'5', '5', 'v'},
            {'2', '0', 'n'},
            {'8', '6', 'v'},
            {'7', '1', 'v'},
            {'1', '0', 'v'},
            {'6', '1', 'v'},
            {'2', '7', 'v'},
            {'1', '6', 'n'},
            {'8', '3', 'v'},
            {'5', '5', 'n'},
            {'7', '3', 'n'},
            {'6', '9', 'v'},
            {'3', '3', 'n'},
            {'4', '6', 'v'},
            {'7', '8', 'v'},
            {'9', '4', 'n'},
            {'8', '7', 'v'},
            {'3', '9', 'v'},
            {'1', '0', 'n'},
            {'7', '8', 'v'},
            {'5', '3', 'n'},
            {'2', '8', 'n'},
            {'7', '3', 'n'},
            {'6', '6', 'n'},
            {'9', '6', 'v'},
            {'9', '8', 'v'},
            {'9', '7', 'n'},
            {'9', '3', 'n'},
            {'7', '6', 'v'},
            {'4', '6', 'n'},
            {'2', '2', 'v'},
            {'3', '7', 'v'},
            {'8', '3', 'v'},
        };

        final char[][] B10 = {
            {'t', 'j', 'f', 'i', 's', 'h', 't', 'n'},
            {'d', 'q', 'k', 'y', 'h', 'l', 'k', 'c'},
            {'i', 's', 'h', 't', 'n'},
            {'r', 'b', 'z', 'b', 'h'},
            {'t', 'f', 't', 'w', 'z', 'l'},
            {'c', 'f', 'z', 'v', 'e', 'r', 'w', 'o', 'o'},
            {'b', 'n', 't', 'i', 'l', 'd', 'f'},
            {'o', 'f', 'a', 'o', 'g'},
            {'v', 'w', 'o', 's'},
            {'q', 'e', 'u', 'y'},
            {'p', 'o', 'b', 'u', 'q'},
            {'s', 'i', 'y', 'y', 's', 'c', 'i'},
            {'b', 'y', 'l'},
            {'c', 's'},
            {'t', 'm', 'e', 'o', 'b', 'x'},
            {'l', 'k', 'c', 'x', 'a', 'v'},
            {'t', 'k', 'u', 'y'},
            {'n', 'a', 'g', 'i', 'm', 'n', 'a'},
            {'r', 'q', 'e'},
            {'y', 'l', 'h', 'u', 'd', 'v'},
            {'c', 'z', 'z', 'z'},
            {'h', 'v', 'b', 'v', 's', 'x'},
            {'v', 'l'},
            {'e', 'o'},
            {'b', 'u', 'q', 'r', 't', 't', 'h'},
            {'h', 'h', 'p', 'z', 'e', 'f', 'v', 'w'},
            {'z', 'f'},
            {'o', 'g', 'c', 'u', 'f', 'h'},
            {'r', 't', 't'},
            {'c', 's', 'v'},
            {'y', 'y', 's', 'c', 'i', 'e', 'e', 'b', 't'},
            {'a', 's', 'y', 'h', 'k', 'y', 'w', 'd'},
            {'f', 'o', 'h', 'v', 'w', 'o', 'h', 'r'},
            {'b', 'u', 'q', 'r', 't', 't', 'h', 'v', 'b'},
            {'k', 'c', 'z', 'z'},
            {'k', 'y'},
            {'e', 'f', 'v', 'w', 'o', 's', 'r', 'h'},
            {'l', 'k', 'c', 'x', 'a', 'v', 'k'},
            {'q', 'r', 't', 't', 'h', 'v'},
            {'h', 'i'},
            {'h', 'n', 'f', 'z', 'b'},
            {'l', 't', 'y', 'f', 'p', 't'},
            {'s', 'h', 'k', 'f', 'k'},
            {'b', 'y', 'l', 'h', 'u', 'd', 'v'},
            {'s', 'h', 't', 'n', 'a', 'g', 'i', 'm'},
            {'c', 'h', 'm', 'a', 'n', 'o', 'y'},
            {'h', 'u', 'd', 'v', 's', 'f', 'n'},
            {'v', 'w', 'o', 'h', 'r'},
            {'c', 'f'},
            {'n', 'a', 'g'},
            {'k', 'e', 't', 'f', 't', 'w', 'z'},
        };

        final char[][] P10 = {
            {'1', '8', 'n'},
            {'1', '4', 'n'},
            {'4', '8', 'n'},
            {'0', '5', 'v'},
            {'7', '6', 'v'},
            {'3', '7', 'v'},
            {'1', '3', 'n'},
            {'6', '7', 'n'},
            {'6', '9', 'n'},
            {'1', '5', 'n'},
            {'1', '1', 'v'},
            {'4', '2', 'v'},
            {'5', '1', 'v'},
            {'6', '0', 'n'},
            {'7', '6', 'n'},
            {'6', '4', 'n'},
            {'3', '3', 'v'},
            {'8', '8', 'n'},
            {'0', '5', 'n'},
            {'5', '2', 'v'},
            {'9', '2', 'n'},
            {'1', '9', 'v'},
            {'8', '0', 'v'},
            {'9', '6', 'v'},
            {'1', '3', 'v'},
            {'0', '9', 'n'},
            {'6', '5', 'v'},
            {'9', '7', 'n'},
            {'1', '6', 'v'},
            {'6', '0', 'n'},
            {'4', '4', 'v'},
            {'9', '8', 'v'},
            {'6', '6', 'v'},
            {'1', '3', 'v'},
            {'8', '2', 'n'},
            {'3', '4', 'n'},
            {'4', '9', 'n'},
            {'6', '4', 'n'},
            {'1', '5', 'v'},
            {'0', '2', 'v'},
            {'9', '5', 'n'},
            {'8', '1', 'n'},
            {'7', '0', 'v'},
            {'5', '1', 'v'},
            {'5', '8', 'n'},
            {'8', '4', 'v'},
            {'5', '4', 'v'},
            {'6', '9', 'v'},
            {'3', '7', 'v'},
            {'8', '8', 'n'},
            {'7', '4', 'v'},
        };

        System.out.println(Druga.krizankaOK(B01, P01));
        System.out.println(Druga.krizankaOK(B02, P02));
        System.out.println(Druga.krizankaOK(B03, P03));
        System.out.println(Druga.krizankaOK(B04, P04));
        System.out.println(Druga.krizankaOK(B05, P05));
        System.out.println(Druga.krizankaOK(B06, P06));
        System.out.println(Druga.krizankaOK(B07, P07));
        System.out.println(Druga.krizankaOK(B08, P08));
        System.out.println(Druga.krizankaOK(B09, P09));
        System.out.println(Druga.krizankaOK(B10, P10));
    }
}
