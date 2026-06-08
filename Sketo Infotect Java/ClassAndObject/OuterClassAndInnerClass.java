package ClassAndObject;

public class OuterClassAndInnerClass {    // this is outer class
    
    class Demo{                           // This is inner class
        //Method 
        public void SayHey(){
            System.out.println("Heyy ");
        }
    }
    public static void main(String[] args) {
        
        OuterClassAndInnerClass instance = new OuterClassAndInnerClass();
        Demo obj = instance.new Demo();                             
        // OuterClassAndInnerClass.Demo obj = instance.new Demo();   both are same 
        obj.SayHey();


        // We can also create innerclass As static class but cant reate outerclass as Static
        // if Innerclass is static then 
        // OuterClassAndInnerClass instance = new OuterClassAndInnerClass();
        // OuterClassAndInnerClass.Demo obj = new OuterClassAndInnerClass.Demo();
  
    }
    
}
