package chengang.com.chapter4;


public class Circle extends Shape{
    private double radius;

    public Circle(Point center, double radius) {
        super(center);
        this.radius = radius;
    }


    public Point getCenter() {
        return point;
    }

    @Override
    public Circle clone() throws CloneNotSupportedException {
        return (Circle) super.clone();
    }
}
