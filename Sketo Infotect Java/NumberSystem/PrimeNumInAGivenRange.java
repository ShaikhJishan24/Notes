package NumberSystem;

import java.util.Scanner;
 
public class PrimeNumInAGivenRange {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the start number : ");
        int start = sc.nextInt();

        System.out.println("Enter the last number : ");
        int last = sc.nextInt();
        int flag = 0;

        for(int num=start; num <= last; num++){
            
            for(int i= 2; i < num; i++){
                if(num % i == 0){
                    flag = 1;
                    break;
                }
            }

            if(flag == 0){
                System.out.println(num + " ");
            }

            flag = 0;
        }
        sc.close();
    }
    
}
