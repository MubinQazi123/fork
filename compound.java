import java.util.Scanner;

class compound{
    public static void main(String[] args){

         System.out.print("Enter The principle Amount:");
         Scanner s= new Scanner(System.in);
         double principle = s.nextDouble();
         System.out.print("\n Enter the interest per annum: " );
         double rate = s.nextDouble();
         System.out.print("\n Enter time priod in year: ");
         double time = s.nextDouble();
         System.out.print("\n Enter number of time the interest is Comound annulay: ");
         int n = s.nextInt();
         double Amount = principle * Math.pow(1+(rate/(n*100)),n*time);
         double ci = Amount-principle;
         System.out.print("\n compound interest = "+ci);
         s.close();






    }
}
