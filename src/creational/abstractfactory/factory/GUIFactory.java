package creational.abstractfactory.factory;

import creational.abstractfactory.component.Buttons;
import creational.abstractfactory.component.CheckBox;
import creational.abstractfactory.component.Dropdown;
import creational.abstractfactory.component.Theme;

public interface GUIFactory {
    Buttons createButton(Theme theme);
    Dropdown createDropdown(Theme theme);
    CheckBox createCheckBox(Theme theme);
}
