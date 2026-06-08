package LambdaExpression;

   interface Temp2{
       
        int Sub(int a , int b);
   }

public class LambdaExwithReturnType {

    public static void main(String[] args) {
        
        Temp2 obj = (x, y) ->  x - y;
        System.out.println(obj.Sub(20, 10));

    }
    
}
