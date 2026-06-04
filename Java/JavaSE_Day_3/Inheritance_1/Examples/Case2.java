class A {

}

class B{

    public B(){
        // super() // Implicitly provided by compiler internally
        System.out.println("In b construtor");
    }
}

public class Case2{

    public static void main(String[] args) {
        
        B obj = new B();

    }
}