package CollectionFramework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetEx {

	public static void main(String[] args) {
		
		// 1) Hashset
		Set<Integer> s = new HashSet<>();
		
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(10);
		s.add(40);
		
//		System.out.println(s);
        
		// 2 LinkedHash Set
        Set<Integer> ls = new LinkedHashSet<>();
		
		ls.add(10);
		ls.add(20);
		ls.add(30);
		ls.add(10);
		ls.add(40);
		
//		System.out.println(ls);	
		
		Iterator<Integer>  i = ls.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		
		
	}

}
