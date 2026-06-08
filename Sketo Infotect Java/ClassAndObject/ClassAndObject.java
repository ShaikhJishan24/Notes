package ClassAndObject;
 public class ClassAndObject {
        
    class Demo{ 
        // instance variable
        String FirstName;
        String LastName;
        
        // Constructor
        public Demo(String first, String last){
            this.FirstName = first;
            this.LastName = last;
        }
        
        // method 
        public void PrintName(){
            System.out.println("FullName is : " + this.FirstName +" " + this.LastName);
        }
    }

        public static void main(String[] args) {
            
        // ClassName objectName = new ClassName()
        // Demo obj1 = obj.new Example("sam", "Badri");
     
        // We have to create the instance(reference) of outer class Otherwise is gives the Error
        // for prinring this we have to write the class inside the Outer class
        // ClassAndObject obj = new ClassAndObject();
        // Demo obj1 = obj.new Demo("sam", "Badri");
        // obj1.PrintName();
        
        }
}
