package VitaPrcatice;

public class Pattern1 {
    
    public static void main(String[] args) {
        
         for (int i = 3; i >= 1; i--) {

			for (int a = i; a >= 2; a--) {
				System.out.print(" ");
			}
			
			for (int j = 3; j >= i; j--) {
				System.out.print(j);
			}
			
			for (int k = i+1; k <= 3; k++) {
				System.out.print(k);
			}

			System.out.println();
		}
    }
}

