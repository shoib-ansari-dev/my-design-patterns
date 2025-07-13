package creational.abstractfactory.windows;

import creational.abstractfactory.component.Buttons;
import creational.abstractfactory.component.Theme;

public class WindowsButton implements Buttons {
    private final Theme theme;
    public WindowsButton(Theme theme){
        this.theme = theme;
    }
    @Override
    public void render() {
        System.out.println("Rendering window button with them: "+ theme);
    }

    @Override
    public void onClick() {
        System.out.println("Windows Button clicked");
    }
}
