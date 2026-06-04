## Number System

# AddtwoNumber
``` java
package NumberSystem;

import java.util.Scanner;

public class AddtwoNumber {
    public static void main(String args[]){ 
    // Add two integer 
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the Num1 : ");
    int num1 = input.nextInt();

    System.out.print("Enter the Num2 : ");
    int num2 = input.nextInt();

    int sum = num1 + num2;
    
    System.out.print(sum);
    input.close();        
}
}
```
# AddtwoNumbersUisngRecursion
``` java
package NumberSystem;

public class AddtwoNumbersUisngRecursion {
     
    public static int Addtwonum(int a, int b){
       
        if(b == 0){
            return a;
        }

        return Addtwonum(a + 1, b - 1);
    }
    public static void main(String[] args){
        
       int a = 10, b = 20;
       int res = Addtwonum(a, b);
       System.out.println(res);
    }
}
```
# AsciiValue
``` java
package NumberSystem;

import java.util.Scanner;

public class AsciiValue {

    public static void main(String[] args) {
         
        Scanner input = new Scanner(System.in);

        System.out.println("Enter An Charchar : ");
        char ch = input.next().charAt(0);

        int AsciiValue = (int) ch;
        System.out.println(AsciiValue);

        input.close();
    }   
}
```
# BinaryToDecimal
``` java
package NumberSystem;

public class BinaryToDecimal{
    
    public static void main(String[] args) {
        
        int binary = 1010; // Example binary number
        int decimal = 0, base = 1, remainder;

        while (binary > 0) {
            remainder = binary % 10; // Get the last digit
            decimal = decimal + remainder * base; // Multiply with power of 2
            binary = binary / 10; // Remove the last digit
            base = base * 2; // Increase the power of 2
        }

        System.out.println("Decimal equivalent: " + decimal);
    }
}
```
# CheckNumIsPalindrome
``` java
package NumberSystem;

public class CheckNumIsPalindrome {

    public static void main(String[] args) {
        
        int num = 101;
        int Orgnum = num;

        int ans = 0;
        while(num != 0){
            int digit = num % 10; // Extract last digit
            ans = (ans * 10) + digit; // Build reversed number
            num = num / 10;     // Remove last digit
        }
        System.out.println(ans);
        
        if(ans == Orgnum){
            System.out.println("Numbers is Palindome");
        }
        else{
            System.out.println("Number is not a palindome Not a palindrome");
        }
    } 
}
```
# DecimalToBinary
``` java
package NumberSystem;

public class DecimalToBinary {

    public static void main(String[] args) {
        
        int decimal = 10;       
        int num = decimal; // Store original value for reference
        String binary = ""; // To store the binary equivalent

        while (decimal > 0) {
            int remainder = decimal % 2; // Get remainder (0 or 1)
            binary = remainder + binary; // Append remainder at the beginning
            decimal /= 2; // Divide by 2
        }

        System.out.println("Binary equivalent of " + num + " is: " + binary);
    } 
}
```
# EvenOrOdd
``` java
package NumberSystem;

public class EvenOrOdd {

    public static boolean isEven(int n){
        if(n % 2 == 0){
           return true;
        }

        return false;
   }

   public static void main(String[] args) {
       
       int num = 17;
       if(isEven(num)){
           System.out.println("Number is even number");
       }
       else{
           System.out.println("Number is odd");
       } 
   }  
}
``` 
# FactorialOfNumber
``` java
package NumberSystem;

// import java.util.Scanner;
public class FactorialOfNumber {

    public static void main(String[] args) {
        
        int num = 5;
        int i = 1;
        int fact = 1;

        while(i<=num){
            fact = fact * i;
            i = i + 1;
        }
        System.out.println(fact);
    }
}
```
# FactorialusingRecurssion
``` java
package NumberSystem;

public class FactorialusingRecurssion {
    
    public static int fact(int n){

        if(n==1){
            return 1;
        }
        
        return n * fact(n-1);
    }

    public static void main(String[] args) {
        
        int num = 5;
        System.out.println(fact(num)); 
            
        }
}
```
# FibonacciSeries
``` java
package NumberSystem;
public class FibonacciSeries {
    
    public static void main(String[] args) {
        
        int num = 10;
        int a = 0;
        int b= 1;
        
        System.out.print(a + " " + b + " ");

        for(int i = 1; i<=num; i++){
           int nextdigit = a + b;
           System.out.print(nextdigit + " ");
           a = b;
           b = nextdigit;
        }
    }
}
```
# GreatestOfThreeNum
``` java
package NumberSystem;

public class GreatestOfThreeNum {
    
    public static void main(String[] args) {
        
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;

        if (num1 >= num2 && num1 >= num3) {
            System.out.println(num1 + " is the greatest.");
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println(num2 + " is the greatest.");
        } else {
            System.out.println(num3 + " is the greatest.");
        }
    }
}
```
# GreatestOfTwoNum
``` java
package NumberSystem;

public class GreatestOfTwoNum {

    public static void main(String[] args) {
        
        int num1 = 10;
        int num2 = 15;

        if(num1 > num2) {
            System.out.println(num1 + " is the greatest.");
        } else if (num2 > num1) {
            System.out.println(num2 + " is the greatest.");
        } else {
            System.out.println("Both numbers are equal.");
        }
    }   
}
```
# LeapYear
``` java
package NumberSystem;

public class LeapYear {
    
    public static boolean CheckLeapYear(int year){

        if(year % 4 == 0){
            return true;
        }

        return false;
    }
    public static void main(String[] args) {
        
        int year = 2022;
        if(CheckLeapYear(year)){
            System.out.println("It is a Leap Year");
        }
        else{
            System.out.println("It is not a Leap Year");
        }
    } 
}
```
# MultiplyFloatingNumbers
``` java
package NumberSystem;

import java.util.Scanner;

public class MultiplyFloatingNumbers {
    
    public static void main(String args[]){   // psvm shortcut 

    // Add floating point Numbers
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the floating Num1 : ");
    float num1 = input.nextFloat();

    System.out.print("Enter the floating Num2 : ");
    float num2 = input.nextFloat();

    float product = num1 * num2;
    
    System.out.print(product);
    input.close(); 
   
    }  
}
```
# PerfectNumber
``` java
package NumberSystem;

public class PerfectNumber {

    public static boolean isPerfect(int num){
         
        if(num < 1){
            return false;
        }
        int sum = 0;

        for(int i = 1; i <= num / 2; i++){
            if(num % i == 0){
                sum = sum + i;
            }
        }

        return sum == num;
    } 
    public static void main(String[] args) {
        
        int num = 28;
        if(isPerfect(num)){
            System.out.println("A number is a perfect number ");
        }
        else{
            System.out.println("A number is not a perfect number ");
        }
    }
}

// What is Perfect Number -> A number whose factors sum is equal to that number 
// we have check for only half of that number Example -> (num / 2)
```
# PostAndPreIncrement
``` java
package NumberSystem;

public class PostAndPreIncrement {
    
    public static void main(String[] args) {
        
       // Post increment
       int a = 5;
       System.out.println(a++);  // 5 print now increment a to 6
       System.out.println(a);    // thats why a is 6

       // Pre Increment
       int b = 12;
       System.out.println(++b);  // b increment to 13 and then print
       System.out.println(b);    // thats why b is 13
  
       // Post And pre increment example
       int x = 6;  // 7, 8
       System.out.println(x++ * ++x);  // 6 * 8
    }
}
```
# PowerOfNum
``` java
package NumberSystem;

public class PowerOfNum {
    
    public static int PowerOfNumbers(int base, int exponent){
         
        int result = 1;
        for(int i=1; i<=exponent; i++){
            result = result * base;
        }
        return result;
    }

    public static void main(String[] args) {
        
        int base = 6;
        int exponent = 2;

        System.out.println("Power of Number : " + PowerOfNumbers(base, exponent));
    }  
}
```
# Prime
``` java
package NumberSystem;
import java.util.Scanner;
public class Prime {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        
        int isprime = 1;  // initailly we can assume number is prime number 
        int i = 2;
        while(i < num){
            if(num % i == 0){
                isprime = 0;
                break;
            }
            i++;
        }
        
        if(isprime == 0){
            System.out.println("Not a prime number");
        }
        else{
            System.out.println("prime number");
        }

        sc.close();
    }
}
```
# package NumberSystem;
``` java
public class Prime2 {
    
    public boolean isPrime(int num){
        int i = 2;
        while(i < num){
            if(num % i == 0){
                return false;
            }
            i++;
        }    
        return true;
    }

    public static void main(String[] args) {
        
        Prime2 obj = new Prime2();

        int n = 20;
        if(obj.isPrime(n)){
            System.out.println("prime Number");
        }
        else{
            System.out.println("Not a Prime Number");
        }

    }
    
    // we can write method here also Write here also
    // public boolean isPrime(int num){
    //     int i = 2;
    //     while(i < num){
    //         if(num % i == 0){
    //             return false;
    //         }
    //         i++;
    //     }    
    //     return true;
    // }
    
    // Using For Loop
    // public boolean isPrime(int num){

    //     for(int i = 2; i<num; i++){
    //         if(num%i == 0)
    //             return false;
    //     }

    //     return true;
    // }
  
}
```
# PrimeNumInAGivenRange
``` java
package NumberSystem;

import java.util.Scanner;
 
public class PrimeNumInAGivenRange {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the start number : ");
        int start = sc.nextInt();

        System.out.println("Enter the last number : ");
        int last = sc.nextInt();
        int flag = 0;

        for(int num=start; num <= last; num++){
            for(int i= 2; i< num; i++){
                if(num % i == 0){
                    flag = 1;
                    break;
                }
            }

            if(flag == 0){
                System.out.println(num + " ");
            }

            flag = 0;
        }
        sc.close();
    }
}
```
# PrintInteger
``` java
package NumberSystem;

import java.util.Scanner; 
public class PrintInteger {
      
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Emter the integer");
        int number = input.nextInt();

        System.out.println("Your Integer is : " + number);
        input.close();
    }
}
```
# ReverseANumber
``` java
package NumberSystem;

import java.util.Scanner;
public class ReverseANumber {
    
    public static void main(String[] args) {
        
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num = Sc.nextInt();
        
        int Orgnum = num;

        int ans = 0;
        while(num != 0){
            int digit = num % 10;
            ans = (ans * 10) + digit;
            num = num / 10;
        }
        System.out.println(ans);
        
        if(ans == Orgnum){
            System.out.println("Palindome");
        }
        else{
            System.out.println("Not a palindrome");
        }

        Sc.close();
    }
}
```
# SumOfEvenNumbers
``` java
package NumberSystem;
import java.util.Scanner;

public class SumOfEvenNumbers {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();

        int sum = 0;
        for(int i=2; i<=n; i=i+2){
            sum = sum + i;
            System.out.println(i);
        }

        System.out.println(sum);

        sc.close();
    }
}
```
# SumofOddNumbers
``` java
package NumberSystem;

import java.util.Scanner;

public class SumofOddNumbers {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();

        int sum = 0;
        for(int i=1; i<=n; i=i+2){
            sum = sum + i;
            System.out.println(i);
        }

        System.out.println(sum);

        sc.close();
    }
}
```
# SwaptwoNumbers
``` java
package NumberSystem;

import java.util.Scanner;

public class SwaptwoNumbers {

    public static void main(String args[]){ 
    // Add two integer 
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the Num1 : ");
    int num1 = input.nextInt();

    System.out.print("Enter the Num2 : ");
    int num2 = input.nextInt();


    int temp = num1 ;
      num1 = num2;
      num2 = temp ;

      System.out.println("Number 1 is : " + num1);
      System.out.println("Number 2 is : " + num2);
    input.close();
}
}
``` 

