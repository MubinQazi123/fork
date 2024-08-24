import java.util.Scanner;

public class GrossSalaryCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter employee's basic salary: ");
        double basicSalary = sc.nextDouble();

        // Calculate gross salary
        double hra = 0.2 * basicSalary; // 20% of basic salary
        double da = 0.1 * basicSalary;  // 10% of basic salary
        double grossSalary = basicSalary + hra + da;

        System.out.println("Gross Salary: " + grossSalary);

        sc.close();
    }
}
