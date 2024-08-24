import java.util.Scanner;
public class PowerCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer (N): ");
        int N = sc.nextInt();
        
        // Calculate and print N^1, N^2, and N^3
        System.out.println("First three powers of " + N + ":");
        System.out.println(N + "^1 = " + N);
        System.out.println(N + "^2 = " + (N * N));
        System.out.println(N + "^3 = " + (N * N * N));
        
        sc.close();
    }
}
