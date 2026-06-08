package CollectonsFramework.Set;

import java.util.LinkedHashSet;
public class linkedHashSet {

    public static void main(String[] args) {
        
        // it is similar to HashSet
        // also similar to LinkedList but not allow Duplicates returns orderd element
        // Methods Are similar to the Other interface
        LinkedHashSet <String> lset = new LinkedHashSet<>();

        lset.add("Welcome");
        lset.add("To");
        lset.add("Channel");
        lset.add("My");
        lset.add("YouTube");
        lset.add("YouTube");
        

        System.out.println(lset);

    }
    
}
