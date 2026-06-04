
class Th9 implements Runnable{

    public void run(){
        System.out.println("Hello");
    }
}


public class Demo {
    
    public static void main(String[] args) {
        
        Th9 t = new Th9();
        Thread t1 = new Thread(t);
        t1.start();
    }
}
