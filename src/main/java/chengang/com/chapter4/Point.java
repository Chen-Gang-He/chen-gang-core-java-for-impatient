package chengang.com.chapter4;


import java.util.Objects;

public class Point {
    protected double x, y;
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
        this(0.0, 0.0);
    }

    public double getX() {
        return this.x;
    }

    double getY() {
        return this.y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return String.format("%s=[x=%.2f, y=%.2f]", this.getClass().getCanonicalName(), this.x, this.y);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this == obj) return true;
        if (getClass() != obj.getClass()) return false;
        Point other = (Point) obj;
        return (other.getX() == this.getX() && other.getY() == this.getY());
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.x, this.y);
    }

    @Override
    public Point clone() throws CloneNotSupportedException {
        return (Point) super.clone();
    }
}
