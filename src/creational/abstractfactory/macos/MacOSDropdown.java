package creational.abstractfactory.macos;

import creational.abstractfactory.component.Dropdown;
import creational.abstractfactory.component.Theme;

public class MacOSDropdown implements Dropdown {
    private final Theme theme;

    public MacOSDropdown(Theme theme){
        this.theme = theme;
    }

    @Override
    public void render() {
        System.out.println("Rendering MacOS Dropdown button with theme "+ theme);

    }

    @Override
    public void onSelect(int idx) {
        System.out.println("Selecting MacOS DropDown");

    }
}