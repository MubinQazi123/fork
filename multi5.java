public class multi5 implements Runnable 
{
 public void run()
 {
    System.out.println("Thread is running...............................");

 }  
 public static void main(String[] args) {
    multi5 m1=new multi5();
    Thread t1=new Thread(m1);
    t1.start();
 } 
}
