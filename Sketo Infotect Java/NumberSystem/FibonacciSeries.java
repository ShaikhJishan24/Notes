package NumberSystem;
public class FibonacciSeries {
    
    public static void main(String[] args) {
        
        int num = 10;
        int a = 0;
        int b= 1;
        
        System.out.print(a + " " + b + " ");

        for(int i = 1; i<=num; i++){
           int nextdigit = a + b;
           System.out.print(nextdigit + " ");
           a = b;
           b = nextdigit;
        }


    }
}
