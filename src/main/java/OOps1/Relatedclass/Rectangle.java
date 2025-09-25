package OOps1.Relatedclass;

public class Rectangle {
    Point topLeft;
    int height;
    int width;

    public Rectangle(Point topLeft,int height,int width){
        this.topLeft = topLeft;
        this.height = height;
        this.width = width;
    }
    public int getArea(){
        return  height * width;
    }
    public int getPerimeter(){
        return 2*(height + width);
    }

    public Point getBottomRight(){
        return new Point(topLeft.x +width, topLeft.y-height );
    }
}
