package creational.abstractfactory.client;

import creational.abstractfactory.component.Buttons;
import creational.abstractfactory.component.CheckBox;
import creational.abstractfactory.component.Dropdown;
import creational.abstractfactory.component.Theme;
import creational.abstractfactory.factory.GUIFactory;
import creational.abstractfactory.provider.FactoryProvider;

public class Application {
    private final Buttons buttons;
    private final Dropdown dropdown;
    private final CheckBox checkBox;

    public Application(GUIFactory factory, Theme theme){
        this.buttons = factory.createButton(theme);
        this.dropdown = factory.createDropdown(theme);
        this.checkBox = factory.createCheckBox(theme);
    }

    public void run(){
        buttons.render();
        buttons.onClick();

        dropdown.render();
        dropdown.onSelect(1);

        checkBox.render();
        checkBox.onToggle();
    }

    public static void main(String[] args) {
        Theme theme= Theme.LIGHT;
        GUIFactory factory = FactoryProvider.getFactory();
        Application application = new Application(factory, theme);
        application.run();
    }
}
