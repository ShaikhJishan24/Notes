public class Th4 extends Thread {

    public void run() {

        System.out.println(Thread.currentThread());
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello" + i);
        }
    }

    public static void main(String args[]) {

        System.out.println(Thread.currentThread()); // main
        
        Th4 t1 = new Th4();
        Th4 t2 = new Th4();
        t1.setName("first");
        t2.setName("second");
        t1.start();
        t2.start();
    }
}
