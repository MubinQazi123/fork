public class multi6 implements Runnable
{
    public void run()
    {
        for(int i=1;i<=20;i++)
        {
            System.out.print(" "+i);
        }
    }
    public static void main(String[] args) {
        multi6 m1=new multi6();
        Thread t1=new Thread(m1);
        t1.start();
    }
    
}

