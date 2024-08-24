public class callpi {
    public static float pi()
    {
        return 3.142f;
    }
    public static int sum(int a, int b)
    {
        int c;
        c=a+b;
        return c;
    
    }
    public static void main(String args[])
    {
        int x=19, y=23,z;
        //float abc;
        //abc=pi();
        System.out.println("The Value of PI is 22/7="+pi());
        //System.out.println("The Value of PI is 22/7="+abc);
        z=sum(x,y);
        System.out.println("Sum of " +x+ " and " +y+ " is: "+z);
    }

    
}
