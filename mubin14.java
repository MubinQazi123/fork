import java.util.Scanner;

public class mubin14 {
    public static void main(String[] args) {
        int num1,num2,sum;
        Scanner sc = new Scanner(System.in);

        //using println number Enter karne ka niche aata 
        //sirf print type kare to same line me aata
        
        System.out.print("Enter The First Number :");
        num1=sc.nextInt();

        System.out.print("Enter The Second Number : ");
        num2=sc.nextInt();
        sc.close();

        sum=num1+num2;
        System.out.println(" Sum of these Number : "+sum);

    }
    
}
