package chengang.com.chapter4;


abstract class Shape {
    Point point ;

    public Shape(Point point) {
        this.point = point;
    }

    public void moveBy(double dx, double dy) {
        this.point.setX(point.getX() + dx);
        this.point.setY(point.getY() + dy);
    }

    abstract public Point getCenter();

}
