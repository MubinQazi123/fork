public class mdatatype {
    public static void main(String[] args) {
        System.out.println("Size of byte: " + Byte.SIZE/8 + " bytes");
        System.out.println("Size of short: " + Short.SIZE/8 + " bytes");
        System.out.println("Size of int: " + Integer.SIZE/8 + " bytes");
        System.out.println("Size of long: " + Long.SIZE/8 + " bytes");
        System.out.println("Size of float: " + Float.SIZE/8 + " bytes");
        System.out.println("Size of double: " + Double.SIZE/8 + " bytes");
        System.out.println("Size of char: " + Character.SIZE/8 + " bytes");
        System.out.println("Size of boolean: 1 byte"); // Size of boolean is not guaranteed to be 1 byte, but it's typically considered as 1 byte.
    }
}
