package Array;

public class TwoDimentionalArray {
     
    public static void main(String[] args) {
        
        String[][] arr = new String[3][3];

         arr[0][0] = "Ram";
         arr[0][1] = "Sham";
         arr[0][2] = "Raju";

         arr[1][0] = "Baburao";
         arr[1][1] = "Snehal";
         arr[1][2] = "Samarth";

         arr[2][0] = "Neha";
         arr[2][1] = "Manjiri";
         arr[2][2] = "Aditya";

         for(int i= 0; i < arr.length; i++){

            for(int j= 0; j < arr[i].length; j++){

                System.out.print(arr[i][j] + " ");
            
            }

           System.out.println();
         }

    }
    
    
}
