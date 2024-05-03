import java.util.Scanner;

public class Main {
    //Deklarasi variabel global
    private static int choice;


    public static void main(String[] args) {
        userType();
    }
    public static void userType() {
        Scanner input = new Scanner(System.in);

        Greetings.annyeong();

        do {
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    Admin.adminLogin();
                    break;
                case 2:
                    Customer.menuCustomer();
                    break;
                default:
                    //Validasi input apabila input yang dimasukkan selain 1 dan 2
                    System.out.println("Invalid Choice. Please enter the available options! \n");
            }
        } while (choice != 1 && choice != 2);

        input.close();
    }
}