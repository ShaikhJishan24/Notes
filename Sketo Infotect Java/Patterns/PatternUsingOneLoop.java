public class PatternUsingOneLoop {
    
    public static void main(String[] args) {
        
        // using while loop
        int n = 4;	
//		int row = 1;
//	    int col = 1;
//
//	    while (row <= n) {
//
//	        System.out.print(col);
//	        col++;
//
//	        if (col > row) {
//	            System.out.println();
//	            row++;
//	            col = 1;
//	        }
//	    }
		

        // using for loop
		for (int i = 1, j = 1; i <= n; ) {
		    
			System.out.print(j);
			j++;
			
			if(j>i) {
				System.out.println();
				i++;
				j = 1;
			}
			
		}
    }
}
