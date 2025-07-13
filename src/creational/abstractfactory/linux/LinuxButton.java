package creational.abstractfactory.linux;

import creational.abstractfactory.component.Buttons;
import creational.abstractfactory.component.Theme;

public class LinuxButton implements Buttons {
    private final Theme theme;

    public LinuxButton(Theme theme){
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
