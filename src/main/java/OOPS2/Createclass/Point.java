package OOPS2.Createclass;

public class Point {
    int x;
    int y;

    public Point(int x,int y){
        this.x = x;
        this.y = y;
    }

    public Point(Point other){
        this.x = other.x;
        this.y = other.y;
    }
}
