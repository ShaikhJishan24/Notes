package AccessModifiers.Pack1;

// import AccessModifiers.Pack2.P2;

class A{ 
        // Private Access Modifiers
        private int y = 40;
        
        //Method to call private Modifires(Encapsulation) 
        public void show(){
            System.out.println(y);
        }
    }
public class Test1 {

    public static void main(String[] args) {
        
        A obj = new A();
        obj.show();
        
        // default Accesse mofifires code of Test1
        Test2 obj1 = new Test2();
        System.out.println(obj1.Name);
        

        // Protected Modifires of pack1 and class p2 hence it can not accissible
        // P2 in = new P2();
        // System.out.println(in.Height);

        
    }
    
}
