import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;
public class mubin12 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Big Integer :");
        //Big Integer Is read large integer value
        BigInteger myBigInteger=input.nextBigInteger();
        System.out.println("Using nextBiginteger():"+myBigInteger);

        //Big Decimal  Is read large decimal value
        System.out.println("Enter A big decimal:");
        BigDecimal myBigDecimal=input.nextBigDecimal();
        System.out.println("Using nextBigdecimal():"+myBigDecimal);
        input.close();

        
    }
    
}
