import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int PaliNumber = scanner.nextInt();

        // Create a variable to store the reverse of the number
        int reverse = 0;

        // Create a copy of the original number to manipulate
        int originalNumber = PaliNumber;

        // Reverse the original number and store it in the reverse variable
        while (originalNumber != 0) {
            int digit = originalNumber % 10;
            reverse = reverse * 10 + digit;
            originalNumber /= 10;
        }

        // Check if the reversed number is equal to the original number
        if (PaliNumber == reverse) {
            System.out.println(PaliNumber + " is a palindrome number.");
        } else {
            System.out.println(PaliNumber + " is not a palindrome number.");
        }
    }
}
