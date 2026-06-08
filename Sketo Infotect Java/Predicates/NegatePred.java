package Predicates;

import java.util.function.Predicate;

public class NegatePred {

    public static void main(String[] args) {
        
        Predicate<Integer> isEven = num -> num % 2 == 0;
        Predicate<Integer> isOdd = isEven.negate(); // Logical NOT

        System.out.println(isOdd.test(10)); 
        System.out.println(isOdd.test(15)); 
    }
    
}
