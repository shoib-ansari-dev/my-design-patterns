package creational.singleton.billpugh;

public class BillPughSingleton {
    private BillPughSingleton() {
        // Private constructor to prevent instantiation
        System.out.println("BillPughSingleton instance created.");
    }

    // Static inner class responsible for holding the singleton instance
    private static class SingletonHelper {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    // Public method to provide access to the singleton instance
    public static BillPughSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }

    public static void main(String[] args) {
        // Using Bill Pugh Singleton
        BillPughSingleton billPughSingleton = BillPughSingleton.getInstance();
        System.out.println("Bill Pugh Singleton Instance: " + billPughSingleton);
        BillPughSingleton anotherBillPughSingleton = BillPughSingleton.getInstance();
        System.out.println("Another Bill Pugh Singleton Instance: " + anotherBillPughSingleton);
    }
}
