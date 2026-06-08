package Threads.PreventingThreadsMethods;

public class SleepMethod1{
    
    public static void main(String[] args) {
        
        // example 1
        // for(int i=1; i<=5; i++){

        //     try{
        //         Thread.sleep(2000);
        //         System.out.println(i);
        //     }
        //     catch(InterruptedException e){
        //         System.out.println(e);
        //     }            
        // }

        // example 2
        System.out.println("start");

        try{
            Thread.sleep(2000);
        }
            catch(InterruptedException e){
            System.out.println(e);
        }  
        System.out.println("End");

    }

}
