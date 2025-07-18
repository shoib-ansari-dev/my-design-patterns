package creational.singleton.eager;

public class EagerSingleton {
    private static final EagerSingleton eagerInstance = new EagerSingleton();

    private EagerSingleton() {
        // Private constructor to prevent instantiation
        System.out.println("EagerSingleton instance created.");
    }
    public static EagerSingleton getInstance() {
        return eagerInstance;
    }
}
