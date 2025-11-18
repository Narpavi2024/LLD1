package DesignPattern.decorator;

public class ChocolateCone implements IceCream{
    //ChocolateCone can behave like a base as well as addon.
    private IceCream iceCream;
    public ChocolateCone(IceCream iceCream){
        this.iceCream = iceCream;
    }
    public ChocolateCone(){}
    @Override
    public int getCost() {
        if (iceCream != null){
            return iceCream.getCost() + 30;
        }
        return 30;
    }

    @Override
    public String getDescription() {
        if (iceCream != null){
            return iceCream.getDescription() + "ChocolateCone";
        }
        return "ChocolateCone";
    }
}
