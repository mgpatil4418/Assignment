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

        // Subtract the numbers
        int difference = num1 - num2;

        // Print the result
        System.out.println("The difference is: " + difference);

        // Close the scanner
        scanner.close();
    }
}
