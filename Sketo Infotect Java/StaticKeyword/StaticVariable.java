package StaticKeyword;
     
    class foo{
        // This variable shared with All instances
        static String Name = "Sam";
    }
public class StaticVariable {

    public static void main(String[] args) {
        
        // call it with ClassName
        System.out.println(foo.Name);  

        // we can also call with object but is not recommended
        // foo obj = new foo();
        // System.out.println(obj.Name);

    }
    
}
