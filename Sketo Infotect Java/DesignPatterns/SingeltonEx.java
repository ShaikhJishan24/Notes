package DesignPatterns;
   
class Singelton{

    private static Singelton instance;

    private Singelton(){      // make the constructor private to prevents direct instantiation
    };

    public static Singelton getinstance(){
       if(instance == null){
          instance = new Singelton();
       }

       return instance; 
    }
}
public class SingeltonEx {

    public static void main(String[] args) {
        
       Singelton s = Singelton.getinstance();
       System.out.println(s);
    }
    
}
