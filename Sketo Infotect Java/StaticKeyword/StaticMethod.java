package StaticKeyword;
    
    class foo2{
        
        public static void fullname(){
            System.out.println("Glenn maxwell");
        }

        // public static void fullname(String surname){
        //     System.out.println("Glenn " + surname);
        // }
    }

    class foo3 extends foo2{
         
        public static void fullname(){
            System.out.println("Glenn maxwell Marry");
        }
    }
public class StaticMethod {

    public static void main(String[] args) {
        
        // foo2 obj = new foo2();
        // foo2.fullname();       // call it whith classname
        // obj.fullname();    // also call with objeect
        
        // Allowed method Overloading
        // foo2.fullname();
        // foo2.fullname("Maxwell");

        // Does not allowd method overrinding does method hinding
        // foo3 obj1 = new foo3();
        foo3.fullname();
    }
    
}
