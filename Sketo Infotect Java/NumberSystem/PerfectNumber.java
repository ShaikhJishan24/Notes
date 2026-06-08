package NumberSystem;

public class PerfectNumber {

    public static boolean isPerfect(int num){
         
        if(num < 1){
            return false;
        }
        
        int sum = 0;

        for(int i = 1; i <= num / 2; i++){
            if(num % i == 0){
                sum = sum + i;
            }
        }

        return sum == num;
    } 
    public static void main(String[] args) {
        
        int num = 28;
        if(isPerfect(num)){
            System.out.println("A number is a perfect number ");
        }
        else{
            System.out.println("A number is not a perfect number ");
        }

    }
    
}

// What is Perfect Number -> A number whose factors sum is equal to that number 
// we have check for only half of that number Example -> (num / 2)