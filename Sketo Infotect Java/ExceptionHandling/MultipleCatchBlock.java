package ExceptionHandling;

public class MultipleCatchBlock {

    public static void main(String[] args) {
        
        int i =  2;
        int arr[] = {10, 20, 30, 40, 50};

        try
        {
            int j = 18 / i; 
            System.out.println(j);

            int result = arr[4]; 
            System.out.println(result);
        }

        catch(ArithmeticException e)
        {
            System.out.println("Can not devide number by Zero");
        }

        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array Out Of the Bound Exception");
        }
        
        catch(Exception e)
        {
            System.out.println("Something Went Wrong");
        }
        
        System.out.println("......End.....");
    }
    }
    

