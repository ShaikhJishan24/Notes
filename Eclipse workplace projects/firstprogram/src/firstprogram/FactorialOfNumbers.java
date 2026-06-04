package firstprogram;

public class FactorialOfNumbers {

	public static void main(String[] args) {
		int fact = 1;
		int num = 5;
		for(int a = 1; a <= num; a++) {
			fact = fact * a;
		}
        System.out.println(fact);
	}

}
