package DesignPattern.Factorypattern.buttons;

public class IosButton implements Button{
    @Override
    public void click() {
        System.out.println("IOS Button Clicking");
    }
}
