package ExceptionHandling;

public class TryAndCatchBlock {

    public static void main(String[] args) {
        
        // Zero Division Exception
        int i =  0;
        int j = 0;
        try
        {
            j = 18 / i; 
        }
        catch(Exception e)
        {
            System.out.println("Can not devide number by Zero");
        }

        System.out.println(j);
        System.out.println("Bye");


        // // Out Of Bound Exception
        // int arr[] = {10, 20, 30, 40, 50};
        // try
        // {     
        //     int result = arr[6]; 
        //     System.out.println(result);
        // }
        // catch(ArrayIndexOutOfBoundsException e)
        // {
        //     System.out.println("Array Out Of the Bound Exception");
        // }
        // finally
        // {
        //     System.out.println("This Block always Executed");
        // }
    
        // System.out.println("......End.....");
    }
    
}
