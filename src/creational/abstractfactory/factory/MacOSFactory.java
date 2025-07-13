package creational.abstractfactory.factory;

import creational.abstractfactory.component.Buttons;
import creational.abstractfactory.component.CheckBox;
import creational.abstractfactory.component.Dropdown;
import creational.abstractfactory.component.Theme;
import creational.abstractfactory.macos.MacOSButton;
import creational.abstractfactory.macos.MacOSCheckBox;
import creational.abstractfactory.macos.MacOSDropdown;

public class MacOSFactory implements GUIFactory{

    @Override
    public Buttons createButton(Theme theme) {
        return new MacOSButton(theme);
    }

    @Override
    public Dropdown createDropdown(Theme theme) {
        return new MacOSDropdown(theme);
    }

    @Override
    public CheckBox createCheckBox(Theme theme) {
        return new MacOSCheckBox(theme);
    }
}
