package Methods;

public class MethodOverloading {
    
    public int add(int n1, int n2){
        return n1 + n2;
    }
    
    public int add(int n1, int n2, int n3){
        return n1 + n2 + n3;
    }

    public static void main(String[] args) {
         
        MethodOverloading obj = new MethodOverloading();
        System.out.println(obj.add(3, 4));    // with 2 parameters with same function name 
        System.out.println(obj.add(3, 4, 5));    // with 3 parameters
    }
    
}
