package OOPS3.MethodOverloadingandoverriding;

public class Point {
    protected int x;
    protected int y;

    public Point(int x,int y){
        this.x = x;
        this.y = y;
    }

    public void display(){
        System.out.println("["+this.x+", "+this.y+"]");
    }
}
