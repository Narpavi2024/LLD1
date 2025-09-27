package OOPS3.MethodOverloadingandoverriding;

//Create a set of class with following requirements:
//
//
//a. Create a class Point
//
//It should have two data members
//        x : int
//y : int
//It should have a display method that prints in following format - “[<<x>>, <<y>>]”
//x and y should be protected and display should be public
//
//b. Create another class ThreedPoint which extends the Point class
//
//It should have the following data members: z : int
//It should have a display method to override the parent’s display method which prints in following format - “[<<x>>, <<y>>, <<z>>]”
//z should be private and display should be public.

public class Main {

    public static void main(String[] args) {
        Point point = new Point(1,2);
        point.display();

        ThreedPoint threedPoint = new ThreedPoint(3,4,5);
        threedPoint.display();
    }
}
