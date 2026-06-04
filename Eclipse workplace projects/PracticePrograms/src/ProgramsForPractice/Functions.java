package ProgramsForPractice;

public class Functions {
    
	//with no return type and no arguments
	static void Info() {
		System.out.println("Hello Info");
	}
	
	//with no return type with arguments
	static void Info1(int Age) {
		System.out.println("Hello Info1 " + Age);
	}
	
	// With no aguements with return type
	static String Info2() {
		return "Moin";
	}
	
	// With argiments and return type
	public static int info4(int Age) {
		return Age;
	}
	
	public static void main(String[] args) {
		
		// Info();
		// Info1(25);
        // System.out.println(Info2());
//		System.out.println(info4(50));
		Functions.Info();
		
	}

}
