package Threads.InteruptingMethods;

public class InteruptMethod {

   public static void main(String[] args) {
    
      Thread t = new Thread(() -> {
         for (int i = 1; i <= 5; i++) {
             System.out.println("Working... " + i);
             try {
               Thread.sleep(1000);
             } 
             catch (InterruptedException e) {
               System.out.println("Thread interrupted while sleeping.");
               return; // exit the thread
             }
         }
     });

     t.start();
     t.interrupt();
   }
    
}
