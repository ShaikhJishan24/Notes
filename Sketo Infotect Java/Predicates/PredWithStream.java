package Predicates;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredWithStream {

    public static void main(String[] args) {
        
        List<Integer> num = Arrays.asList(10, 5, 25, 64, 89);

        Predicate<Integer> isEven = n -> n % 2 == 0;

        List<Integer> EvenNumbers = num.stream()
                                    .filter(isEven)
                                    .collect(Collectors.toList());

        // System.out.println(EvenNumbers);
        EvenNumbers.forEach(e -> System.out.println(e));    // Another way
    }
    
}
