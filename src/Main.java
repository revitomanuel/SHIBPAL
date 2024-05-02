import java.util.Scanner;

public class Main {
    //Deklarasi variabel global
    private static int choice;

    public static void main() {
        Scanner input = new Scanner(System.in);

        Greetings.annyeong();

        do {
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    //Panggil method dari kelas Admin di sini
                    break;
                case 2:
                    //Panggil method dari kelas Customer di sini
                    break;
                default:
                    //Validasi input apabila input yang dimasukkan selain 1 dan 2
                    System.out.println("Invalid Choice. Please enter the available options! \n");
            }
        } while (choice != 1 && choice != 2);
    }
}