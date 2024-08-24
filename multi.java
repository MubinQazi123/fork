public class multi extends Thread       //Extending thread class 
{
 public void run()                          //run() method is declread
 {
    System.out.println("Thread is running...........................");
 }   
 public static void main(String[] args) {
    multi t1 =new multi();                      //object initiated 
    t1.start();  
    multi t2=new multi();  
    t2.start();                                 //run()method is called through start()
    multi t3=new multi();  
    t3.start();
    multi t4=new multi();  
    t4.start();
 }
}
