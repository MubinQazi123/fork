class multi7 implements Runnable {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
}
class Multi2 extends Thread{
    public void run() {
        {
            System.out.println("Thread 2");
        }
    }

        public static void main (String[]args)
        {
            System.out.println("Hello");
            System.out.println("main thread: "+Thread.currentThread().getName());
            multi7 m1 = new multi7();
            Multi2 m2= new Multi2();
            Thread t1 = new Thread(m1);
            t1.start();
            m2.start();

        }
    }
