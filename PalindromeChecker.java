import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Get the input string from the user
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Check if the input string is a palindrome
        if (isPalindrome(inputString)) {
            System.out.println("The input string is a palindrome.");
        } else {
            System.out.println("The input string is not a palindrome.");
        }

        // Close the scanner
        scanner.close();
    }

    // Function to check if a string is a palindrome
    private static boolean isPalindrome(String input) {
        // Use StringBuilder to create a reversed string
        StringBuilder reversed = new StringBuilder(input);
        reversed.reverse();

        // Use equals() method to check if the original and reversed strings are the same
        return input.equals(reversed.toString());
    }
}

