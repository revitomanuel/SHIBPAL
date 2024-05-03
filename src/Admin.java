import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;
public class Admin {
    public static HashMap<String, Restaurant> restaurants = new HashMap<>();
    public static HashMap<String, Restaurant> getRestaurants(){
        return restaurants;
    }
   public static void login() {
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
        //restaurant 1
        Restaurant restaurant1 = new Restaurant("ChicKen", "JL Uluwatu No. 520, Badung");
        restaurant1.addMenu(new Menu("Original Chicken", 23000));
        restaurant1.addMenu(new Menu("Sweet-Spicy Chicken", 27000));
        restaurant1.addMenu(new Menu("Soy Butter Chicken", 27000));
        restaurant1.addMenu(new Menu("Gochujang Chicken", 27000));
        restaurant1.addMenu(new Menu("Garlic Parmesan Chicken", 27000));
        restaurant1.addMenu(new Menu("Bburingkle Chicken", 27000));
        restaurant1.addMenu(new Menu("Can Soda", 10000));
        restaurant1.addMenu(new Menu("Midnight Sky Soda", 17000));
        restaurant1.addMenu(new Menu("Sunset Road Soda", 17000));

        //restaurant 2
        Restaurant restaurant2 = new Restaurant("Bulnoriya", "JL Sunset Road No. 127, Badung");
        restaurant2.addMenu(new Menu("Local Beef Short Skirt (200g)", 75000));
        restaurant2.addMenu(new Menu("Local Beef Sirloin (200g)", 100000));
        restaurant2.addMenu(new Menu("Local Beef Tongue (200g)", 80000));
        restaurant2.addMenu(new Menu("Local Beef Rib (200g)", 90000));
        restaurant2.addMenu(new Menu("Aus Beef Short Skirt (200g)", 100000));
        restaurant2.addMenu(new Menu("Aus Beef Sirloin (200g)", 125000));
        restaurant2.addMenu(new Menu("Aus Beef Tongue (200g)", 105000));
        restaurant2.addMenu(new Menu("Aus Beef Rib (200g)", 115000));
        restaurant2.addMenu(new Menu("Iced Tea", 10000));

        //restaurant 3
        Restaurant restaurant3 = new Restaurant("BabMyeon", "JL Raya Kuta No. 553, Badung");
        restaurant3.addMenu(new Menu("JjangMyeon", 20000));
        restaurant3.addMenu(new Menu("JjangBab", 18000));
        restaurant3.addMenu(new Menu("BibimMyeon", 24000));
        restaurant3.addMenu(new Menu("BibimBab", 18000));
        restaurant3.addMenu(new Menu("BokkeumMyeon", 20000));
        restaurant3.addMenu(new Menu("BokkeumBab", 20000));
        restaurant3.addMenu(new Menu("Mul NaengMyeon", 27000));
        restaurant3.addMenu(new Menu("Ramyeon", 18000));
        restaurant3.addMenu(new Menu("KimBab", 22000));
        restaurant3.addMenu(new Menu("BoriCha", 15000));

        //add restaurant data
        restaurants.put("ChicKen", restaurant1);
        restaurants.put("Bulnoriya", restaurant2);
        restaurants.put("BabMyeon", restaurant3);
    }
    public static void menuAdmin() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("----------------------------");
            System.out.println("| 1. Restaurant List       |");
            System.out.println("| 2. Add New Restaurant    |");
            System.out.println("| 3. Delete Restaurant     |");
            System.out.println("| 4. Back                  |");
            System.out.println("| 0. Exit                  |");
            System.out.println("----------------------------");

            System.out.print(" Enter Choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    viewRestaurants();
                    break;
                case 2:
                    addRestaurant();
                    break;
                case 3:
                    deleteRestaurant();
                    break;
                case 4:
                    Main.main(args);
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }

    public static void viewRestaurants(){
        System.out.println("\n");
        System.out.println("----           Restaurant List           -----\n");
        for (String restaurantName : restaurants.keySet()) {
            System.out.println("** " +restaurantName + ", " + restaurants.get(restaurantName).getAddress()) ;
            System.out.println("====                Menu                 =====");
            for (Menu menu : restaurants.get(restaurantName).getMenus()) {
                System.out.println("" + menu.getName() + "                        \t-- Rp " + menu.getPrice() + ",-");
            }
            System.out.println("---------------------------------------------");
            System.out.println("");
        }
        System.out.println("");
    }

    public static void addRestaurant(){
        Scanner masukkan = new Scanner(System.in);

        System.out.print("Enter restaurant name: ");
        String name = masukkan.nextLine();
        System.out.print("Enter restaurant address: ");
        String address = masukkan.nextLine();
        Restaurant newRestaurant = new Restaurant(name, address);
        String inputUlang = "";

        while (!inputUlang.equals("Bye")) {
            System.out.print("Enter menu (ex input format: menuName--menuPrice), input \"Bye\" to finish: ");
            inputUlang = masukkan.nextLine();
            if (!inputUlang.equals("Bye")) {
                String[] menuData = inputUlang.split("--");
                newRestaurant.addMenu(new Menu(menuData[0], Integer.parseInt(menuData[1])));
            }
        }
        restaurants.put(name, newRestaurant);
        System.out.println("Restaurant added successfully");
    }

    public static void deleteRestaurant(){
        Scanner insert = new Scanner(System.in);

        System.out.print("Enter restaurant name: ");
        String restaurantName = insert.nextLine();
        if (restaurants.containsKey(restaurantName)) {
            restaurants.remove(restaurantName);
            System.out.println("Restaurant deleted successfully");
        } else {
            System.out.println("Restaurant not found");
        }
    }

}
