package DesignPattern.Observer;

public class InventoryService implements OnOrderPlacedSubscriber{

    public InventoryService(){
        Flipkart flipkart = Flipkart.getInstance();
        flipkart.registerSubscriber(this);
    }
    @Override
    public void announceOrderPlaced() {
        System.out.println("Notifying Inventory");
    }
}
