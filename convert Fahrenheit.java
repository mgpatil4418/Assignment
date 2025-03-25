import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter temperature in Fahrenheit
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        // Convert Fahrenheit to Celsius
        double celsius = (fahrenheit - 32) * 5/9.0;

        // Print the result
        System.out.printf("%.2f degrees Fahrenheit is equal to %.2f degrees Celsius%n", fahrenheit, celsius);

        // Close the scanner
        scanner.close();
    }
}
