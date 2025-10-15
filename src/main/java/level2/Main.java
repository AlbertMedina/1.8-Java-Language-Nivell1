package level2;

import Utils.LambdasStreamsUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> names = List.of("Albert", "Pol", "Ana", "ada", "Roc", "Ari");
        System.out.println("Names with 3 letters starting with capital 'A': " + LambdasStreamsUtils.filterWordsStartingWithCapitalLetterWithLength(names, 'A', 3));

        System.out.println();

        List<Integer> numbers = List.of(3, 55, 44);
        System.out.println("String with odd and even numbers: " + LambdasStreamsUtils.getFormattedOddEvenString(numbers));

        System.out.println();

        System.out.println("Operations:");
        OperationsDemo.testOperations(3f, 2f);

        System.out.println();

        List<String> myList = new ArrayList<>(Arrays.asList("1234", "HELLO", "8765.4321", "chocolate", "00000000000", "one", "Abracadabra", "5f"));
        System.out.println("List methods:");
        System.out.println("List ordered by first character: " + LambdasStreamsUtils.getAlphabeticallySortedList(myList));
        System.out.println("List ordered by words containing 'e' priority: " + LambdasStreamsUtils.getCharacterPriorirySortedList(myList, 'e'));
        System.out.println("List changing 'a' by '4': " + LambdasStreamsUtils.getCharacterReplaceList(myList, 'a', '4'));
        System.out.println("List numeric elements: " + LambdasStreamsUtils.filterNumericElements(myList));
    }
}
