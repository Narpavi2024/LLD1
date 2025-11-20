package DesignPattern.Strategy;

public class CarPathCalculator implements PathCalculatorStrategy{
    @Override
    public void findpath(String fromlocation, String tolocation) {
        System.out.println("Car path");
    }
}
