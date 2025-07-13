package creational.abstractfactory.linux;

import creational.abstractfactory.component.CheckBox;
import creational.abstractfactory.component.Theme;

public class LinuxCheckBox implements CheckBox {
    private final Theme theme;

    public LinuxCheckBox(Theme theme){
        this.theme = theme;
    }

    @Override
    public void render() {
        System.out.println("Rendering Linux CheckBox button with theme "+ theme);
    }

    @Override
    public void onToggle() {
        System.out.println("Toggling Linux CheckBox");
    }

}
