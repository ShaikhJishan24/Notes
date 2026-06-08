package Functions;

public class SumOfNaturalNumbers {
    

    static int Sum(int num){
        int sum = 0;
        for(int i=0; i<= num; i++){
            sum = sum + i;  
        }
        return sum;  
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(Sum(n));
     

    }
    
}
