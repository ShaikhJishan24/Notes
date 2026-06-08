package Array;

public class JaggedArray {

    public static void main(String[] args) {
        
        // First Way to create a jagged Array 
        // Here row Size is known but column Size is unknown
        // int arr[][] = {
        //     {1, 2, 3},
        //     {4,5},
        //     {6}
        // };

        // System.out.println(arr[2][0]);
 
        // Second Way 
        char arr1[][] = new char[4][] ;

        arr1[0] = new char[1];      // 1 is column size
        arr1[1] = new char[2];      // 2 is column size
        arr1[2] = new char[3];
        arr1[3] = new char[4];
        
        arr1[0][0] = 'A';

        arr1[1][0] = 'B';
        arr1[1][1] = 'C';
 
        arr1[2][0] = 'D';
        arr1[2][1] = 'E';
        arr1[2][2] = 'F';

        arr1[3][0] = 'G';
        arr1[3][1] = 'H';
        arr1[3][2] = 'I';
        arr1[3][3] = 'J';

        // System.out.println(arr1[3][1]);
        
        for(int i = 0; i < arr1.length; i++){
            
            for(int j= 0; j < arr1[i].length; j++){
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }
        
        // Using forEach loop 
        // for(char[] ans : arr1){
        //     System.out.println(ans);
        // }

    }
    
}
