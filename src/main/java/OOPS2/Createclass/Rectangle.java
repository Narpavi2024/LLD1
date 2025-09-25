package OOPS2.Createclass;

public class Rectangle {
    Point topLeft;
    Point bottomRight;

    public Rectangle(int topLeftX,int topLeftY,int bottomRightX,int bottomRightY){
        this.topLeft = new Point(topLeftX,topLeftY);
        this.bottomRight = new Point(bottomRightX,bottomRightY);
    }
    public Rectangle(Point topLeft,Point bottomRight){
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }
    public Rectangle(Rectangle other){
        this.topLeft = other.topLeft;
        this.bottomRight = other.bottomRight;
    }
}
