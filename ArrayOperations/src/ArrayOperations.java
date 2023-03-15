import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] NumberS = new int[15];
        System.out.println("Enter 15 integers:");
        for (int i = 0; i < 15; i++) {
            NumberS[i] = scanner.nextInt();
        }
        System.out.println("The numbers you entered are:");
        for (int i = 0; i < 15; i++) {
            System.out.print(NumberS[i] + " ");
        }
        System.out.println();
        System.out.print("Enter a number to search for: ");
        int searchNumber = scanner.nextInt();
        int index = -1;
        for (int i = 0; i < 15; i++) {
            if (NumberS[i] == searchNumber) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("Number not found in this array.");
        } else {
            System.out.println("The number found at index " + index);
        }
        int[] reversedNumbers = new int[15];
        for (int i = 0; i < 15; i++) {
            reversedNumbers[i] = NumberS[14 - i];
        }
        System.out.println("The numbers in reverse order are:");
        for (int i = 0; i < 15; i++) {
            System.out.print(reversedNumbers[i] + " ");
        }
        System.out.println();
        int sum = 0;
        int product = 1;
        for (int i = 0; i < 15; i++) {
            sum += NumberS[i];
            product *= NumberS[i];
        }
        System.out.println("The sum of the numbers is: " + sum);
        System.out.println("The product of the numbers is: " + product);
    }
}
