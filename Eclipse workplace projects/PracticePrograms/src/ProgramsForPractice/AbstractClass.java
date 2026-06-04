package ProgramsForPractice;
    
    abstract class Info{
    	int Age = 10;
    	
    	public String Ex() {
    		return "Samual";
    	}
    	
    	public abstract void demo();
    	
    }
    
    class Demo extends Info{
    	
    	public void demo() {
    		System.out.println("Welcome");
    	}
    	
    }
    
public class AbstractClass {

	public static void main(String[] args) {
		
		Demo obj = new Demo();
		obj.demo();
		System.out.println(obj.Ex());
		System.out.println(obj.Age);

	}

}
