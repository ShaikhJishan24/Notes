package PracticeProgram;

   interface User{
       
       void show();
   }
   
   class Teacher implements User{

    @Override
    public void show() {
        
        System.out.println("A show method");
    }

   }

public class New2 {
    
    public static void main(String[] args) {
        
        User obj = new Teacher();
        obj.show();
        
    }
    
}
