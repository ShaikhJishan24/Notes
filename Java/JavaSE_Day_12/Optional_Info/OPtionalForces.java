import java.util.Optional;

public class OPtionalForces{

    public static Optional<String> getString(){
        return Optional.of("Jishan");
    }

    public static void main(String[] args) {
        
        
        Optional<String> name = getString();
        // System.out.println(name.length());  // this gives error you must unwrap the optional box and also check absense of value
        if(name.isPresent()){
            System.out.println(name.get().length());  // 6
        }
    }
}