import java.util.Scanner;

public class mubin16 {
    public static void main(String[] args) {
        float p,r,t,sinterest;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The Principal : ");
        p=sc.nextFloat();

        System.out.print("Enter The Rate Of Intrest : ");
        r=sc.nextFloat();

        System.out.print("Enter The Time Period : ");
        t=sc.nextFloat();
        sc.close();

        sinterest=(p*r*t)/100;
        System.out.println("Simple Intrest Is : "+sinterest);


    }
    
}
