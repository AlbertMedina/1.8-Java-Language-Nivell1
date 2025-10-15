package level2;

import Utils.LambdasStreamsUtils;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> names = List.of("Albert", "Pol", "Ana", "ada", "Roc", "Ari");
        System.out.println("Names with 3 letters starting with capital 'A': " + LambdasStreamsUtils.getWordsStartingWithCapitalLetterWithLength(names, 'A', 3));

        System.out.println();

        List<Integer> numbers = List.of(3, 55, 44);
        System.out.println("String with odd and even numbers: " + LambdasStreamsUtils.getOddEvenString(numbers));

        System.out.println();

        System.out.println("Operations");
        testOperation();
    }

    private static void testOperation() {
        Operation sum = (float a, float b) -> a + b;
        Operation subtraction = (float a, float b) -> a - b;
        Operation multiplication = (float a, float b) -> a * b;
        Operation division = (float a, float b) -> {
            if (b == 0) {
                throw new IllegalArgumentException("Cannot divide by 0.");
            }
            return a / b;
        };

        float a = 1f;
        float b = 2f;

        System.out.println(a + " + " + b + " = " + sum.operation(a, b));
        System.out.println(a + " - " + b + " = " + subtraction.operation(a, b));
        System.out.println(a + " * " + b + " = " + multiplication.operation(a, b));

        try {
            System.out.println(a + " / " + b + " = " + division.operation(a, b));
        } catch (IllegalArgumentException e) {
            System.out.println("Error in division: " + e.getMessage());
        }
    }
}
