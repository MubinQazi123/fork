import java.util.Scanner;

public class mFahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        double number=sc.nextDouble();

        double fahrenheit = (number * 9/5) + 32;

        System.out.println("Temperature in Fahrenheit: "+fahrenheit);
        sc.close();
    }
    
}
