package Relatedclass;

public class RelatedMain {
    public static void main(String[] args) {
        Point point = new Point(0,10);
        Rectangle rectangle = new Rectangle(point,5,8);
        System.out.println("Area: "+rectangle.getArea());
        System.out.println("Perimeter: "+rectangle.getPerimeter());
        Point br = rectangle.getBottomRight();
        System.out.println("Bottom Right: ("+br.x+","+br.y+")");
    }
}
