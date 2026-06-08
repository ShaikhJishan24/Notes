package Threads;
   
    class mythread1 implements Runnable{

        public void run() {       // M1
            System.out.println(Thread.currentThread().getName());  // M3
        }
    }
    
public class BasicMethods {

    public static void main(String[] args) {
        
        mythread1 mt1 = new mythread1();
        Thread t1 = new Thread(mt1);

        t1.start();   // M2)

        System.out.println(t1.isAlive());  // M4
    }
    
}
