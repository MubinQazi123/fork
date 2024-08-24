import java.util.Scanner;

public class mubin26 {
    public static void main(String args[])
    {
        char grade;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the grade : ");
        grade=sc.next().charAt(0);
        
        switch (grade) {
            case 'A':
                System.out.println("Excellent!");
                break;
                case 'B':
                case 'C':
                System.out.println("welldone");
                break;
                case 'D':
                System.out.println("You passed");
                break;
                case 'F':
                System.out.println("Better try again ");
                break;
        
            default:
                System.out.println("Invalid grade");
                
        }
        sc.close();

        System.out.println("Your Grade is "+grade);
    }
    
}
