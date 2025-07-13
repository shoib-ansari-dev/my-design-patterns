package creational.abstractfactory.windows;

import creational.abstractfactory.component.CheckBox;
import creational.abstractfactory.component.Theme;

public class WindowsCheckBox implements CheckBox {
    private final Theme theme;

    public WindowsCheckBox(Theme theme){
        this.theme = theme;
    }
    @Override
    public void render() {
        System.out.println("Rendering WindowsCheckBox button with theme "+ theme);
    }

    @Override
    public void onToggle() {
        System.out.println("Toggling Windows CheckBox");
    }
}
