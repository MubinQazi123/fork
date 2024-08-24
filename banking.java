import java.util.Scanner;

public class banking {
    public static void main(String[] args) {
        int user_pin;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the pin: ");
        user_pin=sc.nextInt();
        int pin=5050;
        if(pin==user_pin)
        {
            System.out.println(" 1  Withdraw");
            System.out.println(" 2  Deposit");
            System.out.println(" 3  Check Balance");
            System.out.println(" 4  EXIT");
           
    }
    else{
        System.out.println("wrong pin");
    }
    
    }
}
