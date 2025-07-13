package creational.abstractfactory.macos;

import creational.abstractfactory.component.CheckBox;
import creational.abstractfactory.component.Theme;

public class MacOSCheckBox implements CheckBox {
    private final Theme theme;

    public MacOSCheckBox(Theme theme){
        this.theme= theme;
    }

    @Override
    public void render() {
        System.out.println("Rendering MacOS button with theme "+ theme);
    }

    @Override
    public void onToggle() {
        System.out.println("Toggling MacOS CheckBox");
    }

}