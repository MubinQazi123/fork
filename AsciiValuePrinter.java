import java.util.Scanner;

public class AsciiValuePrinter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0); // Read a single character
        
        // Convert char to int to get ASCII value
        int asciiValue = (int) ch;
        
        System.out.println("ASCII value of " + ch + " is: " + asciiValue);
        
        sc.close();
    }
}
 