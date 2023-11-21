import java.util.Scanner;

public class LargestNumberFinder {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Get three numbers from the user
        System.out.print("20: ");
        double num1 = scanner.nextDouble();

        System.out.print("22: ");
        double num2 = scanner.nextDouble();

        System.out.print("25: ");
        double num3 = scanner.nextDouble();

        // Find and print the largest number or indicate if they are all equal
        findAndPrintLargestNumber(num1, num2, num3);

        // Close the scanner
        scanner.close();
    }

    // Function to find and print the largest number or indicate if they are all equal
    private static void findAndPrintLargestNumber(double num1, double num2, double num3) {
        if (num1 == num2 && num2 == num3) {
            System.out.println("All numbers are equal.");
        } else {
            double max = Math.max(num1, Math.max(num2, num3));
            System.out.println("The largest number is: " + max);
        }
    }
}
