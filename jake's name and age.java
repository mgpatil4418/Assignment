import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Define Jake's details
        String jakeId = "12345";
        String jakeName = "Jake";
        int jakeAge = 30;

        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter ID
        System.out.print("Enter user ID: ");
        String userId = scanner.nextLine();

        // Check if the ID matches Jake's ID
        if (userId.equals(jakeId)) {
            // Print Jake's details
            System.out.println("Name: " + jakeName);
            System.out.println("Age: " + jakeAge);
        } else {
            // Print error message if ID does not match
            System.out.println("Invalid user ID");
        }

        // Close the scanner
        scanner.close();
    }
}
