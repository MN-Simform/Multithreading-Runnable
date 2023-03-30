public class MyThread implements Runnable{
    int n;
    MyThread(int n){
        this.n = n;
    }
    @Override
    public void run() {
        for(int i=1; i<=5; i++){
            System.out.println(Thread.currentThread().getName() + " : " + n * i);
            try{
                Thread.sleep(1000);
            } catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
