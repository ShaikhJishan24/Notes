package Threads.Multithreading;

    class BookTheatrSeats1{

        static int total_seats = 20;

        static synchronized public void Bookseats(int seats){
            if(total_seats >= seats){
                System.out.println(seats +" Seats booked Successfully by " + Thread.currentThread().getName());
                total_seats = total_seats - seats;
                System.out.println("seats Left : " + total_seats);
            }
            else{
                System.out.println("Seats are Not available for " + Thread.currentThread().getName());
            }
        }
        
    };

    class MovieBookedApp1 extends Thread{
        
        int seats;

        public MovieBookedApp1(String name, int seats){
            super(name);
            this.seats = seats ;
        }

        public void run(){
            BookTheatrSeats1.Bookseats(seats);
        }

    };

    class MovieBookedApp2 extends Thread{
        
        int seats;

        public MovieBookedApp2(String name, int seats){
            super(name);
            this.seats = seats ;
        }

        public void run(){
            BookTheatrSeats1.Bookseats(seats);
        }

    };

public class StaticSynchronized {

    public static void main(String[] args) {
        
        
        MovieBookedApp1 t1 = new MovieBookedApp1(" t1", 7);
        t1.start();
        // t1.setName("t1");   //or

        MovieBookedApp1 t2 = new MovieBookedApp1("t2", 6);
        t2.start();
        // t2.setName("t2");    //or

        MovieBookedApp2 t3 = new MovieBookedApp2("t3", 5);
        t3.start();
        // t3.setName("t3");    //or

        MovieBookedApp2 t4 = new MovieBookedApp2("t4", 6);
        t4.start();
        // t4.setName("t4");    //or

    }
    
}
