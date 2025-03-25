import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Prompt user to enter age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Print name and age
        System.out.println("Your name is: " + name);
        System.out.println("Your age is: " + age);

        // Close the scanner
        scanner.close();
    }
}
