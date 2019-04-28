package chengang.com.chapter4;


public class Rectangle extends Shape {
    private double width, height;

    Rectangle(Point topLeftPoint, double width, double height) {
        super(topLeftPoint);
        this.width = width;
        this.height = height;
    }

    @Override
    public Point getCenter() {
        return new Point(point.getY() + (width / 2), point.getY() - (height / 2));
    }

    @Override
    public Rectangle clone() throws CloneNotSupportedException {
        return (Rectangle) super.clone();

    }

}
