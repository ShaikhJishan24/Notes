package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class streamApi {

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(3, 2, 8, 3, 5);

        // Stream<Integer> s = nums.stream();
        // Stream<Integer> s1 = s.map(n -> n * n);
        // Stream<Integer> s2 = s1.filter(n -> n % 2 == 0);
        // s2.forEach(a -> System.out.println(a));

        // The type(Data type) of the values which is return by reduce function coz
        // it gives Single value hence it can not be the Stream Type
        // Integer s3 = s2.reduce(0, (n, m) -> n + m);
        // System.out.println(s3);
       
        // Stream<Integer> s4 = s.sorted(); // this for only timepass
        // s4.forEach(a -> System.out.println(a));


        // A better Way write this methods in simple way
        Integer a = nums.stream()
                    .map(n -> n * n)
                    .filter(n -> n % 2 == 0)
                    .reduce(0, (n, m) -> n + m);

        System.out.println(a);


        
    }

}
