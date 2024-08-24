public class mchangevalue {
    public static void change(int a,int b) {
        a=a+2;
        b=b+2;
        System.out.println("In function changes are  " +a+ " and " +b);
    }
    public static void main(String[] args) {
        int x=10,y=20;
        System.out.println("Before Calling the function ");
        System.out.println("x="+x+"and y="+y);
        change(x,y);
        System.out.println("After Calling The Function");
        System.out.println("X= "+x+ " and Y="+y);

        
    }
    
}
