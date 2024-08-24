import java.util.Scanner;
public class mubin20 {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the charchter:");
        char ch =input.next().charAt(0); ;
            
            // Convert char to int to get ASCII value
            int asciiValue = (int) ch;
            
            System.out.println("ASCII value of " + ch + " is: " + asciiValue);
        input.close();

        }
        
    }
    
