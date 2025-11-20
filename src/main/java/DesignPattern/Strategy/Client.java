package DesignPattern.Strategy;

public class Client {
    public static void main(String[] args) {

        Googlemaps googlemaps = new Googlemaps();
        googlemaps.findPath("Chennai","Banglore","Car");

    }
}
