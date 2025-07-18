package creational.singleton.eager;

public class EagerMain {
    public static void main(String[] args) {
        // Using Eager Singleton
        EagerSingleton eagerSingleton = EagerSingleton.getInstance();
        System.out.println("Eager Singleton Instance: " + eagerSingleton);
        EagerSingleton anotherEagerSingleton = EagerSingleton.getInstance();
        System.out.println("Another Eager Singleton Instance: " + anotherEagerSingleton);


    }
}
