package List;

import java.util.Vector;

public class vector {

	public static void main(String[] args) {
		
		Vector<String> v = new Vector<>();
		v.add("Ziya");
		v.add("Mayra");
		v.add("Diyana");
		v.add("Shifa");
		
		System.out.println(v);
		
		System.out.println(v.capacity());
		v.setSize(4); 
		v.add("New");
	}

}
