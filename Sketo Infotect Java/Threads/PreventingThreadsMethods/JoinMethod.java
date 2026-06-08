package Threads.PreventingThreadsMethods;
    
    class Testjoin implements Runnable{

        public void run(){
            for(int i=1; i<=5; i++){
                System.out.println(Thread.currentThread().getName()+ " " + i);
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }
    }
public class JoinMethod {

    public static void main(String[] args) throws InterruptedException {
        
        Testjoin tj = new Testjoin();

        Thread t1 = new Thread(tj);
        Thread t2 = new Thread(tj);

        t1.start();
        t1.join();
        t2.start();
    }
    
}
