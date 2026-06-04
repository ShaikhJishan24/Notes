package SingletonPattern;

public class SingletonPa{

    // Static variable to hold the single instance
    private static SingletonPa instance;

    // Private constructor to prevent external instantiation(Object creation)
    private SingletonPa() {
        System.out.println("Singleton Instance Created");
    }

    // Public method to provide access to the instance
    public static SingletonPa getInstance() {
        if (instance == null) {
            instance = new SingletonPa();  // Create instance if it doesn't exist
        }
        return instance;
    }

    public static void main(String[] args) {
        
        SingletonPa s1 = SingletonPa.getInstance();
        SingletonPa s2 = SingletonPa.getInstance();

        // Both references point to the same object
        System.out.println(s1 == s2);  // Output: true
    }
}