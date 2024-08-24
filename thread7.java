
class thread11 implements Runnable
{
    public void run()
    {
        System.out.println("Thread 1 "+Thread.currentThread().getName()+" "+Thread.currentThread().getPriority());
    }
}
class thread21 implements Runnable
{
    public void run()
    {
        System.out.println("Thread 2 "+Thread.currentThread().getName()+" "+Thread.currentThread().getPriority());
    }
}
class thread31 implements Runnable
{
    public void run()
    {
        System.out.println("Thread 3 "+Thread.currentThread().getName()+" "+Thread.currentThread().getPriority());
    }
}
public class thread7 {
    public static void main(String[] args) {
        Thread.currentThread().setName("nbnscoe");
        //Thread.currentThread().setPriority(9);
        System.out.println("Main Thread "+Thread.currentThread().getName()+" "+Thread.currentThread().getPriority());

        thread11 obj11=new thread11();
        thread21 obj21=new thread21();
        thread31 obj31=new thread31();

        Thread th11=new Thread(obj11);
        Thread th21=new Thread(obj21);
        Thread th31=new Thread(obj31);

        th11.setName("kaif");
        th21.setName("saif");
        th31.setName("talmeez");
        th11.setPriority(4);
        th21.setPriority(9);
        th31.setPriority(10);
       

        th11.start();
        th21.start();
        th31.start();


    }
}