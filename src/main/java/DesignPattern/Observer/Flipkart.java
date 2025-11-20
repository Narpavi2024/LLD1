package DesignPattern.Observer;

import java.util.ArrayList;
import java.util.List;

public class Flipkart {
    private static Flipkart instance = null;
    List<OnOrderPlacedSubscriber> onOrderPlacedSubscribers = new ArrayList<>();
    Flipkart(){}

    public static Flipkart getInstance(){
        if (instance == null){
            instance = new Flipkart();
        }
        return instance;
    }

    public void registerSubscriber(OnOrderPlacedSubscriber onOrderPlacedSubscriber){
        onOrderPlacedSubscribers.add(onOrderPlacedSubscriber);
    }
    public void unregisterSubscriber(OnOrderPlacedSubscriber onOrderPlacedSubscriber){
        onOrderPlacedSubscribers.remove(onOrderPlacedSubscriber);
    }

    public void onOrderPlaced(){
        for (OnOrderPlacedSubscriber onOrderPlacedSubscriber:onOrderPlacedSubscribers){
            onOrderPlacedSubscriber.announceOrderPlaced();
        }
    }
}
