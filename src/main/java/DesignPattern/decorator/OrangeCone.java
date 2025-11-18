package DesignPattern.decorator;

public class OrangeCone implements IceCream{

    //Orange Cone will only behave like a cone
    @Override
    public int getCost() {
        return 10;
    }

    @Override
    public String getDescription() {
        return "Orange Cone";
    }
}
