package DesignPattern.Factorypattern;

import DesignPattern.Factorypattern.buttons.AndroidButton;
import DesignPattern.Factorypattern.buttons.Button;
import DesignPattern.Factorypattern.menu.Androidmenu;
import DesignPattern.Factorypattern.menu.Menu;

public class AndroidUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Menu createMenu() {
        return new Androidmenu();
    }
}
