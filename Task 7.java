import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.print("10: ");
        double num1 = scanner.nextDouble();

        System.out.print("15: ");
        double num2 = scanner.nextDouble();

        // Perform arithmetic operations
        double sumResult = add(num1, num2);
        double differenceResult = subtract(num1, num2);
        double productResult = multiply(num1, num2);
        double divisionResult = divide(num1, num2);

        // Print the results
        System.out.println("\nResults:\n");
        System.out.println("Sum: " + sumResult);
        System.out.println("Difference: " + differenceResult);
        System.out.println("Product: " + productResult);
        System.out.println("Division: " + divisionResult);

        // Close the Scanner
        scanner.close();
    }

    // Method to add two numbers
    private static double add(double x, double y) {
        return x + y;
    }

    // Method to subtract two numbers
    private static double subtract(double x, double y) {
        return x - y;
    }

    // Method to multiply two numbers
    private static double multiply(double x, double y) {
        return x * y;
    }

    // Method to divide two numbers
    private static double divide(double x, double y) {
        if (y != 0) {
            return x / y;
        } else {
            System.out.println("Cannot divide by zero.");
            return Double.NaN; // Not a Number
        }
    }
}
