package DesignPattern.Factorypattern;

import DesignPattern.Factorypattern.buttons.Button;
import DesignPattern.Factorypattern.menu.Menu;

public class Client {

    public static void main(String[] args) {
        Flutter flutter = new Flutter();
        UIFactory uiFactory = flutter.getUIFactoryForPlatform(SupportedPlatforms.Ios);

        Button button = uiFactory.createButton();
        button.click();

        Menu menu = uiFactory.createMenu();
        menu.showMenu();
    }
}
