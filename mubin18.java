import java.util.Scanner;
public class mubin18 {
    public static void main(String[] args) {
        int x,y,z;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter The Three Diffrent Value : ");
        x=sc.nextInt();
        y=sc.nextInt();
        z=sc.nextInt();
        System.out.println("the value of x is :"+x);
        System.out.println("the value of y is :"+y);
        System.out.println("the value of z is :"+z);

        if(x>y&&x>z)
        {
            //number ko  print kare format me to use karne ka format 
            System.out.format("\n %d is Greater Than Both %d and %d",x,y,z);
        }
        else if(y>x&&y>z)
        {
            //number ko  print kare format me to use karne ka format 
            System.out.format("\n %d is Greater Than Both %d and %d",y,x,z);
        }
        else if(z>x&&z>y)
        {
            //number ko  print kare format me to use karne ka format 
            System.out.format("\n %d is Greater Than Both %d and %d",z,x,y);

        }
        else 
        {
            System.out.println("\n Either Any Two Values Or all the Three Values Are Equal");
        }


        sc.close();
    }
    
}
