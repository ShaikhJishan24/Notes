package Inheritance;
    
    class Jishan{

        int a;

        public Jishan(int a){
           this.a = a;
        }
    }

    class Moin extends Jishan{

        int b ;
        
        public Moin(int a, int b){
            super(a);              // To call the Class Jishan Constructor 
            this.b = b;
        }
        
        public void Show(){
            System.out.println("a = " + a + " "+ "b = " + b);
        }

    }
public class ConstructorInheritance {

    public static void main(String[] args) {
        
        Moin obj = new Moin(10, 20);
        obj.Show();
    }
    
}
