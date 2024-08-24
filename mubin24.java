import java.util.Scanner;

public class mubin24 {
    private static Scanner sc;
        public static void main(String[] args) {
            int number;
            sc=new Scanner(System.in);
            System.out.print("Please enter the number to check whether it is Divisible by 5 and 11 : ");
            number =sc.nextInt();

            //this method is using as if else
            String message =((number %5==0)&&(number %11==0))? 
            "is Divisible  by 5 and 11" :  " is not Divisible  by 5 and 11";
            System.out.println("\n Given number "+number+message);
            
            
            // and more method is if else

            if ((number %5==0) && (number %11==0) )
            {
                System.out.println("\n \n is Divisible by 5 and 11");

                
            }
            else
            {
                System.out.println("is not Divisible by 5 and 11 ");
            }
    }
    
}
