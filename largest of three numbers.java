import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter three numbers
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter third number: ");
        int num3 = scanner.nextInt();

        // Find the largest number
        int largest = Math.max(Math.max(num1, num2), num3);

        // Print the result
        System.out.println("The largest number is: " + largest);

        // Close the scanner
        scanner.close();
    }
}


10