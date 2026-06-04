package ProgramsForPractice;

public class ExceptionalHandling {

	public static void main(String[] args) {
		
		try{
			int num = 18 / 0;
		}
		catch(ArithmeticException e) {
			System.out.println("Number can not divide by Zero");
		}

	}

}
