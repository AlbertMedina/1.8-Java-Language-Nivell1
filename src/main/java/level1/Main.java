package level1;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> words = List.of("Hello", "HI", "GOODBYE", "Bye", "Chocolate", "Spot");
        System.out.println("Words containing 'o': " + LambdasStreamsDemo.getWordsContainingLetter(words, 'o'));
        System.out.println("Words containing 'o' and with more than 5 characters: " + LambdasStreamsDemo.getWordsContainingLetterWithMinLength(words, 'o', 6));

        System.out.println();

        System.out.println("Months (lambda):");
        List<String> months = List.of("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December");
        months.forEach(month -> System.out.println(month));
        System.out.println("\nMonths (method reference):");
        months.forEach(System.out::println);

        System.out.println();

        Pi pi = () -> 3.1415;
        System.out.println("Pi value: " + pi.getPiValue());

        System.out.println();

        List<String> myList = List.of("1234", "hello", "87654321", "chocolate", "00000000000", "one");
        System.out.println(LambdasStreamsDemo.sortByLength(myList, true));
        System.out.println(LambdasStreamsDemo.sortByLength(myList, false));
    }
}
