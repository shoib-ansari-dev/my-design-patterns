package creational.abstractfactory.windows;

import creational.abstractfactory.component.Dropdown;
import creational.abstractfactory.component.Theme;

public class WindowsDropdown implements Dropdown {
    private final Theme theme;

    public WindowsDropdown(Theme theme){
        this.theme = theme;
    }
    @Override
    public void render() {
        System.out.println("Rendering Windows Dropdown button with theme "+ theme);
    }

    @Override
    public void onSelect(int idx) {
        System.out.println("Selecting Windows DropDown");
    }
}
