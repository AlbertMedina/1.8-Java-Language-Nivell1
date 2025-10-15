package level2;

public class OperationsDemo {

    public static void testOperations(float n1, float n2) {
        Operation sum = (float a, float b) -> a + b;
        Operation subtraction = (float a, float b) -> a - b;
        Operation multiplication = (float a, float b) -> a * b;
        Operation division = (float a, float b) -> {
            if (b == 0) {
                throw new IllegalArgumentException("Cannot divide by 0.");
            }
            return a / b;
        };

        System.out.println(n1 + " + " + n2 + " = " + sum.operation(n1, n2));
        System.out.println(n1 + " - " + n2 + " = " + subtraction.operation(n1, n2));
        System.out.println(n1 + " * " + n2 + " = " + multiplication.operation(n1, n2));

        try {
            System.out.println(n1 + " / " + n2 + " = " + division.operation(n1, n2));
        } catch (IllegalArgumentException e) {
            System.out.println("Error in division: " + e.getMessage());
        }
    }
}
