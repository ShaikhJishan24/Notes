package Threads.IntercommunicationMethods;

    class TotalEarning extends Thread{
     
        int totalearning = 0;
        public void run(){
        
            synchronized(this){
               for(int i=1; i<=10; i++){
                totalearning = totalearning + 100;
               }

               this.notify();
            }
        }

    }
public class WaitAndNotifyMethod {
    
    public static void main(String[] args) throws InterruptedException {
        
        TotalEarning t1 = new TotalEarning();
        t1.start();

        synchronized(t1){
            t1.wait();
            System.out.println(t1.totalearning);
        }

    }
}
