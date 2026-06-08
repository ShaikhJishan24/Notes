package Functions;

public class FactorialOfNumber {
    
   static int Factorial(int num){
      int fact = 1;
      int i = 1;
      while(i<=num){
           fact = fact * i;
           i = i + 1;
      }
      return fact;
   }

    public static void main(String[] args) {
        
        System.out.println("Factorial Of Number is : " + Factorial(5));
    }
}
