package Threads.Multithreading;

    class BookTheatrSeats{

        int total_seats = 10;

        public void Bookseats(int seats){

            // this is synchronized Block
            synchronized(this){
                if(total_seats >= seats){
                    System.out.println("Seats booked Successfully ");
                    total_seats = total_seats - seats;
                    System.out.println("seats Left : " + total_seats);
                }
                else{
                    System.out.println("Seats are Not available");
                }
            }
        }
        
    };

    class MovieBookedApp extends Thread{
        
        BookTheatrSeats b;
        int seats;

        public MovieBookedApp(BookTheatrSeats b, int seats){
            this.b = b;
            this.seats = seats ;
        }

        public void run(){
            b.Bookseats(seats);
        }

    };
public class SynchronizedBlock{

    public static void main(String[] args) {
        
        BookTheatrSeats b = new BookTheatrSeats();   // shared object

        MovieBookedApp t1 = new MovieBookedApp(b, 7);
        t1.start();

        MovieBookedApp t2 = new MovieBookedApp(b, 6);
        t2.start();
    }
}