package Threads;
    
    class Intro1 implements Runnable{
        public void run(){
            System.out.println("Hello!!!");
        }
    }
public class RunnableVsThread {

    public static void main(String[] args) {
         
        Runnable obj = () ->  // implementation of a Runnable interface
        {
            System.out.println("Hello.......");
        };
        
        Thread t1 = new Thread(obj);

        t1.start();
    }
    
}
