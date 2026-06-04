package firstprogram;

public class PrimeNumber {

	public static void main(String[] args) {
		int num = 7;
		for(int a = 2; a <= num; a++) {
			if(num % a == 0) {
				System.out.println("the num is not a prime Number for : " + a);
			}
			else {
				System.out.println("the num is a prime Number for : " + a);
			}
		}

	}

}
