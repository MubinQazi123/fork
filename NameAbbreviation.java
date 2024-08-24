import java.util.Scanner;

public class NameAbbreviation {
    public static void main(String[] args) {
        Scanner mk = new Scanner(System.in);
        
        System.out.print("Enter your full name: ");
        String fullName = mk.nextLine();
        
        String[] words = fullName.split("\\s+");
        StringBuilder abbreviation = new StringBuilder();
        
        for (String word : words) {
            abbreviation.append(word.charAt(0));
        }
        
        System.out.println("Abbreviated name: " + abbreviation.toString().toUpperCase());
        
        mk.close();
    }
}
