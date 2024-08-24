
class Thread1 extends Thread
{
	public void run()
	{
		System.out.println("Thread 1 running..........");
	}
}

class Thread2 extends Thread
{
	public void run()
	{
		System.out.println("Thread 2 running................");
	}
}

class Thread3 extends Thread
{
	public void run()
	{
		System.out.println("Thread 3 running.........");
	}
}

public class multask 
{
	public static void main(String[] args) {
		
		Thread t1=new Thread1();
		Thread t2=new Thread2();
		Thread t3=new Thread3();
		t1.start();
		t2.start();
		t3.start();
	}

}