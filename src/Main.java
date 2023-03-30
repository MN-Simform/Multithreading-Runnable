public class Main {
    public static void main(String[] args) throws InterruptedException {
        MyThread mt1 = new MyThread(10);
        MyThread mt2 = new MyThread(100);

        Thread thread1 = new Thread(mt1, "MyThread 1");
        Thread thread2 = new Thread(mt2, "MyThread 2");

        thread1.start();
        thread1.join();
        thread2.start();
    }
}