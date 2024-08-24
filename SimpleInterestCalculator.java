import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        
        System.out.print("Enter principal amount: ");
        double principal = sc.nextDouble();
        
       
        System.out.print("Enter annual interest rate (in percentage): ");
        double rate = sc.nextDouble();
        
       
        System.out.print("Enter time period (in years): ");
        double time = sc.nextDouble();
        
      
        double simpleInterest = (principal * rate * time) / 100;
        
  
        System.out.println("Simple Interest: " + simpleInterest);
        
        sc.close();
    }
}
