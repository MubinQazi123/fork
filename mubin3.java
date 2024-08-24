import java.util.*;
public class mubin3 {
    public static void main(String[] args) {
        Scanner mk = new Scanner(System.in);
        int number ,p;
        System.out.println("Enter First Number");
        number= mk.nextInt();
        System.out.println("Enter Second Number");
        p=mk.nextInt();
        double result = Math.pow(number,p);
        System.out.println("Total :" +number+"^"+p+"="+result);
    }
    
}
