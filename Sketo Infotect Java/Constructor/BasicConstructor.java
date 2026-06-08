package Constructor;

class Intro{
        
        String Name;
        int Age ;
        
        // when we have same local variable Name as instance var then we have to write this keyword
        public Intro(String Name, int Age){
            this.Name = Name;
            this.Age = Age;
            System.out.println("Heyy");   // we can also print 
        }


        // when we have Different local variable Name as instance var then not need to write this keyword
        // public Intro(String n, int A){
        //     Name = n;
        //     Age = A;
        // }

        public void info(){
            System.out.println(Name +" : "+Age);
        }
       
   }
public class BasicConstructor {

    public static void main(String[] args) {
        
        Intro obj = new Intro("Jishan", 23);
        // obj.info();
        System.out.println(obj.Name);
    }

}
