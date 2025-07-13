package creational.abstractfactory.macos;

import creational.abstractfactory.component.Buttons;
import creational.abstractfactory.component.Theme;

public class MacOSButton implements Buttons {
    private final Theme theme;

    public MacOSButton(Theme theme){
        this.theme = theme;
    }

    @Override
    public void render() {
        System.out.println("Rendering MacOS button with them: "+ theme);
    }

    @Override
    public void onClick() {
        System.out.println("MacOS Button clicked");
    }
}
