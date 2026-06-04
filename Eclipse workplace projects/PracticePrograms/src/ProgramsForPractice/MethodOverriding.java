package ProgramsForPractice;
    
    class Demo1{
    	
    	public void num() {
    		System.out.println("Method of Demo-1");
    	}
    }
    
    class Demo2 extends Demo1{
    	
    	
    	public void num() {
    		System.out.println("Method of Demo-2");
    		super.num();
    	}
    }
public class MethodOverriding {

	public static void main(String[] args) {
		
       Demo2 obj = new Demo2();
       obj.num();
       
       
	}

}
