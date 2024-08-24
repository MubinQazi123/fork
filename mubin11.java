import java.util.Scanner;

public class mubin11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Float :");
        Float myFloat=input.nextFloat();
        System.out.println("Float Entered ="+myFloat);

        //float chote value k liye aur Double bade value k liye 

        System.out.println("Enter Double :");
        double myDouble=input.nextDouble();
        System.out.println("Double Entered ="+myDouble);

        //next() ye sapace nahi leta aur space k baad ka word cut karta 
        //nextline() ye space leta aur uske aage ka word bhi
        System.out.println("Enter Text :");
        String myString=input.next();
        System.out.println("text Entered="+myString);


    }
    
}
