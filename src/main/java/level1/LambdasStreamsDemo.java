package level1;

import java.util.List;

public class LambdasStreamsDemo {

    public static List<String> getWordsContainingLetter(List<String> words, char c){
        return words.stream().filter(w -> w.trim().toLowerCase().contains(Character.toString(c).toLowerCase())).toList();
    }

    public static List<String> getWordsContainingLetterWithMinLength(List<String> words, char c, int minLength){
        return words.stream().filter(w -> w.trim().toLowerCase().contains(Character.toString(c).toLowerCase()) && w.length() >= minLength).toList();
    }
}
