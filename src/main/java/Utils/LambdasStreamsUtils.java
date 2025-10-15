package Utils;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LambdasStreamsUtils {

    public static List<String> getWordsContainingLetter(List<String> words, char c) {
        return words.stream().filter(w -> w.trim().toLowerCase().contains(Character.toString(c).toLowerCase())).toList();
    }

    public static List<String> getWordsContainingLetterWithMinLength(List<String> words, char c, int minLength) {
        return words.stream().filter(w -> w.trim().toLowerCase().contains(Character.toString(c).toLowerCase()) && w.length() >= minLength).toList();
    }

    public static List<String> sortByLength(List<String> words, boolean ascending) {
        List<String> sortedList = words.stream().sorted(Comparator.comparingInt(String::length)).toList();
        return ascending ? sortedList : sortedList.reversed();
    }

    public static List<String> getWordsStartingWithCapitalLetterWithLength(List<String> words, char c, int length) {
        return words.stream().filter(w -> w.length() == length && !w.trim().isEmpty() && w.trim().charAt(0) == Character.toUpperCase(c)).toList();
    }

    public static String getOddEvenString(List<Integer> nums) {
        return nums.stream().map(n -> (n % 2 == 0 ? "e" : "o") + n).collect(Collectors.joining(", "));
    }
}