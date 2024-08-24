public class mul12 implements Runnable {
    public void run()
    {
        System.out.println("thread 1..");
    }
    
}
public class mul13 implements Runnable {
    public void run()
    {
        System.out.println("thread 2..");
    }
    
}
public class mul11 {

    public static void main(String[] args) {
        System.out.println("main");
        mul12 obj11=new mul12();
        mul13 obj21=new mul13();

        Thread th11=new Thread(obj11);
        Thread th21=new Thread(obj21);

        th11.start();
        th21.start();

    }
}