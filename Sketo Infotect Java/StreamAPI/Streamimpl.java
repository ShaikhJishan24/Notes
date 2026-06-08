package StreamAPI;

import java.util.Arrays;
import java.util.List;
// import java.util.stream.IntStream;
// import java.util.Optional;
// import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streamimpl {

    public static void main(String[] args) {
        
        List<Integer> li = Arrays.asList(2, 5, 4, 3, 8);

        Stream<Integer> s = li.stream(); // it can be used only once
        
        // 1) filter<predicate>
        // List<Integer> ans = s.filter(n -> n % 2 == 0).collect(Collectors.toList());
        // // System.out.println(ans);
        // ans.forEach(e -> System.out.println(e));   // ANother way

        // 2) map(function)
        // List<Integer> ans2 = s.map(n -> n * n).collect(Collectors.toList());
        // System.out.println(ans2);

        // 3) Sorted() or Sorted(Comparable)
        // List<Integer> ans2 = s.sorted().collect(Collectors.toList());
        // System.out.println(ans2); 
        
        // 3.1)
        // Using Comparator
        // List<Integer> ans3 = s.sorted((x,y) -> x.compareTo(y)).collect(Collectors.toList());
        // System.out.println(ans3);
        
        // 4) distinct()
        // List<Integer> li2 = Arrays.asList(2, 3, 4, 3, 8, 2);
        // Stream<Integer> s1 = li2.stream(); 
        // List<Integer> ans4 = s1.distinct().toList();
        // System.out.println(ans4);
       
        // 5) Count
        // long ans5 = s.count();
        // System.out.println(ans5);
        
        // 5) Limit()
        // List<Integer> ans6 = s.limit(3).toList();
        // System.out.println(ans6);

        // 7) ForEach()  loop through an array
        // s.forEach(e -> System.out.println(e));
        
        // 8) reduce()
        // int ans7 = s.reduce(0, (n, m) -> n + m);  // Addition
        // System.out.println(ans7);

        // int ans8 = s.reduce(1, (n, m) -> n * m);  // Multiplication
        // System.out.println(ans8);
        
        // A better Way write this methods in simple way
        Integer a = s.map(n -> n * n)    // 4, 25, 16, 9, 64
                    .filter(n -> n % 2 == 0) // 4, 16, 64
                    .reduce(0, (n, m) -> n + m); // 84

        System.out.println(a);

        // 9) allMatch() - return the true or false if allmatch based on condition
        // boolean b1 = li.stream()
        //             .allMatch(n -> n %2 == 0);
        // System.out.println(b1);            

        // 10) anymatch() - return the true or false if atleast one match based on condition
        // boolean b2 = li.stream()
        //             .anyMatch(n -> n %2 == 0);
        // System.out.println(b2);
        
        // 11) equals() - used with string to check equality
        // List<String> li1 = Arrays.asList("Jishan", "Moin", "sana", "Shoheb", "Ranu");
        // List<String> b = li1.stream()
        //             .filter(x -> x.equals("sana"))
        //             .collect(Collectors.toList());
        // System.out.println(b);
        
        // 12) Max()
        // Optional<Integer> max = li.stream()
        //                         .max(Integer::compare);
        // System.out.println(max);

        // 13) Min()
        // Optional<Integer> min = li.stream()
        //                         .max(Integer::compare);
        // System.out.println(min);

        // 14) skip(long n) - skip the total element that give in argument
        // List<Integer> st = s.skip(2)
        //                         .collect(Collectors.toList());
        // System.out.println(st);

        // 15) Intstream.range(startinclusive, endexclusive) - generate int number from start to end given range
        // IntStream num = IntStream.range(1, 5);
        // num.forEach(ele -> System.out.println(ele));
        // 15.1) 
        // List<String> re = IntStream.range(1, 5)
        //                        .mapToObj(i -> "Number: " + i)
        //                        .collect(Collectors.toList());
        // System.out.println(re);

        // Integer::compare is a method reference to the static method
        // It:

            // Returns -1 if x < y

            // Returns 0 if x == y

            // Returns 1 if x > y
        // ready-to-use comparator for comparing two integers

        // same as Comparator<Integer> comp = (a, b) -> Integer.compare(a, b);

    }

    
}
