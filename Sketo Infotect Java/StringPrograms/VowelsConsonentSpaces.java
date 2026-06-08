package StringPrograms;

import java.util.Scanner;

public class VowelsConsonentSpaces {
    
    public static void checkCond(String str){
        int vowels =  0; int consonent = 0; int spaces = 0;

        // str = str.toLowerCase();
        for(char ch : str.toCharArray()){
            if(ch == 'a' || ch == 'e'|| ch == 'i'|| ch == '0' || ch == 'u' ){
                vowels++;
            }
            else if(ch == ' '){
                spaces++;
            }
            else{
                consonent++;
            }
        }

        System.out.println("Vowels : " + vowels);
        System.out.println("Consonent : " + consonent);
        System.out.println("Spaces : " + spaces);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the String : ");
        String str = sc.nextLine().toLowerCase();
        checkCond(str);

        sc.close();
    }
}
