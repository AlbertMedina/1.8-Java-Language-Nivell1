package level2;

import Utils.LambdasStreamsUtils;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> names = List.of("Albert", "Pol", "Ana", "ada", "Roc", "Ari");
        System.out.println("3 letters names starting with capital 'A': " + LambdasStreamsUtils.getWordsStartingWithCapitalLetterWithLength(names, 'A', 3));

        List<Integer> numbers = List.of(3, 55, 44);
        System.out.println("String with odd and even numbers: " + LambdasStreamsUtils.getOddEvenString(numbers));
    }
}
