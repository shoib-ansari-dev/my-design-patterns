package creational.singleton.lazy;

public class LazyThreadSafe {
    private static LazyThreadSafe instance;

    private LazyThreadSafe() {
        System.out.println("LazyThreadSafe instance created.");
    }

    public static synchronized LazyThreadSafe getInstance() {
        if (instance == null) {
            instance = new LazyThreadSafe();
        }
        return instance;
    }
}
