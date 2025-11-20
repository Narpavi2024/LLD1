package DesignPattern.Strategy;

public class BikePathCalculator implements PathCalculatorStrategy{
    @Override
    public void findpath(String fromlocation, String tolocation) {
        System.out.println("Bike path");
    }
}
