package level2;

import Utils.LambdasStreamsUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> names = List.of("Albert", "Pol", "Ana", "ada", "Roc", "Ari");
        System.out.println("Names with 3 letters starting with capital 'A': " + LambdasStreamsUtils.getWordsStartingWithCapitalLetterWithLength(names, 'A', 3));

        System.out.println();

        List<Integer> numbers = List.of(3, 55, 44);
        System.out.println("String with odd and even numbers: " + LambdasStreamsUtils.getOddEvenString(numbers));

        System.out.println();

        System.out.println("Operations:");
        OperationsDemo.testOperations(3f, 2f);

        System.out.println();

        System.out.println("Test list sorting:");
        List<String> myList = new ArrayList<>(Arrays.asList("1234", "HELLO", "8765.4321", "chocolate", "00000000000", "one", "Abracadabra", "5f"));
        testListSorting(myList);
    }


    private static void testListSorting(List<String> words) {
        words.sort(Comparator.comparingInt(w -> w.charAt(0)));
        System.out.println("List ordered by first character: " + words);

        words.sort(Comparator.comparing(w -> !w.toLowerCase().contains("e")));
        System.out.println("List ordered by 'e' character: " + words);

        words = words.stream().map(w -> w.replace('a', '4').replace('A', '4')).toList();
        System.out.println("List changing 'a' by '4': " + words);

        words = words.stream().filter(Main::isNumeric).toList();
        System.out.println("List numeric elements: " + words);
    }

    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
