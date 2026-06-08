package Threads;
   
    class testPriority implements Runnable{

        public void run(){
            System.out.println("......");
        }

    }
public class PriorityBasedMethods {

    public static void main(String[] args) {
        
        testPriority tp = new testPriority();
        Thread t1 = new Thread(tp);
        Thread t2 = new Thread(tp);

        // thread t1 
        System.out.println("th1 old priority "+ t1.getPriority());

        // Thread t2
        System.out.println("th2 old priority "+ t2.getPriority());


        t1.setPriority(10);
        t2.setPriority(8);
        
        System.out.println();
        System.out.println("th1 New priority "+ t1.getPriority());
        System.out.println("th2 New priority "+ t2.getPriority());

        System.out.println(Thread.currentThread().getName() + " : " + Thread.currentThread().getPriority());


    }
    
}
