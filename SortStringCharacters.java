public class SortS {
    public static void main(String[] args) {
        String str = "Hello, World!";
        
        // Convert string to character array
        char[] charArray = str.toCharArray();
        
        // Sort the character array
        java.util.Arrays.sort(charArray);
        
        // Convert the sorted character array back to string
        String sortedStr = new String(charArray);
        
        // Print the sorted string
        System.out.println("Sorted string: " + sortedStr);
    }
}
