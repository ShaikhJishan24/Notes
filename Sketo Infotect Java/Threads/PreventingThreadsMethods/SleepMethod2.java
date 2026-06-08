package Threads.PreventingThreadsMethods;
    
    class TestSleepMethod1 extends Thread{    
        public void run(){    
            for(int i=1; i<=5; i++){   
                // the thread will sleep for the 500 milli seconds   
                try{
                    Thread.sleep(2000);
                }
                catch(InterruptedException e){
                    System.out.println(e);
                }    
                System.out.println(i);    
            }    
        } 
    }   
public class SleepMethod2 {

    public static void main(String[] args) throws InterruptedException {
        
        TestSleepMethod1 t1 = new TestSleepMethod1();    
        TestSleepMethod1 t2 = new TestSleepMethod1(); 
        
        t1.start();
        Thread.sleep(2000); 
        t2.start();
    }
    
}