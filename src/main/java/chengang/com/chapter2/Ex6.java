package chengang.com.chapter2;


public class Ex6 {
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

        public double getX() {

            return this.x;

        }

        /**
         * Get Y point
         *
         * @return y
         */
        public double getY() {
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

        public Point translate(double x, double y) {
            setX(this.x + x);
            setY(this.y + y);
            return this;
        }

        public Point scale(double p) {
            setX(this.x * p);
            setY(this.y * p);
            return this;
        }

        @Override
        public String toString() {
            return String.format("(%.2f, %.2f)", this.getX(), this.getY());
        }
    }

    public static void main(String[] args) {
        Ex6 ex5 = new Ex6();
        Ex6.Point point = ex5.new Point();
        System.out.println(point);
        System.out.println(point.translate(10.1D, 10.1D).scale(2));
    }

}
