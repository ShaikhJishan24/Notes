package StringPrograms;

import java.util.Scanner;

public class RemoveVowels {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str=sc.nextLine();

        str = str.toLowerCase();

        String res="";

        for(char ch : str.toCharArray())
        {
            if(ch =='a' || ch =='e' || ch =='i' || ch =='o' || ch =='u')
                continue;
            else 
                res = res + ch;
        }
        System.out.println(res);

        sc.close();
    }
    
}
