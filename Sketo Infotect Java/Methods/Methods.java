package Methods;

public class Methods {

    // Dynamic Function

    // with non return type
    // void demo(){
    // System.out.println("Heyy..");
    // }

    // with return type
    public int demo1() {
        return 900;
    };

    

    public static void main(String[] args) {

        // className objectName = new ClassName()
        Methods obj = new Methods();
        // obj.demo();                       // with Non return type

        System.out.println(obj.demo1());      // with return type
        
    }

}
