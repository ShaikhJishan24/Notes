package CollectonsFramework.List;

import java.util.Stack;
public class stack {

    public static void main(String[] args) {
        
        Stack <Integer> s = new Stack<>();
        
        // Adding the Elements
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);

        System.out.println("Printing the stack = " + s);

        // Deleting the Elements
        // s.pop();
        // System.out.println("After deleting the Element" + s);
        
        // finding the Top most Element
        // int ans = s.peek();
        // System.out.println("Topmost Element " + ans);

        // s.clear();
        // System.out.println("After clearing the Stack" + s);

        s.add(60);  // follow the LIFO
        System.out.println(s);

    }
    
}
