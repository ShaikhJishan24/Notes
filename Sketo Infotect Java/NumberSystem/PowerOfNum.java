package NumberSystem;

public class PowerOfNum {
    
    public static int PowerOfNumbers(int base, int exponent){
         
        int result = 1;
        for(int i=1; i<=exponent; i++){
            result = result * base;
        }
        return result;
    }

    public static void main(String[] args) {
        
        int base = 6;
        int exponent = 2;

        System.out.println("Power of Number : " + PowerOfNumbers(base, exponent));

    }
    
}
