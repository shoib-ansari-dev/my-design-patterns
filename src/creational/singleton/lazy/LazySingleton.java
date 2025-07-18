package creational.singleton.lazy;

public class LazySingleton {
    private static volatile LazySingleton lazyInstance;

    private LazySingleton() {
        // Private constructor to prevent instantiation
        System.out.println("LazySingleton instance created.");
    }

    public static LazySingleton getInstance(){
        if (lazyInstance == null) {
            lazyInstance = new LazySingleton();
        }
        return lazyInstance;
    }
    public static synchronized LazySingleton getInstanceThreadSafe() {
        if (lazyInstance == null) {
            synchronized (LazySingleton.class) {
                if (lazyInstance == null) {
                    lazyInstance = new LazySingleton();
                }
            }
        }
        return lazyInstance;
    }
}
