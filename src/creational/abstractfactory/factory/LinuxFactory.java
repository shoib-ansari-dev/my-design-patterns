package creational.abstractfactory.factory;

import creational.abstractfactory.component.Buttons;
import creational.abstractfactory.component.CheckBox;
import creational.abstractfactory.component.Dropdown;
import creational.abstractfactory.component.Theme;
import creational.abstractfactory.linux.LinuxButton;
import creational.abstractfactory.linux.LinuxCheckBox;
import creational.abstractfactory.linux.LinuxDropdown;

public class LinuxFactory implements GUIFactory{
    @Override
    public Buttons createButton(Theme theme) {
        return new LinuxButton(theme);
    }

    @Override
    public Dropdown createDropdown(Theme theme) {
        return new LinuxDropdown(theme);
    }

    @Override
    public CheckBox createCheckBox(Theme theme) {
        return new LinuxCheckBox(theme);
    }
}
