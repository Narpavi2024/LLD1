package DesignPattern.Strategy;

public class Googlemaps {

   public void findPath(String from,String to,String mode) {

        PathCalculatorStrategy pathCalculatorStrategy =  PathCalculatorFactory.getpathcalculatefactory(mode);
        pathCalculatorStrategy.findpath(from,to);
    }
}
