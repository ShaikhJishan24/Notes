package Threads;
    
    // Creating a Thread  here A is not class it is thread
    class A extends Thread{
        
        public void run(){
            System.out.println("Heyy");
        }
    }
public class ThreadExample {

    public static void main(String[] args) {
        
        A obj = new A();
        obj.start();          // Calling a thread method 
        System.out.println(obj.getPriority());;
    }
    
}
