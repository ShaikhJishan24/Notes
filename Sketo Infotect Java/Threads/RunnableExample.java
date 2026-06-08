package Threads;
    
    class Intro implements Runnable{
        public void run(){
            System.out.println("Hello.......");
        }
    }
    
public class RunnableExample {

    public static void main(String[] args) {
        
        Runnable obj = new Intro();
        
        Thread t1 = new Thread(obj);

        t1.start();
    }
    
}
