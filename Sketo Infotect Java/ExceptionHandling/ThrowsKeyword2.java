package ExceptionHandling;
    
    class Example{

        public void CheckAge(int Age) throws ArithmeticException{

            if(Age < 18){
                throw new ArithmeticException();
            }
            else{
                System.out.println("You Are not eligible");
            }

        }

        public void Ans(){
            try{
                CheckAge(15);
            }
            catch(ArithmeticException e){
                System.out.println("please Enter the valid Age");
            }
        }
    }
public class ThrowsKeyword2 {

    public static void main(String[] args) {
         
        Example obj = new Example();
        obj.Ans();

        

    }
    
}
