package OOPS2.Createclass.Mathclass;

//Problem Description
//
//Create a class Math with following requirements
//- A class level data member called PI set to 3.14.
//        - A class level public method called getCircleArea, which takes as input an integer parameter called radius. This function should return area of the circle as a double
//

public class Mathmain {

    public static final double PI = 3.14;

    public static double getCircleArea(int radius){
        return PI * radius * radius;
    }

    public static void main(String[] args) {
        int radius1 = 5;
        int radius2 = 10;

        double area1 = Mathmain.getCircleArea(radius1);
        double area2 = Mathmain.getCircleArea(radius2);

        System.out.println("Area of circle with radius " + radius1 + " = " + area1);
        System.out.println("Area of circle with radius " + radius2 + " = " + area2);

    }
}
