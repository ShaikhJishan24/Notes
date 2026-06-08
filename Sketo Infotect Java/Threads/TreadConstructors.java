package Threads;

    class mythread implements Runnable{
        
        public void run() {
            System.out.println(Thread.currentThread().getName());
        }
    }

public class TreadConstructors {

    public static void main(String[] args) {
        
        mythread mt = new mythread();
        
        // Type 1 - Thread()
        // Thread t1 = new Thread();
        // t1.start();

        // Type 2 - Thread(Runnable obj)
        Thread t2 = new Thread(mt);
        t2.start();
        
        // Type 3 - ClassName(String name)
        // only works with Thread class

        // Type 4 - Thread(Runnable obj, String name)
        // Thread t4 = new Thread(mt, "JavaPoint");
        // t4.start();
        

    }

    
}
