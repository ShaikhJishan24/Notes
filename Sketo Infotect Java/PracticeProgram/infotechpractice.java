package PracticeProgram;

    class Emp{
         
        public void show(){
            System.out.println("Show method");
        }
    }

    class EmpImpl extends Emp{
       

    }

public class infotechpractice {

    public static void main(String[] args) {
        
        
       EmpImpl obj = new EmpImpl();
       obj.show();
      
    }
    
}
