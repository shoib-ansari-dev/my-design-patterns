package creational.singleton.lazy;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class LazyFailingAndThreadSafe {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(1000);

        for (int i = 0; i < 1000; i++) {
            executor.submit(() -> {
                try {
                    LazySingleton eagerSingleton = LazySingleton.getInstance();
                } catch (Exception e) {
                    System.err.println("Error occurred while getting Eager Singleton instance: " + e.getMessage());
                }
            });
        }

        for (int i = 0; i < 1000; i++) {
            executor.submit(() -> {
                try {
                    LazySingleton lazySingleton = LazySingleton.getInstanceThreadSafe();
                } catch (Exception e) {
                    System.err.println("Error occurred while getting Lazy Singleton instance: " + e.getMessage());
                }
            });
        }
        executor.shutdown();
    }
}
