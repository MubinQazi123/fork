public class binarynumberadd {
    
    public static void main(String[] args) {
        String binary1 = "1010";
        String binary2 = "1101";
        
        int decimal1 = Integer.parseInt(binary1, 2);
        int decimal2 = Integer.parseInt(binary2, 2);
        
        int sum = decimal1 + decimal2;
        
        String sumBinary = Integer.toBinaryString(sum);
        
        System.out.println("Sum of " + binary1 + " and " + binary2 + " is: " + sumBinary);
    }
    
}
