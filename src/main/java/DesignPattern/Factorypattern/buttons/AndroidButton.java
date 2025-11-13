package DesignPattern.Factorypattern.buttons;

public class AndroidButton implements Button{
    @Override
    public void click() {
        System.out.println("Android Button Clicking");
    }
}
