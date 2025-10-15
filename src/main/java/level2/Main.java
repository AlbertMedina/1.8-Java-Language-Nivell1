package level2;

import level1.LambdasStreamsDemo;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> names = List.of("Albert", "Pol", "Ana", "ada", "Roc", "Ari");
        System.out.println("3 letters names starting with capital 'A': " + LambdasStreamsDemo.getWordsStartingWithCapitalLetterWithLength(names, 'A', 3));
    }
}
