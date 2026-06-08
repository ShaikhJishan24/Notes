package NumberSystem;

public class LeapYear {
    
    public static boolean CheckLeapYear(int year){

        if(year % 4 == 0){
            return true;
        }

        return false;
    }
    
    public static void main(String[] args) {
        
        int year = 2022;
        if(CheckLeapYear(year)){
            System.out.println("It is a Leap Year");
        }
        else{
            System.out.println("It is not a Leap Year");
        }
    }
    
}
