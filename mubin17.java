import java.util.Scanner;

public class mubin17 {
    public static void main(String[] args) {
       
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Value : ");
        x=sc.nextInt();
    
        if(x==10)
        {
            System.out.print("Value of X is 10");

        }
        else if (x==20) 
        {
            System.out.print("Value of X is 20");
            
        }
        else if (x==30) 
        {
            System.out.print("Value of X is 30");
            
        }
        else
        {
            System.out.print("this is else Statement");

        }
        sc.close();
    }
    
}
