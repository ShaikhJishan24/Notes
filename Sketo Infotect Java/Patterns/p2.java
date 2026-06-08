package Patterns;

public class p2 {

 public static void main(String[] args) {
    int num = 3;
    int i = 1;
    int count = 1;

    while(i<=num){

        int j = 1;
        while(j<=num){
            System.out.print(count);
            count = count + 1;
            j = j + 1;
        }

        System.out.println();
        i = i + 1;

    }
 }

}
