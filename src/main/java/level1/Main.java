package level1;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> words = List.of("Hello", "HI", "GOODBYE", "Bye", "Chocolate", "Spot");

        System.out.println("Words containing 'o': " + LambdasStreamsDemo.getWordsContainingLetter(words, 'o'));

        System.out.println("Words containing 'o' and with more than 5 characters: " + LambdasStreamsDemo.getWordsContainingLetterWithMinLength(words, 'o', 6));
    }
}
