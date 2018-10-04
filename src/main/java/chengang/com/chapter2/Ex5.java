package chengang.com.chapter2;

/*
Implement an immutable class Point that describes a point in the plane. Provide a constructor to set it to a specific
point, a no-arg constructor to set it to the origin, and methods getX, getY, translate, and scale. The translate method
moves the point by a given amount in x- and y-direction. The scale method scales both coordinates by a given factor.
Implement these methods so that they return new points with the results.
 */
public class Ex5 {
    private class Point {
        /**
         * a <code> Point </code> object describes a point in the plane.
         */
        private double x, y;

        Point(double x, double y) {
            this.x = x;
            this.y = y;
        }

        Point() {
            this(0.0, 0.0);
        }

        double getX() {

            return this.x;

        }

        /**
         * Get Y point
         *
         * @return y
         */
         double getY() {
            return this.y;
        }

        private void setX(double x) {
            this.x = x;
        }

        private void setY(double y) {
            this.y = y;
        }

        /**
         * moves the point by a given amount in x- and y-direction.
         */

        Point translate(double x, double y) {
            return new Point(this.x + x, this.y + y);
        }

        Point scale(double p) {
            return new Point(this.x * p, this.y * p);
        }

        @Override
        public String toString() {
            return String.format("(%.2f, %.2f)", this.getX(), this.getY());
        }
    }

    public static void main(String[] args) {
        Ex5 ex5 = new Ex5();
        Ex5.Point point = ex5.new Point();
        System.out.println(point);
        System.out.println(point.translate(10.1D, 10.1D).scale(2));
    }

}
