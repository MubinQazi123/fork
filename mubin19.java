import java.util.Scanner;
public class mubin19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble();
        
        // Calculate area
        double area = Math.PI * radius * radius;
        
        // Calculate circumference
        double circumference = 2 * Math.PI * radius;
        
        System.out.println("Area of the circle: " + area);
        System.out.println("Circumference of the circle: " + circumference);
        
        sc.close();

    }
}



    
    

