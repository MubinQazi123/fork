import java.util.Scanner;

public class mubin21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter marks of 5 Subject : ");

        System.out.print("subject 1:");
        double su1=input.nextDouble();

        System.out.print("subject 2:");
        double su2=input.nextDouble();

        System.out.print("subject 3:");
        double su3=input.nextDouble();

        System.out.print("subject 4:");
        double su4=input.nextDouble();

        System.out.print("subject 5:");
        double su5=input.nextDouble();

        double totalmarks=su1+su2+su3+su4+su5;

        System.out.print("the total marks is : "+totalmarks);

        double percentage=(totalmarks/5);

        System.out.print("\n percentage is : "+percentage+ "%");

        input.close();


    }
    
}
