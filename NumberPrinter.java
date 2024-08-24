public class MultiThreadSingleTask {

    public static void main(String[] args) {
        // Create two threads
        Thread thread1 = new Thread(new NumberPrinter(1, 5));
        Thread thread2 = new Thread(new NumberPrinter(6, 10));

        // Start the threads
        thread1.start();
        thread2.start();
    }

    static class NumberPrinter implements Runnable {
        private int start;
        private int end;

        public NumberPrinter(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public void run() {
            for (int i = start; i <= end; i++) {
                System.out.println(Thread.currentThread().getName() + ": " + i);
            }
        }
    }
}
