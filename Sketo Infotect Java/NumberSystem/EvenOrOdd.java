package NumberSystem;

public class EvenOrOdd {

    public static boolean isEven(int n){
        if(n % 2 == 0){
           return true;
        }

        return false;
   }

   public static void main(String[] args) {
       
       int num = 17;
       if(isEven(num)){
           System.out.println("Number is even number");
       }
       else{
           System.out.println("Number is odd");
       } 
   }
    
}
