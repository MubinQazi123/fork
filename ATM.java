
import java.util.Scanner;

public class ATM {
    static Scanner sc = new Scanner(System.in);
    static double bal = 10000;
    static int PIN = 1234;

    public static void main(String[] args) {
        System.out.println("WELCOME TO ATM");
        System.out.println("ENTER YOUR PIN: ");
        int pin = sc.nextInt();

        if (PIN != pin) {
            System.out.println("Incorrect pin");
            showMenu();
        } else {
            int choice;
            do {
                showMenu();
                choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        //checkBalance();
                        break;
                    case 2:
                        //deposit();
                        break;
                    case 3:
                        //withdraw();
                        break;
                    case 4:
                        System.out.println("Thank you for using our ATM.");
                        break;
                    default:
                        System.out.println("Wrong choice");
                        break;
                }
            } while (choice != 4);
        }
    }

    public static void showMenu() {
        System.out.println("\nATM Menu:");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
    }
}