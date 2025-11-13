package DesignPattern.Factorypattern;

import DesignPattern.Factorypattern.buttons.Button;
import DesignPattern.Factorypattern.buttons.IosButton;
import DesignPattern.Factorypattern.menu.IosMenu;
import DesignPattern.Factorypattern.menu.Menu;

public class IosUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new IosButton();
    }

    @Override
    public Menu createMenu() {
        return new IosMenu();
    }
}
