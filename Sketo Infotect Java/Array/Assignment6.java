package Array;

import java.util.Scanner;
public class Assignment6 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Product List Size: ");
        int size = input.nextInt();

        String product[] = new String[size];

        int Price[] = new int[size];
        
        // For taking input product create array 1
        for(int i = 0; i<product.length; i++){
            System.out.println("Enter Product :" + (i+1));
            product[i] = input.next();
        }
        
        // For taking input price  create array 2
        for(int i = 0; i<Price.length; i++){
            System.out.println("Enter " + product[i] + " Price : ");
            Price[i] = input.nextInt();
        }
        
        // caluculate the total 
        int sum = 0;
        for(int i= 0; i < size; i++){
             sum = sum + Price[i];
        }
        
        // caluculate the GST
        double GST = (sum * 18.0)/100;
        int Final_Total = (int)(sum + GST);
       
        System.out.println("Do you Want to add GST");
        int ch = input.next().charAt(0);
        
        if(ch == 'N' || ch == 'n'){
            for(int i = 0; i < Price.length; i++){
            System.out.println(product[i] + " = " + Price[i] + "/");
            }
            System.out.println("---------------");
            System.out.println("Total = " + sum);
        }
        else if (ch == 'Y' || ch == 'y'){
            System.out.println("---------Output---------");

            for(int i = 0; i < Price.length; i++){
            System.out.println(product[i] + " = " + Price[i] + "/");
            }
            
            System.out.println("----------------");

            System.out.println("Total = " + sum);
            System.out.println("GST = " + "18%");

            System.out.println("----------------");
            System.out.println("Final Total = " + Final_Total);

        }


        // System.out.println("----------------");
        
       

        input.close();
    }
}
