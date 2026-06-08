package Predicates;

import java.util.function.Predicate;

public class PredEx{

    public static void main(String[] args) {
        
        Predicate<Integer> p = x -> x > 500;
        System.out.println(p.test(200));
    }
}