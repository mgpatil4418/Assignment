import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Increment age by 1
        age = age + 1;

        // Print the result
        System.out.println("Your age next year will be: " + age);

        // Close the scanner
        scanner.close();
    }
}
