package Threads.PreventingThreadsMethods;
    
    class Testyield implements Runnable{
        public void run(){
            System.out.println("hello");
        }
    }

public class yieldMethod {

    public static void main(String[] args) {
        
        Runnable r = () -> {
            for(int i=1; i<=5; i++){
                System.out.println(Thread.currentThread().getName() + i);
                if(i == 3){
                    Thread.yield();
                }
            }
        };

        Thread t1 = new Thread(r, "Thread-1 ");
        Thread t2 = new Thread(r, "Thread-2 ");

        t1.start();
        t2.start();


    }

    
}
