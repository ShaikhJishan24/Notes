package Predicates;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CombinedPred {

    public static void main(String[] args) {
        
        List<Integer> num = Arrays.asList(10, 5, 25, 64, 89);

        Predicate<Integer> isEven = n -> n % 2 == 0;
        Predicate<Integer> greaterthan = x -> x > 15;
        
        // And 
        Predicate<Integer> combined = isEven.and(greaterthan);
        
        // Or
        // Predicate<Integer> combined = isEven.or(greaterthan);


        List<Integer> combinedAns = num.stream().filter(combined).collect(Collectors.toList());

        combinedAns.forEach(e -> System.out.println(e));   


    }
    
}
