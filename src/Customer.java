import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;

public class Customer {
    private String username;
    private String password;
    private static HashMap<String, String> users = new HashMap<>();  //membuat objek HashMap untuk menyimpan data user
    public static HashMap<String, Restaurant> restaurants = Admin.getRestaurants();

    //Deklarasi variabel global
    private static int choice;

    public static void menuCustomer() {
        Scanner input = new Scanner(System.in);


        System.out.println("✧====================================✧");
        System.out.println("            ₊˚⊹ SHIBPAL ⊹˚₊            ");
        System.out.println("                                       ");
        System.out.println(" 1. Login                              ");
        System.out.println(" 2. Sign Up                            ");
        System.out.println(" 0. Back                               ");
        System.out.println("✧====================================✧");

        do {
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    customerLogin();
                    break;
                case 2:
                    customerSignUp();
                    break;
                case 0:
                    Main back = new Main();
                    back.userType();
                    break;
                default:
                    //Validasi input apabila input yang dimasukkan selain 1, 2, dan 0
                    System.out.println("Invalid Choice. Please enter the available options! \n");
            }
        } while (choice < 0 || choice > 2);

        input.close();
    }

    private static void customerLogin() {
        Scanner input = new Scanner(System.in);
        int loginStatus;

        do {
            System.out.print("Username: ");
            String username = input.nextLine();
            System.out.print("Password: ");
            String password = input.nextLine();

            if (users.containsKey(username) && users.get(username).equals(password)) {  //memeriksa apakah username dan password sesuai
                System.out.println("Login successfully!\n\n");
                loginStatus = 1;
                makeOrder();
            }
            else {
                System.out.println("Login unsuccessfully, please try again.\n\n");
                loginStatus = 0;
            }
        } while(loginStatus == 0);

    }

    private static void customerSignUp() {
        Scanner input = new Scanner(System.in);
        int signUpStatus;

        System.out.print("Username: ");
        String username = input.nextLine();
            if (users.containsKey(username)) {  //memeriksa apakah username sudah terdaftar
                System.out.println("Username already registered, please try again.");
                return;
            }

        do {
            System.out.print("Password: ");
            String password = input.nextLine();
                if (password.length() >= 8) { //memeriksa apakah jumlah karakter pada password sudah setidaknya 8 karakter
                    users.put(username, password);  //menambahkan data user baru ke dalam HashMap
                    System.out.println("Signup was successful! Please login.");
                    signUpStatus = 1;
                    customerLogin();
                } else {
                    System.out.println("Password must be at least 8 characters. Please try again.");
                    signUpStatus = 0;
                }
        } while(signUpStatus == 0);

    }

    private static void makeOrder() {
        ArrayList<Order> orders = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        while(choice != 3){
            System.out.println("✧====================================✧");
            System.out.println(" 1. Make Order                         ");
            System.out.println(" 2. View Order                         ");
            System.out.println(" 0. Back                               ");
            System.out.println("✧====================================✧");

            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    //Menampilkan daftar restaurant
                    System.out.println("\n\n================ Restaurants ==================");
                        for (String restaurantName : restaurants.keySet()) {
                            System.out.println(restaurantName + " --- " + restaurants.get(restaurantName).getAddress());
                        }
                    System.out.println("===============================================");
                    System.out.print("Enter restaurant name: ");
                    String restaurantName = input.nextLine();
                        if (!restaurants.containsKey(restaurantName)) {
                            System.out.println("Restaurant not found");
                            break;
                        }

                    Restaurant restaurant = restaurants.get(restaurantName);
                    Order newOrder = new Order(restaurant);

                    //Menampilkan menu yang tersedia pada restaurant yang dipilih
                    String menuInput = "";
                    while (!menuInput.equals("n")) {
                        System.out.println("\n\n=======" + restaurant.getName() + "=======");
                        System.out.println("=================== Menu ======================");
                        int menuNumber = 1;
                            for (Menu menu : restaurant.getMenus()) {
                                System.out.println(menuNumber + "-" + menu.getName() + "-" + menu.getPrice());
                                menuNumber++;
                            }
                        System.out.println("===============================================");
                        System.out.print("Enter menu number: ");
                        int menuIndex = input.nextInt();
                        System.out.print("Enter quantity: ");
                        int quantity = input.nextInt();
                        input.nextLine();

                        newOrder.addMenu(restaurant.getMenus().get(menuIndex - 1), quantity);

                        System.out.print("Add more menu? (y/n): ");
                        menuInput = input.nextLine();
                    }

                    System.out.print("Enter distance (in km): ");
                    double jarak = input.nextInt();

                    newOrder.setJarak(jarak);
                    orders.add(newOrder);
                    System.out.println("Order placed successfully");

                    break;
                case 2:
                    //Menampilkan detail order dari pesanan yang dibuat Customer
                    System.out.println("\n\n================== Order ======================");
                        for (int i = 0; i < orders.size(); i++) {
                            Order order = orders.get(i);
                            System.out.println((i + 1) + ". " + order.getRestaurant().getName());
                            System.out.println("Menu:");
                                for (Menu menu : order.getMenus().keySet()) {
                                    System.out.println(menu.getName() + " x " + order.getMenus().get(menu));
                                }
                        System.out.println("Distance (Shipping: 10000/km): " + order.getJarak() + " km");
                        System.out.println("Total Price: " + order.getTotalPrice());
                        }
                    System.out.print("Would you like to order again? (y/n)  ");
                    String pesan = input.nextLine();
                        //Jika n, maka perulangan untuk make order dihentikan dan akan menampilkan pesan di bawah
                        if(pesan.equals("n") || pesan.equals("N")) {
                            choice = 0;
                            System.out.println("\nPlease Make Payment");
                            Greetings.gomawo();
                            break;
                        }
                        else{
                            choice = 1;
                        }

                    break;
                case 0:
                    menuCustomer();
                    break;

                default:
                    System.out.println("Invalid Choice. Please enter the available options! \n");
                    break;
            }
        }
    }
}
