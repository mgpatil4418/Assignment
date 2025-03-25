import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter two numbers
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        // Add the numbers
        int sum = num1 + num2;

        // Print the sum
        System.out.println("The sum is: " + sum);

        // Close the scanner
        scanner.close();
    }
}
