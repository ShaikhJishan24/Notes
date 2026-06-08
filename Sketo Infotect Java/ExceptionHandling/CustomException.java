package ExceptionHandling;

    class InvalidAgeException extends Exception{

        public InvalidAgeException(String str){
            super(str);          // it is used to set the error meassage of the constructor
        }
    }

public class CustomException {

    public static void main(String[] args) {
        
       int age =  15;
       try{
            if(age < 18){
                throw new InvalidAgeException("Enter age greater than 18");
            }
       }
       catch(InvalidAgeException e){
            age = 18;
            System.out.println("This is default value : " + e);
       }
    }
    
}
