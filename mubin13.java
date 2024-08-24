import java.util.*;
public class mubin13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Username:");
        String myString=input.nextLine();
    
        System.out.println("Enter Your Age:");
        int myInteger=input.nextInt();

        System.out.println("Welcome " +myString+" your age is "+myInteger);
        input.close();


    }
    
}
