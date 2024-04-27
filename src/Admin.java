import java.util.Scanner;
public class Admin {
    public static void main(String[] args) {
        // Hardcoded username and password
        String username = "Seungcheol";
        String password = "password";

        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their username
        System.out.print("Enter your username: ");
        String enteredUsername = scanner.nextLine();

        // Prompt the user to enter their password
        System.out.print("Enter your password: ");
        String enteredPassword = scanner.nextLine();

        // Check if entered credentials match hardcoded credentials
        if (enteredUsername.equals(username) && enteredPassword.equals(password)) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Login failed. Please check your username and password.");
        }

        // Close the scanner
        scanner.close();
    }
}
