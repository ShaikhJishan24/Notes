package ProgramsForPractice;
    
    // Single Inheritance 
//    class Animal{
//    	int num = 10;
//    	
//    	public void A() {
//    		System.out.println("A for Animal");
//    	}
//    }
//    
//    class Birds extends Animal{
//    	int num2= 20;
//    	
//    	public void B() {
//    		System.out.println("B for Animal");
//    	}
//    }
    
    // Multi-level Inheritance
    class Cat{
    	int num = 10;
    	
    	public void C() {
    		System.out.println("C for Cat");
    	}
    }
    
    class Dog extends Cat{
    	int num2= 20;
    	
    	public void D() {
    		System.out.println("D for Dog");
    	}
    }
    
    class Elephant extends Dog{
    	int num3 = 30;
    	
    	public void E() {
    		System.out.println("E for elephant");
    	}
    }
    
public class Inheritence {

	public static void main(String[] args) {
		
		Elephant obj = new Elephant();
		obj.C();
		obj.D();
		obj.E();

	}

}
