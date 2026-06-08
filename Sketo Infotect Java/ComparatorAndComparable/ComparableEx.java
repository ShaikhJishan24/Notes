package ComparatorAndComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

    class Stud implements Comparable<Stud>{
            
        int id;
        String name;

        public Stud(int id, String name){
            this.id = id;
            this.name = name;
        }
        
        @Override
        public int compareTo(Stud s) {
            return Integer.compare(this.id, s.id);
        }

        public String toString() {
            return id + " - " + name;
        }

    }
public class ComparableEx {

    public static void main(String[] args) {
        
        List<Stud> st = new ArrayList<>();
        st.add(new Stud(103, "neha"));
        st.add(new Stud(101, "Pratik"));
        st.add(new Stud(102, "sana"));
    
    // This is another way for above 
    //    List<Stud> st = Arrays.asList(
    //         new Stud(103, "Neha"),
    //         new Stud(101, "Pratik"),
    //         new Stud(102, "Sana")
    //    );
       Collections.sort(st);
       System.out.println(st); 
    }
    
}
