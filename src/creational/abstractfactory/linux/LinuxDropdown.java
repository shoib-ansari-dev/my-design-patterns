package creational.abstractfactory.linux;

import creational.abstractfactory.component.Dropdown;
import creational.abstractfactory.component.Theme;

public class LinuxDropdown implements Dropdown {
    private final Theme theme;

    public LinuxDropdown(Theme theme){
        this.theme = theme;
    }

    @Override
    public void render() {
        System.out.println("Rendering Linux Dropdown button with theme "+ theme);
    }

    @Override
    public void onSelect(int idx) {
        System.out.println("Selecting Linux DropDown");
    }
}
