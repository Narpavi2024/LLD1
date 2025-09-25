package OOPS2.Createclass;


//Create a set of classes to meet the following requirements:
//
//a. Class Point
//It should have 2 data-members: x and y.
//Add a constructor with two parameters: x and y.
//Add a copy constructor.
//b. Class Rectangle
//It should have 2 data-members:
//
//topLeft (Point)
//bottomRight (Point)
//Add a constructor with 4 parameters of type int: topLeftX, topLeftY, bottomRightX, bottomRightY.
//
//Add a constructor with 2 parameters of type Point: topLeft, bottomRight.
//
//Add a constructor with 1 parameter of type Rectangle.
//
//Make sure that Rectangle constructors make deep copies.
public class CreateMain {
    public static void main(String[] args) {

        Point p1 = new Point(2,3);
        Point p2 = new Point(p1);  //copy constructor

        System.out.println("P1:"+p1.x+","+p1.y);
        System.out.println("P2:"+p2.x+","+p2.y);

        //create rectangle using int constructor

        Rectangle r1 = new Rectangle(0,10,5,0);

        //Create rectangle using point constructor
        Rectangle r2 = new Rectangle(p1,new Point(6,1));

        //Create rectangle using copy constructor

        Rectangle r3 = new Rectangle(r2);

        System.out.println("r1 topLeft: (" + r1.topLeft.x + ", " + r1.topLeft.y +
                "), bottomRight: (" + r1.bottomRight.x + ", " + r1.bottomRight.y + ")");

        System.out.println("r2 topLeft: (" + r2.topLeft.x + ", " + r2.topLeft.y +
                "), bottomRight: (" + r2.bottomRight.x + ", " + r2.bottomRight.y + ")");

        System.out.println("r3 (copy of r2) topLeft: (" + r3.topLeft.x + ", " + r3.topLeft.y +
                "), bottomRight: (" + r3.bottomRight.x + ", " + r3.bottomRight.y + ")");

    }
}
