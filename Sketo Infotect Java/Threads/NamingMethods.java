package Threads;
    
    class mythread2 implements Runnable{

        public void run() {       
            System.out.println(Thread.currentThread().getName());  // M1
        }
    }
public class NamingMethods {

    public static void main(String[] args) {
        
        mythread2 mt1 = new mythread2();
        Thread t1 = new Thread(mt1);

        t1.start();  
        
        t1.setName("foo");  //M2
        // System.out.println(t1.getName()); // M1.1
    }
    
}
