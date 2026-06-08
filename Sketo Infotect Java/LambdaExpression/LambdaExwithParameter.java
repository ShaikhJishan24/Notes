package LambdaExpression;
    
   interface Temp1{
       
        void add(int a , int b);
   }
public class LambdaExwithParameter {

    public static void main(String[] args) {
        
        // Temp1 obj = (int x, int y) ->      // we can also not declare the type of variable
        // {
        //     System.out.println(x + y);
        // };
        // obj.add(10, 20);
        
        // Another Way -->
        Temp1 obj = (x, y) -> System.out.println(x + y);
        obj.add(10, 20);

    }
    
}
