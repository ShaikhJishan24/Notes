package LambdaExpression;

@FunctionalInterface  
interface Temp {

    void show();
}

public class LambdaEx {

    public static void main(String[] args) {

        Temp obj1 = () -> 
        {           // Annonymous Inner Interface
            System.out.println("In a (New) show"); // this is nothing but the show method of the Temp
        
        };

        obj1.show();
    }

}
