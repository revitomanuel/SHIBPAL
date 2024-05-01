import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;
public class Admin {
    public static HashMap<String, Restaurant> restaurants = new HashMap<>();

    public static HashMap<String, Restaurant> getRestaurants(){

        return restaurants;
    }
    public static void main(String[] args) {
        String username = "Seungcheol";
        String password = "password";

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your username: ");
        String enteredUsername = scanner.nextLine();

        System.out.print("Enter your password: ");
        String enteredPassword = scanner.nextLine();

        if (enteredUsername.equals(username) && enteredPassword.equals(password)) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Login failed. Please check your username and password.");
        }

        scanner.close();
    }

    public static void restaurantInit(){

    }
    public static void menuAdmin(){
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("----------------------------");
            System.out.println("| 1. Restaurant List       |");
            System.out.println("| 2. Add New Restaurant    |");
            System.out.println("| 3. Delete Restaurant     |");
            System.out.println("| 4. Back                  |");
            System.out.println("| 0. Exit                  |");
            System.out.println("----------------------------");

            System.out.print(" Enter Choice: ");
            int choice = scanner.nextInt();

            switch (choice){
                case 1:
                    break;

                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}
