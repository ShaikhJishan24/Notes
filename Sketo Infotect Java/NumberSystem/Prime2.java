package NumberSystem;
    
public class Prime2 {
    
    public boolean isPrime(int num){
        int i = 2;
        
        while(i < num){
            if(num % i == 0){
                return false;
            }
            i++;
        }    
        return true;
    }

    public static void main(String[] args) {
        
        Prime2 obj = new Prime2();

        int n = 20;
        if(obj.isPrime(n)){
            System.out.println("prime Number");
        }
        else{
            System.out.println("Not a Prime Number");
        }

    }
    
    // we can write method here also Write here also
    // public boolean isPrime(int num){
    //     int i = 2;
    //     while(i < num){
    //         if(num % i == 0){
    //             return false;
    //         }
    //         i++;
    //     }    
    //     return true;
    // }
    
    // Using For Loop
    // public boolean isPrime(int num){

    //     for(int i = 2; i<num; i++){
    //         if(num%i == 0)
    //             return false;
    //     }

    //     return true;
    // }

    
}
