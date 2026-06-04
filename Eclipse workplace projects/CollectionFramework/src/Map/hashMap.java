package Map;

import java.util.HashMap;

public class hashMap {

	public static void main(String[] args) {
		
		HashMap<Integer, String> h = new HashMap<>();
		h.put(101, "Sham");
		h.put(104, "Ram");
		h.put(103, "Babubhaiya");
		h.put(102, "Raju");
		h.put(105, "Sham");
		
		System.out.println(h);
		
		System.out.println(h.get(102));  
		
        System.out.println(h.values());
	}

}
