import java.util.Scanner;
public class mubin23 {
    public static void main(String[] args) {
        float height,weight,bmi;
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the hight (in inches) :");
        height=sc.nextFloat();

        System.out.print("Enter the weight (in pounds) :");
        weight = sc.nextFloat();

        bmi=(float)(weight/Math.pow(height, 2)* 703);

        System.out.println("the Bmi is :"+bmi);

        if (bmi<16.00) {
        
        System.out.println("Starvation ");
        }
        else if (bmi>=16.00 && bmi<=16.99) {
            System.out.println("emaciation");
            
        }
        else if (bmi>=17.00 && bmi<=18.49) {
            System.out.println("underweight");
            
        }
        else if (bmi>=18.50 && bmi<=22.99) {
            System.out.println("normal, low range");
            
        }
        else if (bmi>=23.00 && bmi<=24.99) {
            System.out.println("normal, high range");
            
        }
        else if (bmi>=25.00 && bmi<=27.49) {
            System.out.println("overweight, low range");
            
        }
        else if (bmi>=27.50 && bmi<=29.99) {
            System.out.println("overweight , high range");

            
        }
        else if (bmi>=30.00 && bmi<=34.99) {
            System.out.println("1st degree is obesity");
            
        }
        else if (bmi>=35.00 && bmi<=39.90) {
            System.out.println("2nd degree is obesity");
            
        }
        else 
        {
            System.out.println("3rd degree is obesity");
        }
        sc.close();

    }
    
}
