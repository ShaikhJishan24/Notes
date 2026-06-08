package ExceptionHandling;

// import java.util.Scanner;

public class ThrowKeyword {

    public static void main(String[] args) {
        
        // int age = 15;
        // if(age < 18){
        //     throw new ArithmeticException("You are not Eligible");
        // }
        // else{
        //     System.out.println("You are Eligible");
        // }
        
        
        // Throw Keyword with try_catch block
           int age = 15;
           try{
                if(age < 18){
                    throw new ArithmeticException("Enter age greater than 18");
                }
           }
           catch(ArithmeticException e){
                age = 18;
                System.out.println("This is default value " + e);
           }


        // Scanner in = new Scanner(System.in);
        // int arr[] = {1, 2, 3, 4, 5};
        // System.out.print("Enter the size");
        // int size = in.nextInt();
        // in.close();
        // try
        // {   
        //     if(size > arr.length){
        //        throw new ArrayIndexOutOfBoundsException("Enter valid size - Do not cross limit");
        //     }
        //     else{
        //         System.out.println("size" + " = " + size);
        //     }
        // }
        // catch(ArrayIndexOutOfBoundsException e)
        // {
        //     System.out.println("Error handled " + e);
        // }
       
    }

    
}
