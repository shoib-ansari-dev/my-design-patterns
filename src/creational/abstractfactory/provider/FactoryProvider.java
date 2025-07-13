package creational.abstractfactory.provider;

import creational.abstractfactory.factory.GUIFactory;
import creational.abstractfactory.factory.LinuxFactory;
import creational.abstractfactory.factory.MacOSFactory;
import creational.abstractfactory.factory.WindowsFactory;

public class FactoryProvider {
    public static GUIFactory getFactory(){
        String os = System.getProperty("os.name").toLowerCase();

        return switch (os) {
            case String s when s.contains("win") -> new WindowsFactory();
            case String s when s.contains("mac") -> new MacOSFactory();
            default -> new LinuxFactory();
        };
    }
}
