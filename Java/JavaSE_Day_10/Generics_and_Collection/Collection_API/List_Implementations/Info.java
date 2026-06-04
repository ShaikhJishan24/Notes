import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class Info {
    
    public static void main(String[] args) {
        
        // List<String> li = new ArrayList<>();
        // li.add("Jishan");
        // li.add("Moin");

        // System.out.println(li);

        // Iterator<String> itr = li.iterator();
        // while(itr.hasNext()){

        //     System.out.println(itr.next());
        //     // li.add("jhgjh"); concurrentModificatioException
        //     itr.remove();   // Allowed
        // }

        // System.out.println(li);

        List<String> li = new CopyOnWriteArrayList<>();
        li.add(null);
        li.add("Jishan");
        li.add("Moin");
        li.add("Jishan");


        System.out.println(li);

        li.remove("Jishan");
        // Iterator<String> itr = li.iterator();
        // while(itr.hasNext()){

        //     System.out.println(itr.next());
        //     // itr.remove();    // unsupportedException
        //     li.add("sana");  // we can add it possible
        // }

        System.out.println(li);

        // Note - iterator has limited methods 
    }
}
