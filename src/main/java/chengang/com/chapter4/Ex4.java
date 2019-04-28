package chengang.com.chapter4;

/*
Define an abstract class Shape with an instance variable of class Point, a constructor, a concrete method public void
moveBy(double dx, double dy) that moves the point by the given amount, and an abstract method public Point getCenter().
Provide concrete subclasses Circle, Rectangle, Line with constructors public Circle(Point center, double radius), public
Rectangle(Point topLeft, double width, double height) and public Line(Point from, Point to).
 */


public class Ex4 {
    public static void main(String[] args) {
        Circle c = new Circle(new Point(4, 4), 3);
        Rectangle r = new Rectangle(new Point(0, 0), 5, 5);
        Line l = new Line(new Point(-1, 2), new Point(3, -6));
        System.out.println(l.getCenter());
    }

}
