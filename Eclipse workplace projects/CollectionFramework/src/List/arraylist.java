package List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class arraylist {

	public static void main(String[] args) {
		
		ArrayList<Integer> li = new ArrayList<>();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(10);
		li.add(40);
		
		System.out.println(li.get(2));
		System.out.println(li);
//		li.set(2, 60);
        
		ArrayList<Integer> li1 = new ArrayList<>();
        li1.add(50);
        li1.add(60);
        li1.add(70);
        li1.add(80);
        li1.add(90);
        
        li.addAll(li1);
        System.out.println(li);
        
        Iterator<Integer> it = li1.iterator();
        while(it.hasNext()) {
        	System.out.println(it.next());
        }
        
	}

}
