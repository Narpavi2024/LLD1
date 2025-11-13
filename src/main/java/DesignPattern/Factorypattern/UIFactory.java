package DesignPattern.Factorypattern;

import DesignPattern.Factorypattern.buttons.Button;
import DesignPattern.Factorypattern.menu.Menu;

public interface UIFactory {

    Button createButton();

    Menu createMenu();
}
