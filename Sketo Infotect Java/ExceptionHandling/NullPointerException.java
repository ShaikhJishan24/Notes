package ExceptionHandling;
    
    class MyException extends Exception{ 

        public MyException(String str){
            super(str);
        }
    }
public class NullPointerException {

    public static void main(String[] args) {

        
        try{
            String x = null;
            if (x == null){
                throw new MyException("A Variable can not be a Null");
            }
        }
        catch(MyException e){
            System.out.println("Please Enter the value of x" + e);
        }
    }
    
}
