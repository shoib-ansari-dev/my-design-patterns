package creational.abstractfactory.factory;

import creational.abstractfactory.component.Buttons;
import creational.abstractfactory.component.CheckBox;
import creational.abstractfactory.component.Dropdown;
import creational.abstractfactory.component.Theme;
import creational.abstractfactory.windows.WindowsButton;
import creational.abstractfactory.windows.WindowsCheckBox;
import creational.abstractfactory.windows.WindowsDropdown;

public class WindowsFactory implements GUIFactory{
    @Override
    public Buttons createButton(Theme theme) {
        return new WindowsButton(theme);
    }

    @Override
    public Dropdown createDropdown(Theme theme) {
        return new WindowsDropdown(theme);
    }

    @Override
    public CheckBox createCheckBox(Theme theme) {
        return new WindowsCheckBox(theme);
    }
}
