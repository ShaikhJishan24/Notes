package Inheritance;

    class X{
        //Instance Variable
        String name = "Jishan";
        
        //method
        public String SayHello(){
            return "Hello" +" " + name;
        }
    } 
    class Y extends X{
        //method
        public String SayBye(){
            // System.out.println(super.name);
            return "Bye";
        }
    }
public class SingleInheritance {

    public static void main(String[] args) {

        // Coz of Inheritance We can call method of another class with creating obj of 2nd Class
        Y obj = new Y();
        System.out.println(obj.name);
        System.out.println(obj.SayHello());
        System.out.println(obj.SayBye());

    }
    
}
