package Patterns;

public class p5 {

    public static void main(String[] args) {
        
    int num = 4;
    int i = 1;
    int count = 1;

    while(i<=num){

        int j = 1;
        while(j<=i){
            System.out.print(count);
            count = count + 1;
            j = j + 1;
        }

        System.out.println();
        i = i + 1;

    }


    }
    
}
